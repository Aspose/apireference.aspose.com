---
title: "System::Xml::XmlNamespaceManager::LookupPrefix метод"
linktitle: "LookupPrefix"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlNamespaceManager::LookupPrefix метод. Находит префикс, объявленный для указанного URI пространства имён в C++."
type: docs
weight: 900
url: /ru/cpp/system.xml/xmlnamespacemanager/lookupprefix/
---
## XmlNamespaceManager::LookupPrefix method


Находит префикс, объявленный для указанного URI пространства имён.

```cpp
String System::Xml::XmlNamespaceManager::LookupPrefix(const String &uri) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| uri | const String\& | Пространство имён, которое нужно разрешить для префикса. |

### ReturnValue

Соответствующий префикс. Если сопоставленного префикса нет, метод возвращает [String::Empty](../../../system/string/empty/). Если передано значение null, возвращается **nullptr**.

## См. также

* Class [String](../../../system/string/)
* Class [XmlNamespaceManager](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
