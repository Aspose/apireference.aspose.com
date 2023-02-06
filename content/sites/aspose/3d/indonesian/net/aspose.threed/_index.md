---
title: Aspose.ThreeD
second_title: Aspose.3D untuk .NET API Referensi
description: Ruang nama dasar Aspose.3D
type: docs
weight: 10
url: /id/net/aspose.threed/
---
Ruang nama dasar Aspose.3D

## Kelas

| Kelas | Keterangan |
| --- | --- |
| [A3DObject](./a3dobject/) | Kelas dasar dari semua objek Aspose.ThreeD, semua sub kelas akan mendukung properti dinamis. |
| [AssetInfo](./assetinfo/) | Informasi aset. Informasi aset dapat dilampirkan pada a[`Scene`](../aspose.threed/scene/) . Anak[`Scene`](../aspose.threed/scene/) dapat memiliki sendiri[`AssetInfo`](../aspose.threed/assetinfo/) untuk mengesampingkan definisi orang tua. |
| [BonePose](./bonepose/) | Itu[`BonePose`](../aspose.threed/bonepose/) berisi matriks transformasi untuk simpul tulang |
| [CustomObject](./customobject/) | Data meta atau objek khusus yang digunakan dalam file 3D dikelola oleh kelas ini. Semua properti khusus disimpan sebagai properti dinamis. |
| [Entity](./entity/) | Kelas dasar dari semua entitas. Entitas mewakili objek konkret yang terpasang di bawah simpul seperti[`Light`](../aspose.threed.entities/light/)/[`Geometry`](../aspose.threed.entities/geometry/) . |
| [ExportException](./exportexception/) | Pengecualian saat Aspose.3D gagal mengekspor adegan ke file |
| [FileFormat](./fileformat/) | Definisi format file |
| [FileFormatType](./fileformattype/) | Jenis format file |
| [GlobalTransform](./globaltransform/) | Transformasi global mirip dengan[`Transform`](../aspose.threed/transform/) tetapi tidak dapat diubah saat mewakili transformasi akhir yang dievaluasi. Sistem koordinat kanan digunakan saat mengevaluasi transformasi global |
| [ImageRenderOptions](./imagerenderoptions/) | Opsi untuk[`Render`](../aspose.threed/scene/render/) Dan[`Render`](../aspose.threed/scene/render/) |
| [ImportException](./importexception/) | Pengecualian saat Aspose.3D gagal membuka sumber yang ditentukan |
| [License](./license/) | Menyediakan metode untuk melisensikan komponen. |
| [Metered](./metered/) | Menyediakan metode untuk menyetel kunci terukur. |
| [Node](./node/) | Merupakan elemen dalam grafik adegan. Grafik adegan adalah pohon objek Node. Layanan manajemen pohon mandiri dalam kelas ini. Perhatikan SDK Aspose.3D tidak menguji validitas grafik adegan yang dibangun. Ini adalah tanggung jawab pemanggil untuk memastikan bahwa itu tidak menghasilkan grafik siklik dalam hirarki node. Selain manajemen pohon, kelas ini mendefinisikan semua properti yang diperlukan untuk menggambarkan posisi objek dalam adegan. Informasi ini mencakup properti Terjemahan, Rotasi, dan Penskalaan dasar dan opsi lebih lanjut untuk atribut pivot, limit, dan sambungan IK seperti kekakuan dan peredaman. Saat pertama kali dibuat, objek Node "kosong" (yaitu: ini adalah objek tanpa representasi grafis yang hanya berisi informasi posisi). Dalam keadaan ini, dapat digunakan untuk mewakili orang tua dalam struktur pohon simpul tetapi tidak lebih. Penggunaan normal dari jenis objek ini adalah menambahkan entitas yang akan mengkhususkan node (lihat "Entitas"). Entitas adalah objek itu sendiri dan terhubung ke Node. Ini juga berarti bahwa entitas yang sama dapat dibagi di antara beberapa node. Camera, Light, Mesh, dll... semuanya adalah entitas dan semuanya berasal dari kelas dasar Entity. |
| [NodeVisitor](./nodevisitor/) | Callback untuk melakukan perjalanan melalui seluruh hierarki node. |
| [Pose](./pose/) | Pose digunakan untuk menyimpan matriks transformasi saat geometri dikuliti. Pose adalah sekumpulan[`BonePose`](../aspose.threed/bonepose/) , setiap[`BonePose`](../aspose.threed/bonepose/) menyimpan informasi transformasi konkret dari node tulang. |
| [Property](./property/) | Kelas untuk menampung properti yang ditentukan pengguna. |
| [PropertyCollection](./propertycollection/) | Kumpulan properti |
| [Scene](./scene/) | Scene adalah objek tingkat atas yang berisi simpul, geometri, material, tekstur, animasi, pose, sub-adegan, dll. Scene dapat memiliki sub-adegan, berfungsi sebagai dukungan banyak dokumen dalam file seperti collada/blender /fbx Hirarki node dapat diakses melalui[`RootNode`](../aspose.threed/scene/rootnode/)[`Library`](../aspose.threed/scene/library/) digunakan untuk menyimpan referensi objek yang tidak terikat selama serialisasi (seperti data meta atau objek khusus) sehingga dapat digunakan sebagai perpustakaan. |
| [SceneObject](./sceneobject/) | Kelas akar objek yang akan disimpan di dalam sebuah adegan. |
| [Transform](./transform/) | Transform berisi informasi yang memungkinkan akses ke translasi/skala/rotasi objek atau matriks transformasi dengan biaya minimum Ini digunakan oleh transformasi lokal. |
| [TrialException](./trialexception/) | Ini dimunculkan di Scene.Open/Scene.Save saat tidak ada lisensi yang diterapkan. Anda dapat menonaktifkan pengecualian ini dengan menyetel SuppressTrialException ke true. |
## Antarmuka

| Antarmuka | Keterangan |
| --- | --- |
| [INamedObject](./inamedobject/) | Objek yang memiliki nama |
## Pencacahan

| Pencacahan | Keterangan |
| --- | --- |
| [Axis](./axis/) | Sumbu koordinat. |
| [CoordinatedSystem](./coordinatedsystem/) | Sistem koordinat tangan kiri atau tangan kanan. |
| [FileContentType](./filecontenttype/) | Jenis konten file |
| [PoseType](./posetype/) | Jenis pose. |
| [PropertyFlags](./propertyflags/) | Bendera properti |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
