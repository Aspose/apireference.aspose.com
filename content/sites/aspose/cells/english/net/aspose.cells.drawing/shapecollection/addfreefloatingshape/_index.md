---
title: ShapeCollection.AddFreeFloatingShape
second_title: Aspose.Cells for .NET API Reference
description: ShapeCollection method. Adds a free floating shape to the worksheet.Only applies for line/image shape
type: docs
url: /net/aspose.cells.drawing/shapecollection/addfreefloatingshape/
---
## ShapeCollection.AddFreeFloatingShape method

Adds a free floating shape to the worksheet.Only applies for line/image shape.

```csharp
public Shape AddFreeFloatingShape(MsoDrawingType type, int top, int left, int height, int width, 
    byte[] imageData, bool isOriginalSize)
```

| Parameter | Type | Description |
| --- | --- | --- |
| type | MsoDrawingType | The shape type. |
| top | Int32 | Represents the vertical offset of shape from the worksheet's top row, in unit of pixel. |
| left | Int32 | Represents the horizontal offset of shape from the worksheet's left column, in unit of pixel. |
| height | Int32 | Represents the height of LineShape, in unit of pixel. |
| width | Int32 | Represents the width of LineShape, in unit of pixel. |
| imageData | Byte[] | The image data,only applies for the picture. |
| isOriginalSize | Boolean | Whether the shape use original size if the shape is image. |

### Examples

```csharp

[C#]
//add a line
Shape floatingShape_Line = shapes.AddFreeFloatingShape(MsoDrawingType.Line, 100, 100, 100, 50, null, false);
//add a picture
byte[] imageData = null;
using(FileStream fs = new FileStream("image.jpg", FileMode.Open))
{
    int len = (int)fs.Length;
    imageData = new byte[len];
    fs.Read(imageData, 0, len);
}
Shape floatingShape_Picture = shapes.AddFreeFloatingShape(MsoDrawingType.Picture, 200, 100, 100, 50, imageData, false);

```

### See Also

* class [Shape](../../shape/)
* enum [MsoDrawingType](../../msodrawingtype/)
* class [ShapeCollection](../)
* namespace [Aspose.Cells.Drawing](../../../aspose.cells.drawing/)
* assembly [Aspose.Cells](../../../)


