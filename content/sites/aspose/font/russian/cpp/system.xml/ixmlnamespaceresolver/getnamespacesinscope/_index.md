---
title: "Метод System::Xml::IXmlNamespaceResolver::GetNamespacesInScope"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::IXmlNamespaceResolver::GetNamespacesInScope. Возвращает коллекцию определённых сопоставлений префикс‑пространство имён, которые в данный момент находятся в области видимости в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml/ixmlnamespaceresolver/getnamespacesinscope/
---
## IXmlNamespaceResolver::GetNamespacesInScope method


Возвращает коллекцию определённых сопоставлений префикс‑пространство имён, которые в данный момент находятся в области видимости.

```cpp
virtual SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::IXmlNamespaceResolver::GetNamespacesInScope(XmlNamespaceScope scope)=0
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| scope | XmlNamespaceScope | Значение [XmlNamespaceScope](../../xmlnamespacescope/), которое указывает тип узлов пространств имён для возврата. |

### ReturnValue

Коллекция IDictionary, содержащая текущие пространства имён в области видимости.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [IXmlNamespaceResolver](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
