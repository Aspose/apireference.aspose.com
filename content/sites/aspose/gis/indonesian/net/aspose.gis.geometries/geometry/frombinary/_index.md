---
title: Geometry.FromBinary
second_title: Aspose.GIS untuk Referensi .NET API
description: Geometry metode. Membuat geometri dari representasi Biner Terkenalnya.
type: docs
weight: 460
url: /id/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

Membuat geometri dari representasi Biner Terkenalnya.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| wkb | Byte[] | Representasi Biner Terkenal dari geometri. |

### Nilai Pengembalian

Geometri yang diwakili oleh argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah nol. |
| NotSupportedException | Argumen mewakili geometri dari tipe yang tidak didukung. |
| FormatException | Argumen bukan Well-Known Binary yang valid. |

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

Membuat geometri dari representasi Biner Terkenalnya.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Parameter | Jenis | Keterangan |
| --- | --- | --- |
| wkb | Byte[] | Representasi Biner Terkenal dari geometri. |
| spatialReferenceSystem | SpatialReferenceSystem | Sistem Referensi Spasial untuk ditugaskan ke geometri. |

### Nilai Pengembalian

Geometri yang diwakili oleh argumen.

### Pengecualian

| pengecualian | kondisi |
| --- | --- |
| ArgumentNullException | Argumen adalah nol. |
| NotSupportedException | Argumen mewakili geometri dari tipe yang tidak didukung. |
| FormatException | Argumen bukan Well-Known Binary yang valid. |

### Perkataan

Jika ada byte ekstra setelah geometri aFormatException pengecualian dilemparkan.

### Lihat juga

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* ruang nama [Aspose.Gis.Geometries](../../geometry/)
* perakitan [Aspose.GIS](../../../)


