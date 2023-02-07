---
title: Light
second_title: Aspose.3D untuk .NET API Referensi
description: Cahaya menerangi pemandangan.
type: docs
weight: 400
url: /id/net/aspose.threed.entities/light/
---
## Light class

Cahaya menerangi pemandangan.

Rumus untuk menghitung redaman total cahaya adalah: `A = ConstantAttenuation + (Dist * LinearAttenuation) + ((Dist^2) * QuadraticAttenuation)`

```csharp
public class Light : Frustum
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Light](light/#constructor)() | Menginisialisasi instance baru dari`Light` kelas. |
| [Light](light/#constructor_1)(string) | Menginisialisasi instance baru dari`Light` kelas. |
| [Light](light/#constructor_2)(string, LightType) | Menginisialisasi instance baru dari`Light` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Aspect](../../aspose.threed.entities/frustum/aspect/) { get; set; } | Mendapat atau menyetel rasio aspek dari frustum |
| [CastLight](../../aspose.threed.entities/light/castlight/) { get; set; } | Mendapatkan atau menyetel jika instance cahaya saat ini dapat menerangi objek lain. |
| [CastShadows](../../aspose.threed.entities/light/castshadows/) { get; set; } | Mendapat atau menyetel jika cahaya dapat membuat bayangan pada objek lain. |
| [Color](../../aspose.threed.entities/light/color/) { get; set; } | Mendapat atau menyetel warna cahaya |
| [ConstantAttenuation](../../aspose.threed.entities/light/constantattenuation/) { get; set; } | Mendapat atau menyetel redaman konstan untuk menghitung redaman total cahaya |
| [Direction](../../aspose.threed.entities/frustum/direction/) { get; set; } | Mendapat atau menyetel arah yang dilihat kamera. Perubahan pada properti ini juga akan memengaruhi[`LookAt`](../frustum/lookat/) Dan[`Target`](../frustum/target/) . |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| [Falloff](../../aspose.threed.entities/light/falloff/) { get; set; } | Mendapat atau menyetel sudut falloff cone (dalam derajat). |
| [FarPlane](../../aspose.threed.entities/frustum/farplane/) { get; set; } | Mendapat atau menyetel jarak jauh bidang frustum. |
| [HotSpot](../../aspose.threed.entities/light/hotspot/) { get; set; } | Mendapat atau menyetel sudut kerucut hot spot (dalam derajat). |
| [Intensity](../../aspose.threed.entities/light/intensity/) { get; set; } | Mendapat atau mengatur intensitas cahaya, nilai default adalah 100 |
| [LightType](../../aspose.threed.entities/light/lighttype/) { get; set; } | Mengambil atau menyetel jenis lampu |
| [LinearAttenuation](../../aspose.threed.entities/light/linearattenuation/) { get; set; } | Mendapat atau menyetel atenuasi linier untuk menghitung redaman total cahaya |
| [LookAt](../../aspose.threed.entities/frustum/lookat/) { get; set; } | Mendapat atau menyetel posisi tertarik yang dilihat kamera. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [NearPlane](../../aspose.threed.entities/frustum/nearplane/) { get; set; } | Mendapat atau menyetel jarak dekat bidang frustum. |
| [OrthoHeight](../../aspose.threed.entities/frustum/orthoheight/) { get; set; } | Mendapat atau mengatur ketinggian saat frustum dalam proyeksi ortografis. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [QuadraticAttenuation](../../aspose.threed.entities/light/quadraticattenuation/) { get; set; } | Mendapat atau menyetel redaman kuadrat untuk menghitung redaman total cahaya |
| [RotationMode](../../aspose.threed.entities/frustum/rotationmode/) { get; set; } | Mendapat atau menyetel mode orientasi frustum Properti ini hanya berfungsi jika[`Target`](../frustum/target/) adalah null. Jika nilainya adalahFixedTarget , arah selalu dihitung oleh properti[`LookAt`](../frustum/lookat/) Jika tidak[`LookAt`](../frustum/lookat/)selalu dihitung dengan[`Direction`](../frustum/direction/) |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [ShadowColor](../../aspose.threed.entities/light/shadowcolor/) { get; set; } | Mendapat atau mengatur warna bayangan. |
| [Target](../../aspose.threed.entities/frustum/target/) { get; set; } | Mendapat atau menyetel target yang dilihat kamera. Jika pengguna mendukung properti ini, itu harus sebelum[`LookAt`](../frustum/lookat/) properti. |
| [Up](../../aspose.threed.entities/frustum/up/) { get; set; } | Mendapat atau mengatur arah kamera |

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

### Lihat juga

* class [Frustum](../frustum/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
