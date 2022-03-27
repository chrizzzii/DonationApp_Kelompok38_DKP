public class userService {
        private final String[][] data;
        private final String email;
        private final String password;
        private String roles = "";

        public userService(String emails, String passwords) {
            email = emails;
            password = passwords;
            this.data = new String[][]{
                    {"warga@donasi.com", "donasi", "Our donators"},
            };
        }
        
        private boolean checkCredential() {
            for (String[] datum : data) {
                if (datum[0].equals(email)) {
                    if (datum[1].equals(password)) {
                        roles = datum[2];
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