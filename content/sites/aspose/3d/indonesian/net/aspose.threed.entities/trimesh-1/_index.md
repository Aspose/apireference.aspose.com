---
title: TriMeshT
second_title: Aspose.3D untuk .NET API Referensi
description: Versi generik dariTriMesh./trimesh/ untuk vertex yang ditentukan oleh pengguna statis type
type: docs
weight: 740
url: /id/net/aspose.threed.entities/trimesh-1/
---
## TriMesh&lt;T&gt; class

Versi generik dari[`TriMesh`](../trimesh/) untuk vertex yang ditentukan oleh pengguna statis type

```csharp
public class TriMesh<T> : TriMesh
    where T : struct
```

| Parameter | Keterangan |
| --- | --- |
| T |  |

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [TriMesh](trimesh/)(string) | Inisialisasi instance dari[`TriMesh`](../trimesh/) |

## Properti

| Nama | Keterangan |
| --- | --- |
| [Capacity](../../aspose.threed.entities/trimesh/capacity/) { get; } | Kapasitas simpul yang telah dialokasikan sebelumnya. |
| [Excluded](../../aspose.threed/entity/excluded/) { get; set; } | Mendapat atau menyetel apakah akan mengecualikan entitas ini selama mengekspor. |
| [IndicesCount](../../aspose.threed.entities/trimesh/indicescount/) { get; } | Hitungan indeks dalam hal ini[`TriMesh`](../trimesh/) |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [ParentNode](../../aspose.threed/entity/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk pertama, jika menyetel simpul induk pertama, entitas ini akan terlepas dari simpul induk lainnya. |
| [ParentNodes](../../aspose.threed/entity/parentnodes/) { get; } | Mendapat semua simpul induk, entitas dapat dilampirkan ke beberapa simpul induk untuk pembuatan geometri |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [UnmergedVerticesCount](../../aspose.threed.entities/trimesh/unmergedverticescount/) { get; } | Hitungan simpul yang tidak digabungkan yang lewat[`BeginVertex`](../trimesh/beginvertex/) Dan[`EndVertex`](../trimesh/endvertex/) . |
| [VertexDeclaration](../../aspose.threed.entities/trimesh/vertexdeclaration/) { get; } | Tata letak simpul dari[`TriMesh`](../trimesh/) . |
| [VerticesCount](../../aspose.threed.entities/trimesh/verticescount/) { get; } | Hitungan simpul dalam hal ini[`TriMesh`](../trimesh/) |
| [VerticesSizeInBytes](../../aspose.threed.entities/trimesh/verticessizeinbytes/) { get; } | Ukuran total semua simpul dalam byte |

## Metode

| Nama | Keterangan |
| --- | --- |
| static [FromMesh](../../aspose.threed.entities/trimesh-1/frommesh/)(Mesh) | Buat TriMesh dari objek mesh yang diberikan dengan tata letak verteks yang dihasilkan secara otomatis. |
| [BeginVertex](../../aspose.threed.entities/trimesh/beginvertex/)() | Mulailah menambahkan simpul |
| [EndVertex](../../aspose.threed.entities/trimesh/endvertex/)() | Akhiri penambahan simpul |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/entity/getboundingbox/)() | Mendapat kotak pembatas entitas saat ini dalam sistem koordinat ruang objeknya. |
| virtual [GetEntityRendererKey](../../aspose.threed/entity/getentityrendererkey/)() | Mendapat kunci dari perender entitas yang terdaftar di perender |
| [GetEnumerator](../../aspose.threed.entities/trimesh/getenumerator/)() | Dapatkan pencacah untuk menghitung[`Vertex`](../../aspose.threed.utilities/vertex/) |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out int[]) |  |
| [IndicesToArray](../../aspose.threed.entities/trimesh/indicestoarray/)(out ushort[]) |  |
| [LoadVerticesFromBytes](../../aspose.threed.entities/trimesh/loadverticesfrombytes/)(byte[]) | Memuat simpul dari byte, panjang byte harus kelipatan bilangan bulat dari ukuran simpul. |
| [ReadDouble](../../aspose.threed.entities/trimesh/readdouble/)(int, VertexField) | Baca bidang ganda |
| [ReadFloat](../../aspose.threed.entities/trimesh/readfloat/)(int, VertexField) | Baca kolom float |
| [ReadFVector2](../../aspose.threed.entities/trimesh/readfvector2/)(int, VertexField) | Baca bidang vektor2 |
| [ReadFVector3](../../aspose.threed.entities/trimesh/readfvector3/)(int, VertexField) | Baca bidang vector3 |
| [ReadFVector4](../../aspose.threed.entities/trimesh/readfvector4/)(int, VertexField) | Baca bidang vector4 |
| [ReadVector2](../../aspose.threed.entities/trimesh/readvector2/)(int, VertexField) | Baca bidang vektor2 |
| [ReadVector3](../../aspose.threed.entities/trimesh/readvector3/)(int, VertexField) | Baca bidang vector3 |
| [ReadVector4](../../aspose.threed.entities/trimesh/readvector4/)(int, VertexField) | Baca bidang vector4 |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |
| override [ToString](../../aspose.threed.entities/trimesh/tostring/)() | Mendapat representasi string dari[`TriMesh`](../trimesh/) |
| [VerticesToArray](../../aspose.threed.entities/trimesh/verticestoarray/)() | Ubah data simpul menjadi array byte |
| [VerticesToTypedArray](../../aspose.threed.entities/trimesh-1/verticestotypedarray/)() | Ubah data simpul menjadi array yang diketik |
| [Write16bIndicesTo](../../aspose.threed.entities/trimesh/write16bindicesto/)(Stream) | Tulis data indeks sebagai integer 16bit ke stream |
| [Write32bIndicesTo](../../aspose.threed.entities/trimesh/write32bindicesto/)(Stream) | Tulis data indeks sebagai integer 32bit ke stream |
| [WriteVerticesTo](../../aspose.threed.entities/trimesh/writeverticesto/)(Stream) | Tulis data simpul ke aliran yang ditentukan |

### Lihat juga

* class [TriMesh](../trimesh/)
* ruang nama [Aspose.ThreeD.Entities](../../aspose.threed.entities/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
