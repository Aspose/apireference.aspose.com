---
title: Class CSSValue
second_title: Aspose.SVG for .NET API Referansı
description: Aspose.Svg.Dom.Css.CSSValue sınıf. Basit veya karmaşık bir değeri temsil eder. Bir CSSValue nesnesi yalnızca bir CSS özelliği bağlamında oluşur.
type: docs
weight: 490
url: /tr/net/aspose.svg.dom.css/cssvalue/
---
## CSSValue class

Basit veya karmaşık bir değeri temsil eder. Bir CSSValue nesnesi yalnızca bir CSS özelliği bağlamında oluşur.

```csharp
public abstract class CSSValue : DOMObject
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| abstract [CSSText](../../aspose.svg.dom.css/cssvalue/csstext/) { get; set; } | Geçerli değerin dize gösterimi. |
| [CSSValueType](../../aspose.svg.dom.css/cssvalue/cssvaluetype/) { get; } | Değerin türünü tanımlayan bir kod. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| override [Equals](../../aspose.svg.dom.css/cssvalue/equals/)(object) | Belirtilenin olup olmadığını belirler.Object bu örneğe eşittir. |
| override [GetHashCode](../../aspose.svg.dom.css/cssvalue/gethashcode/)() | Bu örnek için bir karma kod döndürür. |
| override [GetPlatformType](../../aspose.svg.dom.css/cssvalue/getplatformtype/)() | Bu yöntem ECMAScript nesnesini almak için kullanılır.Type . |
| override [ToString](../../aspose.svg.dom.css/cssvalue/tostring/)() | a döndürürString bu örneği temsil eder. |
| [operator ==](../../aspose.svg.dom.css/cssvalue/op_equality/) | ==. operatörünü uygular |
| [operator !=](../../aspose.svg.dom.css/cssvalue/op_inequality/) | !=. operatörünü uygular |

## Alanlar

| İsim | Tanım |
| --- | --- |
| const [CSS_CUSTOM](../../aspose.svg.dom.css/cssvalue/css_custom/) | Değer, özel bir değerdir. |
| const [CSS_INHERIT](../../aspose.svg.dom.css/cssvalue/css_inherit/) | Değer devralınır ve cssText "inherit" içerir. |
| const [CSS_PRIMITIVE_VALUE](../../aspose.svg.dom.css/cssvalue/css_primitive_value/) | Değer ilkel bir değerdir ve CSSPrimitiveValue arabiriminin bir örneği, CSSValue arabiriminin bu örneğinde bağlamaya özel dönüştürme yöntemleri kullanılarak elde edilebilir. |
| const [CSS_VALUE_LIST](../../aspose.svg.dom.css/cssvalue/css_value_list/) | Değer bir CSSValue listesidir ve CSSValueList arabiriminin bir örneği, CSSValue arabiriminin bu örneğinde bağlamaya özel atama yöntemleri kullanılarak elde edilebilir. |

### Ayrıca bakınız

* class [DOMObject](../../aspose.svg.dom/domobject/)
* ad alanı [Aspose.Svg.Dom.Css](../../aspose.svg.dom.css/)
* toplantı [Aspose.SVG](../../)


