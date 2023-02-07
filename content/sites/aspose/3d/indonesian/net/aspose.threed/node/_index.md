---
title: Node
second_title: Aspose.3D untuk .NET API Referensi
description: Merupakan elemen dalam grafik adegan. Grafik adegan adalah pohon objek Node. Layanan manajemen pohon mandiri dalam kelas ini. Perhatikan SDK Aspose.3D tidak menguji validitas grafik adegan yang dibangun. Ini adalah tanggung jawab pemanggil untuk memastikan bahwa itu tidak menghasilkan grafik siklik dalam hirarki node. Selain manajemen pohon kelas ini mendefinisikan semua properti yang diperlukan untuk menggambarkan posisi objek dalam adegan. Informasi ini mencakup properti Terjemahan Rotasi dan Penskalaan dasar dan opsi lebih lanjut untuk atribut pivot limit dan sambungan IK seperti kekakuan dan peredaman. Saat pertama kali dibuat objek Node kosong yaitu ini adalah objek tanpa representasi grafis yang hanya berisi informasi posisi. Dalam keadaan ini dapat digunakan untuk mewakili orang tua dalam struktur pohon simpul tetapi tidak lebih. Penggunaan normal dari jenis objek ini adalah menambahkan entitas yang akan mengkhususkan node lihat Entitas. Entitas adalah objek itu sendiri dan terhubung ke Node. Ini juga berarti bahwa entitas yang sama dapat dibagi di antara beberapa node. Camera Light Mesh dll... semuanya adalah entitas dan semuanya berasal dari kelas dasar Entity.
type: docs
weight: 1470
url: /id/net/aspose.threed/node/
---
## Node class

Merupakan elemen dalam grafik adegan. Grafik adegan adalah pohon objek Node. Layanan manajemen pohon mandiri dalam kelas ini. Perhatikan SDK Aspose.3D tidak menguji validitas grafik adegan yang dibangun. Ini adalah tanggung jawab pemanggil untuk memastikan bahwa itu tidak menghasilkan grafik siklik dalam hirarki node. Selain manajemen pohon, kelas ini mendefinisikan semua properti yang diperlukan untuk menggambarkan posisi objek dalam adegan. Informasi ini mencakup properti Terjemahan, Rotasi, dan Penskalaan dasar dan opsi lebih lanjut untuk atribut pivot, limit, dan sambungan IK seperti kekakuan dan peredaman. Saat pertama kali dibuat, objek Node "kosong" (yaitu: ini adalah objek tanpa representasi grafis yang hanya berisi informasi posisi). Dalam keadaan ini, dapat digunakan untuk mewakili orang tua dalam struktur pohon simpul tetapi tidak lebih. Penggunaan normal dari jenis objek ini adalah menambahkan entitas yang akan mengkhususkan node (lihat "Entitas"). Entitas adalah objek itu sendiri dan terhubung ke Node. Ini juga berarti bahwa entitas yang sama dapat dibagi di antara beberapa node. Camera, Light, Mesh, dll... semuanya adalah entitas dan semuanya berasal dari kelas dasar Entity.

```csharp
public class Node : SceneObject
```

## Konstruktor

