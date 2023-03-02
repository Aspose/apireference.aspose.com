---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS untuk Referensi .NET API
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType enum. Mewakili jenis sistem referensi spasial.
type: docs
weight: 2270
url: /id/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Mewakili jenis sistem referensi spasial.

```csharp
public enum SpatialReferenceSystemType
```

### Nilai

| Nama | Nilai | Keterangan |
| --- | --- | --- |
| Unknown | `0` | Nilai default. Dapat dikembalikan dari[`Type`](../spatialreferencesystem/type/) jika ini adalah SRS majemuk dengan kombinasi yang tidak valid dari SRS dasar. Melihat[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | SRS Geografis didasarkan pada bujur sudut dan lintang sudut. SRS Geografis dapat dikonversi menjadi[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) melalui[`AsGeographic`](../spatialreferencesystem/asgeographic/) metode. |
| Geocentric | `2` | SRS Geosentris adalah SRS kartesius tiga dimensi yang berasal dari pusat bumi. SRS geosentris dapat dikonversi menjadi[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) melalui[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) metode. |
| Projected | `3` | Projected SRS didasarkan pada linear X dan linear Y. Ini adalah hasil dari aplikasi proyeksi padaGeographic SRS. Proyeksi SRS dapat dikonversi menjadi[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) melalui[`AsProjected`](../spatialreferencesystem/asprojected/) metode. |
| Vertical | `4` | SRS Vertikal menggambarkan koordinat ketinggian linier. SRS Vertikal dapat dikonversi menjadi[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) melalui[`AsVertical`](../spatialreferencesystem/asvertical/) metode. |
| Local | `5` | SRS Lokal menghubungkan koordinat ke beberapa objek, selain itu Bumi. SRS Lokal dapat dikonversi menjadi[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) melalui[`AsLocal`](../spatialreferencesystem/aslocal/) metode. |

### Lihat juga

* ruang nama [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* perakitan [Aspose.GIS](../../)


