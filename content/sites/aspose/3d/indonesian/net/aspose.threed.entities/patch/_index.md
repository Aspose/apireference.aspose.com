---
title: Patch
second_title: Aspose.3D untuk .NET API Referensi
description: APatch./patch/ adalah permukaan pemodelan parametrik mirip denganNurbsSurface./nurbssurface/  itu juga ditentukan oleh dua PatchDirection./patchdirection/  ituU./patch/u/ DanV./patch/v/ . Tapi perbedaan antaraPatch./patch/ DanNurbsSurface./nurbssurface/ Apakah ituPatchDirection./patchdirection/ kurva bisa menjadi salah satunyaBezier QuadraticBezier BasisSpline CardinalSpline DanLinear
type: docs
weight: 500
url: /id/net/aspose.threed.entities/patch/
---
## Patch class

A`Patch` adalah permukaan pemodelan parametrik, mirip dengan[`NurbsSurface`](../nurbssurface/) , itu juga ditentukan oleh dua [`PatchDirection`](../patchdirection/) , itu[`U`](./u/) Dan[`V`](./v/) . Tapi perbedaan antara`Patch` Dan[`NurbsSurface`](../nurbssurface/) Apakah itu[`PatchDirection`](../patchdirection/) kurva bisa menjadi salah satunyaBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline DanLinear

```csharp
public class Patch : Geometry
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Patch](patch/#constructor)() | Menginisialisasi instance baru dari`Patch` kelas. |
| [Patch](patch/#constructor_1)(string) | Menginisialisasi instance baru dari`Patch` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menghasilkan bayangan |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Mendapat semua poin kontrol |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Mendapat semua deformer yang diasosiasikan dengan geometri ini. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menerima bayangan. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [U](../../aspose.threed.entities/patch/u/) { get; } | Mendapatkan arah u. |
| [V](../../aspose.threed.entities/patch/v/) { get; } | Mendapatkan arah v. |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Mendapat semua elemen simpul |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Mendapat atau menyetel jika geometri terlihat |

## Metode

| Nama | Keterangan |
| --- | --- |
| [AddElement](../../aspose.threed.entities/geometry/addelement/)(VertexElement) | Menambahkan elemen simpul yang ada ke geometri saat ini |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType) | Membuat elemen simpul dengan tipe tertentu dan menambahkannya ke geometri. |
| [CreateElement](../../aspose.threed.entities/geometry/createelement/)(VertexElementType, MappingMode, ReferenceMode) | Membuat elemen simpul dengan tipe tertentu dan menambahkannya ke geometri. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping) | Membuat a[`VertexElementUV`](../vertexelementuv/) dengan tipe pemetaan tekstur yang diberikan. |
| [CreateElementUV](../../aspose.threed.entities/geometry/createelementuv/)(TextureMapping, MappingMode, ReferenceMode) | Membuat a[`VertexElementUV`](../vertexelementuv/) dengan tipe pemetaan tekstur yang diberikan. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Mendapat elemen titik dengan tipe tertentu |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Mendapat a[`VertexElementUV`](../vertexelementuv/) instance dengan tipe pemetaan tekstur yang diberikan |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |

### Lihat juga

* class [Geometry](../geometry/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
