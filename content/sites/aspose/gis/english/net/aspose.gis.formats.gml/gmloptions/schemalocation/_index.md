---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS for .NET API Reference
description: GmlOptions property. Space separated list of URI pairs. First URI in every pair is a URI of the namespace second URI is a Path to XML schema of the namespace. If set to null GmlDriver will try read schemaLocation from the root element of the document. Default is null.
type: docs
weight: 50
url: /net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Space separated list of URI pairs. First URI in every pair is a URI of the namespace, second URI is a Path to XML schema of the namespace. If set to `null`, [`GmlDriver`](../../gmldriver/) will try read schemaLocation from the root element of the document. Default is `null`.

```csharp
public string SchemaLocation { get; set; }
```

### Remarks

Aspose.GIS uses XML schema of GML file in order to create [`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/). By defualt, schema location is extracted from schemaLocation attribute. If there is no such attribute or it points to invalid location, Aspose.GIS will fail to read GML file. In this case - set this option, so Aspose.GIS can load schema.

### Examples

"http://site.com/namespace http://site.com/schema.xsd"

### See Also

* class [GmlOptions](../)
* namespace [Aspose.Gis.Formats.Gml](../../gmloptions/)
* assembly [Aspose.GIS](../../../)


