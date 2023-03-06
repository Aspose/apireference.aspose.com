---
title: IGeometry.AsImage
second_title: Aspose.GIS voor .NET API-referentie
description: IGeometry methode. Exporteer deze geometrie naar een afbeelding.
type: docs
weight: 110
url: /nl/net/aspose.gis.geometries/igeometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Exporteer deze geometrie naar een afbeelding.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outputPath | AbstractPath | Pad naar het uitvoerbeeld. |
| width | Measurement | Breedte van de kaart. |
| height | Measurement | Hoogte van de kaart. |
| renderer | Renderer | Renderer te gebruiken. |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. Als`null`, standaard symbolizer wordt gebruikt. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk argument`null`. |
| IOException | Er is een I/O-fout opgetreden. |
| [GisException](../../../aspose.gis/gisexception/) | Een fout tijdens het verwerken of lezen van GIS-gegevens. |
| ArgumentException | Eenheid van breedte of hoogte is!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Breedte of hoogte is negatief of nul. |

### Zie ook

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Exporteer deze geometrie naar een afbeelding.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| outputPath | String | Pad naar het uitvoerbeeld. |
| width | Measurement | Breedte van de kaart. |
| height | Measurement | Hoogte van de kaart. |
| renderer | Renderer | Renderer te gebruiken. |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. Als`null`, standaard symbolizer wordt gebruikt. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk argument`null`. |
| IOException | Er is een I/O-fout opgetreden. |
| [GisException](../../../aspose.gis/gisexception/) | Een fout tijdens het verwerken of lezen van GIS-gegevens. |
| ArgumentException | Eenheid van breedte of hoogte is!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Breedte of hoogte is negatief of nul. |

### Zie ook

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Exporteer deze geometrie naar een afbeelding.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| width | Measurement | Breedte van de kaart. |
| height | Measurement | Hoogte van de kaart. |
| renderer | Renderer | Renderer te gebruiken. |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. Als`null`, standaard symbolizer wordt gebruikt. |

### Winstwaarde

Het beeld als stream

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Elk argument`null`. |
| IOException | Er is een I/O-fout opgetreden. |
| [GisException](../../../aspose.gis/gisexception/) | Een fout tijdens het verwerken of lezen van GIS-gegevens. |
| ArgumentException | Eenheid van breedte of hoogte is!:SpatialReferencing.Unit.MapUnits . |
| ArgumentOutOfRangeException | Breedte of hoogte is negatief of nul. |

### Zie ook

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* interface [IGeometry](../)
* naamruimte [Aspose.Gis.Geometries](../../igeometry/)
* montage [Aspose.GIS](../../../)


