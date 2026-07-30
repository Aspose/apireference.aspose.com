---
title: "System::Xml::XmlNamespaceManager::GetNamespacesInScope метод"
linktitle: "GetNamespacesInScope"
second_title: "Aspose.Font для C++"
description: "System::Xml::XmlNamespaceManager::GetNamespacesInScope method. Возвращает коллекцию имён пространств имён, ключевых по префиксу, которую можно использовать для перечисления текущих областей пространств имён в C++."
type: docs
weight: 600
url: /ru/cpp/system.xml/xmlnamespacemanager/getnamespacesinscope/
---
## XmlNamespaceManager::GetNamespacesInScope method


Возвращает коллекцию имён пространств имён, ключом которой является префикс, которую можно использовать для перечисления текущих пространств имён в области видимости.

```cpp
SharedPtr<Collections::Generic::IDictionary<String, String>> System::Xml::XmlNamespaceManager::GetNamespacesInScope(XmlNamespaceScope scope) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| область | XmlNamespaceScope | Перечислимое значение, указывающее тип узлов пространства имён, которые следует вернуть. |

### ReturnValue

Коллекция пар пространство имён‑префикс, находящихся в текущей области.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IDictionary](../../../system.collections.generic/idictionary/)
* Class [String](../../../system/string/)
* Enum [XmlNamespaceScope](../../xmlnamespacescope/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Font for C++](../../../)
