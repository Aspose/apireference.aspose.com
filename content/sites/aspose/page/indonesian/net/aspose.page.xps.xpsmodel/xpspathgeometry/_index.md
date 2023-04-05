---
title: Class XpsPathGeometry
second_title: Aspose.Page untuk Referensi .NET API
description: Aspose.Page.XPS.XpsModel.XpsPathGeometry kelas. Kelas yang merangkum fitur elemen properti PathGeometry. Elemen ini berisi kumpulan gambar jalur yang ditentukan dengan atribut Figures atau dengan elemen PathFigure anak.
type: docs
weight: 3270
url: /id/net/aspose.page.xps.xpsmodel/xpspathgeometry/
---
## XpsPathGeometry class

Kelas yang merangkum fitur elemen properti PathGeometry. Elemen ini berisi kumpulan gambar jalur yang ditentukan dengan atribut Figures atau dengan elemen PathFigure anak.

```csharp
public sealed class XpsPathGeometry : XpsArray<XpsPathFigure>
```

## Properti

| Nama | Keterangan |
| --- | --- |
| [Count](../../aspose.page.xps.xpsmodel/xpsarray-1/count/) { get; } |  |
| [FillRule](../../aspose.page.xps.xpsmodel/xpspathgeometry/fillrule/) { get; set; } | Mengembalikan/mengatur nilai yang menentukan bagaimana area berpotongan dari bentuk geometric digabungkan untuk membentuk suatu wilayah. |
| [Item](../../aspose.page.xps.xpsmodel/xpsarray-1/item/) { get; } |  |
| [PathFigures](../../aspose.page.xps.xpsmodel/xpspathgeometry/pathfigures/) { get; } | Mengembalikan daftar angka jalur anak. |
| [Transform](../../aspose.page.xps.xpsmodel/xpspathgeometry/transform/) { get; set; } | Mengembalikan/mengatur matriks transformasi affine yang membentuk transformasi matriks lokal yang diterapkan ke semua elemen turunan dan turunan dari geometri jalur sebelum digunakan untuk mengisi, memotong, atau membelai. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmodel/xpsarray-1/add/)(XpsPathFigure) |  |
| [AddSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/addsegment/)(XpsPathSegment) | Menambahkan segmen jalur ke daftar segmen anak dari figur pah terakhir. |
| [Clone](../../aspose.page.xps.xpsmodel/xpspathgeometry/clone/)() | Menggandakan geometri jalur ini. |
| [Insert](../../aspose.page.xps.xpsmodel/xpsarray-1/insert/)(int, XpsPathFigure) |  |
| [InsertSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/insertsegment/)(int, XpsPathSegment) | Menyisipkan segmen jalur ke daftar segmen anak dari gambar jalur terakhir di*index* posisi. |
| [Remove](../../aspose.page.xps.xpsmodel/xpsarray-1/remove/)(XpsPathFigure) |  |
| [RemoveAt](../../aspose.page.xps.xpsmodel/xpsarray-1/removeat/)(int) |  |
| [RemoveSegment](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegment/)(XpsPathSegment) | Menghapus segmen jalur dari daftar segmen anak dari gambar jalur terakhir. |
| [RemoveSegmentAt](../../aspose.page.xps.xpsmodel/xpspathgeometry/removesegmentat/)(int) | Menghapus segmen jalur dari daftar segmen anak gambar jalur terakhir di*index* posisi. |

### Lihat juga

* class [XpsArray&lt;T&gt;](../xpsarray-1/)
* class [XpsPathFigure](../xpspathfigure/)
* ruang nama [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* perakitan [Aspose.Page](../../)


