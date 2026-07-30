---
title: "Метод System::Xml::XPath::XPathNavigator::LookupPrefix"
linktitle: "LookupPrefix"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::XPath::XPathNavigator::LookupPrefix. Возвращает префикс, объявленный для указанного URI пространства имён в C++."
type: docs
weight: 4800
url: /ru/cpp/system.xml.xpath/xpathnavigator/lookupprefix/
---
## XPathNavigator::LookupPrefix method


Возвращает префикс, объявленный для указанного URI пространства имён.

```cpp
String System::Xml::XPath::XPathNavigator::LookupPrefix(const String &namespaceURI) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| namespaceURI | const String\& | URI пространства имён, для которого нужно определить префикс. |

### ReturnValue

Объект [String](../../../system/string/), содержащий префикс пространства имён, назначенный указанному URI пространства имён; в противном случае — [String::Empty](../../../system/string/empty/), если префикс не назначен указанному URI пространства имён. Возвращаемый [String](../../../system/string/) атомизирован.

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
