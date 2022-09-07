---
title: VectorMapLayer
second_title: Riferimento API Aspose.GIS per .NET
description: Crea una nuova istanza con il simbolizzatore predefinito.
type: docs
weight: 10
url: /it/net/aspose.gis.rendering/vectormaplayer/vectormaplayer/
---
## VectorMapLayer(FeaturesSequence) {#constructor}

Crea una nuova istanza con il simbolizzatore predefinito.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Sequenza delle caratteristiche. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |

### Guarda anche

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorMapLayer](../../vectormaplayer)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer)
* assemblea [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer) {#constructor_1}

Crea una nuova istanza con il simbolizzatore predefinito.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Sequenza delle caratteristiche. |
| symbolizer | VectorSymbolizer | Simbolizzatore da utilizzare per il rendering del livello. Se`null`, verrà utilizzato il simbolizzatore predefinito. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |

### Guarda anche

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [VectorMapLayer](../../vectormaplayer)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer)
* assemblea [Aspose.GIS](../../../)

---

## VectorMapLayer(FeaturesSequence, VectorSymbolizer, Labeling) {#constructor_2}

Crea una nuova istanza con il simbolizzatore predefinito.

```csharp
public VectorMapLayer(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, 
    Labeling labeling)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Sequenza delle caratteristiche. |
| symbolizer | VectorSymbolizer | Simbolizzatore da utilizzare per il rendering del livello. Se`null`, verrà utilizzato il simbolizzatore predefinito. |
| labeling | Labeling | Etichettatura da utilizzare per etichettare le funzioni nel livello. Se`null` , predefinito[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) verrà utilizzato. |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | L'argomento è`null`. |

### Guarda anche

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [VectorMapLayer](../../vectormaplayer)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer)
* assemblea [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, bool) {#constructor_5}

Crea una nuova istanza con il simbolizzatore predefinito.

```csharp
public VectorMapLayer(VectorLayer layer, bool keepOpen = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | VectorLayer | Livello vettoriale. |
| keepOpen | Boolean | `true` per lasciare lo strato aperto dopo il[`VectorMapLayer`](../../vectormaplayer) l'oggetto è eliminato; altrimenti,`false` . |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorMapLayer](../../vectormaplayer)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer)
* assemblea [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, bool) {#constructor_4}

Crea una nuova istanza.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | VectorLayer | Livello vettoriale. |
| symbolizer | VectorSymbolizer | Simbolizzatore da utilizzare per il rendering del livello. Se`null`, verrà utilizzato il simbolizzatore predefinito. |
| keepOpen | Boolean | `true` per lasciare lo strato aperto dopo il[`VectorMapLayer`](../../vectormaplayer) l'oggetto è eliminato; altrimenti,`false` . |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [VectorMapLayer](../../vectormaplayer)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer)
* assemblea [Aspose.GIS](../../../)

---

## VectorMapLayer(VectorLayer, VectorSymbolizer, Labeling, bool) {#constructor_3}

Crea una nuova istanza.

```csharp
public VectorMapLayer(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = true)
```

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| layer | VectorLayer | Livello vettoriale. |
| symbolizer | VectorSymbolizer | Simbolizzatore da utilizzare per il rendering del livello. Se`null` verrà utilizzato il simbolizzatore predefinito. |
| labeling | Labeling | Etichettatura da utilizzare per etichettare le funzioni nel livello. Se`null` , predefinito[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) verrà utilizzato. |
| keepOpen | Boolean | `true` per lasciare lo strato aperto dopo il[`VectorMapLayer`](../../vectormaplayer) l'oggetto è eliminato; altrimenti,`false` . |

### Eccezioni

| eccezione | condizione |
| --- | --- |
| ArgumentNullException | Lo strato è`null`. |

### Guarda anche

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [VectorMapLayer](../../vectormaplayer)
* spazio dei nomi [Aspose.Gis.Rendering](../../vectormaplayer)
* assemblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
