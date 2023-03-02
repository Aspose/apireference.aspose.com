---
title: Feature.GetValuesDump
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Bir dizideki tüm özniteliklerin değerlerini döndürür. Kullanmayı düşününGetValues ek bellek ayırmayı önleme yöntemi.
type: docs
weight: 60
url: /tr/net/aspose.gis/feature/getvaluesdump/
---
## Feature.GetValuesDump method

Bir dizideki tüm özniteliklerin değerlerini döndürür. Kullanmayı düşünün[`GetValues`](../getvalues/) ek bellek ayırmayı önleme yöntemi.

```csharp
public object[] GetValuesDump(object defaultValue = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| defaultValue | Object | Öznitelik değeri eksikse (ayarlanmamışsa) döndürülecek değer. Varsayılan değer:`null`. ' kullanmayı düşününDBNull'ayarsız' ve 'ayırmak için .değer'`null` değerler. |

### Geri dönüş değeri

Nitelik değerlerinin kopyalanacağı yeni bir dizi.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman`null`. |
| InvalidOperationException | Öznitelik kilitli değil. |

### Notlar

Özelliğin Value öznitelikleri, parametre olarak iletilen değerler dizisine kopyalanır. Unset değeri olan öznitelikler için, belirtilen 'unsetValue' parametresi döndürülür.

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


