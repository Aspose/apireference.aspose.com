---
title: Shape
second_title: Aspose.3D untuk .NET API Referensi
description: Bentuk menggambarkan deformasi pada satu set titik kontrol yang mirip dengan deformasi cluster di Maya. Misalnya kita dapat menambahkan bentuk ke geometri yang dibuat. Dan bentuk dan geometri memiliki informasi topologi yang sama tetapi posisi titik kontrol berbeda. Dengan jumlah pengaruh yang bervariasi geometri melakukan efek deformasi.
type: docs
weight: 640
url: /id/net/aspose.threed.entities/shape/
---
## Shape class

Bentuk menggambarkan deformasi pada satu set titik kontrol, yang mirip dengan deformasi cluster di Maya. Misalnya, kita dapat menambahkan bentuk ke geometri yang dibuat. Dan bentuk dan geometri memiliki informasi topologi yang sama tetapi posisi titik kontrol berbeda. Dengan jumlah pengaruh yang bervariasi, geometri melakukan efek deformasi.

```csharp
public class Shape : Geometry
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Shape](shape/#constructor)() | Menginisialisasi instance baru dari`Shape` kelas. |
| [Shape](shape/#constructor_1)(string) | Menginisialisasi instance baru dari`Shape` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menghasilkan bayangan |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Mendapat semua poin kontrol |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Mendapat semua deformer yang diasosiasikan dengan geometri ini. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| [Indices](../../aspose.threed.entities/shape/indices/) { get; } | Mendapat indeks. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menerima bayangan. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [VertexElements](../../aspose.threed.entities/geometry/vertexelements/) { get; } | Mendapat semua elemen simpul |
| [Visible](../../aspose.threed.entities/geometry/visible/) { get; set; } | Mendapat atau menyetel jika geometri terlihat |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromControlPoints](../../aspose.threed.entities/shape/fromcontrolpoints/)(params Vector3[]) | Buat bentuk dengan titik kontrol tertentu dengan indeks default. |
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
