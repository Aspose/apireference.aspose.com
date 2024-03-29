---
title: EllipseShape
second_title: Aspose.3D untuk .NET API Referensi
description: Bentuk elips kompatibel IFC yang ditentukan oleh parameter. Posisi tengah profil berada di tengah kotak pembatas.
type: docs
weight: 1540
url: /id/net/aspose.threed.profiles/ellipseshape/
---
## EllipseShape class

Bentuk elips kompatibel IFC yang ditentukan oleh parameter. Posisi tengah profil berada di tengah kotak pembatas.

```csharp
public class EllipseShape : ParameterizedProfile
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [EllipseShape](ellipseshape/)() | Konstruktor default. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [SemiAxis1](../../aspose.threed.profiles/ellipseshape/semiaxis1/) { get; set; } | Mendapat atau mengatur radius pertama elips yang diukur dalam arah sumbu x. |
| [SemiAxis2](../../aspose.threed.profiles/ellipseshape/semiaxis2/) { get; set; } | Mendapat atau mengatur radius kedua elips yang diukur dalam arah sumbu y. |

## Metode

| Nama | Keterangan |
| --- | --- |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| override [GetEntityRendererKey](../../aspose.threed.profiles/profile/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| override [GetExtent](../../aspose.threed.profiles/ellipseshape/getextent/)() | Mendapat luasan dalam dimensi x dan y. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |

### Lihat juga

* class [ParameterizedProfile](../parameterizedprofile/)
* ruang nama [Aspose.ThreeD.Profiles](../../aspose.threed.profiles/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
