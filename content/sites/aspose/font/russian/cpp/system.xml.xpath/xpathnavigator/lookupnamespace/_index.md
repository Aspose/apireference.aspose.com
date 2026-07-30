---
title: "Метод System::Xml::XPath::XPathNavigator::LookupNamespace"
linktitle: "LookupNamespace"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XPath::XPathNavigator::LookupNamespace. Возвращает URI пространства имён для указанного префикса в C++."
type: docs
weight: 4700
url: /ru/cpp/system.xml.xpath/xpathnavigator/lookupnamespace/
---
## XPathNavigator::LookupNamespace method


Возвращает URI пространства имён для указанного префикса.

```cpp
String System::Xml::XPath::XPathNavigator::LookupNamespace(const String &prefix) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| prefix | const String\& | Префикс, URI пространства имён которого вы хотите разрешить. Чтобы соответствовать пространству имён по умолчанию, передайте [String::Empty](../../../system/string/empty/). |

### ReturnValue

Объект [String](../../../system/string/), содержащий URI пространства имён, назначенный указанному префиксу; **nullptr**, если для указанного префикса не назначен URI пространства имён. Возвращаемый [String](../../../system/string/) атомизирован.

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
