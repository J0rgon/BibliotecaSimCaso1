package Library;

public abstract class Library{
  private int idLibrary;
  private String name;
  private String address;

  protected void setId(long id) {
    this.idLibrary = id;
  }

  protected void setName(String name) {
    this.name = name;
  }

  protected void setAddress(String address){
    this.address = address;
  }

}
