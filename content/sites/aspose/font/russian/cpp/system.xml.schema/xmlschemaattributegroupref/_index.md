---
title: "System::Xml::Schema::XmlSchemaAttributeGroupRef класс"
linktitle: "XmlSchemaAttributeGroupRef"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaAttributeGroupRef класс. Представляет элемент attributeGroup с атрибутом ref из XML Schema, как указано в . AttributesGroupRef является ссылкой на attributeGroup, свойство name содержит группу атрибутов, на которую происходит ссылка в C++."
type: docs
weight: 1300
url: /ru/cpp/system.xml.schema/xmlschemaattributegroupref/
---
## XmlSchemaAttributeGroupRef class


Представляет элемент **attributeGroup** с атрибутом **ref** из XML [Schema](../) в соответствии с [World Wide Web Consortium (W3C)](https://go.microsoft.com/fwlink/?LinkId=49454). AttributesGroupRef является ссылкой на attributeGroup, свойство name содержит ссылку на группу атрибутов.

```cpp
class XmlSchemaAttributeGroupRef : public System::Xml::Schema::XmlSchemaAnnotated
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_RefName](./get_refname/)() | Возвращает имя ссылочного элемента **attributeGroup**. |
| [set_RefName](./set_refname/)(const SharedPtr\<XmlQualifiedName\>\&) | Устанавливает имя ссылочного элемента **attributeGroup**. |
| [XmlSchemaAttributeGroupRef](./xmlschemaattributegroupref/)() | Инициализирует новый экземпляр класса [XmlSchemaAttributeGroupRef](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaAnnotated](../xmlschemaannotated/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
