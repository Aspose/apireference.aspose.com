---
title: Class Region
second_title: Aspose.Drawing untuk Referensi .NET API
description: System.Drawing.Region kelas. Menjelaskan interior bentuk grafik yang terdiri dari persegi panjang dan jalur. Kelas ini tidak dapat diwariskan.
type: docs
weight: 1060
url: /id/net/system.drawing/region/
---
## Region class

Menjelaskan interior bentuk grafik yang terdiri dari persegi panjang dan jalur. Kelas ini tidak dapat diwariskan.

```csharp
public sealed class Region : IDisposable
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Region](region/#constructor)() | Menginisialisasi instance baru dari`Region` kelas. |
| [Region](region/#constructor_1)(GraphicsPath) | Menginisialisasi instance baru dari`Region` kelas dengan yang ditentukanGraphicsPath . |
| [Region](region/#constructor_3)(Rectangle) | Menginisialisasi instance baru dari`Region` kelas dari yang ditentukanRectangle struktur. |
| [Region](region/#constructor_4)(RectangleF) | Menginisialisasi instance baru dari`Region` kelas dari yang ditentukanRectangleF struktur. |
| [Region](region/#constructor_2)(RegionData) | Menginisialisasi instance baru dari`Region` kelas dari data yang ditentukan. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../system.drawing/region/clone/)() | Membuat salinan persis dari iniRegion . |
| [Complement](../../system.drawing/region/complement/#complement)(GraphicsPath) | Memperbarui iniRegion mengandung bagian yang ditentukanGraphicsPath itu tidak tidak bersinggungan dengan iniRegion . |
| [Complement](../../system.drawing/region/complement/#complement_1)(Rectangle) | Memperbarui iniRegion mengandung bagian yang ditentukanRectangle structure yang tidak bersinggungan dengan iniRegion . |
| [Complement](../../system.drawing/region/complement/#complement_2)(RectangleF) | Memperbarui iniRegion mengandung bagian yang ditentukanRectangleF structure yang tidak bersinggungan dengan iniRegion . |
| [Complement](../../system.drawing/region/complement/#complement_3)(Region) | Memperbarui iniRegion mengandung bagian yang ditentukanRegionitu tidak bersinggungan dengan iniRegion . |
| [Dispose](../../system.drawing/region/dispose/)() | Merilis semua sumber daya yang digunakan oleh iniRegion . |
| [Equals](../../system.drawing/region/equals/#equals)(Region, Graphics) | Menguji apakah yang ditentukanRegion identik dengan iniRegion pada permukaan gambar yang ditentukan. |
| [Exclude](../../system.drawing/region/exclude/#exclude)(GraphicsPath) | Memperbarui iniRegion berisi hanya bagian interiornya yang tidak bersinggungan dengan yang ditentukanGraphicsPath . |
| [Exclude](../../system.drawing/region/exclude/#exclude_1)(Rectangle) | Memperbarui iniRegion berisi hanya bagian interiornya yang tidak berpotongan dengan yang ditentukanRectangle struktur. |
| [Exclude](../../system.drawing/region/exclude/#exclude_2)(RectangleF) | Memperbarui iniRegion berisi hanya bagian interiornya yang tidak bersinggungan dengan yang ditentukanRectangleF struktur. |
| [Exclude](../../system.drawing/region/exclude/#exclude_3)(Region) | Memperbarui iniRegion berisi hanya bagian interiornya yang tidak berpotongan dengan yang ditentukanRegion . |
| [GetBounds](../../system.drawing/region/getbounds/)(Graphics) | Mendapat aRectangleF struktur yang mewakili persegi panjang yang membatasi iniRegion pada permukaan gambar aGraphics objek. |
| [GetRegionData](../../system.drawing/region/getregiondata/)() | Mengembalikan aRegionData yang mewakili informasi yang menjelaskan iniRegion . |
| [GetRegionScans](../../system.drawing/region/getregionscans/)(Matrix) | Mengembalikan arrayRectangleF struktur yang mendekati iniRegion setelah transformasi matriks yang ditentukan diterapkan. |
| [Intersect](../../system.drawing/region/intersect/#intersect)(GraphicsPath) | Memperbarui iniRegion ke persimpangan dirinya dengan yang ditentukanGraphicsPath . |
| [Intersect](../../system.drawing/region/intersect/#intersect_1)(Rectangle) | Memperbarui iniRegion ke persimpangan dirinya dengan yang ditentukanRectangle struktur. |
| [Intersect](../../system.drawing/region/intersect/#intersect_2)(RectangleF) | Memperbarui iniRegion ke persimpangan dirinya sendiri dengan yang ditentukan RectangleF struktur. |
| [Intersect](../../system.drawing/region/intersect/#intersect_3)(Region) | Memperbarui iniRegion ke persimpangan dirinya dengan yang ditentukanRegion . |
| [IsEmpty](../../system.drawing/region/isempty/)(Graphics) | Menguji apakah iniRegion memiliki interior kosong pada permukaan gambar yang ditentukan. |
| [IsInfinite](../../system.drawing/region/isinfinite/)(Graphics) | Menguji apakah iniRegion memiliki interior tak terbatas pada permukaan gambar yang ditentukan. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_7)(Point) | Menguji apakah yang ditentukanPoint struktur terkandung di dalamnyaRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_9)(PointF) | Menguji apakah yang ditentukanPointF struktur terkandung di dalamnyaRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_11)(Rectangle) | Menguji apakah ada bagian yang ditentukanRectangle struktur terkandung dalam this Region . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_13)(RectangleF) | Menguji apakah ada bagian yang ditentukanRectangleF struktur terkandung dalam iniRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_3)(float, float) | Menguji apakah titik yang ditentukan terkandung di dalamnyaRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_8)(Point, Graphics) | Menguji apakah yang ditentukanPoint struktur terkandung di dalamnyaRegion saat digambar menggunakan yang ditentukanGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_10)(PointF, Graphics) | Menguji apakah yang ditentukanPointF struktur terkandung di dalamnyaRegion saat digambar menggunakan yang ditentukanGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_12)(Rectangle, Graphics) | Menguji apakah ada bagian yang ditentukanRectangle struktur terkandung dalam iniRegion saat digambar menggunakan yang ditentukanGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_14)(RectangleF, Graphics) | Menguji apakah ada bagian yang ditentukanRectangleF struktur terkandung dalam iniRegion saat digambar menggunakan yang ditentukanGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_6)(float, float, Graphics) | Menguji apakah titik yang ditentukan terkandung di dalamnyaRegion saat digambar menggunakan yang ditentukanGraphics. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_2)(int, int, Graphics) | Menguji apakah titik yang ditentukan terkandung di dalamnyaRegion objek saat digambar menggunakan yang ditentukanGraphics objek. |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_4)(float, float, float, float) | Menguji apakah ada bagian dari persegi panjang yang ditentukan di dalamnyaRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible)(int, int, int, int) | Menguji apakah ada bagian dari persegi panjang yang ditentukan di dalamnyaRegion . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_5)(float, float, float, float, Graphics) | Menguji apakah ada bagian dari persegi panjang yang ditentukan di dalamnyaRegion saat digambar menggunakan yang ditentukanGraphics . |
| [IsVisible](../../system.drawing/region/isvisible/#isvisible_1)(int, int, int, int, Graphics) | Menguji apakah ada bagian dari persegi panjang yang ditentukan di dalamnyaRegion saat digambar menggunakan yang ditentukanGraphics . |
| [MakeEmpty](../../system.drawing/region/makeempty/)() | Menginisialisasi iniRegion ke interior kosong. |
| [MakeInfinite](../../system.drawing/region/makeinfinite/)() | Menginisialisasi iniRegion objek ke interior tak terbatas. |
| [Transform](../../system.drawing/region/transform/)(Matrix) | Mengubah iniRegion oleh yang ditentukanMatrix . |
| [Translate](../../system.drawing/region/translate/#translate_1)(float, float) | Mengimbangi koordinat iniRegion dengan jumlah yang ditentukan. |
| [Translate](../../system.drawing/region/translate/#translate)(int, int) | Mengimbangi koordinat iniRegion dengan jumlah yang ditentukan. |
| [Union](../../system.drawing/region/union/#union)(GraphicsPath) | Memperbarui iniRegion untuk serikat itu sendiri dan ditentukanGraphicsPath . |
| [Union](../../system.drawing/region/union/#union_1)(Rectangle) | Memperbarui iniRegion untuk serikat itu sendiri dan ditentukanRectangle struktur. |
| [Union](../../system.drawing/region/union/#union_2)(RectangleF) | Memperbarui iniRegion untuk serikat itu sendiri dan ditentukanRectangleF struktur. |
| [Union](../../system.drawing/region/union/#union_3)(Region) | Memperbarui iniRegion untuk serikat itu sendiri dan ditentukanRegion . |
| [Xor](../../system.drawing/region/xor/#xor)(GraphicsPath) | Memperbarui iniRegion ke serikat dikurangi persimpangan itu sendiri dengan the ditentukanGraphicsPath . |
| [Xor](../../system.drawing/region/xor/#xor_1)(Rectangle) | Memperbarui iniRegion ke serikat dikurangi persimpangan itu sendiri dengan the ditentukanRectangle struktur. |
| [Xor](../../system.drawing/region/xor/#xor_2)(RectangleF) | Memperbarui iniRegion ke serikat dikurangi persimpangan itu sendiri dengan yang ditentukanRectangleF struktur. |
| [Xor](../../system.drawing/region/xor/#xor_3)(Region) | Memperbarui iniRegion ke serikat dikurangi persimpangan itu sendiri dengan the ditentukanRegion . |

### Lihat juga

* ruang nama [System.Drawing](../../system.drawing/)
* perakitan [Aspose.Drawing](../../)


