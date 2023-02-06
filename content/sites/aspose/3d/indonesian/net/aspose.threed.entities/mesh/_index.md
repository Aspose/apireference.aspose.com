---
title: Mesh
second_title: Aspose.3D untuk .NET API Referensi
description: Jala terbuat dari banyak poligon sisin.
type: docs
weight: 450
url: /id/net/aspose.threed.entities/mesh/
---
## Mesh class

Jala terbuat dari banyak poligon sisi-n.

```csharp
public class Mesh : Geometry, IEnumerable<int[]>, IMeshConvertible
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Mesh](mesh/#constructor)() | Menginisialisasi instance baru dari`Mesh` kelas. |
| [Mesh](mesh/#constructor_1)(Bitmap) | Bangun jaring menggunakan peta ketinggian yang ditentukan, jika format piksel peta ketinggian berisi banyak komponen, komponen pertama (biasanya merah) akan digunakan sebagai nilai ketinggian(z) Komponen x dan y titik kontrol adalah koordinat piksel yang dinormalisasi . |
| [Mesh](mesh/#constructor_4)(string) | Menginisialisasi instance baru dari`Mesh` kelas. |
| [Mesh](mesh/#constructor_2)(Bitmap, Matrix4) | Bangun jaring menggunakan peta ketinggian yang ditentukan, jika format piksel peta ketinggian berisi banyak komponen, komponen pertama (biasanya merah) akan digunakan sebagai nilai ketinggian(z) Komponen x dan y titik kontrol adalah koordinat piksel yang dinormalisasi . |
| [Mesh](mesh/#constructor_3)(Bitmap, bool, Matrix4) | Bangun jaring menggunakan peta ketinggian yang ditentukan, jika format piksel peta ketinggian berisi banyak komponen, komponen pertama (biasanya merah) akan digunakan sebagai nilai ketinggian(z) Komponen x dan y titik kontrol adalah koordinat piksel yang dinormalisasi . |

## Properti

| Nama | Keterangan |
| --- | --- |
| [CastShadows](../../aspose.threed.entities/geometry/castshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menghasilkan bayangan |
| [ControlPoints](../../aspose.threed.entities/geometry/controlpoints/) { get; } | Mendapat semua poin kontrol |
| [Deformers](../../aspose.threed.entities/geometry/deformers/) { get; } | Mendapat semua deformer yang diasosiasikan dengan geometri ini. |
| [Edges](../../aspose.threed.entities/mesh/edges/) { get; } | Mendapat tepi Mesh. Edge bersifat opsional dalam mesh, jadi bisa kosong. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [PolygonCount](../../aspose.threed.entities/mesh/polygoncount/) { get; } | Mendapat jumlah poligon |
| [Polygons](../../aspose.threed.entities/mesh/polygons/) { get; } | Mendapatkan definisi poligon dari mesh |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [ReceiveShadows](../../aspose.threed.entities/geometry/receiveshadows/) { get; set; } | Mendapatkan atau menyetel apakah geometri ini dapat menerima bayangan. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
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
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_2)(int[]) | Membuat poligon baru dengan semua simpul yang ditentukan*indices* . Untuk membuat simpul poligon demi simpul, silakan gunakan[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon)(int, int, int) | Buat poligon dengan 3 simpul (segitiga) |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_3)(int[], int, int) | Membuat poligon baru dengan semua simpul yang ditentukan*indices* . Untuk membuat simpul poligon demi simpul, silakan gunakan[`PolygonBuilder`](../polygonbuilder/) . |
| [CreatePolygon](../../aspose.threed.entities/mesh/createpolygon/#createpolygon_1)(int, int, int, int) | Buat poligon dengan 4 simpul (segi empat) |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| [GetDeformers&lt;T&gt;](../../aspose.threed.entities/geometry/getdeformers/)() |  |
| [GetElement](../../aspose.threed.entities/geometry/getelement/)(VertexElementType) | Mendapat elemen titik dengan tipe tertentu |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| [GetEnumerator](../../aspose.threed.entities/mesh/getenumerator/)() | Mendapatkan enumerator untuk setiap poligon dalam. |
| [GetPolygonSize](../../aspose.threed.entities/mesh/getpolygonsize/)(int) | Mendapat jumlah simpul dari poligon yang ditentukan. |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [GetVertexElementOfUV](../../aspose.threed.entities/geometry/getvertexelementofuv/)(TextureMapping) | Mendapat a[`VertexElementUV`](../vertexelementuv/) instance dengan tipe pemetaan tekstur yang diberikan |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |
| [ToMesh](../../aspose.threed.entities/mesh/tomesh/)() | Mendapatkan instance Mesh dari entitas saat ini. |

### Contoh

Untuk menambahkan poligon di mesh: Jelajahi semua poligon dalam jaring:

```csharp
int[] indices = new int[] {0, 1, 2};
mesh.CreatePolygon(indices);
```

```csharp
foreach(int[] polygon in mesh)
{
    //berurusan dengan poligon
}
```

### Lihat juga

* class [Geometry](../geometry/)
* interface [IMeshConvertible](../imeshconvertible/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
