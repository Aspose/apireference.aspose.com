---
title: IGeometry.Relate
second_title: Aspose.GIS for .NET API Referansı
description: IGeometry yöntem. Bu geometrinin ve belirli bir geometrinin DE9IM kesişim matrisinin sağlanan desenle eşleşip eşleşmediğini belirler.
type: docs
weight: 290
url: /tr/net/aspose.gis.geometries/igeometry/relate/
---
## IGeometry.Relate method

Bu geometrinin ve belirli bir geometrinin DE-9IM kesişim matrisinin sağlanan desenle eşleşip eşleşmediğini belirler.

```csharp
public bool Relate(IGeometry other, string intersectionPatternMatrix)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| other | IGeometry | Bir geometri. |
| intersectionPatternMatrix | String | Eşleşecek bir bilmece. Bu, 9'a eşit uzunlukta bir dize olmalıdır. Dizinin her karakteri, bir kesişmenin beklenen boyutunu temsil eder: karakter 0 - geometrilerin içleri arasında.karakter 1 - bu geometrinin içi ile başka bir geometrinin sınırı arasında.karakter 2 - bu geometrinin içi ile başka bir geometrinin dışı arasında.karakter 3 - bu geometrinin sınırı ile başka bir geometrinin içi arasında.karakter 4 - geometrilerin sınırları arasında.karakter 5 - bu geometrinin sınırı ile başka bir geometrinin dışı arasında.karakter 6 - bu geometrinin dışı ile başka bir geometrinin içi arasında.karakter 7 - bu geometrinin dışı ile başka bir geometrinin sınırı arasında.karakter 8 - geometrilerin dışları arasında. Her karakterin olası değerleri: * - herhangi bir değer;F - kesişme yok;T - herhangi bir kavşak;0 - nokta kesişimi (örn. ortak nokta);1 - hat kesişimi (örneğin, hattın paylaşılan bölümü);2 - alan kesişimi (örneğin, çokgenin paylaşılan kısmı); Örneğin, "F0******" bir kesişme modeli, interiors geometrileri arasında kesişme olmaması gerektiği ve geometriler arasındaki kesişme sınırlarının bir nokta olması gerektiği anlamına gelir. Kesişim matrisi hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın. desen. |

### Geri dönüş değeri

`true` bu kesişim matrisi pıtırtı ile eşleşirse;`false` aksi halde.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | *other* dır-dir`null`. |
| ArgumentException | Geometrilerden biri, işlemin tamamlanamayacağı şekilde geçersiz. |
| ArgumentException | [`SpatialReferenceSystem`](../spatialreferencesystem/) geometrilerin eşdeğer değil. Kullanabilirsiniz[`SpatialReferenceSystemTransformation`](../../../aspose.gis.spatialreferencing/spatialreferencesystemtransformation/) geometrileri aynı uzamsal referans sistemine dönüştürmek için. |

### Notlar

Bu yöntem, DE-9IM kesişim matrisini oluşturur ve bunu pattern ile eşleştirir. DE-9IM kesişim matrisi hakkında daha fazla ayrıntı için OpenGIS Basit Özellikler Spesifikasyonuna bakın.

### Örnekler

Şu kod:  , geometrilerin uzamsal olarak eşit olup olmadığını algılar.

```csharp
geometry.Relate(other, "T*F**FFF*");
```

### Ayrıca bakınız

* interface [IGeometry](../)
* ad alanı [Aspose.Gis.Geometries](../../igeometry/)
* toplantı [Aspose.GIS](../../../)


