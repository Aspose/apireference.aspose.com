---
title: Feature.CopyValues
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Başka bir özellikten özniteliklerin değerlerini kopyalar.
type: docs
weight: 20
url: /tr/net/aspose.gis/feature/copyvalues/
---
## Feature.CopyValues method

Başka bir özellikten özniteliklerin değerlerini kopyalar.

```csharp
public void CopyValues(Feature inputFeature)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| inputFeature | Feature | Değerlerin kopyalanacağı özellik. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman`null`. |
| ArgumentException | Bu ada sahip özellik bu katmanda mevcut değil. |
| InvalidOperationException | Öznitelik kilitli değil. |
| InvalidOperationException | Giriş değeri boştur ve bu özellikteki öznitelik boş olamaz. |
| [GisException](../../gisexception/) | Bir öznitelik, özelliklerde aynı ada ancak farklı veri türlerine sahiptir. |

### Notlar

Bu yöntem yalnızca eşleşen adlara sahip öznitelikleri kopyalar.

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


