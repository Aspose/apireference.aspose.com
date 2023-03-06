---
title: Map.Add
second_title: Aspose.GIS för .NET API Referens
description: Map metod. Skapar enVectorMapLayer med standardsymboliseraren och lägger till den på kartan. Lager renderas i tilläggsordning.
type: docs
weight: 110
url: /sv/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Skapar en[`VectorMapLayer`](../../vectormaplayer/) med standardsymboliseraren och lägger till den på kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| layer | VectorLayer | Ett vektorlager att representera med[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` för att lämna vektorlagret öppet efter[`Map`](../) objektet kasseras; `false` för att ta bort lagret. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Lager är`null`. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Skapar och lägger till en[`VectorMapLayer`](../../vectormaplayer/) till kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| layer | VectorLayer | Ett vektorlager att representera med[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. Om`null`, standardsymboliseraren används. |
| keepOpen | Boolean | `true` för att lämna vektorlagret öppet efter[`Map`](../) objektet kasseras; `false` för att ta bort lagret. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Lager är`null`. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Skapar och lägger till en[`VectorMapLayer`](../../vectormaplayer/) till kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| layer | VectorLayer | Ett vektorlager att representera med[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. Om`null`, standardsymboliseraren används. |
| labeling | Labeling | Märkning att använda för att märka funktioner i lager. Om`null` , standard[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) kommer att användas. |
| keepOpen | Boolean | `true` att lämna lagret öppet efter[`Map`](../) föremål kasseras; annat,`false` . |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Lager är`null`. |

### Se även

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Skapar och lägger till en[`VectorMapLayer`](../../vectormaplayer/) till kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | En funktionssekvens att representera med[`VectorMapLayer`](../../vectormaplayer/). |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Funktioner sekvens är`null`. |

### Se även

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Skapar och lägger till en[`VectorMapLayer`](../../vectormaplayer/) till kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | En funktionssekvens att representera med[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. Om`null`, standardsymboliseraren används. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Funktioner sekvens är`null`. |

### Se även

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Skapar och lägger till en[`VectorMapLayer`](../../vectormaplayer/) till kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | En funktionssekvens att representera med[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | En symboliserare att använda för rendering. |
| labeling | Labeling | Märkning att använda för att märka funktioner i lager. Om`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) kommer att användas. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Funktioner sekvens är`null`. |

### Se även

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Lägger till ett lager på kartan. Lager renderas i tilläggsordning.

```csharp
public void Add(MapLayer mapLayer)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| mapLayer | MapLayer | Lagret som ska läggas till. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Argument är`null`. |

### Se även

* class [MapLayer](../../maplayer/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Skapar en[`RasterMapLayer`](../../rastermaplayer/) med standardfärgare och lägger till den på kartan.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parameter | Typ | Beskrivning |
| --- | --- | --- |
| layer | RasterLayer | Ett vektorlager att representera med[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | En färgsättare att använda för rendering. Om`null`, standardfärgare används. |
| keepOpen | Boolean | `true` att lämna rasterlagret öppet efter[`Map`](../) objektet kasseras; `false` för att ta bort lagret. |

### Undantag

| undantag | skick |
| --- | --- |
| ArgumentNullException | Lager är`null`. |

### Se även

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* namnutrymme [Aspose.Gis.Rendering](../../map/)
* hopsättning [Aspose.GIS](../../../)


