---
title: Class VbaModule
second_title: Aspose.Cells for .NET API Reference
description: Aspose.Cells.Vba.VbaModule class. Represents the module in VBA project
type: docs
url: /net/aspose.cells.vba/vbamodule/
---
## VbaModule class

Represents the module in VBA project.

```csharp
public class VbaModule
```

## Properties

| Name | Description |
| --- | --- |
| [BinaryCodes](../../aspose.cells.vba/vbamodule/binarycodes/) { get; } | Gets and sets the binary codes of module. |
| [Codes](../../aspose.cells.vba/vbamodule/codes/) { get; set; } | Gets and sets the codes of module. |
| [Name](../../aspose.cells.vba/vbamodule/name/) { get; set; } | Gets and sets the name of Module. |
| [Type](../../aspose.cells.vba/vbamodule/type/) { get; } | Gets the type of module. |

### Examples

```csharp

[C#]

//Instantiating a Workbook object
Workbook workbook = new Workbook();
 // Init VBA project.
VbaProject vbaProject = workbook.VbaProject; 
// Add a new module.
int index = vbaProject.Modules.Add(VbaModuleType.Class, "test");
// Get vba module
VbaModule vbaModule = vbaProject.Modules[index];
// Set codes
vbaModule.Codes = "Sub ShowMessage()\r\nMsgBox \"Welcome to Aspose!\"\r\nEnd Sub";
//Saving the Excel file
workbook.Save("book1.xlsm");

 [Visual Basic]

'Instantiating a Workbook object
Dim workbook As Workbook = New Workbook()
'Init VBA project.
Dim vbaProject as VbaProject  = workbook.VbaProject
'Add a new module.
Dim index as Integer = vbaProject.Modules.Add(VbaModuleType.Class, "test")
'Get vba module
Dim vbaModule as VbaModule = vbaProject.Modules(index)
'Set codes
vbaModule.Codes = "Sub ShowMessage()\r\nMsgBox \"Welcome to Aspose!\"\r\nEnd Sub"
'Saving the Excel file
workbook.Save("book1.xlsm")
```

### See Also

* namespace [Aspose.Cells.Vba](../../aspose.cells.vba/)
* assembly [Aspose.Cells](../../)


