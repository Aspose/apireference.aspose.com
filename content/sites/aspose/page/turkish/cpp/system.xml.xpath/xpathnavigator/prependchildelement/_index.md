---
title: "System::Xml::XPath::XPathNavigator::PrependChildElement method"
linktitle: "PrependChildElement"
second_title: "Aspose.Page için C++"
description: "System::Xml::XPath::XPathNavigator::PrependChildElement method. C++'da belirtilen değerle birlikte ad alanı öneki, yerel ad ve ad alanı URI'sı kullanarak geçerli düğümün alt düğüm listesine başına yeni bir alt öğe oluşturur."
type: docs
weight: 6700
url: /tr/cpp/system.xml.xpath/xpathnavigator/prependchildelement/
---
## XPathNavigator::PrependChildElement method


Creates a new child element at the beginning of the list of child nodes of the current node using the namespace prefix, local name, and namespace URI specified with the value specified.

```cpp
virtual void System::Xml::XPath::XPathNavigator::PrependChildElement(String prefix, String localName, String namespaceURI, String value)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| önek | String | Yeni alt öğenin ad alanı öneki (varsa). |
| localName | String | Yeni alt öğenin yerel adı (varsa). |
| namespaceURI | String | Yeni alt öğenin ad alanı URI'sı (varsa). [String::Empty](../../../system/string/empty/) ve **nullptr** eşdeğerdir. |
| value | String | Yeni alt öğenin değeri. Eğer [String::Empty](../../../system/string/empty/) veya **nullptr** geçirilirse, boş bir öğe oluşturulur. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
