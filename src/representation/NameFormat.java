package representation;


public enum NameFormat {
    FIRSTLAST {
        public String callWithTitle(String title, String firstName, String lastName) {
            return String.format("%s %s %s", title, firstName, lastName);
        }
    },
    LASTFIRST {
        public String callWithTitle(String title, String firstName, String lastName) {
            return String.format("%s %s, %s", title, lastName, firstName);
        }
    };
}
