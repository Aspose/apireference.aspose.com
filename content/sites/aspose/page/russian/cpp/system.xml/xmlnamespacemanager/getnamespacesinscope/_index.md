---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope метод"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope метод. Возвращает коллекцию имён пространств имён, ключевых по префиксу, которую можно использовать для перечисления пространств имён, находящихся в текущей области видимости, в C++."
type: docs
weight: 600
url: /ru/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


Возвращает коллекцию имён пространств имён, ключевых по префиксу, которую можно использовать для перечисления текущих пространств имён в области видимости.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| область | XmlNamespaceScope | Значение перечисления, указывающее тип возвращаемых узлов пространства имён. |

### ReturnValue

Коллекция пар пространств имён и префиксов, находящихся в текущей области видимости.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
