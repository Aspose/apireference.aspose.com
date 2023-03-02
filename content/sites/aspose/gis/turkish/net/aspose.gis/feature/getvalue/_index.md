---
title: Feature.GetValue
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Bir niteliğin değerini alır.
type: docs
weight: 30
url: /tr/net/aspose.gis/feature/getvalue/
---
## GetValue&lt;T&gt;(string) {#getvalue_1}

Bir niteliğin değerini alır.

```csharp
public T GetValue<T>(string attributeName)
```

| Parametre | Tanım |
| --- | --- |
| T | Değer için istenen tür. |
| attributeName | Özelliğin adı. |

### Geri dönüş değeri

Özelliğin değeri.

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

Bu yöntem, değeri otomatik olarak genel tür parametresinde istenen türe dönüştürür.  Katman, özelliklerinin katman için tanımlanan tüm nitelikler için değerlere sahip olmasını gerektirmiyorsa, bu yöntem başarısız olabilirInvalidOperationException eksik bir değer istendiğinde. Bu tür katmanlarla çalışırken kullanmayı düşünün[`GetValueOrDefault`](../getvalueordefault/) .

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)

---

## GetValue(string) {#getvalue}

Bir niteliğin değerini alır.

```csharp
public object GetValue(string attributeName)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| attributeName | String | Özelliğin adı. |

### Geri dönüş değeri

Özelliğin değeri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | öznitelik adı`null`. |
| ArgumentException | Bu ada sahip özellik bu katmanda mevcut değil. |
| InvalidOperationException | Öznitelik kilitli değil. |
| InvalidOperationException | Bu özelliğin değeri, bu özellik için ayarlanmadı. |

### Notlar

Katman, özelliklerinin katman için tanımlanan tüm nitelikler için değerlere sahip olmasını gerektirmiyorsa, bu yöntem başarısız olabilirInvalidOperationException eksik bir değer istendiğinde. Bu tür katmanlarla çalışırken kullanmayı düşünün[`GetValueOrDefault`](../getvalueordefault/) .

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


