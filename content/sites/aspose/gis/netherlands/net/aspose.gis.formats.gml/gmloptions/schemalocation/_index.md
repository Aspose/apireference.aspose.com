---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS voor .NET API-referentie
description: GmlOptions eigendom. Door spaties gescheiden lijst met URIparen. De eerste URI in elk paar is een URI van de naamruimte de tweede URI is een pad naar XMLschema van de naamruimte. Indien ingesteld opnull GmlDriver zal proberen schemaLocation te lezen van het rootelement van het document. Standaard isnull .
type: docs
weight: 50
url: /nl/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

Door spaties gescheiden lijst met URI-paren. De eerste URI in elk paar is een URI van de naamruimte, de tweede URI is een pad naar XML-schema van de naamruimte. Indien ingesteld op`null` ,[`GmlDriver`](../../gmldriver/) zal proberen schemaLocation te lezen van het root-element van het document. Standaard is`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Opmerkingen

Aspose.GIS gebruikt XML-schema van GML-bestand om te creëren[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Standaard wordt de locatie van het schema geëxtraheerd uit het attribuut schemaLocation. Als zo'n attribuut niet bestaat of naar een ongeldige locatie verwijst, kan Aspose.GIS het GML-bestand niet lezen. In dit geval - stel deze optie in, zodat Aspose.GIS schema. kan laden

### Voorbeelden

"http://site.com/namespace http://site.com/schema.xsd"

### Zie ook

* class [GmlOptions](../)
* naamruimte [Aspose.Gis.Formats.Gml](../../gmloptions/)
* montage [Aspose.GIS](../../../)


