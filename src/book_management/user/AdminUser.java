package book_management.user;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
    }

    @Override
    public int menu() {
        return 0;
    }
}
