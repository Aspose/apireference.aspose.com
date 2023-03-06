---
title: Map.Add
second_title: Aspose.GIS for .NET API Referansı
description: Map yöntem. oluştururVectorMapLayer varsayılan sembolleştirici ile ve haritaya ekler. Katmanlar ek sırayla işlenir.
type: docs
weight: 110
url: /tr/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

oluşturur[`VectorMapLayer`](../../vectormaplayer/) varsayılan sembolleştirici ile ve haritaya ekler. Katmanlar ek sırayla işlenir.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| layer | VectorLayer | Temsil edilecek bir vektör katmanı[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` sonra vektör katmanını açık bırakmak için[`Map`](../) nesne atıldı; `false` katmanı atmak için. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | katman`null`. |

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Bir oluşturur ve ekler[`VectorMapLayer`](../../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| layer | VectorLayer | Temsil edilecek bir vektör katmanı[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. Eğer`null`, varsayılan simgeleyici kullanılır. |
| keepOpen | Boolean | `true` sonra vektör katmanını açık bırakmak için[`Map`](../) nesne atıldı; `false` katmanı atmak için. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | katman`null`. |

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Bir oluşturur ve ekler[`VectorMapLayer`](../../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| layer | VectorLayer | Temsil edilecek bir vektör katmanı[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. Eğer`null`, varsayılan simgeleyici kullanılır. |
| labeling | Labeling | Katmandaki özellikleri etiketlemek için kullanılacak etiketleme. Eğer`null` , varsayılan[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) kullanılacak. |
| keepOpen | Boolean | `true` sonra katmanı açık bırakmak için[`Map`](../) nesne atılır; aksi takdirde,`false` . |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | katman`null`. |

### Ayrıca bakınız

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Bir oluşturur ve ekler[`VectorMapLayer`](../../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Temsil edilecek bir özellik dizisi[`VectorMapLayer`](../../vectormaplayer/). |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Özellikler sırası`null`. |

### Ayrıca bakınız

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Bir oluşturur ve ekler[`VectorMapLayer`](../../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Temsil edilecek bir özellik dizisi[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. Eğer`null`, varsayılan simgeleyici kullanılır. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Özellikler sırası`null`. |

### Ayrıca bakınız

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Bir oluşturur ve ekler[`VectorMapLayer`](../../vectormaplayer/) haritaya Katmanlar ek sırayla işlenir.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Temsil edilecek bir özellik dizisi[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | İşleme için kullanılacak bir sembolleştirici. |
| labeling | Labeling | Katmandaki özellikleri etiketlemek için kullanılacak etiketleme. Eğer`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) kullanılacak. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Özellikler sırası`null`. |

### Ayrıca bakınız

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Haritaya bir katman ekler. Katmanlar ek sırayla işlenir.

```csharp
public void Add(MapLayer mapLayer)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| mapLayer | MapLayer | Eklenecek katman. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | bağımsız değişken`null`. |

### Ayrıca bakınız

* class [MapLayer](../../maplayer/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

oluşturur[`RasterMapLayer`](../../rastermaplayer/) varsayılan renklendirici ile ve haritaya ekler.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| layer | RasterLayer | Temsil edilecek bir vektör katmanı[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | İşleme için kullanılacak bir renklendirici. Eğer`null`, varsayılan renklendirici kullanılır. |
| keepOpen | Boolean | `true` sonra raster katmanını açık bırakmak için[`Map`](../) nesne atıldı; `false` katmanı atmak için. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | katman`null`. |

### Ayrıca bakınız

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* ad alanı [Aspose.Gis.Rendering](../../map/)
* toplantı [Aspose.GIS](../../../)


