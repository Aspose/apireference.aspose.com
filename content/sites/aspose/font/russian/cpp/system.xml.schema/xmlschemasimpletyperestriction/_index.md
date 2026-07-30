---
title: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction класс"
linktitle: "XmlSchemaSimpleTypeRestriction"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaSimpleTypeRestriction класс. Представляет элемент restriction для простых типов из XML Schema, как указано консорциумом World Wide Web (W3C). Этот класс может использоваться для ограничения элемента simpleType в C++."
type: docs
weight: 6500
url: /ru/cpp/system.xml.schema/xmlschemasimpletyperestriction/
---
## XmlSchemaSimpleTypeRestriction class


Представляет элемент **restriction** для простых типов из XML [Schema](../), как указано консорциумом World Wide [Web](../../system.web/) (W3C). Этот класс может использоваться для ограничения элемента **simpleType**.

```cpp
class XmlSchemaSimpleTypeRestriction : public System::Xml::Schema::XmlSchemaSimpleTypeContent
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_BaseType](./get_basetype/)() | Возвращает информацию о базовом типе. |
| [get_BaseTypeName](./get_basetypename/)() | Возвращает имя квалифицированного базового типа. |
| [get_Facets](./get_facets/)() | Возвращает фасет [Xml](../../system.xml/)[Schema](../). |
| [set_BaseType](./set_basetype/)(const SharedPtr\<XmlSchemaSimpleType\>\&) | Устанавливает информацию о базовом типе. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Устанавливает имя квалифицированного базового типа. |
| [XmlSchemaSimpleTypeRestriction](./xmlschemasimpletyperestriction/)() | Инициализирует новый экземпляр класса [XmlSchemaSimpleTypeRestriction](./). |
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
