package activities;

public class Activity8 {
    public String exceptionTest(String message) throws CustomException {

if(message!=null){
    System.out.println(message + ":String is valid");

}
else{

   // System.out.println("String is null");
    throw new CustomException("String is not valid");
}

        return message;
    }

    public static void main(String[] args) {
        Activity8 obj=new Activity8();
        try{
        obj.exceptionTest("test");
        obj.exceptionTest(null);
        } catch (CustomException e) {
            System.out.println("Caught the exception: " + e.getMessage());
        }

    }
}
