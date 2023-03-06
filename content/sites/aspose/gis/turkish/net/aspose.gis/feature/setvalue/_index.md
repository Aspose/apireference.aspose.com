---
title: Feature.SetValue
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Bir özellik için yeni bir değer ayarlar.
type: docs
weight: 100
url: /tr/net/aspose.gis/feature/setvalue/
---
## Feature.SetValue&lt;T&gt; method

Bir özellik için yeni bir değer ayarlar.

```csharp
public void SetValue<T>(string attributeName, T value)
```

| Parametre | Tanım |
| --- | --- |
| T | Değerin türü. |
| attributeName | Özniteliğin adı. |
| value | Özelliğin değeri. |

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | öznitelik adı`null`. |
| ArgumentException | Bu ada sahip özellik bu katmanda mevcut değil. |
| InvalidOperationException | Öznitelik kilitli değil. |
| InvalidCastException | Değerin türü uygulanmıyorIConvertible. |
| FormatException | Değer yanlış biçimde olduğundan dönüştürme başarısız oldu. |
| OverflowException | Taşma nedeniyle dönüştürme başarısız oldu. |

### Notlar

Bu yöntem, değeri otomatik olarak özelliğin türüne dönüştürür.

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


