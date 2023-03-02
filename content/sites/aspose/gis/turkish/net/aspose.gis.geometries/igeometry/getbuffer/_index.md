---
title: IGeometry.GetBuffer
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometri etrafında bir tampon bölge hesaplar.
type: docs
weight: 200
url: /tr/net/aspose.gis.geometries/igeometry/getbuffer/
---
## IGeometry.GetBuffer method

Bu geometri etrafında bir tampon bölge hesaplar.

```csharp
public IGeometry GetBuffer(double distance, int quadrantSegments = 30)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| distance | Double | Tampon bölge genişliği (Uzamsal Referans birimleri cinsinden). |
| quadrantSegments | Int32 | 90 derecelik bir eğriliğe yaklaşmak için kullanılan segment sayısı. Bu sayı ne kadar büyük olursa, eğriler o kadar iyi tahmin edilir. Varsayılan değer 30. |

### Geri dönüş değeri

Bu geometriden belirli bir mesafe içindeki tüm noktaları temsil eden bir geometri. Sonucun türü ya[`Null`](../../geometry/null/) ,[`IPolygon`](../../ipolygon/) veya[`IMultiPolygon`](../../imultipolygon/) .

### istisnalar

| istisna | şart |
| --- | --- |
| InvalidOperationException | Bu geometri, işlemin tamamlanamayacağı şekilde geçersizdir. |
| ArgumentOutOfRangeException | Çeyrek segmentler, 0. 'den küçük veya eşittir |

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


