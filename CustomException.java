class ConflictException extends Exception {
    public ConflictException(String bubur){
        super(bubur);
    }
}

class BadRequestException extends Exception{
    public BadRequestException(String m){
        super(m);
    }
}

class UnAuthorizeException extends Exception{
    public UnAuthorizeException(String idol){
        super(idol);
    }
}

class NotFoundException extends Exception{
    public NotFoundException(String indo){
        super(indo);
    }
}
