---
title: "System::Xml::Schema::XmlSchemaSimpleContentExtension класс"
linktitle: "XmlSchemaSimpleContentExtension"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaSimpleContentExtension класс. Представляет элемент **extension** для простого содержимого из XML Schema, как указано World Wide Web Consortium (W3C). Этот класс может использоваться для создания простых типов посредством расширения. Такие производные типы используются для расширения содержимого простого типа элемента путем добавления атрибутов в C++."
type: docs
weight: 6000
url: /ru/cpp/system.xml.schema/xmlschemasimplecontentextension/
---
## XmlSchemaSimpleContentExtension class


Представляет элемент **extension** для простого содержимого из XML [Schema](../), как указано World Wide [Web](../../system.web/) Consortium (W3C). Этот класс может использоваться для создания простых типов посредством расширения. Такие производные типы используются для расширения содержимого простого типа элемента путем добавления атрибутов.

```cpp
class XmlSchemaSimpleContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Возвращает [XmlSchemaAnyAttribute](../xmlschemaanyattribute/), используемый для значения атрибута. |
| [get_Attributes](./get_attributes/)() | Возвращает коллекцию [XmlSchemaAttribute](../xmlschemaattribute/) и [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Возвращает имя встроенного типа данных или простого типа, из которого этот тип расширяется. |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Устанавливает [XmlSchemaAnyAttribute](../xmlschemaanyattribute/), используемый для значения атрибута. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Устанавливает имя встроенного типа данных или простого типа, от которого расширяется этот тип. |
| [XmlSchemaSimpleContentExtension](./xmlschemasimplecontentextension/)() | Инициализирует новый экземпляр класса [XmlSchemaSimpleContentExtension](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaContent](../xmlschemacontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
