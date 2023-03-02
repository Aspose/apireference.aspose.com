---
title: SpatialReferenceSystem.Validate
second_title: Aspose.GIS for .NET API Referansı
description: SpatialReferenceSystem yöntem. Bu SRSnin geçerli olup olmadığını belirleyin.
type: docs
weight: 240
url: /tr/net/aspose.gis.spatialreferencing/spatialreferencesystem/validate/
---
## SpatialReferenceSystem.Validate method

Bu SRS'nin geçerli olup olmadığını belirleyin.

```csharp
public abstract bool Validate(out string errorMessage)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| errorMessage | String& | Eğer yöntem dönüşü`false` o zaman bu geçersizliğin açıklamasıdır. |

### Geri dönüş değeri

`true` SRS geçerliyse,`false` aksi takdirde.

### Notlar

Geçerli SRS'de geçerli bir elipsoid olmalıdır. - Coğrafi SRS'nin tam olarak bir Doğu/Batı ekseni, tam olarak bir Kuzey/Güney ekseni ve isteğe bağlı Yukarı/Aşağı ekseni olmalıdır (coğrafi SRS, 2B coğrafi SRS'nin bir bileşimi olduğunda isteğe bağlı eksen mevcuttur ve dikey SRS). - Öngörülen SRS'nin tam olarak bir Doğu/Batı ekseni, tam olarak bir Kuzey/Güney ekseni ve isteğe bağlı Yukarı/Aşağı ekseni olmalıdır (yansıtılan SRS, 2B coğrafi SRS ve dikey SRS'nin bir bileşimi olduğunda isteğe bağlı eksen mevcuttur). - Geocentric SRS tam olarak bir Doğu/Batı eksenine, tam olarak bir Kuzey/Güney eksenine ve tam olarak bir Diğer eksene sahip olmalıdır. - Dikey SRS tam olarak bir Yukarı/Aşağı eksene sahip olmalıdır. - Yerel SRS en az bir eksene sahip olmalıdır. Eksen yönleri ölçülmez. - Bileşik SRS, geçerli bir Coğrafi/Öngörülen ve geçerli bir Dikey SRS'nin birleşimi olmalıdır.

### Ayrıca bakınız

* class [SpatialReferenceSystem](../)
* ad alanı [Aspose.Gis.SpatialReferencing](../../spatialreferencesystem/)
* toplantı [Aspose.GIS](../../../)


