---
title: GmlOptions.LoadSchemasFromInternet
second_title: Aspose.GIS for .NET API Reference
description: GmlOptions property. Determines whether Aspose.GIS is allowed to load XML schema from Internet. If set to false schemas with absolute URIs that does not start with file// would not be loaded. Default is false
type: docs
weight: 20
url: /net/aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/
---
## GmlOptions.LoadSchemasFromInternet property

Determines whether Aspose.GIS is allowed to load XML schema from Internet. If set to `false`, schemas with absolute URIs that does not start with 'file://' would not be loaded. Default is `false`.

```csharp
public bool LoadSchemasFromInternet { get; set; }
```

## Remarks

Aspose.GIS uses XML schema of GML file in order to create [`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/). XML schema files can be distributed alongside with GML files or can be located on the Internet. In former case, you need to set this option to `true` to allow Aspose.GIS to load XML schema.

### See Also

* class [GmlOptions](../)
* namespace [Aspose.Gis.Formats.Gml](../../gmloptions/)
* assembly [Aspose.GIS](../../../)


