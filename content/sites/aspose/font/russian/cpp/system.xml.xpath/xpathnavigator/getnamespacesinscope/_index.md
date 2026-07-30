---
title: "System::Xml::XPath::XPathNavigator::GetNamespacesInScope метод"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::GetNamespacesInScope метод. Возвращает области видимости пространств имён текущего узла в C++."
type: docs
weight: 4000
url: /ru/cpp/system.xml.xpath/xpathnavigator/getnamespacesinscope/
---
## XPathNavigator::GetNamespacesInScope method


Возвращает области действия пространств имён текущего узла.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XPath::XPathNavigator::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| scope | XmlNamespaceScope | Значение [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/), указывающее пространства имён для возврата. |

### ReturnValue

Коллекция IDictionary имён пространств имён, индексируемая по префиксу.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../../system.xml/xmlnamespacescope/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
