package programmer.zaman.now.data;


// Saat kita membuat record class,
// secara otomatis Java akan membuatkan getter, equals, hashCode dan toString method secara otomatis, dan juga constructor secara otomatis
public record LoginRequest(String username, String password) {

    // Record class constructor
    public LoginRequest {
        System.out.println("Membuat object LoginRequest");
    }

    public LoginRequest(String username) {
        this(username, "");
    }

    public LoginRequest() {
        this("", "");
    }

}