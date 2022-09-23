package hello.javaee7.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;


//@RequestScoped
@Named
@ViewScoped
@Getter @Setter
public class Bb implements Serializable {
    private String data = "<input type='text' value='하이' />";
    private String sample07Data;
    private String mail;
    private String msg;
    private String hello;
    private String food;
    private Integer number;
    private String name;
    private String text;
    private String dt;
    private Date date;
//    @IdPattern(from = 2014, to = 2018)
    @Size(min = 1)
    private String code;
    private Integer amount;
    private Boolean mailCheck;
    private Integer[] cities;
    private Integer[] cities2;
    private static final Map<String, Integer> items2;
    
    static {
        items2 = new LinkedHashMap<>();
        items2.put("서울", 1);
        items2.put("대전", 2);
        items2.put("부산", 3);
    }
    
    public Map<String, Integer> getItems2() {
        return items2;
    }
    
    public String sample06Next() {
        return "/sample06/output";
    }
    
    public String sample0604Next() {
        return "";
    }
    
    public String sample07Next() {
        return "/sample07/output";
    }
    
    public String sample08Next() {
        return "/sample08/output";
    }
    
    public String sample11Next() {
        return "/sample11/output";
    }
    
    public String sample12Next() {
        save();
        return null;
    }
    
    public void save() {
        System.out.println(this.text);
    }
    
    public String sample16Next() {
        return null;
    }
}
