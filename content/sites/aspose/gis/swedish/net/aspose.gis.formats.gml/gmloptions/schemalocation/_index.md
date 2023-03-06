---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS för .NET API Referens
description: GmlOptions fast egendom. Mellanslagsseparerad lista med URIpar. Första URI i varje par är en URI för namnutrymmet andra URI är ett sökväg till XMLschema för namnutrymmet. Om satt tillnull GmlDriver kommer att försöka läsa schemaLocation från rotelementet i dokumentet. Standard ärnull .
type: docs
weight: 50
url: /sv/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Mellanslagsseparerad lista med URI-par. Första URI i varje par är en URI för namnutrymmet, andra URI är ett sökväg till XML-schema för namnutrymmet. Om satt till`null` ,[`GmlDriver`](../../gmldriver/) kommer att försöka läsa schemaLocation från rotelementet i dokumentet. Standard är`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Anmärkningar

Aspose.GIS använder XML-schema för GML-fil för att skapa[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Som standard extraheras schemaplatsen från attributet schemaLocation. Om det inte finns något sådant attribut eller om det pekar på en ogiltig plats kommer Aspose.GIS inte att läsa GML-filen. I det här fallet - ställ in det här alternativet så att Aspose.GIS kan ladda schema.

### Exempel

"http://site.com/namespace http://site.com/schema.xsd"

### Se även

* class [GmlOptions](../)
* namnutrymme [Aspose.Gis.Formats.Gml](../../gmloptions/)
* hopsättning [Aspose.GIS](../../../)