| Nama | Keterangan |
| --- | --- |
| [Node](node/#constructor)() | Menginisialisasi instance baru dari`Node` kelas. |
| [Node](node/#constructor_1)(string) | Menginisialisasi instance baru dari`Node` kelas. |
| [Node](node/#constructor_2)(string, Entity) | Menginisialisasi instance baru dari`Node` kelas. |

## Properti

| Nama | Keterangan |
| --- | --- |
| [AssetInfo](../../aspose.threed/node/assetinfo/) { get; set; } | Info aset per node |
| [ChildNodes](../../aspose.threed/node/childnodes/) { get; } | Mendapat simpul turunan. |
| [Entities](../../aspose.threed/node/entities/) { get; } | Mendapat semua entitas node. |
| [Entity](../../aspose.threed/node/entity/) { get; set; } | Mendapat atau menyetel entitas pertama yang dilampirkan ke node ini, jika disetel, akan menghapus entitas lain. |
| [Excluded](../../aspose.threed/node/excluded/) { get; set; } | Mendapatkan atau menyetel apakah akan mengecualikan node ini dan semua node/entitas anak selama mengekspor. |
| [GlobalTransform](../../aspose.threed/node/globaltransform/) { get; } | Mendapat transformasi global. |
| [Material](../../aspose.threed/node/material/) { get; set; } | Mendapat atau menyetel materi pertama yang terkait dengan simpul ini, jika disetel, akan menghapus materi lain |
| [Materials](../../aspose.threed/node/materials/) { get; } | Mendapat material yang terkait dengan node ini. |
| [MetaDatas](../../aspose.threed/node/metadatas/) { get; } | Mendapat meta data yang ditentukan di node ini. |
| virtual [Name](../../aspose.threed/a3dobject/name/) { get; set; } | Mendapat atau menetapkan nama. |
| [ParentNode](../../aspose.threed/node/parentnode/) { get; set; } | Mendapat atau menyetel simpul induk. |
| [Properties](../../aspose.threed/a3dobject/properties/) { get; } | Mendapat koleksi semua properti. |
| [Scene](../../aspose.threed/sceneobject/scene/) { get; } | Mendapat adegan tempat objek ini berada |
| [Transform](../../aspose.threed/node/transform/) { get; } | Mendapat transformasi lokal. |
| [Visible](../../aspose.threed/node/visible/) { get; set; } | Mendapat atau mengatur untuk menampilkan node |

## Metode

| Nama | Keterangan |
| --- | --- |
| [Accept](../../aspose.threed/node/accept/)(NodeVisitor) | Menjelajahi semua node turunan (termasuk node saat ini) dan memanggil pengunjung dengan node. Pengunjung dapat menghentikan walk-through dengan mengembalikan false |
| [AddChildNode](../../aspose.threed/node/addchildnode/)(Node) | Tambahkan node anak ke node ini |
| [AddEntity](../../aspose.threed/node/addentity/)(Entity) | Tambahkan entitas ke node. |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode)() | Membuat node anak |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_1)(Entity) | Buat simpul anak baru dengan entitas yang diberikan terlampir |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_2)(string) | Buat simpul anak baru dengan nama simpul yang diberikan |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_3)(string, Entity) | Buat simpul anak baru dengan nama simpul yang diberikan |
| [CreateChildNode](../../aspose.threed/node/createchildnode/#createchildnode_4)(string, Entity, Material) | Buat node anak baru dengan nama node yang diberikan, dan lampirkan entitas tertentu dan material |
| [EvaluateGlobalTransform](../../aspose.threed/node/evaluateglobaltransform/)(bool) | Mengevaluasi transformasi global, termasuk transformasi geometrik atau tidak. |
| [FindProperty](../../aspose.threed/a3dobject/findproperty/)(string) | Menemukan properti. Ini bisa berupa properti dinamis (Dibuat oleh CreateDynamicProperty/SetProperty) atau properti asli (Diidentifikasi dengan namanya) |
| [GetBoundingBox](../../aspose.threed/node/getboundingbox/)() | Menghitung kotak pembatas dari node |
| [GetChild](../../aspose.threed/node/getchild/#getchild)(int) | Mendapat simpul anak pada indeks yang ditentukan. |
| [GetChild](../../aspose.threed/node/getchild/#getchild_1)(string) | Mendapat simpul anak dengan nama yang ditentukan |
| [GetEntity&lt;T&gt;](../../aspose.threed/node/getentity/)() |  |
| [GetProperty](../../aspose.threed/a3dobject/getproperty/)(string) | Dapatkan nilai properti yang ditentukan |
| [Merge](../../aspose.threed/node/merge/)(Node) | Lepas semua yang ada di bawah node dan lampirkan ke node saat ini. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(Property) | Menghapus properti dinamis. |
| [RemoveProperty](../../aspose.threed/a3dobject/removeproperty/)(string) | Hapus properti yang ditentukan yang diidentifikasi dengan name |
| [SelectObjects](../../aspose.threed/node/selectobjects/)(string) | Pilih beberapa objek di bawah node saat ini menggunakan sintaks kueri mirip XPath. |
| [SelectSingleObject](../../aspose.threed/node/selectsingleobject/)(string) | Pilih objek tunggal di bawah node saat ini menggunakan sintaks kueri mirip XPath. |
| [SetProperty](../../aspose.threed/a3dobject/setproperty/)(string, object) | Menetapkan nilai properti yang ditentukan |
| override [ToString](../../aspose.threed/node/tostring/)() | Mendapat representasi string dari node ini. |

### Lihat juga

* class [SceneObject](../sceneobject/)
* ruang nama [Aspose.ThreeD](../../aspose.threed/)
* perakitan [Aspose.3D](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
