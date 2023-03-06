---
title: Feature.GetValueOrDefault
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Bir özelliğin değerini alır veyaDefaultValue değer ayarlanmamışsa veyahükümsüz .
type: docs
weight: 40
url: /tr/net/aspose.gis/feature/getvalueordefault/
---
## GetValueOrDefault&lt;T&gt;(string) {#getvalueordefault_1}

Bir özelliğin değerini alır veya[`DefaultValue`](../../featureattribute/defaultvalue/) değer ayarlanmamışsa veya`hükümsüz` .

```csharp
public T GetValueOrDefault<T>(string attributeName)
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

Bu yöntem, değeri otomatik olarak genel tür parametresinde istenen türe dönüştürür.

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)

---

## GetValueOrDefault(string, object) {#getvalueordefault}

Bir özelliğin değerini alır veya[`DefaultValue`](../../featureattribute/defaultvalue/) değer ayarlanmamışsa veya`hükümsüz` .

```csharp
public object GetValueOrDefault(string attributeName, object defaultValue = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| attributeName | String | Özelliğin adı. |
| defaultValue | Object | Öznitelik değeri eksikse döndürülecek değer. Varsayılan değer:`null` . |

### Geri dönüş değeri

Özelliğin değeri.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | öznitelik adı`null`. |
| ArgumentException | Bu ada sahip özellik bu katmanda mevcut değil. |
| InvalidOperationException | Öznitelik kilitli değil. |
| InvalidOperationException | Bu özelliğin değeri, bu özellik için ayarlanmadı. |

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)

---

## GetValueOrDefault&lt;T&gt;(string, object) {#getvalueordefault_2}

Bir özelliğin değerini alır veya[`DefaultValue`](../../featureattribute/defaultvalue/) değer ayarlanmamışsa veya`hükümsüz` .

```csharp
public T GetValueOrDefault<T>(string attributeName, object defaultValue)
```

| Parametre | Tanım |
| --- | --- |
| T | Değer için istenen tür. |
| attributeName | Özelliğin adı. |
| defaultValue | Öznitelik değeri eksikse döndürülecek değer. |

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

Bu yöntem, değeri otomatik olarak genel tür parametresinde istenen türe dönüştürür.

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


