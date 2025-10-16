import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class soal02 {
    public static Scanner hi = new Scanner(System.in);
    public static User signedUP = null;
    public static ArrayList<User> accounts = new ArrayList<>();


    public static void Register() throws ConflictException, BadRequestException, UnAuthorizeException {
        if (signedUP != null) {
            throw new UnAuthorizeException("No no kamu belom login");
        }
        
        System.out.println("Masukkan Email:");
        String email = hi.nextLine();

        System.out.println("Masukkan Nama Lengkap");
        String fullname = hi.nextLine();
        
        System.out.println("Masukkan Password");
        String pw = hi.nextLine();
        
        if (pw.length() < 8) {
            throw new BadRequestException("Password tidak boleh kurang dari 8\n");
        }

        for (User user : accounts) {
            if (user.getEmail().equals(email)) {
                throw new ConflictException("Email sudah terdaftar\n");
            }
           
        }
        
        accounts.add(new User(email, fullname, pw));
        System.out.println("Regist SUkses\n"); 

    }

    public static void Login() throws NotFoundException, UnAuthorizeException{

        System.out.println("Masukkan Email:");
        String email = hi.nextLine();
        

        System.out.println("Masukkan Password");
        String pw = hi.nextLine();

        for (User usr : accounts) {
            if (usr.getEmail().equals(email)) {
                if (usr.getPw().equals(pw)) {
                    signedUP = usr;
                    System.out.println("Login Suksesss");
                    return;
                } else {
                    throw new UnAuthorizeException("Password Unmatched");
                }
            }
        }

        throw new NotFoundException("Email tidak ditemukan");
    }

    public static void Profile() throws UnAuthorizeException {
        if (signedUP == null) {
            throw new UnAuthorizeException("Ente belom login");
        }

        System.out.println("Profile kamu:");
        System.out.println();
        System.out.println("Email: " + signedUP.getEmail());
        System.out.println("Fullname: " + signedUP.getFullname());
    }

    public static void Logout() throws UnAuthorizeException {
        if (signedUP == null) {
            throw new UnAuthorizeException("Ente belom login");
        }

        System.out.println("Session Dipotong bye");
        signedUP = null;
    }


    public static void main(String[] args) throws ConflictException, BadRequestException, UnAuthorizeException, NotFoundException {
        boolean stats = true;

        while (stats) {
            try {
                
                System.out.println("1. Register\n2. Login\n3. Profile\n4. Logout\n5. Exit");
                int inp = hi.nextInt();
                hi.nextLine();
                
                switch (inp) {
                    case 1:
                    Register();    
                    break;
                    
                    case 2:
                    Login();
                    break;
                    
                    case 3:
                    Profile();
                    break;
                    
                    case 4:
                    Logout();
                    break;
                    
                    case 5:
                    stats = false;
                    break;
                    default:
                    break;
                }
            

            } catch (BadRequestException | ConflictException | UnAuthorizeException | NotFoundException e) {
                System.out.println("error king, coba baca surat cinta ini: " + e.getMessage());

            } catch (Exception e){
                System.out.println("Kesalahan ninu ninu! You got a mail! " + e.getMessage());
            }
           
            
        }
    }
}
