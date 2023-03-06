---
title: Aspose.Gis.SpatialReferencing
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.Referensi Spasial namespace menyediakan kelas untuk bekerja dengan referensi spasial sistem referensi koordinat.
type: docs
weight: 370
url: /id/net/aspose.gis.spatialreferencing/
---
`Aspose.Gis.Referensi Spasial` namespace menyediakan kelas untuk bekerja dengan referensi spasial (sistem referensi koordinat).

## Kelas

| Kelas | Keterangan |
| --- | --- |
| [Axis](./axis/) | Sumbu menjelaskan satu dimensi SRS. |
| [BursaWolfParameters](./bursawolfparameters/) | Kelas yang berisi parameter rumus Bursa-Wolf untuk diubah ke datum lain. |
| [CompoundSpatialReferenceSystem](./compoundspatialreferencesystem/) | SRS majemuk menyatukan dua SRS yang mendasarinya, tidak ada yang bisa menjadi majemuk. |
| [Ellipsoid](./ellipsoid/) | Ellipsoid mewakili ellipsoid, yang mendekati bumi. |
| [GeocentricSpatialReferenceSystem](./geocentricspatialreferencesystem/) | SRS geosentris adalah SRS kartesian 3 dimensi yang berasal dari pusat bumi. |
| [GeocentricSpatialReferenceSystemParameters](./geocentricspatialreferencesystemparameters/) | Parameter untuk membuat SRS geosentris. Parameter memiliki default yang masuk akal, jadi Anda hanya perlu menetapkan sebagian saja. Jika Anda menetapkan`null` ke parameter apa pun, nilai default akan digunakan. |
| [GeographicDatum](./geographicdatum/) | Datum geografis menghubungkan garis bujur dan garis lintang dengan tempat tertentu di bumi. |
| [GeographicSpatialReferenceSystem](./geographicspatialreferencesystem/) | SRS Geografis adalah SRS yang didasarkan pada garis bujur dan lintang. SRS Geografis dapat berbentuk dua dimensi atau tiga dimensi. Jika SRS geografis berbentuk tiga dimensi, maka sebenarnya SRS tersebut merupakan SRS gabungan dari SRS dua dimensi dan SRS vertikal. |
| [GeographicSpatialReferenceSystemParameters](./geographicspatialreferencesystemparameters/) | Parameter untuk membuat SRS geografis. Parameter memiliki default yang masuk akal, jadi Anda hanya perlu menetapkan sebagian saja. Jika Anda menetapkan`null` ke parameter apa pun, nilai default akan digunakan. |
| [IdentifiableObject](./identifiableobject/) | Merupakan objek yang mungkin memiliki kode dan nama EPSG. |
| [Identifier](./identifier/) | Mewakili pengenal - referensi untuk deskripsi eksternal suatu objek. Jika Anda membuat SRS dari WKT,[`Identifier`](../aspose.gis.spatialreferencing/identifier/) sesuai dengan kata kunci "AUTHORITY". |
| [LocalDatum](./localdatum/) | Menunjukkan metode yang digunakan untuk pengukuran dalam sistem referensi spasial lokal. |
| [LocalSpatialReferenceSystem](./localspatialreferencesystem/) | SRS lokal terkait koordinat ke beberapa objek, bukan bumi. |
| [PrimeMeridian](./primemeridian/) | PrimeMeridian mewakili meridian di mana bujur didefinisikan sebagai 0. |
| [ProjectedSpatialReferenceSystem](./projectedspatialreferencesystem/) | SRS yang diproyeksikan merupakan hasil penerapan proyeksi terhadap SRS geografis. SRS yang diproyeksikan dapat berupa SRS dua dimensi atau tiga dimensi. Jika SRS yang diproyeksikan adalah tiga dimensi, maka sebenarnya SRS tersebut merupakan gabungan SRS dari SRS yang diproyeksikan dua dimensi dan vertikal satu dimensi SRS. |
| [ProjectedSpatialReferenceSystemParameters](./projectedspatialreferencesystemparameters/) | Parameter untuk membuat proyeksi SRS. Beberapa parameter memiliki default. Beberapa parameter memiliki default yang masuk akal, jadi Anda tidak perlu menetapkannya saja. Jika Anda menetapkan`null` ke parameter tersebut, nilai default akan digunakan. [`ProjectionMethodName`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/projectionmethodname/) Dan[`Base`](../aspose.gis.spatialreferencing/projectedspatialreferencesystemparameters/base/) tidak memiliki default - Anda harus menetapkan beberapa non`null` nilai ke properti ini. |
| [Projection](./projection/) | Merupakan metode proyeksi dengan parameter, yang mengubah (bujur, lintang) menjadi (x, y). |
| [SpatialReferenceSystem](./spatialreferencesystem/) | Koordinat peta sistem referensi spasial ke tempat-tempat di Bumi. Ada berbagai jenis SRS, lihat[`Type`](../aspose.gis.spatialreferencing/spatialreferencesystem/type/) . Apalagi kalau tipe SRS-nyaGeographic or Projected SRS bisa majemuk atau tunggal, lihat[`IsCompound`](../aspose.gis.spatialreferencing/spatialreferencesystem/iscompound/) . |
| [SpatialReferenceSystemTransformation](./spatialreferencesystemtransformation/) | Transformasi sistem referensi spasial mengubah geometri dari sistem referensi spasial sumber menjadi sistem referensi spasial target. |
| [TransformationException](./transformationexception/) | Pengecualian transformasi dilemparkan saat kesalahan terjadi selama transformasi koordinat atau selama pembuatan transformasi. |
| [Unit](./unit/) | Mewakili satuan pengukuran. |
| [VerticalDatum](./verticaldatum/) | Menunjukkan metode yang digunakan untuk pengukuran vertikal. |
| [VerticalSpatialReferenceSystem](./verticalspatialreferencesystem/) | SRS Vertikal adalah SRS satu dimensi yang menggambarkan koordinat ketinggian. |
## Pencacahan

| Pencacahan | Keterangan |
| --- | --- |
| [AxisDirection](./axisdirection/) | Arah sumbu menentukan arah ke mana sumbu menunjuk. |
| [GeocentricAxisesOrder](./geocentricaxisesorder/) | Mewakili urutan sumbu dalam SRS geosentris. |
| [GeographicAxisesOrder](./geographicaxisesorder/) | Mewakili urutan sumbu dalam SRS geografis. |
| [ParameterType](./parametertype/) | Menentukan jenis parameter di[`Projection`](../aspose.gis.spatialreferencing/projection/) . |
| [ProjectedAxisesOrder](./projectedaxisesorder/) | Mewakili urutan sumbu dalam SRS geografis. |
| [SpatialReferenceSystemType](./spatialreferencesystemtype/) | Mewakili jenis sistem referensi spasial. |


