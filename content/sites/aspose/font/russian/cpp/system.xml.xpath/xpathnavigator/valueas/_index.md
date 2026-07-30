---
title: "System::Xml::XPath::XPathNavigator::ValueAs метод"
linktitle: "ValueAs"
second_title: "Aspose.Font для C++"
description: "System::Xml::XPath::XPathNavigator::ValueAs метод. Возвращает значение текущего узла как указанный тип, используя указанный объект IXmlNamespaceResolver для разрешения префиксов пространств имён в C++."
type: docs
weight: 8100
url: /ru/cpp/system.xml.xpath/xpathnavigator/valueas/
---
## XPathNavigator::ValueAs method


Возвращает значение текущего узла как указанный тип, используя указанный объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/) для разрешения префиксов пространств имён.

```cpp
SharedPtr<Object> System::Xml::XPath::XPathNavigator::ValueAs(const TypeInfo &returnType, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| returnType | const TypeInfo\& | Тип, в котором возвращать значение текущего узла. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемый для разрешения префиксов пространств имен. |

### ReturnValue

Значение текущего узла в запрошенном типе.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XPathNavigator](../)
* Namespace [System::Xml::XPath](../../)
* Library [Aspose.Font for C++](../../../)
