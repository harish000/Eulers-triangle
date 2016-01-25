/*package yodel.career;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class MainClass 
{
	public static void main(String[] args)
	{
		readFileAtPath("triangle.txt");
	}

	private static void readFileAtPath(String filename)
	{
		// TODO Auto-generated method stub
		ArrayList<Integer> largest = new ArrayList<>();
		int total = 0;
		if (filename == null || filename.isEmpty()) 
		{
			System.out.println("Invalid File Path");
			return;
		}
		String filePath = System.getProperty("user.dir") + "/" + filename;
		BufferedReader inputStream = null;
		try 
		{
			try 
			{
				inputStream = new BufferedReader(new FileReader(filePath)); 
				String lineContent = null; 
				while ((lineContent = inputStream.readLine()) != null) 
				{
					//System.out.println(lineContent);
					String[] temp = lineContent.split(" ");
					int large = Integer.MIN_VALUE;
					for(int i=0;i<temp.length;i++)
					{
						if(Integer.parseInt(temp[i].trim()) > large)
						{
							large = Integer.parseInt(temp[i].trim());
						}
					}
					largest.add(large);
				}
				for(int j=0;j<largest.size();j++)
				{
					total = total + largest.get(j);
				}
			}
			finally
			{
				if (inputStream != null)
					inputStream.close(); 
				System.out.println("Maximum total from top to bottom is: "+ total);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
	}
}

*/