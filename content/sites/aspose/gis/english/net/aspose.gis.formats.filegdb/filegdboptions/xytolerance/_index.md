---
title: FileGdbOptions.XYTolerance
second_title: Aspose.GIS for .NET API Reference
description: FileGdbOptions property. X and Y snapping tolerance
type: docs
weight: 100
url: /net/aspose.gis.formats.filegdb/filegdboptions/xytolerance/
---
## FileGdbOptions.XYTolerance property

X and Y snapping tolerance.

```csharp
public double? XYTolerance { get; set; }
```

## Remarks

This is a creation option and it does not affect reading and editing. This parameter controls a snapping tolerance used for advanced ArcGIS features. It does not affect Aspose.GIS behavior, but it can be used by ArcGIS. The unit of the parameter is the unit of spatial reference system. If set to `null`, the default is used. The default depends on spatial reference system and equals to 0.000000008983153 degrees for geographic systems or 0.001 meters for projected systems (values are transformed to spatial reference system units). If spatial reference system is unknown the default is 0.001.

### See Also

* class [FileGdbOptions](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assembly [Aspose.GIS](../../../)


