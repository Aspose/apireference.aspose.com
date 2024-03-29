---
title: Class IconSet
second_title: Aspose.Cells for .NET API Reference
description: Aspose.Cells.IconSet class. Describe the IconSet conditional formatting rule. This conditional formatting rule applies icons to cells according to their values
type: docs
url: /net/aspose.cells/iconset/
---
## IconSet class

Describe the IconSet conditional formatting rule. This conditional formatting rule applies icons to cells according to their values.

```csharp
public class IconSet
```

## Properties

| Name | Description |
| --- | --- |
| [CfIcons](../../aspose.cells/iconset/cficons/) { get; } | Get the[`ConditionalFormattingIcon`](../conditionalformattingicon/) from the collection |
| [Cfvos](../../aspose.cells/iconset/cfvos/) { get; } | Get the CFValueObjects instance. |
| [IsCustom](../../aspose.cells/iconset/iscustom/) { get; } | Indicates whether the icon set is custom. Default value is false. |
| [Reverse](../../aspose.cells/iconset/reverse/) { get; set; } | Get or set the flag indicating whether to reverses the default order of the icons in this icon set. Default value is false. |
| [ShowValue](../../aspose.cells/iconset/showvalue/) { get; set; } | Get or set the flag indicating whether to show the values of the cells on which this icon set is applied. Default value is true. |
| [Type](../../aspose.cells/iconset/type/) { get; set; } | Get or Set the icon set type to display. Setting the type will auto check if the current Cfvos's count is accord with the new type. If not accord, old Cfvos will be cleaned and default Cfvos will be added. |

### Examples

```csharp

[C#]

//Instantiating a Workbook object
Workbook workbook = new Workbook();

Worksheet sheet = workbook.Worksheets[0];

//Adds an empty conditional formatting
int index = sheet.ConditionalFormattings.Add();

FormatConditionCollection fcs = sheet.ConditionalFormattings[index];

//Sets the conditional format range.
CellArea ca = new CellArea();

ca.StartRow = 0;

ca.EndRow = 2;

ca.StartColumn = 0;

ca.EndColumn = 0;

fcs.AddArea(ca);

//Adds condition.
int idx = fcs.AddCondition(FormatConditionType.IconSet);

fcs.AddArea(ca);

FormatCondition cond = fcs[idx];

//Get Icon Set
IconSet iconSet = cond.IconSet;

//Set Icon Type
iconSet.Type = IconSetType.Arrows3;

//Put Cell Values
Aspose.Cells.Cell cell1 = sheet.Cells["A1"];

cell1.PutValue(10);

Aspose.Cells.Cell cell2 = sheet.Cells["A2"];

cell2.PutValue(120);

Aspose.Cells.Cell cell3 = sheet.Cells["A3"];

cell3.PutValue(260);

//Saving the Excel file
workbook.Save("book1.xlsx");

[VB.NET]

'Instantiating a Workbook object
Dim workbook As Workbook = New Workbook()

Dim sheet As Worksheet = workbook.Worksheets(0)

'Adds an empty conditional formatting
Dim index As Integer = sheet.ConditionalFormattings.Add()

Dim fcs As FormatConditionCollection = sheet.ConditionalFormattings(index)

'Sets the conditional format range.
Dim ca As New CellArea()

ca.StartRow = 0

ca.EndRow = 2

ca.StartColumn = 0

ca.EndColumn = 0

fcs.AddArea(ca)

'Adds condition.
Dim idx As Integer = fcs.AddCondition(FormatConditionType.IconSet)

fcs.AddArea(ca)

Dim cond As FormatCondition = fcs(idx)

'Get Icon Set
Dim iconSet As IconSet = cond.IconSet

'Set Icon Type
iconSet.Type = IconSetType.Arrows3

'Put Cell Values
Dim cell1 As Aspose.Cells.Cell = sheet.Cells("A1")

cell1.PutValue(10)

Dim cell2 As Aspose.Cells.Cell = sheet.Cells("A2")

cell2.PutValue(120)

Dim cell3 As Aspose.Cells.Cell = sheet.Cells("A3")

cell3.PutValue(260)

'Saving the Excel file
workbook.Save("book1.xlsx") 
```

### See Also

* namespace [Aspose.Cells](../../aspose.cells/)
* assembly [Aspose.Cells](../../)


