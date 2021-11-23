package source;

import java.util.*;
import java.util.stream.Collectors;

public class danhsachcb {
    private List<Canbo> cb;
     public danhsachcb (){
         this.cb = new ArrayList<>();
     }
    
    public void add(Canbo cb){
        this.cb.add(cb);
    }
    public List<Canbo> search(String name) {
        return this.cb.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
    }
    public void Search(String name){
        for (Canbo cb : cb) {
            if(cb.getName().indexOf(name)>=0) {
                System.out.println(cb);
            }
        }
    }
    public void showList() {
        this.cb.forEach(o -> System.out.println(o.toString()));
    }
}
