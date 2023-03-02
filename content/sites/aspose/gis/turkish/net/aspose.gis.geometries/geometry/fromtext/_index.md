---
title: Geometry.FromText
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. İyi Bilinen Metin gösteriminden bir geometri oluşturur.
type: docs
weight: 470
url: /tr/net/aspose.gis.geometries/geometry/fromtext/
---
## FromText(string) {#fromtext}

İyi Bilinen Metin gösteriminden bir geometri oluşturur.

```csharp
public static IGeometry FromText(string wkt)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| wkt | String | Bir geometrinin İyi Bilinen Metin gösterimi. |

### Geri dönüş değeri

Bağımsız değişken tarafından temsil edilen bir geometri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş. |
| NotSupportedException | Bağımsız değişken, desteklenmeyen türde bir geometriyi temsil ediyor. |
| FormatException | Argüman geçerli bir İyi Bilinen Metin değil. |

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)

---

## FromText(string, SpatialReferenceSystem) {#fromtext_1}

İyi Bilinen Metin gösteriminden bir geometri oluşturur.

```csharp
public static IGeometry FromText(string wkt, SpatialReferenceSystem spatialReferenceSystem)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| wkt | String | Bir geometrinin İyi Bilinen Metin gösterimi. |
| spatialReferenceSystem | SpatialReferenceSystem | Geometriye atanacak Uzamsal Referans Sistemi. |

### Geri dönüş değeri

Bağımsız değişken tarafından temsil edilen bir geometri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman boş. |
| NotSupportedException | Bağımsız değişken, desteklenmeyen türde bir geometriyi temsil ediyor. |
| FormatException | Argüman geçerli bir İyi Bilinen Metin değil. |

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


