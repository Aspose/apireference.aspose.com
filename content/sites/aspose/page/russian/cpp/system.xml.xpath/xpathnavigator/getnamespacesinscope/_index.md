---
title: "System::Xml::XPath::XPathNavigator::GetNamespacesInScope метод"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::GetNamespacesInScope метод. Возвращает области имён, находящиеся в области действия текущего узла, в C++."
type: docs
weight: 4000
url: /ru/cpp/system.xml.xpath/xpathnavigator/getnamespacesinscope/
---
## XPathNavigator::GetNamespacesInScope method


Возвращает области видимости пространств имён текущего узла.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XPath::XPathNavigator::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| scope | XmlNamespaceScope | Значение [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/) , указывающее пространства имён, которые следует вернуть. |

### ReturnValue

Коллекция IDictionary имён пространств имён, индексируемая префиксом.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
