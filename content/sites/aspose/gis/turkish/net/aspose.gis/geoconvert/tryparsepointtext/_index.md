---
title: GeoConvert.TryParsePointText
second_title: Aspose.GIS for .NET API Referansı
description: GeoConvert yöntem. Koordinatları içeren dizgiyi IPoint nesnesine dönüştürür. Dönüş değeri dönüştürmenin başarılı olup olmadığını gösterir.
type: docs
weight: 30
url: /tr/net/aspose.gis/geoconvert/tryparsepointtext/
---
## GeoConvert.TryParsePointText method

Koordinatları içeren dizgiyi IPoint nesnesine dönüştürür. Dönüş değeri, dönüştürmenin başarılı olup olmadığını gösterir.

```csharp
public static bool TryParsePointText(string text, out IPoint point)
```

| Parametre | Tip | Tanım |
| --- | --- | --- |
| text | String | Dönüştürülecek koordinatları içeren bir dize. Dize, hem koordinat enlemini hem de boylamı içermelidir. Koordinatlar boşlukla, virgülle veya noktalı virgülle ayrılmalıdır. |
| point | IPoint& | Bu yöntem geri döndüğünde, dönüştürme başarılıysa ayrıştırılmış koordinatlara sahip IPoint nesnesini veya dönüştürme başarısızsa null'u içerir. |

### Geri dönüş değeri

Metin başarıyla ayrıştırıldıysa doğru, aksi takdirde Yanlış.

### Notlar

Örnekler: "80° 151°", "74°50,82', 172°08,21'", "80°;151°", "2CMB", "2CMB6682893142", "2C MB 66828 93142", "WMAQ12405535".

### Ayrıca bakınız

* interface [IPoint](../../../aspose.gis.geometries/ipoint/)
* class [GeoConvert](../)
* ad alanı [Aspose.Gis](../../geoconvert/)
* toplantı [Aspose.GIS](../../../)


