---
title: Map.Add
second_title: Aspose.GIS untuk Referensi .NET API
description: Map metode. Membuat aVectorMapLayer dengan simbol default dan menambahkannya ke peta. Lapisan dirender dalam urutan tambahan.
type: docs
weight: 110
url: /id/net/aspose.gis.rendering/map/add/
---
## Add(VectorLayer, bool) {#add_7}

Membuat a[`VectorMapLayer`](../../vectormaplayer/) dengan simbol default dan menambahkannya ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(VectorLayer layer, bool keepOpen = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| layer | VectorLayer | Lapisan vektor untuk diwakili oleh[`VectorMapLayer`](../../vectormaplayer/). |
| keepOpen | Boolean | `true` untuk membiarkan lapisan vektor terbuka setelah[`Map`](../) objek dibuang; `false` untuk membuang layer. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Lapisan adalah`null`. |

### Lihat juga

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, bool) {#add_6}

Membuat dan menambahkan a[`VectorMapLayer`](../../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, bool keepOpen = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| layer | VectorLayer | Lapisan vektor untuk diwakili oleh[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. Jika`null`, simbol default digunakan. |
| keepOpen | Boolean | `true` untuk membiarkan lapisan vektor terbuka setelah[`Map`](../) objek dibuang; `false` untuk membuang layer. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Lapisan adalah`null`. |

### Lihat juga

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(VectorLayer, VectorSymbolizer, Labeling, bool) {#add_5}

Membuat dan menambahkan a[`VectorMapLayer`](../../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(VectorLayer layer, VectorSymbolizer symbolizer, Labeling labeling, 
    bool keepOpen = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| layer | VectorLayer | Lapisan vektor untuk diwakili oleh[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. Jika`null`, simbol default digunakan. |
| labeling | Labeling | Pelabelan yang digunakan untuk memberi label pada fitur dalam lapisan. Jika`null` , bawaan[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) akan digunakan. |
| keepOpen | Boolean | `true` untuk meninggalkan lapisan terbuka setelah[`Map`](../) objek dibuang; jika tidak,`false` . |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Lapisan adalah`null`. |

### Lihat juga

* class [VectorLayer](../../../aspose.gis/vectorlayer/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(FeaturesSequence) {#add}

Membuat dan menambahkan a[`VectorMapLayer`](../../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(FeaturesSequence featuresSequence)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Urutan fitur untuk diwakili oleh[`VectorMapLayer`](../../vectormaplayer/). |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Urutan fitur adalah`null`. |

### Lihat juga

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer) {#add_1}

Membuat dan menambahkan a[`VectorMapLayer`](../../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Urutan fitur untuk diwakili oleh[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. Jika`null`, simbol default digunakan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Urutan fitur adalah`null`. |

### Lihat juga

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(FeaturesSequence, VectorSymbolizer, Labeling) {#add_2}

Membuat dan menambahkan a[`VectorMapLayer`](../../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(FeaturesSequence featuresSequence, VectorSymbolizer symbolizer, Labeling labeling)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| featuresSequence | FeaturesSequence | Urutan fitur untuk diwakili oleh[`VectorMapLayer`](../../vectormaplayer/). |
| symbolizer | VectorSymbolizer | Symboler yang digunakan untuk rendering. |
| labeling | Labeling | Pelabelan yang digunakan untuk memberi label pada fitur dalam lapisan. Jika`null` ,[`NullLabeling`](../../../aspose.gis.rendering.labelings/nulllabeling/) akan digunakan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Urutan fitur adalah`null`. |

### Lihat juga

* class [FeaturesSequence](../../../aspose.gis/featuressequence/)
* class [VectorSymbolizer](../../../aspose.gis.rendering.symbolizers/vectorsymbolizer/)
* class [Labeling](../../../aspose.gis.rendering.labelings/labeling/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(MapLayer) {#add_4}

Menambahkan lapisan ke peta. Lapisan dirender dalam urutan tambahan.

```csharp
public void Add(MapLayer mapLayer)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| mapLayer | MapLayer | Lapisan yang akan ditambahkan. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah`null`. |

### Lihat juga

* class [MapLayer](../../maplayer/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)

---

## Add(RasterLayer, RasterColorizer, bool) {#add_3}

Membuat a[`RasterMapLayer`](../../rastermaplayer/) dengan pewarna default dan menambahkannya ke peta.

```csharp
public void Add(RasterLayer layer, RasterColorizer colorizer = null, bool keepOpen = false)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| layer | RasterLayer | Lapisan vektor untuk diwakili oleh[`RasterLayer`](../../../aspose.gis.raster/rasterlayer/). |
| colorizer | RasterColorizer | Pewarna yang digunakan untuk rendering. Jika`null`, pewarna default digunakan. |
| keepOpen | Boolean | `true` untuk membiarkan lapisan raster terbuka setelah[`Map`](../) objek dibuang; `false` untuk membuang layer. |

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Lapisan adalah`null`. |

### Lihat juga

* class [RasterLayer](../../../aspose.gis.raster/rasterlayer/)
* class [RasterColorizer](../../../aspose.gis.rendering.colorizers/rastercolorizer/)
* class [Map](../)
* ruang nama [Aspose.Gis.Rendering](../../map/)
* perakitan [Aspose.GIS](../../../)


