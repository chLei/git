public Class HelloWorld{
    public static void main(String[] args) {
        System.out.println("Hello");
        String[] strArr = new String[12];
        for (String str : strArr) {
            str = "HelloWorld";
            System.out.println(str);
        }
    }
}