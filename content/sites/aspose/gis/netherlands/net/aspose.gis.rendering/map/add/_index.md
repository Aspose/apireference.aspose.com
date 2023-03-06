---
title: Map.Add
second_title: Aspose.GIS voor .NET API-referentie
description: Map methode. Creëert eenVectorMapLayer met standaard symbolizer en voegt deze toe aan de kaart. Lagen worden in aanvullende volgorde weergegeven.
type: docs
weight: 110
url: /nl/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Creëert een[`VectorMapLayer`](../../vectormaplayer/) met standaard symbolizer en voegt deze toe aan de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| layer | VectorLayer | Een vectorlaag om mee weer te geven[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` om de vectorlaag open te laten na de[`Map`](../) object is weggegooid; `false` om de laag te verwijderen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Laag is`null`. |

### Zie ook

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Creëert en voegt een[`VectorMapLayer`](../../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| layer | VectorLayer | Een vectorlaag om mee weer te geven[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. Als`null`, standaard symbolizer wordt gebruikt. |
| keepOpen | Boolean | `true` om de vectorlaag open te laten na de[`Map`](../) object is weggegooid; `false` om de laag te verwijderen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Laag is`null`. |

### Zie ook

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Creëert en voegt een[`VectorMapLayer`](../../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| layer | VectorLayer | Een vectorlaag om mee weer te geven[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. Als`null`, standaard symbolizer wordt gebruikt. |
| labeling | Labeling | Labeling om objecten in laag te labelen. Als`null` , standaard[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) zal worden gebruikt. |
| keepOpen | Boolean | `true` om de laag open te laten na de[`Map`](../) object is verwijderd; anders,`false` . |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Laag is`null`. |

### Zie ook

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Creëert en voegt een[`VectorMapLayer`](../../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Een reeks kenmerken om door weer te geven[`VectorMapLayer`](../../vectormaplayer/). |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Functievolgorde is`null`. |

### Zie ook

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Creëert en voegt een[`VectorMapLayer`](../../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Een reeks kenmerken om door weer te geven[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. Als`null`, standaard symbolizer wordt gebruikt. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Functievolgorde is`null`. |

### Zie ook

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Creëert en voegt een[`VectorMapLayer`](../../vectormaplayer/) naar de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Een reeks kenmerken om door weer te geven[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Een symbolizer om te gebruiken voor weergave. |
| labeling | Labeling | Labeling om objecten in laag te labelen. Als`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) zal worden gebruikt. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Functievolgorde is`null`. |

### Zie ook

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Voegt een laag toe aan de kaart. Lagen worden in aanvullende volgorde weergegeven.

```csharp
public void Add(MapLayer mapLayer)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| mapLayer | MapLayer | De laag die moet worden toegevoegd. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Argument is`null`. |

### Zie ook

* class [MapLayer](../../maplayer/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Creëert een[`RasterMapLayer`](../../rastermaplayer/) met standaardkleurmaker en voegt deze toe aan de kaart.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parameter | Type | Beschrijving |
| --- | --- | --- |
| layer | RasterLayer | Een vectorlaag om mee weer te geven[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | Een colorizer om te gebruiken voor weergave. Als`null`, wordt de standaardkleurmaker gebruikt. |
| keepOpen | Boolean | `true` om de rasterlaag open te laten na de[`Map`](../) object is weggegooid; `false` om de laag te verwijderen. |

### Uitzonderingen

| uitzondering | voorwaarde |
| --- | --- |
| ArgumentNullException | Laag is`null`. |

### Zie ook

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* naamruimte [Aspose.Gis.Rendering](../../map/)
* montage [Aspose.GIS](../../../)


