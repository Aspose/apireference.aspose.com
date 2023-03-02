---
title: GmlOptions.LoadSchemasFromInternet
second_title: Aspose.GIS för .NET API Referens
description: GmlOptions fast egendom. Avgör om Aspose.GIS tillåts ladda XMLschema från Internet. Om inställt påfalse scheman med absoluta URIer som inte börjar med file// skulle inte laddas. Standard ärfalse .
type: docs
weight: 20
url: /sv/net/aspose.gis.formats.gml/gmloptions/loadschemasfrominternet/
---
## GmlOptions.LoadSchemasFromInternet property

Avgör om Aspose.GIS tillåts ladda XML-schema från Internet. Om inställt på`false` scheman med absoluta URI:er som inte börjar med 'file://' skulle inte laddas. Standard är`false` .

```csharp
public bool LoadSchemasFromInternet { get; set; }
```

### Anmärkningar

Aspose.GIS använder XML-schema för GML-fil för att skapa[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) . XML-schemafiler kan distribueras tillsammans med GML-filer eller kan finnas på Internet. I tidigare fall måste du ställa in det här alternativet till`true` för att tillåta Aspose.GIS att ladda XML-schema.

### Se även

* class [GmlOptions](../)
* namnutrymme [Aspose.Gis.Formats.Gml](../../gmloptions/)
* hopsättning [Aspose.GIS](../../../)


