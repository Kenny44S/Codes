public class SimplifyPath{

    public static void main(String[] args)
    {
        String str = "/home/kenny/desktop/example.java";

        int dot = str.lastIndexOf(".");
        String extension = str.substring(str.lastIndexOf("."));
        String fileName = str.substring(str.lastIndexOf("/") + 1, dot);
        String fullPath = str.substring(0, str.lastIndexOf("/"));

        System.out.println("File extension is: " + extension);
        System.out.println("Filename is: " + fileName);
        System.out.println("File path is: " + fullPath);
    }
}

