public class userService {
        private final String[][] data;
        private final String email;
        private final String password;
        private String roles = "";

        public userService(String emails, String passwords) {
            email = emails;
            password = passwords;
            this.data = new String[][]{
                    {"crseven.utd.com", "siuuu7", "Our donators"},
            };
        }
        
        private boolean checkCredential() {
            for(int i = 0; i < data.length; i++ ) {
                if(data[i][0].equals(email)) {
                    if(data[i][1].equals(password)) {
                        roles = data[i][2];
                        return true;

                    }
                }
            }
            return false;
        }

        public void login() {
            boolean status = checkCredential();
            if(status) {
                System.out.println("\nSalam hangat " + roles);
                System.out.println("Logged it as user email " + email);
            } else {
                System.out.println("\nLOGIN GAGAL ");

            }
        }
    }