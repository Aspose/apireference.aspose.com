---
title: TopoJsonOptions.DefaultObjectName
second_title: Aspose.GIS for .NET API Referansı
description: TopoJsonOptions mülk. Özelliklerin varsayılan olarak konulduğu nesnenin adı.
type: docs
weight: 20
url: /tr/net/aspose.gis.formats.topojson/topojsonoptions/defaultobjectname/
---
## TopoJsonOptions.DefaultObjectName property

Özelliklerin varsayılan olarak konulduğu nesnenin adı.

```csharp
public string DefaultObjectName { get; set; }
```

### Notlar

Bu yazma seçeneğidir - okumayı etkilemez. TopoJSON herhangi bir sayıda adlandırılmış nesne içerebilir. Bu tür her nesne birden çok özellik içerebilir. Özelliğinizi hangi nesneye koyacağınızı belirtmek için use [`ObjectNameAttribute`](../objectnameattribute/) property. If özniteliği ve adı[`ObjectNameAttribute`](../objectnameattribute/) dır-dir`null`veya bazı özellikler için ayarını kaldırın, bu özellik adı ile nesneye eklenir`DefaultObjectName` . If özniteliği ve adı[`ObjectNameAttribute`](../objectnameattribute/) içinde mevcut değil[`Attributes`](../../../aspose.gis/vectorlayer/attributes/) koleksiyonu, tüm özellikler ada sahip nesneye konur[`ObjectNameAttribute`](../objectnameattribute/) . Varsayılan değer "adsız"dır.

### Ayrıca bakınız

* class [TopoJsonOptions](../)
* ad alanı [Aspose.Gis.Formats.TopoJson](../../topojsonoptions/)
* toplantı [Aspose.GIS](../../../)


