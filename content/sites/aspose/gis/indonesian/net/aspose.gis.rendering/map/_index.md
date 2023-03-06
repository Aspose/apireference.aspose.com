---
title: Class Map
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Rendering.Map kelas. Peta adalah kumpulan lapisan yang dapat dirender di atas satu sama lain melaluiRenderer .
type: docs
weight: 1720
url: /id/net/aspose.gis.rendering/map/
---
## Map class

Peta adalah kumpulan lapisan yang dapat dirender di atas satu sama lain melalui[`Renderer`](../renderer/) .

```csharp
public class Map : IDisposable, IReadOnlyList<MapLayer>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Map](map/)(Measurement, Measurement) | Membuat instance baru dari`Peta` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [BackgroundColor](../../aspose.gis.rendering/map/backgroundcolor/) { get; set; } | Warna latar belakang peta. Default keTransparent . |
| [Count](../../aspose.gis.rendering/map/count/) { get; } | Mendapat jumlah lapisan di peta. |
| [Extent](../../aspose.gis.rendering/map/extent/) { get; set; } | Menentukan batas peta yang akan dirender. Jika disetel ke`null` , jangkauan dihitung selama rendering untuk menyertakan semua geometri di semua lapisan. |
| [Height](../../aspose.gis.rendering/map/height/) { get; set; } | Ketinggian visual peta. |
| [Item](../../aspose.gis.rendering/map/item/) { get; } | Mendapat lapisan pada indeks yang ditentukan. |
| [Padding](../../aspose.gis.rendering/map/padding/) { get; set; } | Menentukan padding untuk ditambahkan ke jangkauan. |
| [Resolution](../../aspose.gis.rendering/map/resolution/) { get; set; } | Resolusi yang akan digunakan untuk merender peta ini dan untuk mengonversi antara[`Measurement`](../measurement/) . Default ke 96. |
| [SpatialReferenceSystem](../../aspose.gis.rendering/map/spatialreferencesystem/) { get; set; } | [`SpatialReferenceSystem`](./spatialreferencesystem/) dari peta. |
| [Width](../../aspose.gis.rendering/map/width/) { get; set; } | Lebar visual peta. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add](../../aspose.gis.rendering/map/add/#add)(FeaturesSequence) | Membuat dan menambahkan a[`VectorMapLayer`](../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan. |
| [Add](../../aspose.gis.rendering/map/add/#add_4)(MapLayer) | Menambahkan lapisan ke peta. Lapisan dirender dalam urutan tambahan. |
| [Add](../../aspose.gis.rendering/map/add/#add_1)(FeaturesSequence, VectorSymbolizer) | Membuat dan menambahkan a[`VectorMapLayer`](../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan. |
| [Add](../../aspose.gis.rendering/map/add/#add_7)(VectorLayer, bool) | Membuat a[`VectorMapLayer`](../vectormaplayer/) dengan simbol default dan menambahkannya ke peta. Lapisan dirender dalam urutan tambahan. |
| [Add](../../aspose.gis.rendering/map/add/#add_2)(FeaturesSequence, VectorSymbolizer, Labeling) | Membuat dan menambahkan a[`VectorMapLayer`](../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan. |
| [Add](../../aspose.gis.rendering/map/add/#add_3)(RasterLayer, RasterColorizer, bool) | Membuat a[`RasterMapLayer`](../rastermaplayer/) dengan pewarna default dan menambahkannya ke peta. |
| [Add](../../aspose.gis.rendering/map/add/#add_6)(VectorLayer, VectorSymbolizer, bool) | Membuat dan menambahkan a[`VectorMapLayer`](../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan. |
| [Add](../../aspose.gis.rendering/map/add/#add_5)(VectorLayer, VectorSymbolizer, Labeling, bool) | Membuat dan menambahkan a[`VectorMapLayer`](../vectormaplayer/) ke peta. Lapisan dirender dalam urutan tambahan. |
| [Dispose](../../aspose.gis.rendering/map/dispose/)() | Membuang sumber daya. |
| [GetEnumerator](../../aspose.gis.rendering/map/getenumerator/)() | Mengembalikan pencacah yang mengulang melalui lapisan di peta. |
| [Render](../../aspose.gis.rendering/map/render/#render)(AbstractPath, Renderer) | Membuat peta menjadi file. |
| [Render](../../aspose.gis.rendering/map/render/#render_1)(string, Renderer) | Membuat peta menjadi file. |

### Lihat juga

* class [MapLayer](../maplayer/)
* ruang nama [Aspose.Gis.Rendering](../../aspose.gis.rendering/)
* perakitan [Aspose.GIS](../../)


