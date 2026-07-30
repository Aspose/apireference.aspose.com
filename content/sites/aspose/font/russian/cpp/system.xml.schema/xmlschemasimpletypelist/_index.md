---
title: "Класс System::Xml::Schema::XmlSchemaSimpleTypeList"
linktitle: "XmlSchemaSimpleTypeList"
second_title: "Aspose.Font для C++"
description: "Класс System::Xml::Schema::XmlSchemaSimpleTypeList. Представляет элемент list из XML Schema, как указано World Wide Web Consortium (W3C). Этот класс можно использовать для определения элемента simpleType как списка значений указанного типа данных в C++."
type: docs
weight: 6400
url: /ru/cpp/system.xml.schema/xmlschemasimpletypelist/
---
## XmlSchemaSimpleTypeList class


Представляет элемент **list** из XML [Schema](../) в соответствии с World Wide [Web](../../system.web/) Consortium (W3C). Этот класс можно использовать для определения элемента **simpleType** как списка значений указанного типа данных.

```cpp
class XmlSchemaSimpleTypeList : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_BaseItemType](./get_baseitemtype/)() | Возвращает [XmlSchemaSimpleType](../xmlschemasimpletype/), представляющий тип элемента **simpleType**, основанный на значениях [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) и [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) простого типа. |
| [get_ItemType](./get_itemtype/)() | Возвращает элемент **simpleType**, полученный из типа, указанного базовым значением. |
| [get_ItemTypeName](./get_itemtypename/)() | Возвращает имя встроенного типа данных или элемента **simpleType**, определённого в этой схеме (или в другой схеме, указанной заданным пространством имён). |
| [set_BaseItemType](./set_baseitemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Устанавливает [XmlSchemaSimpleType](../xmlschemasimpletype/), представляющий тип элемента **simpleType**, основанный на значениях [XmlSchemaSimpleTypeList::get_ItemType](./get_itemtype/) и [XmlSchemaSimpleTypeList::get_ItemTypeName](./get_itemtypename/) простого типа. |
| [set_ItemType](./set_itemtype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Устанавливает элемент **simpleType**, полученный из типа, указанного базовым значением. |
| [set_ItemTypeName](./set_itemtypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Устанавливает имя встроенного типа данных или элемента **simpleType**, определённого в этой схеме (или в другой схеме, указанной заданным пространством имён). |
| [XmlSchemaSimpleTypeList](./xmlschemasimpletypelist/)() | Инициализирует новый экземпляр класса [XmlSchemaSimpleTypeList](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaSimpleTypeContent](../xmlschemasimpletypecontent/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
