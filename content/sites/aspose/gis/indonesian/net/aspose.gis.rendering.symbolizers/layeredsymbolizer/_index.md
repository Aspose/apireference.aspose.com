---
title: Class LayeredSymbolizer
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer kelas. Simbol yang merender beberapa simbol lainnya.
type: docs
weight: 1830
url: /id/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

Simbol yang merender beberapa simbol lainnya.

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | Membuat instance baru. |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | Membuat instance baru. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | Mendapat jumlah simbol. |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | Mendapatkan simbol pada indeks yang ditentukan . |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | Menentukan urutan rendering. ByFeatures - render semua simbol untuk fitur tersebut, lalu lanjutkan ke fitur berikutnya.ByLayers - render semua fitur dengan simbol, lalu lanjutkan ke simbol berikutnya. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | Menambahkan simbol yang ditentukan. |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | Mengembalikan pencacah yang mengulang melalui koleksi. |

### Lihat juga

* class [VectorSymbolizer](../vectorsymbolizer/)
* ruang nama [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* perakitan [Aspose.GIS](../../)


