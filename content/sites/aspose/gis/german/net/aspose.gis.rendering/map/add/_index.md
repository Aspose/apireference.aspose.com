---
title: Add
second_title: Aspose.GIS für .NET-API-Referenz
description: Erstellt einVectorMapLayeraspose.gis.rendering/vectormaplayer mit dem Standardsymbolisierer und fügt ihn der Karte hinzu. Ebenen werden in zusätzlicher Reihenfolge gerendert.
type: docs
weight: 110
url: /de/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Erstellt ein[`VectorMapLayer`](../../vectormaplayer) mit dem Standardsymbolisierer und fügt ihn der Karte hinzu. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | VectorLayer | Eine Vektorebene zur Darstellung[`VectorMapLayer`](../../vectormaplayer). |
| keepOpen | Boolean | `true` um die Vektorebene nach dem geöffnet zu lassen[`Map`](../../map) Objekt wird entsorgt; `false` um die Schicht zu entsorgen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Erstellt und fügt a hinzu[`VectorMapLayer`](../../vectormaplayer) zur Karte. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | VectorLayer | Eine Vektorebene zur Darstellung[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. Wenn`null`, wird der Standardsymbolisierer verwendet. |
| keepOpen | Boolean | `true` um die Vektorebene nach dem geöffnet zu lassen[`Map`](../../map) Objekt wird entsorgt; `false` um die Schicht zu entsorgen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Erstellt und fügt a hinzu[`VectorMapLayer`](../../vectormaplayer) zur Karte. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | VectorLayer | Eine Vektorebene zur Darstellung[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. Wenn`null`, wird der Standardsymbolisierer verwendet. |
| labeling | Labeling | Beschriftung zum Beschriften von Features im Layer. Wenn`null` , Ursprünglich[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) wird verwendet. |
| keepOpen | Boolean | `true` um die Ebene nach dem offen zu lassen[`Map`](../../map) Objekt wird entsorgt; Andernfalls,`false` . |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Erstellt und fügt a hinzu[`VectorMapLayer`](../../vectormaplayer) zur Karte. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Eine Feature-Sequenz zur Darstellung durch[`VectorMapLayer`](../../vectormaplayer). |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Features-Reihenfolge ist`null`. |

### Siehe auch

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Erstellt und fügt a hinzu[`VectorMapLayer`](../../vectormaplayer) zur Karte. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Eine Feature-Sequenz zur Darstellung durch[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. Wenn`null`, wird der Standardsymbolisierer verwendet. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Features-Reihenfolge ist`null`. |

### Siehe auch

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Erstellt und fügt a hinzu[`VectorMapLayer`](../../vectormaplayer) zur Karte. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Eine Feature-Sequenz zur Darstellung durch[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Ein Symbolisierer zum Rendern. |
| labeling | Labeling | Beschriftung zum Beschriften von Features im Layer. Wenn`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) wird verwendet. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Features-Reihenfolge ist`null`. |

### Siehe auch

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Fügt der Karte eine Ebene hinzu. Ebenen werden in zusätzlicher Reihenfolge gerendert.

```csharp
public void Add(MapLayer mapLayer)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| mapLayer | MapLayer | Die hinzuzufügende Ebene. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Argument ist`null`. |

### Siehe auch

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Erstellt ein[`RasterMapLayer`](../../rastermaplayer) mit Standard-Colorizer und fügt es der Karte hinzu.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| layer | RasterLayer | Eine Vektorebene zur Darstellung[`RasterLayer`](../../../aspose.gis.raster/rasterlayer). |
| colorizer | RasterColorizer | Ein Colorizer zum Rendern. Wenn`null`, wird der Standardcolorizer verwendet. |
| keepOpen | Boolean | `true` um die Rasterebene nach dem offen zu lassen[`Map`](../../map) Objekt wird entsorgt; `false` um die Schicht zu entsorgen. |

### Ausnahmen

| Ausnahme | Bedingung |
| --- | --- |
| ArgumentNullException | Schicht ist`null`. |

### Siehe auch

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* namensraum [Aspose.Gis.Rendering](../../map)
* Montage [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
