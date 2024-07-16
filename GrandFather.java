
import java.util.*;

public class GrandFather {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashMap<String,ArrayList<String>> hm=new HashMap<>();
        int ans=0,n=4;
        String a[][]={{"Paari","Karikalan"},{"Udhiran","Sendhan"},{"Sendhan","Arulmozhi"},{"Karikalan","Sendhan"}};

        for (int i = 0; i < n; i++) {
            //creating map
            if(hm.containsKey(a[i][1])){
                ArrayList<String> l=new ArrayList<>(hm.get(a[i][1]));
                l.add(a[i][0]);
                hm.put(a[i][1],l);
            }
            else{
                hm.put(a[i][1],new ArrayList<>(Arrays.asList(a[i][0])));
            }
        }

        System.out.println("Enter grand father name:");
        String grandFather=sc.nextLine();

        if(hm.containsKey(grandFather)){ //if false -> then there is no child
            // i - father
            for(String i:hm.get(grandFather)){
                if(hm.containsKey(i)) //if false -> then there is no child
                ans+=hm.get(i).size(); // gives count of child of => i => grandchild of grandFather
            }
        }
        System.out.println(ans);
    }
}
