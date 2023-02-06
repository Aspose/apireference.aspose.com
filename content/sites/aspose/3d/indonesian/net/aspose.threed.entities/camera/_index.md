---
title: Camera
second_title: Aspose.3D untuk .NET API Referensi
description: Kamera mendeskripsikan titik mata pemirsa yang melihat pemandangan.
type: docs
weight: 250
url: /id/net/aspose.threed.entities/camera/
---
## Camera class

Kamera mendeskripsikan titik mata pemirsa yang melihat pemandangan.

```csharp
public class Camera : Frustum
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Camera](camera/#constructor)() | Menginisialisasi instance baru dari`Camera` kelas. |
| [Camera](camera/#constructor_1)(ProjectionType) | Menginisialisasi instance baru dari`Camera` kelas. |
| [Camera](camera/#constructor_2)(string) | Menginisialisasi instance baru dari`Camera` kelas. |
| [Camera](camera/#constructor_3)(string, ProjectionType) | Menginisialisasi instance baru dari`Camera` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [ApertureMode](../../aspose.threed.entities/camera/aperturemode/) { get; set; } | Mendapatkan atau menyetel mode apertur kamera |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Mendapat atau menyetel rasio aspek dari frustum |
| [AspectRatio](../../aspose.threed.entities/camera/aspectratio/) { get; set; } | Mendapat atau menyetel rasio aspek bidang tampilan. |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Mendapat atau menyetel arah yang dilihat kamera. Perubahan pada properti ini juga akan memengaruhi[`LookAt`](../frustum/lookat/) Dan[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Mendapat atau menyetel jarak jauh bidang frustum. |
| [FieldOfView](../../aspose.threed.entities/camera/fieldofview/) { get; set; } | Mendapat atau menyetel bidang pandang kamera dalam derajat, properti ini hanya digunakan saat ApertureMode adalahHorizontal atauVertical |
| [FieldOfViewX](../../aspose.threed.entities/camera/fieldofviewx/) { get; set; } | Mendapat atau menyetel bidang pandang horizontal kamera dalam derajat, properti ini hanya digunakan saat ApertureMode adalahHorizAndVert |
| [FieldOfViewY](../../aspose.threed.entities/camera/fieldofviewy/) { get; set; } | Mendapat atau menyetel bidang pandang vertikal kamera dalam derajat, properti ini hanya digunakan saat ApertureMode diaktifkanHorizAndVert |
| [Height](../../aspose.threed.entities/camera/height/) { get; set; } | Mendapat atau menyetel tinggi bidang tampilan yang diukur dalam inci |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Mendapat atau menyetel posisi tertarik yang dilihat kamera. |
| [Magnification](../../aspose.threed.entities/camera/magnification/) { get; set; } | Mendapatkan atau menyetel perbesaran yang digunakan dalam kamera ortografis |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Mendapat atau menyetel jarak dekat bidang frustum. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Mendapat atau mengatur ketinggian saat frustum dalam proyeksi ortografis. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [ProjectionType](../../aspose.threed.entities/camera/projectiontype/) { get; set; } | Mengambil atau menyetel jenis proyeksi kamera. Secara default, proyeksi perspektif digunakan. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Mendapat atau menyetel mode orientasi frustum Properti ini hanya berfungsi jika[`Target`](../frustum/target/) adalah null. Jika nilainya adalahFixedTarget , arah selalu dihitung oleh properti[`LookAt`](../frustum/lookat/) Jika tidak[`LookAt`](../frustum/lookat/)selalu dihitung dengan[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Mendapat atau menyetel target yang dilihat kamera. Jika pengguna mendukung properti ini, itu harus sebelum[`LookAt`](../frustum/lookat/) properti. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Mendapat atau mengatur arah kamera |
| [Width](../../aspose.threed.entities/camera/width/) { get; set; } | Mendapat atau menyetel lebar bidang tampilan yang diukur dalam inci |

## Metode

| Nama | Keterangan |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [MoveForward](../../aspose.threed.entities/camera/moveforward/)(double) | Pindahkan kamera ke depan menuju arah atau targetnya. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |

### Lihat juga

* class [Frustum](../frustum/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
