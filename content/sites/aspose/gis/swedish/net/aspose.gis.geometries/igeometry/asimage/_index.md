---
title: IGeometry.AsImage
second_title: Aspose.GIS för .NET API Referens
description: IGeometry metod. Exportera denna geometri till en bildrepresentation.
type: docs
weight: 110
url: /sv/net/aspose.gis.geometries/igeometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Exportera denna geometri till en bildrepresentation.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outputPath | AbstractPath | Sökväg till utdatabilden. |
| width | Measurement | Kartans bredd. |
| height | Measurement | Kartans höjd. |
| renderer | Renderer | Renderer att använda. |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. Om`null`, standardsymboliseraren används. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vilket argument som helst`null`. |
| IOException | Ett I/O-fel uppstod. |
| [GisException](../../../aspose.gis/gisexception/) | Ett fel vid bearbetning eller läsning av GIS-data. |
| ArgumentException | Enhet för bredd eller höjd är!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Bredd eller höjd är negativ eller noll. |

### Se även

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Exportera denna geometri till en bildrepresentation.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| outputPath | String | Sökväg till utdatabilden. |
| width | Measurement | Kartans bredd. |
| height | Measurement | Kartans höjd. |
| renderer | Renderer | Renderer att använda. |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. Om`null`, standardsymboliseraren används. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vilket argument som helst`null`. |
| IOException | Ett I/O-fel uppstod. |
| [GisException](../../../aspose.gis/gisexception/) | Ett fel vid bearbetning eller läsning av GIS-data. |
| ArgumentException | Enhet för bredd eller höjd är!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Bredd eller höjd är negativ eller noll. |

### Se även

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Exportera denna geometri till en bildrepresentation.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| width | Measurement | Kartans bredd. |
| height | Measurement | Kartans höjd. |
| renderer | Renderer | Renderer att använda. |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. Om`null`, standardsymboliseraren används. |

### Returvärde

Bilden som ström

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Vilket argument som helst`null`. |
| IOException | Ett I/O-fel uppstod. |
| [GisException](../../../aspose.gis/gisexception/) | Ett fel vid bearbetning eller läsning av GIS-data. |
| ArgumentException | Enhet för bredd eller höjd är!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Bredd eller höjd är negativ eller noll. |

### Se även

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* namnutrymme [Aspose.Gis.Geometries](../../igeometry/)
* hopsättning [Aspose.GIS](../../../)


