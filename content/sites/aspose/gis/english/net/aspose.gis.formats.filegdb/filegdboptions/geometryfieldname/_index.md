---
title: FileGdbOptions.GeometryFieldName
second_title: Aspose.GIS for .NET API Reference
description: FileGdbOptions property. Name of the geometry field
type: docs
weight: 50
url: /net/aspose.gis.formats.filegdb/filegdboptions/geometryfieldname/
---
## FileGdbOptions.GeometryFieldName property

Name of the geometry field.

```csharp
public string GeometryFieldName { get; set; }
```

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentException | Value is not a valid field name. A valid field name must: Be not `null` and not emptyStart with Latin letter or underscoreContain only Latin letters, digits or underscores |

## Remarks

This is a creation option and it does not affect reading and editing. Defines the name of the geometry field (column). Defaults to "SHAPE". If any attribute in [`Attributes`](../../../aspose.gis/vectorlayer/attributes/) has name equal to the value of this property, then this attribute is renamed.

### See Also

* class [FileGdbOptions](../)
* namespace [Aspose.Gis.Formats.FileGdb](../../filegdboptions/)
* assembly [Aspose.GIS](../../../)


