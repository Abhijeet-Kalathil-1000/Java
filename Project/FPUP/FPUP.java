//  File PackerUnpacker

import java.lang.*;
import java.util.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FPUP
{
    static int FileCnt=0;
    static String FileList[];
    static int LineCnt[];
    static String NewFile,DirName;

//  Create new file
    public static void CreateFile()
    {
        try
        {
            File file = new File(NewFile);

            boolean bRet = file.createNewFile();
            if(bRet == true)
            { 
                System.out.println(NewFile+" file created successfully");
            }
            else
            {
                System.out.println(NewFile+" file already exists !! Try again \n");
                return;
            }
        }
        catch(IOException ioe)
        {
            System.out.println("Alert :: IOException occured !!");
        }
    }

//  Display Files in Directroy
    public static void DisplayFiles(File[] files)
    {
        try
        {
            for(File filename : files)
            {
                if(filename.isFile())
                {
                    System.out.println("File name: "+filename.getName());
                    FileCnt++;
                }
                else
                {
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println("Alert :: FileNotFoundException occured !!");
        }
    }


//  Copy src file in new file
    public static void Pack(File[] files)
    {
        try
        {
            int length;
            int iCnt =0;
            
            byte[] buffer = new byte[1024];
            InputStream ins = null;
            OutputStream ops = null;
           
            for(File filename : files)
            {
                if(filename.isFile())
                {
                    FileList[iCnt] = filename.getName();

                    ins = new FileInputStream(filename);
                    ops = new FileOutputStream(NewFile, true);

                    while((length = ins.read(buffer)) > 0)
                    {
                        ops.write(buffer,0,length);
                        LineCnt[iCnt]=length;
                    }
                    iCnt++;
                }
                else
                {
                    break;
                }
            }
            //System.out.println("line array :"+LineCnt[]);
            ins.close();
            ops.close();
            System.out.println("Files packed successfully!!");
        }
        catch(Exception e)
        {
            System.out.println("Alert :: Exception Occured !!");
        }
    }

    public static void Unpack()
    {
        try
        { 
            int length;
            int iCnt =0;
            int size = 0;
            
            byte[] buffer = new byte[1024];
            InputStream ins = null;
            OutputStream ops = null;

            for(String element: FileList) 
            {
                File file = new File(element);
                file.createNewFile();     
            
                if((file.isFile()) && (file.getName()==FileList[iCnt]))
                {
                    ins = new FileInputStream(NewFile);
                    ops = new FileOutputStream(FileList[iCnt]);

                    while((length = ins.read(buffer)) > 0)
                    {
                        ops.write(buffer,size,LineCnt[iCnt]);
                    }
                    size = size + LineCnt[iCnt];
                    iCnt++;
                }
                else
                {
                    break;
                }
                ins.close();
                ops.close();
            }
            System.out.println("Files unpacked successfully!!");
        }
        catch(Exception e)
        {
            System.out.println("Alert :: Exception Occured !!");
        }
    }

    public static void main(String args[]) 
    {
        //Buffered reader
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);  
        File[] files ;

        try
        {    
            // Create packer txt file 
            System.out.println("\nEnter name of packer file : ");
            NewFile = br.readLine();

            //call function to create file
            CreateFile();
            
            System.out.println("\nEnter name of directory : ");
            DirName = br.readLine();
            files = new File(DirName).listFiles();

            //call function to trverse file
            DisplayFiles(files);
            System.out.println("file cnt : "+FileCnt);

            //List to store file size
            LineCnt = new int[FileCnt];

            //List to store file name
            FileList = new String[FileCnt];

            Pack(files);

            Unpack();

        }
        catch(Exception e)
        {
            System.out.println("Alert :: Exception Occured !!");
        }
    }
}