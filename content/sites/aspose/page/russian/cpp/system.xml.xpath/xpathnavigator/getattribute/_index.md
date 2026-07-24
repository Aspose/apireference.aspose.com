---
title: "System::Xml::XPath::XPathNavigator::GetAttribute method"
linktitle: "GetAttribute"
second_title: "Aspose.Page для C++"
description: "System::Xml::XPath::XPathNavigator::GetAttribute method. Возвращает значение атрибута с указанным локальным именем и URI пространства имён в C++."
type: docs
weight: 3800
url: /ru/cpp/system.xml.xpath/xpathnavigator/getattribute/
---
## XPathNavigator::GetAttribute method


Возвращает значение атрибута с указанным локальным именем и URI пространства имён.

```cpp
virtual String System::Xml::XPath::XPathNavigator::GetAttribute(String localName, String namespaceURI)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| localName | String | Локальное имя атрибута. **localName** чувствительно к регистру. |
| namespaceURI | String | URI пространства имён атрибута. |

### ReturnValue

Строка [String](../../../system/string/) содержащая значение указанного атрибута; [String::Empty](../../../system/string/empty/) если соответствующий атрибут не найден, или если [XPathNavigator](../) не находится на узле элемента.

## См. также

* Class [String](../../../system/string/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Page for C++](../../../)
