---
title: FileGdbOptions.EnsureValidCoordinatesRange
second_title: Aspose.GIS for .NET API Reference
description: FileGdbOptions property. Whether coordinates should be in valid range
type: docs
weight: 30
url: /net/aspose.gis.formats.filegdb/filegdboptions/ensurevalidcoordinatesrange/
---
## FileGdbOptions.EnsureValidCoordinatesRange property

Whether coordinates should be in valid range.

```csharp
public bool EnsureValidCoordinatesRange { get; set; }
```

## Remarks

This is a creation option and it does not affect reading and editing. If set to `true` an exception will be thrown on attempt to write a coordinate with values out of valid range. If set to `false` such coordinate will be written silently. Valid range is defined by [`CoordinatePrecisionGrid`](../coordinateprecisiongrid/). Refer to [`CoordinatePrecisionGrid`](../coordinateprecisiongrid/) documentation to read about how valid range is determined from coordinate precision grid. Default is `false`.

### See Also

* class [FileGdbOptions](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assembly [Aspose.GIS](../../../)


