---
title: Enum SpatialReferenceSystemType
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.SpatialReferencing.SpatialReferenceSystemType Sıralama. Uzamsal referans sisteminin türünü temsil eder.
type: docs
weight: 2270
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystemtype/
---
## SpatialReferenceSystemType enumeration

Uzamsal referans sisteminin türünü temsil eder.

```csharp
public enum SpatialReferenceSystemType
```

### değerler

| İsim | Değer | Tanım |
| --- | --- | --- |
| Unknown | `0` | Varsayılan değer. Şuradan döndürülebilir:[`Type`](../spatialreferencesystem/type/) bu, SRS'lerin altında yatan geçersiz kombinasyonuna sahip bir bileşik SRS ise. Görmek[`IsCompound`](../spatialreferencesystem/iscompound/) . |
| Geographic | `1` | Coğrafi SRS, açısal boylam ve açısal enlemi temel alır. Coğrafi SRS şuna dönüştürülebilir:[`GeographicSpatialReferenceSystem`](../geographicspatialreferencesystem/) yoluyla[`AsGeographic`](../spatialreferencesystem/asgeographic/) yöntem. |
| Geocentric | `2` | Yermerkezli SRS, Dünya merkezinden başlayan üç boyutlu kartezyen SRS'dir. Yermerkezli SRS şuna dönüştürülebilir:[`GeocentricSpatialReferenceSystem`](../geocentricspatialreferencesystem/) yoluyla[`AsGeocentric`](../spatialreferencesystem/asgeocentric/) yöntem. |
| Projected | `3` | Projeksiyonlu SRS, lineer X ve lineer Y'ye dayalıdır.Geographic SRS. Öngörülen SRS şuna dönüştürülebilir:[`ProjectedSpatialReferenceSystem`](../projectedspatialreferencesystem/) yoluyla[`AsProjected`](../spatialreferencesystem/asprojected/) yöntem. |
| Vertical | `4` | Dikey SRS, doğrusal yükseklik koordinatını tanımlar. Dikey SRS şuna dönüştürülebilir:[`VerticalSpatialReferenceSystem`](../verticalspatialreferencesystem/) yoluyla[`AsVertical`](../spatialreferencesystem/asvertical/) yöntem. |
| Local | `5` | Local SRS, koordinatları bazı nesnelerle ilişkilendirir, diğerleri Earth. Local SRS dönüştürülebilir[`LocalSpatialReferenceSystem`](../localspatialreferencesystem/) yoluyla[`AsLocal`](../spatialreferencesystem/aslocal/) yöntem. |

### Ayrıca bakınız

* ad alanı [Aspose.Gis.SpatialReferencing](../../aspose.gis.spatialreferencing/)
* toplantı [Aspose.GIS](../../)


