---
title: Class EmfPolyDraw16
second_title: Aspose.Imaging for .NET API Reference
description: Aspose.Imaging.FileFormats.Emf.Emf.Records.EmfPolyDraw16 class. The EMR_POLYDRAW16 record specifies a set of line segments and Bezier curves
type: docs
weight: 4040
url: /net/aspose.imaging.fileformats.emf.emf.records/emfpolydraw16/
---
## EmfPolyDraw16 class

The EMR_POLYDRAW16 record specifies a set of line segments and Bezier curves.

```csharp
public sealed class EmfPolyDraw16 : EmfDrawingRecordType
```

## Constructors

| Name | Description |
| --- | --- |
| [EmfPolyDraw16](emfpolydraw16/)(EmfRecord) | Initializes a new instance of the `EmfPolyDraw16` class. |

## Properties

| Name | Description |
| --- | --- |
| [AbTypes](../../aspose.imaging.fileformats.emf.emf.records/emfpolydraw16/abtypes/) { get; set; } | Gets or sets a Count length array of bytes that specifies the point types. This value MUST be in the Point (section 2.1.26) enumeration. |
| [APoints](../../aspose.imaging.fileformats.emf.emf.records/emfpolydraw16/apoints/) { get; set; } | Gets or sets a Count length array of WMF PointS objects, specified in [MS-WMF] section 2.2.2.16, which specifies the array of points. |
| [Bounds](../../aspose.imaging.fileformats.emf.emf.records/emfpolydraw16/bounds/) { get; set; } | Gets or sets a 128-bit WMF RectL object, specified in [MS-WMF] section 2.2.2.19, which specifies the bounding rectangle, in device units. |
| [Size](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/size/) { get; set; } | Gets or sets the size of the record |
| [Type](../../aspose.imaging.fileformats.emf.emf.records/emfrecord/type/) { get; set; } | Gets or sets the type. |

### See Also

* class [EmfDrawingRecordType](../emfdrawingrecordtype/)
* namespace [Aspose.Imaging.FileFormats.Emf.Emf.Records](../../aspose.imaging.fileformats.emf.emf.records/)
* assembly [Aspose.Imaging](../../)


