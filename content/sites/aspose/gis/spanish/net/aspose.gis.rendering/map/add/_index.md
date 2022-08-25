---
title: Add
second_title: Referencia de API de Aspose.GIS para .NET
description: Crea unVectorMapLayeraspose.gis.rendering/vectormaplayer con el símbolo predeterminado y lo agrega al mapa. Las capas se renderizan en orden adicional.
type: docs
weight: 110
url: /es/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Crea un[`VectorMapLayer`](../../vectormaplayer) con el símbolo predeterminado y lo agrega al mapa. Las capas se renderizan en orden adicional.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| layer | VectorLayer | Una capa vectorial para representar por[`VectorMapLayer`](../../vectormaplayer). |
| keepOpen | Boolean | `true` para dejar la capa vectorial abierta después de la[`Map`](../../map) se desecha el objeto; `false` para disponer de la capa. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La capa es`null`. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Crea y agrega un[`VectorMapLayer`](../../vectormaplayer) al mapa Las capas se renderizan en orden adicional.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| layer | VectorLayer | Una capa vectorial para representar por[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. Si`null`, se utiliza el símbolo predeterminado. |
| keepOpen | Boolean | `true` para dejar la capa vectorial abierta después de la[`Map`](../../map) se desecha el objeto; `false` para disponer de la capa. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La capa es`null`. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Crea y agrega un[`VectorMapLayer`](../../vectormaplayer) al mapa Las capas se renderizan en orden adicional.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| layer | VectorLayer | Una capa vectorial para representar por[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. Si`null`, se utiliza el símbolo predeterminado. |
| labeling | Labeling | Etiquetado para usar para etiquetar entidades en la capa. Si`null` , defecto[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) se utilizará. |
| keepOpen | Boolean | `true` para dejar la capa abierta después de la[`Map`](../../map) se desecha el objeto; de lo contrario,`false` . |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La capa es`null`. |

### Ver también

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Crea y agrega un[`VectorMapLayer`](../../vectormaplayer) al mapa Las capas se renderizan en orden adicional.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Una secuencia de características para representar por[`VectorMapLayer`](../../vectormaplayer). |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La secuencia de características es`null`. |

### Ver también

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Crea y agrega un[`VectorMapLayer`](../../vectormaplayer) al mapa Las capas se renderizan en orden adicional.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Una secuencia de características para representar por[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. Si`null`, se utiliza el símbolo predeterminado. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La secuencia de características es`null`. |

### Ver también

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Crea y agrega un[`VectorMapLayer`](../../vectormaplayer) al mapa Las capas se renderizan en orden adicional.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Una secuencia de características para representar por[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Un simbolizador que se utilizará para renderizar. |
| labeling | Labeling | Etiquetado para usar para etiquetar entidades en la capa. Si`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) se utilizará. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La secuencia de características es`null`. |

### Ver también

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Agrega una capa al mapa. Las capas se renderizan en orden adicional.

```csharp
public void Add(MapLayer mapLayer)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| mapLayer | MapLayer | La capa que se agregará. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | El argumento es`null`. |

### Ver también

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Crea un[`RasterMapLayer`](../../rastermaplayer) con el colorizador predeterminado y lo agrega al mapa.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parámetro | Escribe | Descripción |
| --- | --- | --- |
| layer | RasterLayer | Una capa vectorial para representar por[`RasterLayer`](../../../aspose.gis.raster/rasterlayer). |
| colorizer | RasterColorizer | Un colorizador para usar para renderizar. Si`null`, se utiliza el colorizador predeterminado. |
| keepOpen | Boolean | `true` para dejar la capa ráster abierta después de la[`Map`](../../map) se desecha el objeto; `false` para disponer de la capa. |

### Excepciones

| excepción | condición |
| --- | --- |
| ArgumentNullException | La capa es`null`. |

### Ver también

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* espacio de nombres [Aspose.Gis.Rendering](../../map)
* asamblea [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
