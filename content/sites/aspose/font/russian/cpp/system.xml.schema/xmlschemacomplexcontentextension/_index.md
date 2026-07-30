---
title: "System::Xml::Schema::XmlSchemaComplexContentExtension класс"
linktitle: "XmlSchemaComplexContentExtension"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaComplexContentExtension класс. Представляет элемент extension из XML Schema, как указано World Wide Web Consortium (W3C). Этот класс предназначен для сложных типов со сложной моделью содержимого, полученной посредством расширения. Он расширяет сложный тип, добавляя атрибуты или элементы в C++."
type: docs
weight: 1900
url: /ru/cpp/system.xml.schema/xmlschemacomplexcontentextension/
---
## XmlSchemaComplexContentExtension class


Представляет элемент **extension** из XML [Schema](../) в соответствии с World Wide [Web](../../system.web/) Consortium (W3C). Этот класс предназначен для сложных типов со сложной моделью содержимого, полученной посредством расширения. Он расширяет сложный тип, добавляя атрибуты или элементы.

```cpp
class XmlSchemaComplexContentExtension : public System::Xml::Schema::XmlSchemaContent
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_AnyAttribute](./get_anyattribute/)() | Возвращает компонент [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) модели сложного содержимого. |
| [get_Attributes](./get_attributes/)() | Возвращает коллекцию атрибутов для сложного содержимого. Содержит элементы [XmlSchemaAttribute](../xmlschemaattribute/) и [XmlSchemaAttributeGroupRef](../xmlschemaattributegroupref/). |
| [get_BaseTypeName](./get_basetypename/)() | Возвращает имя сложного типа, от которого этот тип наследуется посредством расширения. |
| [get_Particle](./get_particle/)() | Возвращает один из классов [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) или [XmlSchemaSequence](../xmlschemasequence/). |
| [set_AnyAttribute](./set_anyattribute/)(const SharedPtr\<XmlSchemaAnyAttribute\>\&) | Устанавливает компонент [XmlSchemaAnyAttribute](../xmlschemaanyattribute/) сложной модели содержимого. |
| [set_BaseTypeName](./set_basetypename/)(const SharedPtr\<XmlQualifiedName\>\&) | Устанавливает имя сложного типа, от которого этот тип наследуется посредством расширения. |
| [set_Particle](./set_particle/)(const SharedPtr\<XmlSchemaParticle\>\&) | Устанавливает один из классов [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](../xmlschemachoice/), [XmlSchemaAll](../xmlschemaall/) или [XmlSchemaSequence](../xmlschemasequence/). |
| [XmlSchemaComplexContentExtension](./xmlschemacomplexcontentextension/)() | Инициализирует новый экземпляр класса [XmlSchemaComplexContentExtension](./). |
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
