package yodel.career;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class AdjacentSum {
	public static void main(String[] args)
	{
		ArrayList<Integer> largest = new ArrayList<>();
		int total=0;
		readFileAtPath("triangle.txt");
	}

	private static void readFileAtPath(String filename) {
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
				int cursor = 0;
				int count =0;
				while ((lineContent = inputStream.readLine()) != null) 
				{
					if(count == 0)
					{
						largest.add(Integer.parseInt(lineContent.trim()));
						count++;
					}
					else
					{
						String[] temp = lineContent.split(" ");
						int large = Integer.MIN_VALUE;
						for(int i=cursor; i<=cursor+1; i++)
						{
							if(Integer.parseInt(temp[i].trim()) > large)
							{
								large = Integer.parseInt(temp[i].trim());
							}
						}
						//System.out.println(large);
						largest.add(large);
						cursor = Arrays.asList(temp).indexOf(String.valueOf(large));
					}
					
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
