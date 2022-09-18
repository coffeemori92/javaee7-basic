package hello.javaee7.bean;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import lombok.Getter;
import lombok.Setter;

@Named
@RequestScoped
@Getter @Setter
public class Bb {
    private String data = "<input type='text' value='하이' />";
    private String sample07Data;
    private String mail;
    private String msg;
    private String hello;
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
}
