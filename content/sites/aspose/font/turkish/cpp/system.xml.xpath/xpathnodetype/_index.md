---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNodeType enum. C++'da XPathNavigator sınıfından döndürülebilen XPath düğüm tiplerini tanımlar."
type: docs
weight: 1100
url: /tr/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


[XPath](../) düğüm tiplerini, [XPathNavigator](../xpathnavigator/) sınıfından döndürülebilecek şekilde tanımlar.

```cpp
enum class XPathNodeType
```

### Değerler

| Ad | Değer | Açıklama |
| --- | --- | --- |
| Kök | 0 | XML belgesinin veya düğüm ağacının kök düğümü. |
| Element | 1 | Bir öğe, örneğin **<element>**. |
| Attribute | 2 | Bir öznitelik, örneğin **id='123'**. |
| Ad alanı | 3 | Bir ad alanı, örneğin **xmlns=\"namespace\"**. |
| Text | 4 | Bir düğümün metin içeriği. Document [Object](../../system/object/) Model (DOM) [Text](../../system.text/) ve CDATA düğüm tiplerine eşdeğerdir. En az bir karakter içerir. |
| ÖnemliBoşluk | 5 | **xml:space** değeri **preserve** olarak ayarlanmış ve boşluk karakterleri içeren bir düğüm. |
| Boşluk | 6 | Yalnızca boşluk karakterleri içeren ve anlamlı boşluk bulunmayan bir düğüm. Boşluk karakterleri **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | **<?pi test?>** gibi bir işleme talimatı. Bu, [XPathNavigator](../xpathnavigator/) sınıfı tarafından görünmeyen XML bildirimlerini içermez. |
| Yorum | 8 | Bir yorum, örneğin ****. |
| All | 9 | [XPathNodeType](./) düğüm tiplerinden herhangi biri. |

## Ayrıca Bakınız

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Font for C++](../../)
