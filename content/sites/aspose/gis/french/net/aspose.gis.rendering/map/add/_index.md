---
title: Add
second_title: Référence de l'API Aspose.GIS pour .NET
description: Crée unVectorMapLayeraspose.gis.rendering/vectormaplayer avec le symboliseur par défaut et lajoute à la carte. Les calques sont rendus dans lordre supplémentaire.
type: docs
weight: 110
url: /fr/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Crée un[`VectorMapLayer`](../../vectormaplayer) avec le symboliseur par défaut et l'ajoute à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| layer | VectorLayer | Une couche vectorielle à représenter par[`VectorMapLayer`](../../vectormaplayer). |
| keepOpen | Boolean | `true` pour laisser le calque vectoriel ouvert après la[`Map`](../../map) l'objet est supprimé ; `false` pour disposer la couche. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le calque est`null`. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Crée et ajoute un[`VectorMapLayer`](../../vectormaplayer) à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| layer | VectorLayer | Une couche vectorielle à représenter par[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Symboliseur à utiliser pour le rendu. Si`null`, le symboliseur par défaut est utilisé. |
| keepOpen | Boolean | `true` pour laisser le calque vectoriel ouvert après la[`Map`](../../map) l'objet est supprimé ; `false` pour disposer la couche. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le calque est`null`. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Crée et ajoute un[`VectorMapLayer`](../../vectormaplayer) à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| layer | VectorLayer | Une couche vectorielle à représenter par[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Symboliseur à utiliser pour le rendu. Si`null`, le symboliseur par défaut est utilisé. |
| labeling | Labeling | Étiquetage à utiliser pour étiqueter les entités dans la couche. Si`null` , défaut[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) sera utilisé. |
| keepOpen | Boolean | `true` pour laisser le calque ouvert après le[`Map`](../../map) l'objet est éliminé ; Par ailleurs,`false` . |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le calque est`null`. |

### Voir également

* class [VectorLayer](../../../aspose.gis/vectorlayer)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Crée et ajoute un[`VectorMapLayer`](../../vectormaplayer) à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Une séquence de caractéristiques à représenter par[`VectorMapLayer`](../../vectormaplayer). |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | La séquence des fonctionnalités est`null`. |

### Voir également

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Crée et ajoute un[`VectorMapLayer`](../../vectormaplayer) à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Une séquence de caractéristiques à représenter par[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Symboliseur à utiliser pour le rendu. Si`null`, le symboliseur par défaut est utilisé. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | La séquence des fonctionnalités est`null`. |

### Voir également

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Crée et ajoute un[`VectorMapLayer`](../../vectormaplayer) à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Une séquence de caractéristiques à représenter par[`VectorMapLayer`](../../vectormaplayer). |
| symbolizer | VectorSymbolizer | Symboliseur à utiliser pour le rendu. |
| labeling | Labeling | Étiquetage à utiliser pour étiqueter les entités dans la couche. Si`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling) sera utilisé. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | La séquence des fonctionnalités est`null`. |

### Voir également

* class [FeaturesSequence](../../../aspose.gis/featuressequence)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Ajoute une couche à la carte. Les calques sont rendus dans l'ordre supplémentaire.

```csharp
public void Add(MapLayer mapLayer)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| mapLayer | MapLayer | La couche à ajouter. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | L'argument est`null`. |

### Voir également

* class [MapLayer](../../maplayer)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Crée un[`RasterMapLayer`](../../rastermaplayer) avec le coloriseur par défaut et l'ajoute à la carte.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Paramètre | Taper | La description |
| --- | --- | --- |
| layer | RasterLayer | Une couche vectorielle à représenter par[`RasterLayer`](../../../aspose.gis.raster/rasterlayer). |
| colorizer | RasterColorizer | Un coloriseur à utiliser pour le rendu. Si`null`, le coloriseur par défaut est utilisé. |
| keepOpen | Boolean | `true` pour laisser la couche raster ouverte après la[`Map`](../../map) l'objet est supprimé ; `false` pour disposer la couche. |

### Exceptions

| exception | condition |
| --- | --- |
| ArgumentNullException | Le calque est`null`. |

### Voir également

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer)
* class [Map](../../map)
* espace de noms [Aspose.Gis.Rendering](../../map)
* Assemblée [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
