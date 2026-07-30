---
title: "System::Xml::Schema::XmlSchemaSimpleType класс"
linktitle: "XmlSchemaSimpleType"
second_title: "Aspose.Font для C++"
description: "Класс System::Xml::Schema::XmlSchemaSimpleType. Представляет элемент **simpleType** для простого содержимого из XML Schema, как указано World Wide Web Consortium (W3C). Этот класс определяет простой тип. Простые типы могут задавать информацию и ограничения для значений атрибутов или элементов с текстовым содержимым в C++."
type: docs
weight: 6200
url: /ru/cpp/system.xml.schema/xmlschemasimpletype/
---
## XmlSchemaSimpleType class


Представляет элемент **simpleType** для простого содержимого из XML [Schema](../) как указано World Wide [Web](../../system.web/) Consortium (W3C). Этот класс определяет простой тип. Простые типы могут задавать информацию и ограничения для значений атрибутов или элементов с текстовым содержимым.

```cpp
class XmlSchemaSimpleType : public System::Xml::Schema::XmlSchemaType
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Content](./get_content/)() | Возвращает один из [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), или [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [set_Content](./set_content/)(const SharedPtr\<XmlSchemaSimpleTypeContent\>\&) | Устанавливает один из [XmlSchemaSimpleTypeUnion](../xmlschemasimpletypeunion/), [XmlSchemaSimpleTypeList](../xmlschemasimpletypelist/), или [XmlSchemaSimpleTypeRestriction](../xmlschemasimpletyperestriction/). |
| [XmlSchemaSimpleType](./xmlschemasimpletype/)() | Инициализирует новый экземпляр класса [XmlSchemaSimpleType](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaType](../xmlschematype/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
