package CommonElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class CommonDropDowns extends CommonHelp{

static Select dropdown;
	
	public static void selectDropDownByText(By locator, String Text){
		if (findAnyElement(locator).isEnabled()){
		dropdown= new Select(findAnyElement(locator));
		dropdown.selectByVisibleText(Text);
		
		} else {
			System.out.println("Targeted Dropdown element is not Enabled." );
		}
	}
	
	
	
	public static void selectDropDownByIndex(By locator, int indexID){
	
		if(findAnyElement(locator).isEnabled()){
			dropdown= new Select(findAnyElement(locator));
			dropdown.selectByIndex(indexID);			
		} else {
			System.out.println("Targeted Dropdown element is not Enabled." );
		}
	}
	
	public static void deselectDropdown(By locator, String Text){
		dropdown= new Select(findAnyElement(locator));
		if(findAnyElement(locator).isEnabled()){
			if (findAnyElement(locator).isSelected()){
				dropdown.deselectByVisibleText(Text);
			}
		}
	}
	
	//Function to select Multiple values from Dropdown list
	public static void selectMultipleValuesInDropdown(By locator, String Text1, String Text2){
		dropdown= new Select(findAnyElement(locator));
		if(findAnyElement(locator).isEnabled()){
			if(dropdown.isMultiple()){
				dropdown.selectByVisibleText(Text1);
				dropdown.selectByVisibleText(Text2);
				}
			}
		}
	
	//Function to DeSelect all selected options
	public static void deselectAllfromDropdown(By locator){
		dropdown= new Select(findAnyElement(locator));
		if(findAnyElement(locator).isSelected())
			dropdown.deselectAll();
		} 
	
	
	public static void Dropdownselectbyli(By locator,String expectedtext) {
		  driver.findElement((locator)).click();
			List<WebElement> list=driver.findElements(By.xpath("//li"));
			  int size= list.size();
			  
			  try {
			  for(int i=1;i<size;i++) {
				   WebElement alllist=list.get(i);
				  
				String   text=alllist.getText();
				
				
				
				if(text.equals(expectedtext)) {
					
					alllist.click();
					break;
					
				}
				  
				   }
			  }
			  catch(Exception e)
			  {
				  
			  }
	    }
	
	
	
	
	public static void DropDownSelectByTable(String datafindTest,By locator){
	
	WebElement mytable = CommonHelp.driver.findElement((locator));
	//To locate rows of table. 
	List < WebElement > rows_table = mytable.findElements(By.tagName("tr"));
	//To calculate no of rows In table.
	int rows_count = rows_table.size();
	//Loop will execute till the last row of table.
	for (int row = 0; row < rows_count; row++) {
	    //To locate columns(cells) of that specific row.
	    List < WebElement > Columns_row = rows_table.get(row).findElements(By.tagName("td"));
	    //To calculate no of columns (cells). In that specific row.
	    int columns_count = Columns_row.size();
	    System.out.println("Number of cells In Row " + row + " are " + columns_count);
	    //Loop will execute till the last cell of that specific row.
	    for (int column = 0; column < columns_count; column++) {
	        // To retrieve text from that specific cell.
	    	//String df= ReadExcelData.readExcelCell(6, 0);
	        String celtext = Columns_row.get(column).getText();
	        if (celtext.equals(datafindTest))
	        {
	        	System.out.println(Columns_row.get(column).getText());
	        	Columns_row.get(column).click();
	        	//System.out.println(ReadExcelData.readExcelCell(6, 0)+"After");
	        	
	        	
	        }
	      //  System.out.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	    }
	 //   System.out.println("-------------------------------------------------- ");
	
//
	  /*  driver.findElement(By.xpath("(//div[contains(.,'--Select City--')])[9]")).click();
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		  int size= list.size();
		  System.out.println("citylist"+size);
		  try {
		  for(int i=1;i<size;i++) {
			   WebElement alllist=list.get(i);
			String   text=alllist.getText();
			if(text.equals("Indore")) {
				alllist.click();
			}
			  
			   }
		  }
		  catch(Exception e)
		  {
			  
		  }
		  */
	  
	
}
	
	}
}
