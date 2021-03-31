import implementation.hashtable_implementation;

public class hastable_app {

    public static void main(String[] args) {
        hashtable_implementation table = new hashtable_implementation(19);
        table.insert("smit");
        table.insert("patel");
        table.insert("mfc");
        table.insert("whatthe");
        table.insert("fine");
        table.insert("sounds");
        table.insert("zebra");
        table.insert("lion");
        table.insert("cheetha");
        table.insert("seal");
        table.insert("bea1r");

        System.out.println("____________FIND ELEMENTS_______________");
        System.out.println(table.find("smit"));
        System.out.println(table.find("cheetha"));
        System.out.println(table.find("bear"));
        System.out.println(table.find("jello"));
        System.out.println(table.find("lion"));
    }



}
