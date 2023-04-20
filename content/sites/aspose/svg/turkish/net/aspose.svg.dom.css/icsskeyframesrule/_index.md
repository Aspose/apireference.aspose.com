---
title: Interface ICSSKeyframesRule
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Css.ICSSKeyframesRule arayüz. CSSKeyframesRule arabirimi tek bir animasyon için eksiksiz bir anahtar kare kümesini temsil eder
type: docs
weight: 580
url: /tr/net/aspose.svg.dom.css/icsskeyframesrule/
---
## ICSSKeyframesRule interface

CSSKeyframesRule arabirimi, tek bir animasyon için eksiksiz bir anahtar kare kümesini temsil eder

```csharp
public interface ICSSKeyframesRule : ICSSRule
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [CSSRules](../../aspose.svg.dom.css/icsskeyframesrule/cssrules/) { get; } | Bu özellik, list içindeki anahtar karelere erişim sağlar |
| [Name](../../aspose.svg.dom.css/icsskeyframesrule/name/) { get; } | Bu özellik, 'animation-name' özelliği tarafından kullanılan anahtar karelerin adıdır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [AppendRule](../../aspose.svg.dom.css/icsskeyframesrule/appendrule/)(string) | appendRule yöntemi, geçen CSSKeyframeRule'u, geçen key 'deki listeye ekler. |
| [DeleteRule](../../aspose.svg.dom.css/icsskeyframesrule/deleterule/)(string) | deleteRule yöntemi, CSSKeyframeRule'u geçirilen anahtarla siler. Bu anahtara sahip bir kural yoksa, yöntem bir şey yapmaz |
| [FindRule](../../aspose.svg.dom.css/icsskeyframesrule/findrule/)(string) | findRule yöntemi, kuralı geçirilen anahtarla eşleşen bir anahtarla döndürür. Böyle bir kural yoksa, boş bir değer döndürülür |

### Ayrıca bakınız

* interface [ICSSRule](../icssrule/)
* ad alanı [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* toplantı [Aspose.SVG](../../)


