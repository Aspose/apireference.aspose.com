---
title: FileGdbOptions.ZTolerance
second_title: Aspose.GIS for .NET API Reference
description: FileGdbOptions property. Z snapping tolerance
type: docs
weight: 110
url: /net/aspose.gis.formats.filegdb/filegdboptions/ztolerance/
---
## FileGdbOptions.ZTolerance property

Z snapping tolerance.

```csharp
public double? ZTolerance { get; set; }
```

## Remarks

This is a creation option and it does not affect reading and editing. This parameter controls a snapping tolerance used for advanced ArcGIS features. It does not affect Aspose.GIS behavior, but it can be used by ArcGIS. The unit of the parameter is the unit of spatial reference system. If set to `null`, the default is used. If spatial reference system is unknown or has less than three dimensions the default is 0.001. If spatial reference system has three dimensions the default is 0.001 meters converted to the unit of the third dimension.

### See Also

* class [FileGdbOptions](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assembly [Aspose.GIS](../../../)


