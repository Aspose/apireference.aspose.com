---
title: "System::Xml::Schema::XmlAtomicValue::ValueAs method"
linktitle: "ValueAs"
second_title: "Aspose.Page для C++"
description: "System::Xml::Schema::XmlAtomicValue::ValueAs method. Возвращает значение проверенного XML‑элемента или атрибута как тип, указанный с помощью объекта IXmlNamespaceResolver, используемого для разрешения префиксов пространств имён в C++."
type: docs
weight: 1300
url: /ru/cpp/system.xml.schema/xmlatomicvalue/valueas/
---
## XmlAtomicValue::ValueAs method


Возвращает значение проверенного XML‑элемента или атрибута как тип, указанный с помощью объекта [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемого для разрешения префиксов пространств имён.

```cpp
SharedPtr<Object> System::Xml::Schema::XmlAtomicValue::ValueAs(const TypeInfo &type, SharedPtr<IXmlNamespaceResolver> nsResolver) override
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| тип | const TypeInfo\& | Тип, в который следует вернуть значение проверенного XML‑элемента или атрибута. |
| nsResolver | SharedPtr\<IXmlNamespaceResolver\> | Объект [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/), используемый для разрешения префиксов пространств имён. |

### ReturnValue

Значение проверенного XML‑элемента или атрибута в запрошенном типе.

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TypeInfo](../../../system/typeinfo/)
* Class [IXmlNamespaceResolver](../../../system.xml/ixmlnamespaceresolver/)
* Class [XmlAtomicValue](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
