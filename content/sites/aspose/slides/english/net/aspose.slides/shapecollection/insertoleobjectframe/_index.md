---
title: InsertOleObjectFrame
second_title: Aspose.Sildes for .NET API Reference
description: Creates a new OLE object and inserts it to a collection at the specified index.
type: docs
weight: 350
url: /net/aspose.slides/shapecollection/insertoleobjectframe/
---
## InsertOleObjectFrame(int, float, float, float, float, IOleEmbeddedDataInfo) {#insertoleobjectframe}

Creates a new OLE object and inserts it to a collection at the specified index.

```csharp
public IOleObjectFrame InsertOleObjectFrame(int index, float x, float y, float width, float height, 
    IOleEmbeddedDataInfo dataInfo)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | The zero-based index at which OLE object should be inserted. |
| x | Single | X coordinate of a new OLE frame. |
| y | Single | Y coordinate of a new OLE frame. |
| width | Single | Width of a new OLE frame. |
| height | Single | Height of a new OLE frame. |
| dataInfo | IOleEmbeddedDataInfo | Embedded data info [`IOleEmbeddedDataInfo`](../../ioleembeddeddatainfo). |

### Return Value

Created OLE object.

### Examples

This example demonstrates inserting an OLE object at the second index:

```csharp
[C#]
byte[] fileData = File.ReadAllBytes("test.zip");
IOleDataInfo dataInfo = new OleDataInfo(fileData, "zip");
IOleObjectFrame oleObjectFrame = slidees.Shapes.AddOleObjectFrame(2, 150, 20, 50, 50, dataInfo);
```

### See Also

* interface [IOleObjectFrame](../../ioleobjectframe)
* interface [IOleEmbeddedDataInfo](../../ioleembeddeddatainfo)
* class [ShapeCollection](../../shapecollection)
* namespace [Aspose.Slides](../../shapecollection)
* assembly [Aspose.Slides](../../../)

---

## InsertOleObjectFrame(int, float, float, float, float, string, string) {#insertoleobjectframe_1}

Creates a new OLE object and inserts it to a collection at the specified index.

```csharp
public IOleObjectFrame InsertOleObjectFrame(int index, float x, float y, float width, float height, 
    string className, string path)
```

| Parameter | Type | Description |
| --- | --- | --- |
| index | Int32 | The zero-based index at which OLE object should be inserted. |
| x | Single | X coordinate of a new OLE frame. |
| y | Single | Y coordinate of a new OLE frame. |
| width | Single | Width of a new OLE frame. |
| height | Single | Height of a new OLE frame. |
| className | String | Name of an OLE class. |
| path | String | Path to the linked file. |

### Return Value

Created OLE object.

### See Also

* interface [IOleObjectFrame](../../ioleobjectframe)
* class [ShapeCollection](../../shapecollection)
* namespace [Aspose.Slides](../../shapecollection)
* assembly [Aspose.Slides](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Slides.dll -->
