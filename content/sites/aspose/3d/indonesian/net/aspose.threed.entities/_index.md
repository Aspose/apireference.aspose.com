---
title: Aspose.ThreeD.Entities
second_title: Aspose.3D untuk .NET API Referensi
description: Semua geometri dan entitas didefinisikan dalam namespace ini
type: docs
weight: 40
url: /id/net/aspose.threed.entities/
---
Semua geometri dan entitas didefinisikan dalam namespace ini

## Kelas

| Kelas | Keterangan |
| --- | --- |
| [Box](./box/) | Kotak. |
| [Camera](./camera/) | Kamera mendeskripsikan titik mata pemirsa yang melihat pemandangan. |
| [Circle](./circle/) | A[`Circle`](../aspose.threed.entities/circle/) kurva terdiri dari kumpulan titik-titik di tepi bentuk lingkaran. |
| [CompositeCurve](./compositecurve/) | A[`CompositeCurve`](../aspose.threed.entities/compositecurve/) terdiri dari beberapa segmen kurva. |
| [Curve](./curve/) | Kelas dasar dari semua implementasi kurva. |
| [Cylinder](./cylinder/) | Parameterized Cylinder. Ini juga dapat digunakan untuk merepresentasikan kerucut ketika salah satu dari radiusTop/radiusBottom adalah nol. |
| [Dish](./dish/) | Hidangan berparameter. |
| [Ellipse](./ellipse/) | An[`Ellipse`](../aspose.threed.entities/ellipse/)mendefinisikan sekumpulan titik yang membentuk bentuk elips. |
| [Frustum](./frustum/) | Kelas dasar dari[`Camera`](../aspose.threed.entities/camera/) Dan[`Light`](../aspose.threed.entities/light/) |
| [Geometry](./geometry/) | Kelas dasar dari semua objek geometris yang dapat dirender (seperti[`Mesh`](../aspose.threed.entities/mesh/) ,[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ,[`Patch`](../aspose.threed.entities/patch/) dan lain-lain). |
| [Light](./light/) | Cahaya menerangi pemandangan. |
| [Line](./line/) | Polyline adalah jalur yang ditentukan oleh sekumpulan titik dengan[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) , dan dihubungkan oleh[`Segments`](../aspose.threed.entities/line/segments/) , yang artinya bisa juga merupakan kumpulan ruas garis yang terhubung. Garis biasanya merupakan objek linier, artinya tidak dapat digunakan untuk merepresentasikan kurva, untuk merepresentasikan kurva, gunakan[`NurbsCurve`](../aspose.threed.entities/nurbscurve/) . |
| [LinearExtrusion](./linearextrusion/) | Linear ekstrusi mengambil bentuk 2D sebagai input dan memperluas bentuk dalam dimensi ke-3. |
| [Mesh](./mesh/) | Jala terbuat dari banyak poligon sisi-n. |
| [NurbsCurve](./nurbscurve/) | [kurva NURBS](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline) adalah kurva yang diwakili oleh NURBS (Spline dasar rasional tidak seragam), Kurva NURBS ditentukan oleh[`Order`](../aspose.threed.entities/nurbscurve/order/) , satu set tertimbang[`ControlPoints`](../aspose.threed.entities/geometry/controlpoints/) dan a[`KnotVectors`](../aspose.threed.entities/nurbscurve/knotvectors/) Komponen w pada control point digunakan sebagai bobot control point, apapun itu aTwoDimensional atauThreeDimensional |
| [NurbsDirection](./nurbsdirection/) | Sebuah 3D[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) memiliki dua arah, yaitu[`U`](../aspose.threed.entities/nurbssurface/u/) Dan[`V`](../aspose.threed.entities/nurbssurface/v/) , itu[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/) mendefinisikan data untuk setiap arah. Arah sebenarnya adalah kurva NURBS, artinya juga ditentukan oleh[`Order`](../aspose.threed.entities/nurbsdirection/order/) , A[`KnotVectors`](../aspose.threed.entities/nurbsdirection/knotvectors/) , dan satu set titik kontrol berbobot (didefinisikan dalam[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) ). |
| [NurbsSurface](./nurbssurface/) | [`NurbsSurface`](../aspose.threed.entities/nurbssurface/) adalah permukaan yang diwakili oleh[NURBS (Spline dasar rasional tidak seragam)](https://en.wikipedia.org/wiki/Non-uniform_rational_B-spline), A[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) didefinisikan oleh dua[`NurbsDirection`](../aspose.threed.entities/nurbsdirection/)[`U`](../aspose.threed.entities/nurbssurface/u/) Dan[`V`](../aspose.threed.entities/nurbssurface/v/) . Komponen w pada control point digunakan sebagai bobot control point apapun tipe arahnya aTwoDimensional atauThreeDimensional |
| [Patch](./patch/) | A[`Patch`](../aspose.threed.entities/patch/) adalah permukaan pemodelan parametrik, mirip dengan[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) , itu juga ditentukan oleh dua [`PatchDirection`](../aspose.threed.entities/patchdirection/) , itu[`U`](../aspose.threed.entities/patch/u/) Dan[`V`](../aspose.threed.entities/patch/v/) . Tapi perbedaan antara[`Patch`](../aspose.threed.entities/patch/) Dan[`NurbsSurface`](../aspose.threed.entities/nurbssurface/) Apakah itu[`PatchDirection`](../aspose.threed.entities/patchdirection/) kurva bisa menjadi salah satunyaBezier ,QuadraticBezier ,BasisSpline ,CardinalSpline DanLinear |
| [PatchDirection](./patchdirection/) | Arah U dan V Patch. |
| [Plane](./plane/) | Pesawat berparameter. |
| [PointCloud](./pointcloud/) | Awan titik tidak berisi informasi topologi tetapi hanya titik kontrol dan elemen simpul. |
| [PolygonBuilder](./polygonbuilder/) | Kelas pembantu untuk membuat poligon[`Mesh`](../aspose.threed.entities/mesh/) |
| [PolygonModifier](./polygonmodifier/) | Utilitas untuk mengubah poligon |
| [Primitive](./primitive/) | Kelas dasar untuk semua primitif |
| [Pyramid](./pyramid/) | Piramida berparameter. |
| [RectangularTorus](./rectangulartorus/) | Torus persegi panjang berparameter. |
| [RevolvedAreaSolid](./revolvedareasolid/) | Kelas ini mewakili model solid dengan memutar penampang yang disediakan oleh profil tentang sumbu. |
| [Shape](./shape/) | Bentuk menggambarkan deformasi pada satu set titik kontrol, yang mirip dengan deformasi cluster di Maya. Misalnya, kita dapat menambahkan bentuk ke geometri yang dibuat. Dan bentuk dan geometri memiliki informasi topologi yang sama tetapi posisi titik kontrol berbeda. Dengan jumlah pengaruh yang bervariasi, geometri melakukan efek deformasi. |
| [Skeleton](./skeleton/) | Itu[`Skeleton`](../aspose.threed.entities/skeleton/)terutama digunakan oleh perangkat lunak CAD untuk membantu perancang memanipulasi transformasi struktur kerangka, biasanya tidak berguna di luar perangkat lunak CAD. Untuk membuat hierarki kerangka bertindak seperti satu objek dalam perangkat lunak CAD, perlu menandai bagian atas[`Skeleton`](../aspose.threed.entities/skeleton/) node sebagai root satu dengan pengaturan[`Type`](../aspose.threed.entities/skeleton/type/) keSkeleton , dan semua anak disetel keBone |
| [Sphere](./sphere/) | Bola berparameter. |
| [SweptAreaSolid](./sweptareasolid/) | A[`SweptAreaSolid`](../aspose.threed.entities/sweptareasolid/) membangun geometri dengan menyapu profil di sepanjang directrix. |
| [Torus](./torus/) | torus berparameter. |
| [TransformedCurve](./transformedcurve/) | A[`TransformedCurve`](../aspose.threed.entities/transformedcurve/) memberikan penempatan kurva dengan menggunakan matriks transformasi. Ini memungkinkan untuk melakukan transformasi di dalam a[`TrimmedCurve`](../aspose.threed.entities/trimmedcurve/) atau[`CompositeCurve`](../aspose.threed.entities/compositecurve/) . |
| [TriMesh](./trimesh/) | TriMesh berisi data mentah yang dapat digunakan oleh GPU secara langsung. Kelas ini adalah utilitas untuk membantu membuat mesh yang hanya berisi data per-vertex. |
| [TriMesh&lt;T&gt;](./trimesh-1/) | Versi generik dari[`TriMesh`](../aspose.threed.entities/trimesh/) untuk vertex yang ditentukan oleh pengguna statis type |
| [TrimmedCurve](./trimmedcurve/) | Kurva berbatas yang memangkas kurva dasar di kedua ujungnya. |
| [VertexElement](./vertexelement/) | Kelas dasar elemen simpul. Jenis elemen simpul diidentifikasi oleh VertexElementType. Sebuah VertexElement menjelaskan bagaimana elemen vertex dipetakan ke permukaan geometri dan bagaimana informasi pemetaan disusun dalam memori. VertexElement berisi Normals, UVs, atau jenis informasi lainnya. |
| [VertexElementBinormal](./vertexelementbinormal/) | Menentukan vektor binormal untuk komponen tertentu. |
| [VertexElementDoublesTemplate](./vertexelementdoublestemplate/) | Kelas pembantu untuk mendefinisikan beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementasi. |
| [VertexElementEdgeCrease](./vertexelementedgecrease/) | Menentukan lipatan tepi untuk komponen tertentu |
| [VertexElementHole](./vertexelementhole/) | Mendefinisikan jika poligon yang ditentukan adalah hole |
| [VertexElementIntsTemplate](./vertexelementintstemplate/) | Kelas pembantu untuk mendefinisikan beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementasi. |
| [VertexElementMaterial](./vertexelementmaterial/) | Mendefinisikan indeks material untuk komponen tertentu. Sebuah node dapat memiliki banyak material,[`VertexElementMaterial`](../aspose.threed.entities/vertexelementmaterial/) digunakan untuk merender bagian geometri yang berbeda dalam material yang berbeda. |
| [VertexElementNormal](./vertexelementnormal/) | Menentukan vektor normal untuk komponen tertentu. |
| [VertexElementPolygonGroup](./vertexelementpolygongroup/) | Mendefinisikan grup poligon untuk komponen tertentu untuk mengelompokkan poligon terkait bersama-sama. |
| [VertexElementSmoothingGroup](./vertexelementsmoothinggroup/) | Grup pemulusan adalah grup poligon dalam jala poligon yang seharusnya tampak membentuk permukaan halus. Beberapa perangkat lunak pemodelan 3d awal seperti 3D studio max untuk DOS menggunakan grup pemulusan untuk membatalkan penyimpanan vektor normal untuk setiap simpul jala. |
| [VertexElementSpecular](./vertexelementspecular/) | Menentukan warna specular untuk komponen tertentu. |
| [VertexElementTangent](./vertexelementtangent/) | Mendefinisikan vektor tangen untuk komponen tertentu. |
| [VertexElementTemplate&lt;T&gt;](./vertexelementtemplate-1/) | Kelas pembantu untuk mendefinisikan beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementasi. |
| [VertexElementUserData](./vertexelementuserdata/) | Mendefinisikan data pengguna khusus untuk komponen tertentu. Biasanya data khusus aplikasi untuk tujuan khusus. |
| [VertexElementUV](./vertexelementuv/) | Menentukan koordinat UV untuk komponen tertentu. Geometri dapat memiliki beberapa[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) elemen, dan masing-masing memiliki perbedaan[`TextureMapping`](../aspose.threed.entities/texturemapping/) s. |
| [VertexElementVector4](./vertexelementvector4/) | Kelas pembantu untuk mendefinisikan beton[`VertexElement`](../aspose.threed.entities/vertexelement/) implementasi. |
| [VertexElementVertexColor](./vertexelementvertexcolor/) | Menentukan warna vertex untuk komponen tertentu |
| [VertexElementVertexCrease](./vertexelementvertexcrease/) | Mendefinisikan lipatan puncak untuk komponen tertentu |
| [VertexElementVisibility](./vertexelementvisibility/) | Mendefinisikan jika komponen tertentu terlihat |
| [VertexElementWeight](./vertexelementweight/) | Menentukan bobot campuran untuk komponen tertentu. |
## Struktur

| Struktur | Keterangan |
| --- | --- |
| [EndPoint](./endpoint/) | Titik akhir untuk memangkas kurva, bisa berupa nilai parameter atau titik Cartesian. |
## Antarmuka

| Antarmuka | Keterangan |
| --- | --- |
| [IIndexedVertexElement](./iindexedvertexelement/) | VertexElement dengan data indeks. |
| [IMeshConvertible](./imeshconvertible/) | Entitas yang mengimplementasikan antarmuka ini dapat dikonversi ke[`Mesh`](../aspose.threed.entities/mesh/) |
| [IOrientable](./iorientable/) | Entitas yang dapat diorientasikan harus mengimplementasikan antarmuka ini. |
## Pencacahan

| Pencacahan | Keterangan |
| --- | --- |
| [ApertureMode](./aperturemode/) | Mode apertur kamera. Mode apertur menentukan nilai mana yang mendorong apertur kamera. Jika mode apertur adalah Horizontal, Vertikal, atau Vertikal, maka bidang pandang yang digunakan. Jika mode apertur adalah Panjang Fokus, panjang fokus digunakan. |
| [CurveDimension](./curvedimension/) | Dimensi kurva. |
| [LightType](./lighttype/) | Jenis lampu. |
| [MappingMode](./mappingmode/) | Menentukan bagaimana elemen dipetakan ke permukaan. Itu[`MappingMode`](../aspose.threed.entities/mappingmode/) didefinisikan bagaimana[`VertexElement`](../aspose.threed.entities/vertexelement/) dipetakan ke permukaan geometri. |
| [NurbsType](./nurbstype/) | jenis NURBS. |
| [PatchDirectionType](./patchdirectiontype/) | Jenis arah tambalan. |
| [ProjectionType](./projectiontype/) | Jenis proyeksi kamera. |
| [ReferenceMode](./referencemode/) | [`ReferenceMode`](../aspose.threed.entities/referencemode/) mendefinisikan bagaimana informasi pemetaan disimpan dan direferensikan oleh. |
| [RotationMode](./rotationmode/) | Mode rotasi frustum |
| [SkeletonType](./skeletontype/) | [`Skeleton`](../aspose.threed.entities/skeleton/) tipe s. |
| [SplitMeshPolicy](./splitmeshpolicy/) | Bagikan data vertex/titik kontrol antar sub-mesh atau setiap sub-mesh memiliki data yang dipadatkan. |
| [TextureMapping](./texturemapping/) | Jenis pemetaan tekstur untuk[`VertexElementUV`](../aspose.threed.entities/vertexelementuv/) Menjelaskan jenis pemetaan tekstur yang digunakan. |
| [VertexElementType](./vertexelementtype/) | Jenis elemen verteks, ditentukan bagaimana ia akan digunakan dalam pemodelan. |

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.3D.dll -->
