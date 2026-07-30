---
title: "System::Xml::XPath::XPathNavigator::AppendChildElement metodu"
linktitle: "AppendChildElement"
second_title: "Aspose.Font için C++"
description: "System::Xml::XPath::XPathNavigator::AppendChildElement metodu. C++'da belirtilen değerle tanımlanan ad alanı öneki, yerel ad ve ad alanı URI'sı kullanılarak mevcut düğümün alt düğüm listesi sonuna yeni bir alt öğe düğümü oluşturur."
type: docs
weight: 200
url: /tr/cpp/system.xml.xpath/xpathnavigator/appendchildelement/
---
## XPathNavigator::AppendChildElement method


Belirtilen ad alanı öneki, yerel ad ve ad alanı URI'siyle birlikte verilen değeri kullanarak geçerli düğümün alt düğüm listesi sonuna yeni bir alt öğe düğümü oluşturur.

```cpp
virtual void System::Xml::XPath::XPathNavigator::AppendChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| önek | Dize | Yeni alt öğe düğümünün ad alanı öneki (varsa). |
| localName | Dize | Yeni alt öğe düğümünün yerel adı (varsa). |
| namespaceURI | String | Yeni alt öğe düğümünün ad alanı URI'sı (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. |
| value | String | Yeni alt öğe düğümünün değeri. Eğer [String::Empty](../../../system/string/empty/) veya **nullptr** geçirilirse, boş bir öğe oluşturulur. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
