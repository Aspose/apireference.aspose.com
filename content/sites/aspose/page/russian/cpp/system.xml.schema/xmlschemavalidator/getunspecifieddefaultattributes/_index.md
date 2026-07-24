---
title: "Метод System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes"
linktitle: "GetUnspecifiedDefaultAttributes"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes. Проверяет ограничения идентичности для атрибутов по умолчанию и заполняет указанный List объектами XmlSchemaAttribute для всех атрибутов с значениями по умолчанию, которые ранее не были проверены с помощью метода XmlSchemaValidator::ValidateAttribute в контексте элемента в C++."
type: docs
weight: 900
url: /ru/cpp/system.xml.schema/xmlschemavalidator/getunspecifieddefaultattributes/
---
## XmlSchemaValidator::GetUnspecifiedDefaultAttributes method


Проверяет ограничения идентичности для атрибутов по умолчанию и заполняет указанный List объектами [XmlSchemaAttribute](../../xmlschemaattribute/) для всех атрибутов с значениями по умолчанию, которые ранее не были проверены с помощью метода [XmlSchemaValidator::ValidateAttribute](../validateattribute/) в контексте элемента.

```cpp
void System::Xml::Schema::XmlSchemaValidator::GetUnspecifiedDefaultAttributes(const SharedPtr<Collections::Generic::List<SharedPtr<Object>>> &defaultAttributes)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| defaultAttributes | const SharedPtr\<Collections::Generic::List\<SharedPtr\<Object\>\>\>\& | List, который будет заполнен объектами [XmlSchemaAttribute](../../xmlschemaattribute/) для всех атрибутов, ещё не встреченных во время проверки в контексте элемента. |

## См. также

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [List](../../../system.collections.generic/list/)
* Class [Object](../../../system/object/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
