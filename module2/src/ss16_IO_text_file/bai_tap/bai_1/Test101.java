package ss16_IO_text_file.bai_tap.bai_1;

import java.util.List;

public class Test101 {
    public static void main(String[] args) {
        List<String> stringList = CopyTool.readFile("src/ss16_IO_text_file/bai_tap/bai_1/sourcefile.txt");
        CopyTool.copyFile(stringList, "src/ss16_IO_text_file/bai_tap/bai_1/targetfile.txt");
    }
}
