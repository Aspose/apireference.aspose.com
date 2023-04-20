---
title: Interface ICSSStyleSheet
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Css.ICSSStyleSheet arayüz. CSSStyleSheet arabirimi bir CSS stil sayfasını yani içerik türü text/css olan bir stil sayfasını temsil etmek için kullanılan somut bir arabirimdir.
type: docs
weight: 660
url: /tr/net/aspose.svg.dom.css/icssstylesheet/
---
## ICSSStyleSheet interface

CSSStyleSheet arabirimi, bir CSS stil sayfasını, yani içerik türü "text/css" olan bir stil sayfasını temsil etmek için kullanılan somut bir arabirimdir.

```csharp
public interface ICSSStyleSheet : IStyleSheet
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icssstylesheet/cssrules/) { get; } | Stil sayfasında bulunan tüm CSS kurallarının listesi. Buna hem kural kümeleri hem de at-rules dahildir. |
| [OwnerRule](../../aspose.svg.dom.css/icssstylesheet/ownerrule/) { get; } | Bu stil sayfası bir @import kuralından geliyorsa, ownRule özniteliği CSSImportRule'u içerecektir. Bu durumda, StyleSheet arabirimindeki OwnerNode özniteliği boş olacaktır. Stil sayfası bir öğeden veya bir işleme talimatından geliyorsa, ownRule özniteliği boş olur ve ownNode özniteliği Node. öğesini içerir. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [DeleteRule](../../aspose.svg.dom.css/icssstylesheet/deleterule/)(int) | Stil sayfasından bir kuralı silmek için kullanılır. |
| [InsertRule](../../aspose.svg.dom.css/icssstylesheet/insertrule/)(string, int) | Stil sayfasına yeni bir kural eklemek için kullanılır. Yeni kural artık kaskadın bir parçası haline geliyor. |

### Ayrıca bakınız

* interface [IStyleSheet](../istylesheet/)
* ad alanı [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* toplantı [Aspose.SVG](../../)


