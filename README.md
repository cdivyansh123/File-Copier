# File-Copier
a file copy program that works exactly like a windows file copy mechanism with the functionalities described below:   
• It will ask the user for the file name which needs to be copied. • If the input file exists then it will copy that file into a new file name with exact conventions followed by windows. (i.e. “- Copy”, “- Copy (2)” etc.)

<h3>Description</h3>
 In this program we will see how we can create file copier program which works exactly like windows file copy mechanism with functionalities described as below.

 The code starts by taking input for the input path, output path and file name.
 The code then uses a Scanner to take in user input.

 The input path is the location of the file that you want to copy and the output path is where you want to copy.
 
 The code starts by creating a file called inputPath+"\\"+fileName.
 It then creates another file called (outputPath+"\\"+fileName).
 Next, it opens up two files: inputFile and outputFile.

 The first one is opened as a FileReader so that it can read in data from the original input path + "\\" + fileName; 
 The second is opened as a FileWriter so that it can write out data to its corresponding destination path + "\\" + fileName.
 
 The code then checks if both files exist before continuing .

 Next, readFile is created using new FileReader(inputPath+"\\").
 
 The code takes the input path and filename, creates a temporary file with the same name as the input file, then reads in the contents of that temporary file.

 The code then opens up a FileWriter to write out the output file.

 It also opens up a FileReader to read in what it needs from the temporary file.

 The code starts by creating a new File object called temp.

 The code then creates a new FileWriter object called writeFile and sets the file path to outputPath+"\\"+fileName.substring(0,fileName.indexOf(".
 "))+" - Copy ("+i+")".

 It then loops through the while loop until it finds that temp does not exist in order to break out of the loop.

 Next, it creates another File object called writeFile and sets its file path to outputPath + "\\" + fileName.substring(0,fileName.indexOf("."))
 + " - Copy ("+(i)+").

 Then it writes all of the data from readFile into this newly created file.

 The code then checks if the temp file exists and if it does, it will create a FileWriter object for writing to the temp file and read from the temp file until there is no more data in it.

 The code in this case creates a new FileWriter object and writes to it using a while loop.

 The first line of the while loop checks for an error by reading from readFile, which returns -1 if there was an error or 0 otherwise.

 If there was no error, then writeFile is created with outputPath+"\\"+fileName as its filename.

 Then, while((a=readFile.read())!=-1){ writeFile.write(a); } is used to write each character of input into the file one at a time until all characters have been  written into it (the last two lines).
                                                                                                                                                
 Finally, System.out .println("copied."); is used to print out "copied." after all data has been successfully copied into the file.

 The code will write a file to the output path with the name of "copied."

 The code will read a file and write it to the output path with the name of "copied."



![before running code1](https://user-images.githubusercontent.com/85683019/214255837-cd87a9cc-1300-4c2d-88cc-73a021259d81.png)


![Taking output from user](https://user-images.githubusercontent.com/85683019/214256080-2982debc-86c4-4c87-a6c2-90c5d24c7752.png)


![After running code](https://user-images.githubusercontent.com/85683019/214256266-a0a3aeba-e274-4aac-8baf-28a0641b7685.png)
