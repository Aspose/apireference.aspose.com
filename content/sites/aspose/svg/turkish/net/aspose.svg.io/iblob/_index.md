---
title: Interface IBlob
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.IO.IBlob arayüz. Bir Blob nesnesi bir bayt dizisine atıfta bulunur ve bayt dizisindeki toplam bayt sayısı olan bir boyut özniteliğine ve bayt dizisinin ortam türünü temsil eden küçük harflerle ASCII kodlu bir dize olan bir tür özniteliğine sahiptir. .
type: docs
weight: 1920
url: /tr/net/aspose.svg.io/iblob/
---
## IBlob interface

Bir Blob nesnesi, bir bayt dizisine atıfta bulunur ve bayt dizisindeki toplam bayt sayısı olan bir boyut özniteliğine ve bayt dizisinin ortam türünü temsil eden küçük harflerle ASCII kodlu bir dize olan bir tür özniteliğine sahiptir. .

```csharp
public interface IBlob
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Size](../../aspose.svg.io/iblob/size/) { get; } | Bayt dizisinin boyutunu bayt sayısı olarak döndürür. Alma sırasında, uygun kullanıcı aracıları, bir FileReader veya FileReaderSync nesnesi tarafından okunabilen toplam bayt sayısını veya Blob'da okunacak bayt yoksa 0 döndürmelidir. . |
| [Type](../../aspose.svg.io/iblob/type/) { get; } | Blob'un ortam türünü temsil eden küçük harfli ASCII kodlu dize. Alınırken, kullanıcı aracıları Blob türünü küçük harfli ASCII kodlu dize olarak döndürmelidir, öyle ki bir bayta dönüştürüldüğünde dizi, ayrıştırılabilir bir MIME türüdür, veya tür belirlenemezse boş dize – 0 bayt – olur. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Slice](../../aspose.svg.io/iblob/slice/)(ulong, ulong, string) | İsteğe bağlı başlangıç parametresinden isteğe bağlı bitiş parametresi 'ye kadar olan ancak bu parametreyi içermeyen baytlara ve isteğe bağlı contentType parametresinin değeri olan bir type özniteliğine sahip yeni bir Blob nesnesi döndürür. |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.IO](../../aspose.svg.io/)
* toplantı [Aspose.SVG](../../)


