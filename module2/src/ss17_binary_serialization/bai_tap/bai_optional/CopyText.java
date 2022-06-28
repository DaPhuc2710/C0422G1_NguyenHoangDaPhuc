package ss17_binary_serialization.bai_tap.bai_optional;

import ss17_binary_serialization.bai_tap.model.Product;
import ss17_binary_serialization.bai_tap.util.ReadAndWrite;

import java.util.List;


public class CopyText {
    public static void CopyText(String sourceFile, String targetFile) {
        List<Product> productList = ReadAndWrite.read(sourceFile);
        ReadAndWrite.write(targetFile, productList);
    }
    public static void main(String[] args) {
        CopyText("src/ss17_binary_serialization/bai_tap/util/file_doc.txt", "src/ss17_binary_serialization/bai_tap/bai_optional/file.dat");
    }
}

