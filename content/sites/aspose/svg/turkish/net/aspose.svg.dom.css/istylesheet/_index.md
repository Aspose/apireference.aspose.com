---
title: Interface IStyleSheet
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Css.IStyleSheet arayüz. StyleSheet arabirimi herhangi bir stil sayfası türü için soyut temel arabirimdir. Yapılandırılmış bir belgeyle ilişkili tek bir stil sayfasını temsil eder.
type: docs
weight: 740
url: /tr/net/aspose.svg.dom.css/istylesheet/
---
## IStyleSheet interface

StyleSheet arabirimi, herhangi bir stil sayfası türü için soyut temel arabirimdir. Yapılandırılmış bir belgeyle ilişkili tek bir stil sayfasını temsil eder.

```csharp
public interface IStyleSheet
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Disabled](../../aspose.svg.dom.css/istylesheet/disabled/) { get; set; } | Stil sayfası belgeye uygulanmışsa false. değilse doğrudur. Bu özniteliği değiştirmek, belge için yeni bir stil çözünürlüğüne neden olabilir. Bir stil sayfası yalnızca hem uygun bir ortam tanımı mevcutsa hem de devre dışı bırakılan öznitelik yanlışsa geçerlidir. Bu nedenle, ortam geçerli kullanıcı aracısı için geçerli değilse, devre dışı bırakılan öznitelik göz ardı edilir. |
| [Href](../../aspose.svg.dom.css/istylesheet/href/) { get; } | Stil sayfası bağlantılı bir stil sayfasıysa, özniteliğinin değeri konumudur. Satır içi stil sayfaları için bu özelliğin değeri boştur. |
| [Media](../../aspose.svg.dom.css/istylesheet/media/) { get; } | Stil bilgisi için amaçlanan hedef ortam. |
| [OwnerNode](../../aspose.svg.dom.css/istylesheet/ownernode/) { get; } | Bu stil sayfasını belgeyle ilişkilendiren düğüm. HTML için bu, karşılık gelen LINK veya STYLE öğesi olabilir. XML için, bağlama işleme talimatı olabilir. Diğer stil sayfaları tarafından dahil edilen stil sayfaları için bu özelliğin değeri null. şeklindedir. |
| [ParentStyleSheet](../../aspose.svg.dom.css/istylesheet/parentstylesheet/) { get; } | Stil sayfası dahil etme kavramını destekleyen stil sayfası dilleri için, bu öznitelik varsa dahil olan stil sayfasını temsil eder. Stil sayfası üst düzey bir stil sayfasıysa veya stil sayfası dili eklemeyi desteklemiyorsa, bu özelliğin değeri null. |
| [Title](../../aspose.svg.dom.css/istylesheet/title/) { get; } | Danışma başlığı. |
| [Type](../../aspose.svg.dom.css/istylesheet/type/) { get; } | Bu, bu stil sayfası için stil sayfası dilini belirtir. Stil sayfası dili, içerik türü olarak belirtilir (örn. "text/css"). |

### Ayrıca bakınız

* ad alanı [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* toplantı [Aspose.SVG](../../)


