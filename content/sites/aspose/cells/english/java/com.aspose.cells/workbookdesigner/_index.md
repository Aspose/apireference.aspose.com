---
title: WorkbookDesigner
second_title: Aspose.Cells for Java API Reference
description: Encapsulates the object that represents a designer spreadsheet.
type: docs
url: /java/com.aspose.cells/workbookdesigner/
---

**Inheritance:**
java.lang.Object
```
public class WorkbookDesigner
```

Encapsulates the object that represents a designer spreadsheet.

**Example**

```
         //Create WorkbookDesigner object.
         WorkbookDesigner wd = new WorkbookDesigner();
         //Open the template file (which contains smart markers).
         wd.setWorkbook(new Workbook("SmartMarker_Designer.xls"));
 
         //Initialize your data from data source
         //DataSet ds = new DataSet();
         //...
 
         //Set the datatable as the data source.
         //wd.SetDataSource(dt);
         //Process the smart markers to fill the data into the worksheets.
         wd.process(true);
         //Save the excel file.
         wd.getWorkbook().save("outSmartMarker_Designer.xls");
```
## Constructors

| Constructor | Description |
| --- | --- |
| [WorkbookDesigner()](#WorkbookDesigner--) | Initializes a new instance of the [WorkbookDesigner](../../com.aspose.cells/workbookdesigner) class. |
| [WorkbookDesigner(Workbook workbook)](#WorkbookDesigner-com.aspose.cells.Workbook-) | Initializes a new instance of the [WorkbookDesigner](../../com.aspose.cells/workbookdesigner) class. |
## Methods

| Method | Description |
| --- | --- |
| [clearDataSource()](#clearDataSource--) | Clears all data sources. |
| [containsVariables()](#containsVariables--) | Indicates whether the first worksheet contains custom variables. |
| [equals(Object arg0)](#equals-java.lang.Object-) |  |
| [getCalculateFormula()](#getCalculateFormula--) | Indicates whether formulas should be calculated. |
| [getCallBack()](#getCallBack--) | Gets callback interface of processing smartmarker. |
| [getClass()](#getClass--) |  |
| [getLineByLine()](#getLineByLine--) | Indicates whether processing the smart marker line by line. |
| [getRepeatFormulasWithSubtotal()](#getRepeatFormulasWithSubtotal--) | Indicates whether repeating formulas with subtotal row. |
| [getSmartMarkers()](#getSmartMarkers--) | Returns a collection of smart markers in a spreadsheet. |
| [getUpdateEmptyStringAsNull()](#getUpdateEmptyStringAsNull--) | If TRUE, Null will be inserted if the value is ""; |
| [getUpdateReference()](#getUpdateReference--) | Indicates if references in other worksheets will be updated. |
| [getWorkbook()](#getWorkbook--) | Gets the [Workbook](../../com.aspose.cells/workbook) object. |
| [hashCode()](#hashCode--) |  |
| [notify()](#notify--) |  |
| [notifyAll()](#notifyAll--) |  |
| [process()](#process--) | Processes the smart markers and populates the data source values. |
| [process(boolean isPreserved)](#process-boolean-) | Processes the smart markers and populates the data source values. |
| [process(Range range, boolean isPreserved)](#process-com.aspose.cells.Range-boolean-) | Processes the smart markers and populates the data source values. |
| [process(int sheetIndex, boolean isPreserved)](#process-int-boolean-) | Processes the smart markers and populates the data source values. |
| [setCalculateFormula(boolean value)](#setCalculateFormula-boolean-) | Indicates whether formulas should be calculated. |
| [setCallBack(ISmartMarkerCallBack value)](#setCallBack-com.aspose.cells.ISmartMarkerCallBack-) | Sets callback interface of processing smartmarker. |
| [setContainsVariables(boolean value)](#setContainsVariables-boolean-) | Indicates whether the first worksheet contains custom variables. |
| [setDataSource(String dataSource, ICellsDataTable cellsDataTable)](#setDataSource-java.lang.String-com.aspose.cells.ICellsDataTable-) | Sets data source of a [ICellsDataTable](../../com.aspose.cells/icellsdatatable) object. |
| [setDataSource(String variable, Object data)](#setDataSource-java.lang.String-java.lang.Object-) | Sets data binding to a variable. |
| [setDataSource(String dataSource, ResultSet rs)](#setDataSource-java.lang.String-java.sql.ResultSet-) | Set the data source. |
| [setDataSource(String dataSource, ResultSet rs, int rowCount)](#setDataSource-java.lang.String-java.sql.ResultSet-int-) | Set the data source. |
| [setDataSource(ResultSet rs)](#setDataSource-java.sql.ResultSet-) | Set the data source. |
| [setJsonDataSource(String variable, String data)](#setJsonDataSource-java.lang.String-java.lang.String-) |  |
| [setLineByLine(boolean value)](#setLineByLine-boolean-) | Indicates whether processing the smart marker line by line. |
| [setRepeatFormulasWithSubtotal(boolean value)](#setRepeatFormulasWithSubtotal-boolean-) | Indicates whether repeating formulas with subtotal row. |
| [setUpdateEmptyStringAsNull(boolean value)](#setUpdateEmptyStringAsNull-boolean-) | If TRUE, Null will be inserted if the value is ""; |
| [setUpdateReference(boolean value)](#setUpdateReference-boolean-) | Indicates if references in other worksheets will be updated. |
| [setWorkbook(Workbook value)](#setWorkbook-com.aspose.cells.Workbook-) | Sets the [Workbook](../../com.aspose.cells/workbook) object. |
| [toString()](#toString--) |  |
| [wait()](#wait--) |  |
| [wait(long arg0)](#wait-long-) |  |
| [wait(long arg0, int arg1)](#wait-long-int-) |  |
### WorkbookDesigner() {#WorkbookDesigner--}
```
public WorkbookDesigner()
```


Initializes a new instance of the [WorkbookDesigner](../../com.aspose.cells/workbookdesigner) class.

### WorkbookDesigner(Workbook workbook) {#WorkbookDesigner-com.aspose.cells.Workbook-}
```
public WorkbookDesigner(Workbook workbook)
```


Initializes a new instance of the [WorkbookDesigner](../../com.aspose.cells/workbookdesigner) class.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| workbook | [Workbook](../../com.aspose.cells/workbook) | The template workbook file. |

### clearDataSource() {#clearDataSource--}
```
public void clearDataSource()
```


Clears all data sources.

### containsVariables() {#containsVariables--}
```
public boolean containsVariables()
```


Indicates whether the first worksheet contains custom variables.

**Returns:**
boolean
### equals(Object arg0) {#equals-java.lang.Object-}
```
public boolean equals(Object arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | java.lang.Object |  |

**Returns:**
boolean
### getCalculateFormula() {#getCalculateFormula--}
```
public boolean getCalculateFormula()
```


Indicates whether formulas should be calculated.

**Returns:**
boolean
### getCallBack() {#getCallBack--}
```
public ISmartMarkerCallBack getCallBack()
```


Gets callback interface of processing smartmarker.

**Returns:**
[ISmartMarkerCallBack](../../com.aspose.cells/ismartmarkercallback)
### getClass() {#getClass--}
```
public final native Class<?> getClass()
```




**Returns:**
java.lang.Class<?>
### getLineByLine() {#getLineByLine--}
```
public boolean getLineByLine()
```


Indicates whether processing the smart marker line by line.

**Remarks**

The default value is true. If False, the template file must contain a range which is named as "\_CellsSmartMarkers".

**Returns:**
boolean
### getRepeatFormulasWithSubtotal() {#getRepeatFormulasWithSubtotal--}
```
public boolean getRepeatFormulasWithSubtotal()
```


Indicates whether repeating formulas with subtotal row.

**Returns:**
boolean
### getSmartMarkers() {#getSmartMarkers--}
```
public String[] getSmartMarkers()
```


Returns a collection of smart markers in a spreadsheet.

**Remarks**

A string array is created on every call. The array is sorted and duplicated values are removed.

**Returns:**
java.lang.String[] - A collection of smart markers
### getUpdateEmptyStringAsNull() {#getUpdateEmptyStringAsNull--}
```
public boolean getUpdateEmptyStringAsNull()
```


If TRUE, Null will be inserted if the value is "";

**Returns:**
boolean
### getUpdateReference() {#getUpdateReference--}
```
public boolean getUpdateReference()
```


Indicates if references in other worksheets will be updated.

**Returns:**
boolean
### getWorkbook() {#getWorkbook--}
```
public Workbook getWorkbook()
```


Gets the [Workbook](../../com.aspose.cells/workbook) object.

**Returns:**
[Workbook](../../com.aspose.cells/workbook)
### hashCode() {#hashCode--}
```
public native int hashCode()
```




**Returns:**
int
### notify() {#notify--}
```
public final native void notify()
```




### notifyAll() {#notifyAll--}
```
public final native void notifyAll()
```




### process() {#process--}
```
public void process()
```


Processes the smart markers and populates the data source values.

### process(boolean isPreserved) {#process-boolean-}
```
public void process(boolean isPreserved)
```


Processes the smart markers and populates the data source values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| isPreserved | boolean | True if the unrecognized smart marker is preserved. |

### process(Range range, boolean isPreserved) {#process-com.aspose.cells.Range-boolean-}
```
public void process(Range range, boolean isPreserved)
```


Processes the smart markers and populates the data source values.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| range | [Range](../../com.aspose.cells/range) | The range to be processed |
| isPreserved | boolean | True if the unrecognized smart marker is preserved. |

### process(int sheetIndex, boolean isPreserved) {#process-int-boolean-}
```
public void process(int sheetIndex, boolean isPreserved)
```


Processes the smart markers and populates the data source values.

**Remarks**

This method works on worksheet level.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| sheetIndex | int | Worksheet index. |
| isPreserved | boolean | True if the unrecognized smart marker is preserved. |

### setCalculateFormula(boolean value) {#setCalculateFormula-boolean-}
```
public void setCalculateFormula(boolean value)
```


Indicates whether formulas should be calculated.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setCallBack(ISmartMarkerCallBack value) {#setCallBack-com.aspose.cells.ISmartMarkerCallBack-}
```
public void setCallBack(ISmartMarkerCallBack value)
```


Sets callback interface of processing smartmarker.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [ISmartMarkerCallBack](../../com.aspose.cells/ismartmarkercallback) |  |

### setContainsVariables(boolean value) {#setContainsVariables-boolean-}
```
public void setContainsVariables(boolean value)
```


Indicates whether the first worksheet contains custom variables.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setDataSource(String dataSource, ICellsDataTable cellsDataTable) {#setDataSource-java.lang.String-com.aspose.cells.ICellsDataTable-}
```
public void setDataSource(String dataSource, ICellsDataTable cellsDataTable)
```


Sets data source of a [ICellsDataTable](../../com.aspose.cells/icellsdatatable) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | java.lang.String | The name of the data source. |
| cellsDataTable | [ICellsDataTable](../../com.aspose.cells/icellsdatatable) | data table. |

### setDataSource(String variable, Object data) {#setDataSource-java.lang.String-java.lang.Object-}
```
public void setDataSource(String variable, Object data)
```


Sets data binding to a variable.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| variable | java.lang.String | Variable name created using smart marker. |
| data | java.lang.Object | Source data. |

### setDataSource(String dataSource, ResultSet rs) {#setDataSource-java.lang.String-java.sql.ResultSet-}
```
public void setDataSource(String dataSource, ResultSet rs)
```


Set the data source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | java.lang.String | The name of the data source. |
| rs | java.sql.ResultSet | The result set. |

### setDataSource(String dataSource, ResultSet rs, int rowCount) {#setDataSource-java.lang.String-java.sql.ResultSet-int-}
```
public void setDataSource(String dataSource, ResultSet rs, int rowCount)
```


Set the data source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| dataSource | java.lang.String | The name of the data source. |
| rs | java.sql.ResultSet | The result set. |
| rowCount | int | The data count of given resultset. It should be the exact row count or -1; If the resultset is forward only, user should give the exact row count here, otherwise the smart may not be processed correctly when the smart marker's "noadd" is not set. |

### setDataSource(ResultSet rs) {#setDataSource-java.sql.ResultSet-}
```
public void setDataSource(ResultSet rs)
```


Set the data source.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| rs | java.sql.ResultSet | The result set. |

### setJsonDataSource(String variable, String data) {#setJsonDataSource-java.lang.String-java.lang.String-}
```
public void setJsonDataSource(String variable, String data)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| variable | java.lang.String |  |
| data | java.lang.String |  |

### setLineByLine(boolean value) {#setLineByLine-boolean-}
```
public void setLineByLine(boolean value)
```


Indicates whether processing the smart marker line by line.

**Remarks**

The default value is true. If False, the template file must contain a range which is named as "\_CellsSmartMarkers".

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setRepeatFormulasWithSubtotal(boolean value) {#setRepeatFormulasWithSubtotal-boolean-}
```
public void setRepeatFormulasWithSubtotal(boolean value)
```


Indicates whether repeating formulas with subtotal row.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setUpdateEmptyStringAsNull(boolean value) {#setUpdateEmptyStringAsNull-boolean-}
```
public void setUpdateEmptyStringAsNull(boolean value)
```


If TRUE, Null will be inserted if the value is "";

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setUpdateReference(boolean value) {#setUpdateReference-boolean-}
```
public void setUpdateReference(boolean value)
```


Indicates if references in other worksheets will be updated.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | boolean |  |

### setWorkbook(Workbook value) {#setWorkbook-com.aspose.cells.Workbook-}
```
public void setWorkbook(Workbook value)
```


Sets the [Workbook](../../com.aspose.cells/workbook) object.

**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| value | [Workbook](../../com.aspose.cells/workbook) |  |

### toString() {#toString--}
```
public String toString()
```




**Returns:**
java.lang.String
### wait() {#wait--}
```
public final void wait()
```




### wait(long arg0) {#wait-long-}
```
public final native void wait(long arg0)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |

### wait(long arg0, int arg1) {#wait-long-int-}
```
public final void wait(long arg0, int arg1)
```




**Parameters:**
| Parameter | Type | Description |
| --- | --- | --- |
| arg0 | long |  |
| arg1 | int |  |

