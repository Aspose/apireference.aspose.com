---
title: Geometry.FromBinary
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. İyi Bilinen İkili temsilinden bir geometri oluşturur.
type: docs
weight: 460
url: /tr/net/aspose.gis.geometries/geometry/frombinary/
---
## FromBinary(byte[]) {#frombinary}

İyi Bilinen İkili temsilinden bir geometri oluşturur.

```csharp
public static IGeometry FromBinary(byte[] wkb)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| wkb | Byte[] | Bir geometrinin İyi Bilinen İkili gösterimi. |

### Geri dönüş değeri

Bağımsız değişken tarafından temsil edilen bir geometri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş. |
| NotSupportedException | Bağımsız değişken, desteklenmeyen türde bir geometriyi temsil ediyor. |
| FormatException | Argüman geçerli bir İyi Bilinen İkili Dosya değil. |

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)

---

## FromBinary(byte[], SpatialReferenceSystem) {#frombinary_1}

İyi Bilinen İkili temsilinden bir geometri oluşturur.

```csharp
public static IGeometry FromBinary(byte[] wkb, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| wkb | Byte[] | Bir geometrinin İyi Bilinen İkili gösterimi. |
| spatialReferenceSystem | SpatialReferenceSystem | Geometriye atanacak Uzamsal Referans Sistemi. |

### Geri dönüş değeri

Bağımsız değişken tarafından temsil edilen bir geometri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş. |
| NotSupportedException | Bağımsız değişken, desteklenmeyen türde bir geometriyi temsil ediyor. |
| FormatException | Argüman geçerli bir İyi Bilinen İkili Dosya değil. |

### Notlar

Geometri a'dan sonra fazladan bayt varsaFormatException istisna atıldı.

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


