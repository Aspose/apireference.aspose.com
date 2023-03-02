---
title: Geometry.AsImage
second_title: Aspose.GIS für .NET-API-Referenz
description: Geometry methode. Exportieren Sie diese Geometrie in eine Bilddarstellung.
type: docs
weight: 120
url: /de/net/aspose.gis.geometries/geometry/asimage/
---
## AsImage(AbstractPath, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_1}

Exportieren Sie diese Geometrie in eine Bilddarstellung.

```csharp
public void AsImage(AbstractPath outputPath, Measurement width, Measurement height, 
    Renderer renderer, VectorSymbolizer symbolizer = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outputPath | AbstractPath | Pfad zum Ausgabebild. |
| width | Measurement | Breite der Karte. |
| height | Measurement | Höhe der Karte. |
| renderer | Renderer | Zu verwendender Renderer. |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. Wenn`null`, wird der Standardsymbolisierer verwendet. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Irgendein Argument`null`. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| [GisException](../../../aspose.gis/gisexception/) | Ein Fehler beim Verarbeiten oder Lesen von GIS-Daten. |
| ArgumentException | Einheit der Breite oder Höhe ist!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Breite oder Höhe ist negativ oder Null. |

### Siehe auch

* class [AbstractPath](../../../aspose.gis/abstractpath/)
* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)

---

## AsImage(string, Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage_2}

Exportieren Sie diese Geometrie in eine Bilddarstellung.

```csharp
public void AsImage(string outputPath, Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| outputPath | String | Pfad zum Ausgabebild. |
| width | Measurement | Breite der Karte. |
| height | Measurement | Höhe der Karte. |
| renderer | Renderer | Zu verwendender Renderer. |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. Wenn`null`, wird der Standardsymbolisierer verwendet. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Irgendein Argument`null`. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| [GisException](../../../aspose.gis/gisexception/) | Ein Fehler beim Verarbeiten oder Lesen von GIS-Daten. |
| ArgumentException | Einheit der Breite oder Höhe ist!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Breite oder Höhe ist negativ oder Null. |

### Siehe auch

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)

---

## AsImage(Measurement, Measurement, Renderer, VectorSymbolizer) {#asimage}

Exportieren Sie diese Geometrie in eine Bilddarstellung.

```csharp
public Stream AsImage(Measurement width, Measurement height, Renderer renderer, 
    VectorSymbolizer symbolizer = null)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| width | Measurement | Breite der Karte. |
| height | Measurement | Höhe der Karte. |
| renderer | Renderer | Zu verwendender Renderer. |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. Wenn`null`, wird der Standardsymbolisierer verwendet. |

### Rückgabewert

Das Bild als Stream

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Irgendein Argument`null`. |
| IOException | Ein E/A-Fehler ist aufgetreten. |
| [GisException](../../../aspose.gis/gisexception/) | Ein Fehler beim Verarbeiten oder Lesen von GIS-Daten. |
| ArgumentException | Einheit der Breite oder Höhe ist!:Unit.MapUnits . |
| ArgumentOutOfRangeException | Breite oder Höhe ist negativ oder Null. |

### Siehe auch

* struct [Measurement](../../../aspose.gis.rendering/measurement/)
* class [Renderer](../../../aspose.gis.rendering/renderer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Geometry](../)
* namensraum [Aspose.Gis.Geometries](../../geometry/)
* Montage [Aspose.GIS](../../../)


