---
title: Cylinder
second_title: Aspose.3D untuk .NET API Referensi
description: Parameterized Cylinder. Ini juga dapat digunakan untuk merepresentasikan kerucut ketika salah satu dari radiusTop/radiusBottom adalah nol.
type: docs
weight: 310
url: /id/net/aspose.threed.entities/cylinder/
---
## Cylinder class

Parameterized Cylinder. Ini juga dapat digunakan untuk merepresentasikan kerucut ketika salah satu dari radiusTop/radiusBottom adalah nol.

```csharp
public class Cylinder : Primitive
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Cylinder](cylinder/#constructor)() | Menginisialisasi instance baru dari`Cylinder` kelas. |
| [Cylinder](cylinder/#constructor_1)(double, double) | Menginisialisasi instance baru dari`Cylinder` kelas. |
| [Cylinder](cylinder/#constructor_2)(double, double, double) | Menginisialisasi instance baru dari`Cylinder` kelas. |
| [Cylinder](cylinder/#constructor_3)(double, double, double, int, int, bool) | Menginisialisasi instance baru dari`Cylinder` kelas. |
| [Cylinder](cylinder/#constructor_4)(string, double, double, double, int, int, bool, double, double) | Menginisialisasi instance baru dari`Cylinder` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/primitive/castshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menghasilkan bayangan |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| [GenerateFanCylinder](../../aspose.threed.entities/cylinder/generatefancylinder/) { get; set; } | Mendapat atau menyetel apakah akan menghasilkan silinder gaya kipas saat ThetaLength kurang dari 2*PI, jika tidak, model tidak akan dipotong. |
| [Height](../../aspose.threed.entities/cylinder/height/) { get; set; } | Mendapat atau mengatur ketinggian silinder. |
| [HeightSegments](../../aspose.threed.entities/cylinder/heightsegments/) { get; set; } | Mendapat atau mengatur segmen ketinggian. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [OffsetBottom](../../aspose.threed.entities/cylinder/offsetbottom/) { get; set; } | Mendapat atau mengatur offset transformasi simpul dari sisi bawah. |
| [OffsetTop](../../aspose.threed.entities/cylinder/offsettop/) { get; set; } | Mendapat atau menetapkan offset transformasi simpul dari sisi atas. |
| [OpenEnded](../../aspose.threed.entities/cylinder/openended/) { get; set; } | Mendapat atau menetapkan nilai yang menunjukkan apakah ini`Cylinder` terbuka berakhir. Nilai default adalah palsu. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [RadialSegments](../../aspose.threed.entities/cylinder/radialsegments/) { get; set; } | Mendapat atau mengatur segmen radial. |
| [RadiusBottom](../../aspose.threed.entities/cylinder/radiusbottom/) { get; set; } | Mendapat atau menyetel radius tutup bawah silinder. |
| [RadiusTop](../../aspose.threed.entities/cylinder/radiustop/) { get; set; } | Mendapat atau menyetel radius tutup atas silinder. |
| [ReceiveShadows](../../aspose.threed.entities/primitive/receiveshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menerima bayangan. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [ShearBottom](../../aspose.threed.entities/cylinder/shearbottom/) { get; set; } | Mendapat atau mengatur transformasi geser sisi bawah, vektor menyimpan nilai geser (sumbu x, sumbu z) yang diukur dalam radian, nilai default adalah (0, 0) |
| [ShearTop](../../aspose.threed.entities/cylinder/sheartop/) { get; set; } | Mendapat atau mengatur transformasi geser sisi atas, vektor menyimpan nilai geser (sumbu x, sumbu z) yang diukur dalam radian, nilai default adalah (0, 0) |
| [ThetaLength](../../aspose.threed.entities/cylinder/thetalength/) { get; set; } | Mendapatkan atau mengatur panjang theta. Nilai defaultnya adalah 2π. |
| [ThetaStart](../../aspose.threed.entities/cylinder/thetastart/) { get; set; } | Mendapat atau menyetel awal theta. Nilai defaultnya adalah 0. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |
| override [ToMesh](../../aspose.threed.entities/cylinder/tomesh/)() | Ubah objek saat ini menjadi mesh |

### Lihat juga

* class [Primitive](../primitive/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
