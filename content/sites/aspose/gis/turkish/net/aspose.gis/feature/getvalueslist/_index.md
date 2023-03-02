---
title: Feature.GetValuesList
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Bir öznitelik dizisinin değerlerini bir liste olarak alır.
type: docs
weight: 70
url: /tr/net/aspose.gis/feature/getvalueslist/
---
## Feature.GetValuesList&lt;T&gt; method

Bir öznitelik dizisinin değerlerini bir liste olarak alır.

```csharp
public List<T> GetValuesList<T>(string attributeName, string separator)
```

| Parametre | Tanım |
| --- | --- |
| T | Değerler için istenen tip. |
| attributeName | Özelliğin adı. |
| separator | Dizinin öznitelik adını ve dizin değerini ayırmak için kullanılan bir dize. |

### Geri dönüş değeri

Dizi dizin değerine göre farklı adlar veren özniteliklerin değerlerinin listesi.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | öznitelik adı`null`. |
| ArgumentException | Bu ada sahip özellik bu katmanda mevcut değil. |
| InvalidOperationException | Öznitelik kilitli değil. |
| InvalidOperationException | Bu özelliğin değeri, bu özellik için ayarlanmadı. |
| InvalidCastException | İstenen tür uygulanmıyorIConvertible. |
| InvalidCastException | Özelliğin değeri:`null`, ancak istenen tür bir değer türüdür. |
| FormatException | Değer yanlış biçimde olduğundan dönüştürme başarısız oldu. |
| OverflowException | Taşma nedeniyle dönüştürme başarısız oldu. |

### Notlar

Bu,[`GetValue`](../getvalue/) tek bir değer elde etmek için. Bu nedenle, bu yöntem, değeri otomatik olarak genel tür parametresinde istenen türe dönüştürür.  0 indeksli öznitelik bulunamazsa üretecekArgumentException .

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


