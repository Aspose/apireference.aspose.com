---
title: GmlOptions.SchemaLocation
second_title: Aspose.GIS for .NET API Referansı
description: GmlOptions mülk. URI çiftlerinin boşlukla ayrılmış listesi. Her çiftteki ilk URI ad alanının bir URIsidir ikinci URI ad alanının XML Yolu şemasıdır. Olarak ayarlanırsanull GmlDriver belgenin kök öğesinden schemaLocation okumayı deneyecek. Varsayılannull .
type: docs
weight: 50
url: /tr/net/aspose.gis.formats.gml/gmloptions/schemalocation/
---
## GmlOptions.SchemaLocation property

URI çiftlerinin boşlukla ayrılmış listesi. Her çiftteki ilk URI, ad alanının bir URI'sidir, ikinci URI, ad alanının XML Yolu şemasıdır. Olarak ayarlanırsa`null` ,[`GmlDriver`](../../gmldriver/) belgenin kök öğesinden schemaLocation okumayı deneyecek. Varsayılan:`null` .

```csharp
public string SchemaLocation { get; set; }
```

### Notlar

Aspose.GIS, oluşturmak için GML dosyasının XML şemasını kullanır.[`FeatureAttributeCollection`](../../../aspose.gis/featureattributecollection/) Varsayılan olarak, şema konumu, schemaLocation özniteliğinden çıkarılan 'dir. Böyle bir öznitelik yoksa veya geçersiz konuma işaret ediyorsa, Aspose.GIS, GML dosyasını okuyamaz. Bu durumda - Aspose.GIS'in schema. dosyasını yükleyebilmesi için bu seçeneği ayarlayın

### Örnekler

"http://site.com/namespace http://site.com/schema.xsd"

### Ayrıca bakınız

* class [GmlOptions](../)
* ad alanı [Aspose.Gis.Formats.Gml](../../gmloptions/)
* toplantı [Aspose.GIS](../../../)


