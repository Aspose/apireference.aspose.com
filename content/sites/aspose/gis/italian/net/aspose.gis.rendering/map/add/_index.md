---
title: Add
second_title: Riferimento API Aspose.GIS per .NET
description: Crea aVectorMapLayeraspose.gis.rendering/vectormaplayer con il simbolizzatore predefinito e lo aggiunge alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.
type: docs
weight: 110
url: /it/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Crea a[`VectorMapLayer`](../../vectormaplayer) con il simbolizzatore predefinito e lo aggiunge alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | VectorLayer | Un livello vettoriale da rappresentare[`VectorMapLayer`](../../vectormaplayer). |
| keepOpen | Boolean | `true` per lasciare il livello vettoriale aperto dopo il[`Map`](../../map) l'oggetto è eliminato; `false` per eliminare il livello. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Crea e aggiunge a[`VectorMapLayer`](../../vectormaplayer) alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | VectorLayer | Un livello vettoriale da rappresentare[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizzatore da utilizzare per il rendering. Se`null`, viene utilizzato il simbolizzatore predefinito. |
| keepOpen | Boolean | `true` per lasciare il livello vettoriale aperto dopo il[`Map`](../../map) l'oggetto è eliminato; `false` per eliminare il livello. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Crea e aggiunge a[`VectorMapLayer`](../../vectormaplayer) alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | VectorLayer | Un livello vettoriale da rappresentare[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizzatore da utilizzare per il rendering. Se`null`, viene utilizzato il simbolizzatore predefinito. |
| labeling | Labeling | Etichettatura da utilizzare per etichettare le funzioni nel livello. Se`null` , predefinito[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) verrà utilizzato. |
| keepOpen | Boolean | `true` per lasciare lo strato aperto dopo il[`Map`](../../map) l'oggetto è eliminato; altrimenti,`false` . |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Crea e aggiunge a[`VectorMapLayer`](../../vectormaplayer) alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Una sequenza di caratteristiche da rappresentare[`VectorMapLayer`](../../vectormaplayer). |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | La sequenza delle caratteristiche è`null`. |

### Guarda anche

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Crea e aggiunge a[`VectorMapLayer`](../../vectormaplayer) alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Una sequenza di caratteristiche da rappresentare[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizzatore da utilizzare per il rendering. Se`null`, viene utilizzato il simbolizzatore predefinito. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | La sequenza delle caratteristiche è`null`. |

### Guarda anche

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Crea e aggiunge a[`VectorMapLayer`](../../vectormaplayer) alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Una sequenza di caratteristiche da rappresentare[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizzatore da utilizzare per il rendering. |
| labeling | Labeling | Etichettatura da utilizzare per etichettare le funzioni nel livello. Se`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) verrà utilizzato. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | La sequenza delle caratteristiche è`null`. |

### Guarda anche

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Aggiunge un livello alla mappa. I livelli vengono visualizzati in ordine aggiuntivo.

```csharp
public void Add(MapLayer mapLayer)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| mapLayer | MapLayer | Il livello da aggiungere. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |

### Guarda anche

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Crea a[`RasterMapLayer`](../../rastermaplayer) con il colorizer predefinito e lo aggiunge alla mappa.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | RasterLayer | Un livello vettoriale da rappresentare[`RasterLayer`](../../../aspose.gis.raster/rasterlayer). |
| colorizer | RasterColorizer | Un colorizer da usare per il rendering. Se`null`, viene utilizzato il colorizer predefinito. |
| keepOpen | Boolean | `true` per lasciare il livello raster aperto dopo il[`Map`](../../map) l'oggetto è eliminato; `false` per eliminare il livello. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* spazio dei nomi [Aspose.Gis.Rendering](../../map)
* assemblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
