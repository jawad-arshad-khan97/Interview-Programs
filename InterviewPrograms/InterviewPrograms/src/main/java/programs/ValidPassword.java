package programs;

public class ValidPassword {

//    (?=.*[0-9]) a digit must occur at least once
//            (?=.*[a-z]) a lower case letter must occur at least once
//            (?=.*[A-Z]) an upper case letter must occur at least once
//            (?=.*[@#$%^&+=]) a special character must occur at least once
//(?=\\S+$) no whitespace allowed in the entire string
//            .{8,} at least 8 characters

    public static class passwordvalidation {
        public static void main(String[] args) {
            String passwd = "aaZZa44@";
            String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
            System.out.println(passwd.matches(pattern));
        }
    }
}
