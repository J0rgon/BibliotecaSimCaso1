package Material;
import java.time.LocalDate;
public interface Material{
    public String getName();
    public String getDescription();
    public long getId();
    public String getMoreInfo();
    public LocalDate getDueDate();
    public LocalDate getBorrowDate();
    public void borrow();
    public void giveBack();

}
