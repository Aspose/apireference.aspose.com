---
title: Geometry.FromText
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Membuat geometri dari representasi Teks Terkenalnya.
type: docs
weight: 470
url: /id/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

Membuat geometri dari representasi Teks Terkenalnya.

```csharp
public static IGeometry FromText(string wkt)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| wkt | String | Representasi Teks Terkenal dari geometri. |

### Nilai Pengembalian

Geometri yang diwakili oleh argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah nol. |
| NotSupportedException | Argumen mewakili geometri dari tipe yang tidak didukung. |
| FormatException | Argumen bukan Teks Terkenal yang valid. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

Membuat geometri dari representasi Teks Terkenalnya.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| wkt | String | Representasi Teks Terkenal dari geometri. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem Referensi Spasial untuk ditugaskan ke geometri. |

### Nilai Pengembalian

Geometri yang diwakili oleh argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah nol. |
| NotSupportedException | Argumen mewakili geometri dari tipe yang tidak didukung. |
| FormatException | Argumen bukan Teks Terkenal yang valid. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


