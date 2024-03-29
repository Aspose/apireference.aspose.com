---
title: Picture.Copy
second_title: Aspose.Cells for .NET API Reference
description: Picture method. Copy the picture
type: docs
url: /net/aspose.cells.drawing/picture/copy/
---
## Picture.Copy method

Copy the picture.

```csharp
public void Copy(Picture source, CopyOptions options)
```

| Parameter | Type | Description |
| --- | --- | --- |
| source | Picture | The source picture. |
| options | CopyOptions | The copy options. |

### Examples

```csharp

[C#]
//Instantiating a Workbook object
Workbook workbook = new Workbook();
Worksheet worksheet = workbook.Worksheets[0];
//insert first picture
int imgIndex1 = worksheet.Pictures.Add(1, 1, "1.png");
//Get the inserted picture object
Picture pic1 = worksheet.Pictures[imgIndex1];
//insert second picture
int imgIndex2 = worksheet.Pictures.Add(1, 9, "2.jpeg");
//Get the inserted picture object
Picture pic2 = worksheet.Pictures[imgIndex2];
//Copy picture 1 to picture 2.You'll get two picture 1 objects that are superimposed on top of each other.
CopyOptions opt = new CopyOptions();
pic2.Copy(pic1, opt);
//Save the excel file.
workbook.Save("result.xlsx");
```

### See Also

* class [CopyOptions](../../../aspose.cells/copyoptions/)
* class [Picture](../)
* namespace [Aspose.Cells.Drawing](../../../aspose.cells.drawing/)
* assembly [Aspose.Cells](../../../)


