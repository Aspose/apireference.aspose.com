---
title: OsmXmlDriver.CreateLayer
second_title: Aspose.GIS för .NET API Referens
description: OsmXmlDriver metod. Skapar ett lager och öppnar det för att lägga till nya funktioner.
type: docs
weight: 40
url: /sv/net/aspose.gis.formats.osmxml/osmxmldriver/createlayer/
---
## CreateLayer(string, OsmXmlOptions) {#createlayer_7}

Skapar ett lager och öppnar det för att lägga till nya funktioner.

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| options | OsmXmlOptions | Förarspecifika alternativ. |

### Returvärde

Ett exempel på[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Lagret finns redan. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [OsmXmlOptions](../../osmxmloptions/)
* class [OsmXmlDriver](../)
* namnutrymme [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

Skapar ett lager och öppnar det för att lägga till nya funktioner.

```csharp
public override VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | AbstractPath | Sökväg till filen. |
| options | DriverOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Lagret finns redan. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [AbstractPath](../../../aspose.gis/abstractpath/)
* class [DriverOptions](../../../aspose.gis/driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* namnutrymme [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* hopsättning [Aspose.GIS](../../../)

---

## CreateLayer(string, OsmXmlOptions, SpatialReferenceSystem) {#createlayer_8}

Skapar ett lager och öppnar det för att lägga till nya funktioner.

```csharp
public VectorLayer CreateLayer(string path, OsmXmlOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| path | String | Sökväg till filen. |
| options | OsmXmlOptions | Förarspecifika alternativ. |
| spatialReferenceSystem | SpatialReferenceSystem | Rumsligt referenssystem. |

### Returvärde

Ett exempel på[`VectorLayer`](../../../aspose.gis/vectorlayer/).

### Undantag

| undantag | skick |
| --- | --- |
| InvalidOperationException | Lagret finns redan. |
| NotSupportedException | Det rumsliga referenssystemet stöds inte av föraren. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [OsmXmlOptions](../../osmxmloptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [OsmXmlDriver](../)
* namnutrymme [Aspose.Gis.Formats.OsmXml](../../osmxmldriver/)
* hopsättning [Aspose.GIS](../../../)


