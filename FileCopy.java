import java.util.*;
import java.io.*;

public class FileCopy {

    public static void main(String[] args) throws IOException{

        Scanner s = new Scanner(System.in);

        //taking input for inputpath outputpath and filename
        System.out.println("InputPath");
        String inputPath=s.nextLine();

        System.out.println("OutputPath");
        String outputPath=s.nextLine();

        System.out.println("File Name:-");
        String fileName=s.nextLine();

        //Function takes the inputpath ouutput path and filename
        fileCopy(inputPath, outputPath, fileName);



    }
    static void fileCopy(String inputPath,String outputPath,String fileName) throws FileNotFoundException, IOException
    {

        File inputFile=new File(inputPath+"\\"+fileName);
        File outputFile=new File(outputPath+"\\"+fileName);
        File temp=null;
        //FileReader read in data from the original input path + "\\" + fileName;
        FileReader readFile=null;
        //FileWriter write out data to its corresponding destination path + "\\" + fileName.
        FileWriter writeFile=null;

        readFile = new FileReader(inputPath+"\\"+fileName);

        if(inputFile.exists()){
            if(outputFile.exists()){

                temp = new File(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+" - Copy"+fileName.substring(fileName.indexOf("."),fileName.length()));

                if(temp.exists()){
                    int i=2;
                    int a;
                    while(true){
                        temp = new File(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+" - Copy ("+i+")"+fileName.substring(fileName.indexOf("."),fileName.length()));
                        if(!temp.exists()){
                            break;
                        }
                        i++;
                    }
                    writeFile = new FileWriter(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+" - Copy ("+i+")"+fileName.substring(fileName.indexOf("."),fileName.length()));
                    while((a=readFile.read())!=-1){
                        writeFile.write(a);
                    }
                    System.out.println("copied.");
                }else{
                    int a;
                    writeFile = new FileWriter(outputPath+"\\"+fileName.substring(0,fileName.indexOf("."))+" - Copy"+fileName.substring(fileName.indexOf("."),fileName.length()));
                    while((a=readFile.read())!=-1){
                        writeFile.write(a);
                    }
                    System.out.println("copied.");
                }
            }else{
                int a;
                writeFile = new FileWriter(outputPath+"\\"+fileName);
                while((a=readFile.read())!=-1){
                    writeFile.write(a);
                }
                System.out.println("copied.");
            }
        }else{
            System.out.println("dosen't exists.");
        }

        readFile.close();
        writeFile.close();

    }
}
