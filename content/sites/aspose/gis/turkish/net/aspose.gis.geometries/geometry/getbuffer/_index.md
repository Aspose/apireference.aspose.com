---
title: Geometry.GetBuffer
second_title: Aspose.GIS for .NET API Referansı
description: Geometry yöntem. Bu geometri etrafında bir tampon bölge hesaplar.
type: docs
weight: 210
url: /tr/net/aspose.gis.geometries/geometry/getbuffer/
---
## Geometry.GetBuffer method

Bu geometri etrafında bir tampon bölge hesaplar.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| distance | Double | Tampon bölge genişliği. |
| quadrantSegments | Int32 | 90 derecelik bir eğriliğe yaklaşmak için kullanılan segment sayısı. Bu sayı ne kadar büyük olursa, eğriler o kadar iyi tahmin edilir. Varsayılan değer 30. |

### Geri dönüş değeri

Bu geometriden belirli bir mesafe içindeki tüm noktaları temsil eden bir geometri. Sonucun türü ya[`Null`](../null/) ,[`IPolygon`](../../ipolygon/) veya[`IMultiPolygon`](../../imultipolygon/) .

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri, işlemin tamamlanamayacağı şekilde geçersizdir. |
| ArgumentOutOfRangeException | Çeyrek segmentler, 0. 'den küçük veya eşittir |

### Ayrıca bakınız

* interface [IGeometry](../../igeometry/)
* class [Geometry](../)
* ad alanı [Aspose.Gis.Geometries](../../geometry/)
* toplantı [Aspose.GIS](../../../)


