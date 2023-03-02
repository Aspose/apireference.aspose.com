---
title: Class AbstractPath
second_title: Aspose.GIS for .NET API Referansı
description: Aspose.Gis.AbstractPath sınıf. birÖzetYol diğerleri arasında dosya sistemi yerel dosya sistemi uzak dosya deposu veya ZIP arşivi gibi bir ortamda benzersiz bir konum belirten sınıflar için bir temel sınıftır.
type: docs
weight: 10
url: /tr/net/aspose.gis/abstractpath/
---
## AbstractPath class

bir`ÖzetYol` diğerleri arasında dosya sistemi, yerel dosya sistemi, uzak dosya deposu veya ZIP arşivi gibi bir ortamda benzersiz bir konum belirten sınıflar için bir temel sınıftır.

```csharp
public abstract class AbstractPath
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [Location](../../aspose.gis/abstractpath/location/) { get; } | Bunun konumunun dize gösterimini alır`ÖzetYol` . |
| abstract [Separator](../../aspose.gis/abstractpath/separator/) { get; } | Dizin düzeylerini ayırmak için kullanılan bir ayırıcı karakter alır.[`Location`](./location/) sicim. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| static [FromLocalPath](../../aspose.gis/abstractpath/fromlocalpath/)(string) | oluşturur`AbstractPath` bu, yerel dosya sistemindeki bir konumu temsil eder. |
| static [FromStream](../../aspose.gis/abstractpath/fromstream/)(Stream) | oluşturur`AbstractPath` birStream . |
| virtual [Combine](../../aspose.gis/abstractpath/combine/)(string) | Bunu birleştirir`AbstractPath` belirtilen yol bileşenleriyle. |
| abstract [Delete](../../aspose.gis/abstractpath/delete/)() | Bu yolla işaret edilen bir dosyayı siler. |
| [GetExtension](../../aspose.gis/abstractpath/getextension/)() | Bunun uzantısını döndürür`AbstractPath` . |
| [GetFileName](../../aspose.gis/abstractpath/getfilename/)() | Bunun dosya adını ve uzantısını döndürür.`AbstractPath` . |
| [GetFileNameWithoutExtension](../../aspose.gis/abstractpath/getfilenamewithoutextension/)() | Bunun dosya adını döndürür`AbstractPath` uzantı olmadan. |
| abstract [IsFile](../../aspose.gis/abstractpath/isfile/)() | Bu yolun, okuma için açılabilen mevcut bir dosyaya işaret edip etmediğini gösteren bir değer alır. |
| abstract [ListDirectory](../../aspose.gis/abstractpath/listdirectory/)() | Bunun içinde bulunan yolları döndürür`ÖzetYol` , eğer bu bir directory. ise |
| abstract [Open](../../aspose.gis/abstractpath/open/)(FileAccess) | Bunu açar`ÖzetYol`dosya olarak. |
| virtual [WithExtension](../../aspose.gis/abstractpath/withextension/)(string) | Yeni bir döndürür`AbstractPath` dosya uzantısı belirtilen değere değiştirildi. |

### Notlar

bir`ÖzetYol` yerel dosya sisteminde bir konum, uzak dosya sisteminde bir konum veya Azure Blob depolama gibi bir harici depolama vb. belirtebilir. Konum, var olan veya olmayan bir dosya benzeri nesneye, dizin benzeri nesneye işaret edebilir veya ait olduğu ortam için makul başka bir anlama sahip olabilir. Örnek olarak, bir`ÖzetYol` yerel dosya sistemindeki bir konumu temsil eden mirasçı, varolan bir dosyasına, dizine veya dosya sistemindeki henüz oluşturulmamış bir yere işaret edebilir. Kullanılabilir yeni bir dosya sistemi benzeri depolama yapmak için`Aspose.GIS` kişi bu class 'yi devralmalı ve soyut yöntemlerini uygulamalıdır.

### Ayrıca bakınız

* ad alanı [Aspose.Gis](../../aspose.gis/)
* toplantı [Aspose.GIS](../../)


