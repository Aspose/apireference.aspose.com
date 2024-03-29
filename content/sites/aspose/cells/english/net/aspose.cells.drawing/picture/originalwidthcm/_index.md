---
title: Picture.OriginalWidthCM
second_title: Aspose.Cells for .NET API Reference
description: Picture property. Gets the original width of picture in unit of centimeters
type: docs
url: /net/aspose.cells.drawing/picture/originalwidthcm/
---
## Picture.OriginalWidthCM property

Gets the original width of picture, in unit of centimeters.

```csharp
public double OriginalWidthCM { get; }
```

### Examples

```csharp

[C#]
//Instantiating a Workbook object
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
//Adding a picture at the location of a cell whose row and column indices are 1 in the worksheet. It is "B2" cell
int imgIndex = worksheet.Pictures.Add(1, 1, "example.jpeg");
//Get the inserted picture object
Picture pic = worksheet.Pictures[imgIndex];
//Gets the original width of the picture.
double picWidthCM = pic.OriginalWidthCM;
//Save the excel file.
workbook.Save("result.xlsx");
```

### See Also

* class [Picture](../)
* namespace [Aspose.Cells.Drawing](../../../aspose.cells.drawing/)
* assembly [Aspose.Cells](../../../)


