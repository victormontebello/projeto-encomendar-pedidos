package entidades;
import java.text.SimpleDateFormat;
import java.util.Date;


public class cliente {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private String name;
    private String email;
    private Date date;

    public cliente(){
    }
    public cliente(String name, String email, Date date){
        this.name = name;
        this.email = email;
        this.date = date;
    }
    public String getName(String name){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getEmail(String email){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public Date getDate(Date date){
        return date;
    }
    @Override
	public String toString() {
		return name + " (" + sdf.format(date) + ") - " + email;
 	}
}
