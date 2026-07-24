---
title: "System::Xml::XPath::XPathNodeType enum"
linktitle: "XPathNodeType"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNodeType enum. C++'ta XPathNavigator sınıfından döndürülebilecek XPath düğüm türlerini tanımlar."
type: docs
weight: 1100
url: /tr/cpp/system.xml.xpath/xpathnodetype/
---
## XPathNodeType enum


[XPath](../) düğüm türlerini, [XPathNavigator](../xpathnavigator/) sınıfından döndürülebilecek şekilde tanımlar.

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
| Text | 4 | Bir düğümün metin içeriği. Belge [Object](../../system/object/) Modeli (DOM) [Text](../../system.text/) ve CDATA düğüm türlerine eşdeğerdir. En az bir karakter içerir. |
| SignificantWhitespace | 5 | Beyaz boşluk karakterleri içeren ve **xml:space** özelliği **preserve** olarak ayarlanmış bir düğüm. |
| Boşluk | 6 | Yalnızca beyaz boşluk karakterleri içeren ve anlamlı boşluk bulunmayan bir düğüm. Beyaz boşluk karakterleri **'\\x20'**, **'\\x0d'**, **'\\x0a'**, **'\\x09'**. |
| ProcessingInstruction | 7 | Bir işleme talimatı, örneğin **<?pi test?>**. Bu, XML bildirimlerini içermez; bu bildirimler [XPathNavigator](../xpathnavigator/) sınıfı tarafından görülmez. |
| Comment | 8 | Bir yorum, örneğin ****. |
| All | 9 | Herhangi bir [XPathNodeType](./) düğüm türü. |

## Ayrıca Bakınız

* Namespace [System::Xml::XPath](../)
* Library [Aspose.Page for C++](../../)
