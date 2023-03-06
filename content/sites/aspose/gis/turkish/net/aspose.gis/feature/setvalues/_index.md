---
title: Feature.SetValues
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Tüm nitelikler için yeni değerler ayarlar. Ayrıca kullanmayı düşününCopyValues ayar değerlerini tek bir çağrıda düzene sokma yöntemi.
type: docs
weight: 120
url: /tr/net/aspose.gis/feature/setvalues/
---
## Feature.SetValues method

Tüm nitelikler için yeni değerler ayarlar. Ayrıca kullanmayı düşünün[`CopyValues`](../copyvalues/) ayar değerlerini tek bir çağrıda düzene sokma yöntemi.

```csharp
public int SetValues(object[] values)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| values | Object[] | Yeni değerler dizisi. |

### Geri dönüş değeri

Ayarlanan özellik değerlerinin sayısı.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman olamaz`null`. |
| ArgumentException | Bu ada sahip özellik bu katmanda mevcut değil. |
| InvalidOperationException | Öznitelik kilitli değil. |
| InvalidCastException | Değerin türü uygulanmıyorIConvertible. |
| FormatException | Değer yanlış biçimde olduğundan dönüştürme başarısız oldu. |
| OverflowException | Taşma nedeniyle dönüştürme başarısız oldu. |

### Notlar

Bu yöntem, her değeri otomatik olarak özniteliğin türüne dönüştürür.  Değerler dizisinin uzunluğunun özellikteki öznitelik sayısıyla eşleşmesi gerekmez. Dizinin uzunluğu öznitelik sayısından büyükse, dizi değerlerinin tümü özniteliklere kopyalanır; daha azsa, 0. sıralı öznitelik değerinden başlayarak, özniteliklerine yalnızca dizi uzunluğu değer sayısı kopyalanır

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


