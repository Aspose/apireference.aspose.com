---
title: Class SimpleLabeling
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Rendering.Labelings.SimpleLabeling kelas. Pelabelan sederhana memberi label pada setiap fitur.
type: docs
weight: 1700
url: /id/net/aspose.gis.rendering.labelings/simplelabeling/
---
## SimpleLabeling class

Pelabelan sederhana memberi label pada setiap fitur.

```csharp
public class SimpleLabeling : Labeling
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [SimpleLabeling](simplelabeling/#constructor)() | Menginisialisasi instance baru dari`SimpleLabeling` kelas. |
| [SimpleLabeling](simplelabeling/#constructor_1)(SimpleLabeling) | Menginisialisasi instance baru dari`SimpleLabeling` kelas. |
| [SimpleLabeling](simplelabeling/#constructor_2)(string) | Menginisialisasi instance baru dari`SimpleLabeling` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [FeatureBasedConfiguration](../../aspose.gis.rendering.labelings/simplelabeling/featurebasedconfiguration/) { get; set; } | Callback yang digunakan untuk mengonfigurasi pelabelan ini sebelum menangani fitur. |
| [FontColor](../../aspose.gis.rendering.labelings/simplelabeling/fontcolor/) { get; set; } | Menentukan warna teks. |
| [FontFamily](../../aspose.gis.rendering.labelings/simplelabeling/fontfamily/) { get; set; } | Kumpulan font yang digunakan untuk merender teks. Standarnya adalah nilai yang bergantung pada sistem. |
| [FontSize](../../aspose.gis.rendering.labelings/simplelabeling/fontsize/) { get; set; } | Ukuran teks. |
| [FontStyle](../../aspose.gis.rendering.labelings/simplelabeling/fontstyle/) { get; set; } | Gaya untuk diterapkan ke teks. |
| [GeometryExpression](../../aspose.gis.rendering.labelings/simplelabeling/geometryexpression/) { get; set; } | Menyediakan cara untuk mengganti geometri fitur dengan yang dimodifikasi untuk pelabelan. Callback ini dipanggil pertama kali setelah[`FeatureBasedConfiguration`](./featurebasedconfiguration/) . Standarnya adalah`null` (gunakan geometri fitur apa adanya). |
| [HaloColor](../../aspose.gis.rendering.labelings/simplelabeling/halocolor/) { get; set; } | Warna halo (goresan) di sekitar teks. |
| [HaloSize](../../aspose.gis.rendering.labelings/simplelabeling/halosize/) { get; set; } | Ukuran halo (goresan) di sekitar teks. |
| [LabelAttribute](../../aspose.gis.rendering.labelings/simplelabeling/labelattribute/) { get; set; } | Nama atribut untuk digunakan sebagai sumber label. Diabaikan jika[`LabelExpression`](./labelexpression/) sudah diatur. Salah satunya[`LabelAttribute`](./labelattribute/) atau[`LabelExpression`](./labelexpression/) harus disetel sebelum merender; InvalidOperationException dilemparkan sebaliknya. |
| [LabelExpression](../../aspose.gis.rendering.labelings/simplelabeling/labelexpression/) { get; set; } | Menyediakan cara untuk menyesuaikan dan memformat teks label. Jika disetel, timpa[`LabelAttribute`](./labelattribute/) . Entah[`LabelAttribute`](./labelattribute/) atau[`LabelExpression`](./labelexpression/) harus disetel sebelum merender; InvalidOperationException dilemparkan sebaliknya. |
| [MultipartMode](../../aspose.gis.rendering.labelings/simplelabeling/multipartmode/) { get; set; } | Menentukan perilaku rendering untuk geometri multibagian. Default adalahAll . |
| [Placement](../../aspose.gis.rendering.labelings/simplelabeling/placement/) { get; set; } | Penempatan label menentukan bagaimana label ditempatkan relatif terhadap geometri fitur. |
| [Priority](../../aspose.gis.rendering.labelings/simplelabeling/priority/) { get; set; } | Menunjukkan prioritas label ini jika tumpang tindih dengan label lain. Label dengan prioritas lebih rendah tidak dirender. Standarnya adalah 1000. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Clone](../../aspose.gis.rendering.labelings/simplelabeling/clone/)() | Menggandakan instance ini. |

### Lihat juga

* class [Labeling](../labeling/)
* ruang nama [Aspose.Gis.Rendering.Labelings](../../aspose.gis.rendering.labelings/)
* perakitan [Aspose.GIS](../../)


