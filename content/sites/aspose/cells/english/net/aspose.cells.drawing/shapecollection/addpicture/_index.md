---
title: ShapeCollection.AddPicture
second_title: Aspose.Cells for .NET API Reference
description: ShapeCollection method. Adds a picture to the collection
type: docs
url: /net/aspose.cells.drawing/shapecollection/addpicture/
---
## AddPicture(int, int, int, int, Stream) {#addpicture}

Adds a picture to the collection.

```csharp
public Picture AddPicture(int upperLeftRow, int upperLeftColumn, int lowerRightRow, 
    int lowerRightColumn, Stream stream)
```

| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftRow | Int32 | Upper left row index. |
| upperLeftColumn | Int32 | Upper left column index. |
| lowerRightRow | Int32 | Lower right row index |
| lowerRightColumn | Int32 | Lower right column index |
| stream | Stream | Stream object which contains the image data. |

### Return Value

[`Picture`](../../picture/) Picture object.

### Examples

```csharp

[C#]
//add a picture
using (FileStream fs = new FileStream("image.jpg", FileMode.Open))
{
    Picture picture = shapes.AddPicture(1, 0, 1, 0, fs);
}
```

### See Also

* class [Picture](../../picture/)
* class [ShapeCollection](../)
* namespace [Aspose.Cells.Drawing](../../../aspose.cells.drawing/)
* assembly [Aspose.Cells](../../../)

---

## AddPicture(int, int, Stream, int, int) {#addpicture_1}

Adds a picture to the collection.

```csharp
public Picture AddPicture(int upperLeftRow, int upperLeftColumn, Stream stream, int widthScale, 
    int heightScale)
```

| Parameter | Type | Description |
| --- | --- | --- |
| upperLeftRow | Int32 | Upper left row index. |
| upperLeftColumn | Int32 | Upper left column index. |
| stream | Stream | Stream object which contains the image data. |
| widthScale | Int32 | Scale of image width, a percentage. |
| heightScale | Int32 | Scale of image height, a percentage. |

### Return Value

[`Picture`](../../picture/) Picture object.

### Examples

```csharp

[C#]
//add a picture
using (FileStream fs = new FileStream("image.jpg", FileMode.Open))
{
    Picture picture = shapes.AddPicture(1, 1, fs, 50, 60);
}
```

### See Also

* class [Picture](../../picture/)
* class [ShapeCollection](../)
* namespace [Aspose.Cells.Drawing](../../../aspose.cells.drawing/)
* assembly [Aspose.Cells](../../../)


