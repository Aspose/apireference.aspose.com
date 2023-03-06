---
title: GmlOptions.RestoreSchema
second_title: Aspose.GIS for .NET API Reference
description: GmlOptions property. Determines whether Aspose.GIS is allowed to parse attributes in a Gml file in which an XML schema is missing or cannot be loaded. If set to true Aspose.GIS reader does not require the presence of an XML Schema. Default is false.
type: docs
weight: 40
url: /net/aspose.gis.formats.gml/gmloptions/restoreschema/
---
## GmlOptions.RestoreSchema property

Determines whether Aspose.GIS is allowed to parse attributes in a Gml file in which an XML schema is missing or cannot be loaded. If set to `true`, Aspose.GIS reader does not require the presence of an XML Schema. Default is `false`.

```csharp
public bool RestoreSchema { get; set; }
```

### Remarks

Driver attempts to automatically parse the feature classes and their associated properties by scanning the file and looking for “known” objects to determine the organization. While this approach is error prone, it has the advantage of working for GML files even if the associated XML schema has been lost or cannot load from Internet.

### See Also

* class [GmlOptions](../)
* namespace [Aspose.Gis.Formats.Gml](../../gmloptions/)
* assembly [Aspose.GIS](../../../)


