---
title: "System::Xml::Schema::XmlSchemaRedefine класс"
linktitle: "XmlSchemaRedefine"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaRedefine класс. Представляет элемент redefine из XML Schema, как указано World Wide Web Consortium (W3C). Этот класс можно использовать для переопределения простых и сложных типов, групп и групп атрибутов из внешних файлов схем в текущей схеме. Этот класс также можно использовать для обеспечения версионирования элементов схемы в C++."
type: docs
weight: 5600
url: /ru/cpp/system.xml.schema/xmlschemaredefine/
---
## XmlSchemaRedefine class


Представляет элемент **redefine** из XML [Schema](../) в соответствии с World Wide [Web](../../system.web/) Consortium (W3C). Этот класс можно использовать для переопределения простых и сложных типов, групп и групп атрибутов из внешних файлов схем в текущей схеме. Этот класс также можно использовать для обеспечения версионирования элементов схемы.

```cpp
class XmlSchemaRedefine : public System::Xml::Schema::XmlSchemaExternal
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_AttributeGroups](./get_attributegroups/)() | Возвращает [XmlSchemaObjectTable](../xmlschemaobjecttable/), содержащий все атрибуты в схеме, который хранит посткомпиляционную интерпретацию значения **AttributeGroups**. |
| [get_Groups](./get_groups/)() | Возвращает [XmlSchemaObjectTable](../xmlschemaobjecttable/), содержащий все группы в схеме, который хранит посткомпиляционную интерпретацию значения **Groups**. |
| [get_Items](./get_items/)() | Возвращает коллекцию следующих классов: [XmlSchemaAnnotation](../xmlschemaannotation/), [XmlSchemaAttributeGroup](../xmlschemaattributegroup/), [XmlSchemaComplexType](../xmlschemacomplextype/), [XmlSchemaSimpleType](../xmlschemasimpletype/), и [XmlSchemaGroup](../xmlschemagroup/). |
| [get_SchemaTypes](./get_schematypes/)() | Возвращает [XmlSchemaObjectTable](../xmlschemaobjecttable/), содержащий все простые и сложные типы в схеме, который хранит посткомпиляционную интерпретацию значения **SchemaTypes**. |
| [XmlSchemaRedefine](./xmlschemaredefine/)() | Создаёт новый экземпляр класса [XmlSchemaRedefine](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaExternal](../xmlschemaexternal/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
