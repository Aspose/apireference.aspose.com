---
title: Class GraphicsPathIterator
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Drawing2D.GraphicsPathIterator kelas. Memberikan kemampuan untuk melakukan iterasi melalui subpath di aGraphicsPath dan uji jenis bentuk yang terdapat di setiap subpath. Kelas ini tidak dapat diwariskan.
type: docs
weight: 270
url: /id/net/system.drawing.drawing2d/graphicspathiterator/
---
## GraphicsPathIterator class

Memberikan kemampuan untuk melakukan iterasi melalui subpath di aGraphicsPath dan uji jenis bentuk yang terdapat di setiap subpath. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class GraphicsPathIterator : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [GraphicsPathIterator](graphicspathiterator/)(GraphicsPath) | Menginisialisasi instance baru dari`GraphicsPathIterator` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Count](../../system.drawing.drawing2d/graphicspathiterator/count/) { get; } | Mendapat jumlah poin di jalur. |
| [SubpathCount](../../system.drawing.drawing2d/graphicspathiterator/subpathcount/) { get; } | Mendapat jumlah subpath di path. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [CopyData](../../system.drawing.drawing2d/graphicspathiterator/copydata/)(ref PointF[], ref byte[], int, int) | Menyalin properti GraphicsPath.PathPoints dan properti GraphicsPath.PathTypes arrays dari properti terkait[`GraphicsPath`](../graphicspath/) ke dalam dua array yang ditentukan. |
| [Dispose](../../system.drawing.drawing2d/graphicspathiterator/dispose/)() | Melakukan tugas yang ditentukan aplikasi terkait dengan membebaskan, melepaskan, atau menyetel ulang sumber daya yang tidak dikelola. |
| [Enumerate](../../system.drawing.drawing2d/graphicspathiterator/enumerate/)(ref PointF[], ref byte[]) | Menyalin properti GraphicsPath.PathPoints dan properti GraphicsPath.PathTypes arrays dari properti terkait[`GraphicsPath`](../graphicspath/) ke dalam dua array yang ditentukan. |
| [HasCurve](../../system.drawing.drawing2d/graphicspathiterator/hascurve/)() | Menunjukkan apakah jalur terkait dengan ini`GraphicsPathIterator` berisi kurva. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker_1)(GraphicsPath) | Ini`GraphicsPathIterator` objek memiliki a[`GraphicsPath`](../graphicspath/) objek yang terkait dengannya. Metode ini menambah yang terkait[`GraphicsPath`](../graphicspath/) ke penanda berikutnya di path dan menyalin semua titik yang terdapat antara penanda saat ini dan penanda berikutnya (atau ujung jalur) ke detik[`GraphicsPath`](../graphicspath/) objek diteruskan ke parameter. |
| [NextMarker](../../system.drawing.drawing2d/graphicspathiterator/nextmarker/#nextmarker)(out int, out int) | Menaikkan`GraphicsPathIterator`ke penanda berikutnya di path dan mengembalikan indeks mulai dan berhenti melalui parameter [keluar]. |
| [NextPathType](../../system.drawing.drawing2d/graphicspathiterator/nextpathtype/)(out byte, out int, out int) | Mendapat indeks awal dan indeks akhir dari grup titik data berikutnya yang semuanya memiliki tipe yang sama. |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath_1)(GraphicsPath, out bool) | Mendapat angka berikutnya (subjalur) dari jalur terkait ini`GraphicsPathIterator` . |
| [NextSubpath](../../system.drawing.drawing2d/graphicspathiterator/nextsubpath/#nextsubpath)(out int, out int, out bool) | Memindahkan`GraphicsPathIterator` ke subpath berikutnya di path. Indeks awal dan indeks akhir dari subjalur berikutnya dimuat dalam parameter [keluar]. |
| [Rewind](../../system.drawing.drawing2d/graphicspathiterator/rewind/)() | Memundurkan ini`GraphicsPathIterator` ke awal jalur terkaitnya. |

### Lihat juga

* ruang nama [System.Drawing.Drawing2D](../../system.drawing.drawing2d/)
* perakitan [Aspose.Drawing](../../)


