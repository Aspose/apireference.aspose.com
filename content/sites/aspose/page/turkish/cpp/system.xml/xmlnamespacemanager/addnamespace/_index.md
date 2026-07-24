---
title: "System::Xml::XmlNamespaceManager::AddNamespace metodu"
linktitle: "AddNamespace"
second_title: "Aspose.Page için C++"
description: "System::Xml::XmlNamespaceManager::AddNamespace metodu. Verilen ad alanını C++'ta koleksiyona ekler."
type: docs
weight: 200
url: /tr/cpp/system.xml/xmlnamespacemanager/addnamespace/
---
## XmlNamespaceManager::AddNamespace method


Verilen ad alanını koleksiyona ekler.

```cpp
virtual void System::Xml::XmlNamespaceManager::AddNamespace(String prefix, String uri)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| prefix | String | Eklenecek ad alanı ile ilişkilendirilecek önek. Varsayılan bir ad alanı eklemek için [String::Empty](../../../system/string/empty/) kullanın. [XmlNamespaceManager](../), bir XML Yol Dili ([XPath](../../../system.xml.xpath/)) ifadesindeki ad alanlarını çözümlemek için kullanılacaksa, bir önek belirtilmelidir. Bir [XPath](../../../system.xml.xpath/) ifadesi bir önek içermiyorsa, ad alanı Evrensel Kaynak Tanımlayıcısının (URI) boş ad alanı olduğu varsayılır. [XPath](../../../system.xml.xpath/) ifadeleri ve [XmlNamespaceManager](../) hakkında daha fazla bilgi için XmlNode::SelectNodes(String) ve XPathExpression::SetContext(SharedPtr<XmlNamespaceManager>) metodlarına bakın. |
| uri | String | Eklenecek ad alanı. |

## Ayrıca Bakınız

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
