---
title: Feature.GetValues
second_title: Aspose.GIS for .NET API Referansı
description: Feature yöntem. Bir dizideki tüm özniteliklerin değerlerini döndürür.
type: docs
weight: 50
url: /tr/net/aspose.gis/feature/getvalues/
---
## Feature.GetValues method

Bir dizideki tüm özniteliklerin değerlerini döndürür.

```csharp
public int GetValues(object[] values, object defaultValue = null)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| values | Object[] | Öznitelik değerlerinin kopyalanacağı dizi. |
| defaultValue | Object | Öznitelik değeri eksikse (ayarlanmamışsa) döndürülecek değer. Varsayılan değer:`null`. ' kullanmayı düşününDBNull'ayarsız' ve 'ayırmak için .değer'`null` değerler. |

### Geri dönüş değeri

Bir dizi özellik kopyalandı.

### istisnalar

| istisna | şart |
| --- | --- |
| ArgumentNullException | Argüman`null`. |
| InvalidOperationException | Öznitelik kilitli değil. |

### Notlar

Özelliğin Value öznitelikleri, parametre olarak iletilen değerler dizisine kopyalanır. Unset değeri olan öznitelikler için, belirtilen 'unsetValue' parametresi döndürülür.  Değerler dizisinin uzunluğunun, özellikteki özniteliklerin sayısıyla eşleşmesi gerekmez. Dizinin uzunluğu, özniteliklerin sayısından büyükse, tüm öznitelik değerleri diziye kopyalanır; daha azsa, öznitelik değerlerinin yalnızca dizi uzunluğu sayısı, sıralı 0. olan öznitelik değerinden başlayarak, dizisine kopyalanır.

### Ayrıca bakınız

* class [Feature](../)
* ad alanı [Aspose.Gis](../../feature/)
* toplantı [Aspose.GIS](../../../)


