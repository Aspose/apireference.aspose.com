---
title: "Класс System::Xml::Schema::XmlSchemaParticle"
linktitle: "XmlSchemaParticle"
second_title: "Aspose.Font для C++"
description: "Класс System::Xml::Schema::XmlSchemaParticle. Базовый класс, являющийся базовым классом для всех типов частиц (например, XmlSchemaAny) в C++."
type: docs
weight: 5400
url: /ru/cpp/system.xml.schema/xmlschemaparticle/
---
## XmlSchemaParticle class


Базовый класс, являющийся базовым классом для всех типов частиц (например, [XmlSchemaAny](../xmlschemaany/)).

```cpp
class XmlSchemaParticle : public System::Xml::Schema::XmlSchemaAnnotated
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_MaxOccurs](./get_maxoccurs/)() | Возвращает максимальное количество повторений частицы. |
| [get_MaxOccursString](./get_maxoccursstring/)() | Возвращает число в виде строкового значения. Максимальное количество повторений частицы. |
| [get_MinOccurs](./get_minoccurs/)() | Возвращает минимальное количество повторений частицы. |
| [get_MinOccursString](./get_minoccursstring/)() | Возвращает число в виде строкового значения. Минимальное количество повторений частицы. |
| [set_MaxOccurs](./set_maxoccurs/)(Decimal) | Устанавливает максимальное количество повторений частицы. |
| [set_MaxOccursString](./set_maxoccursstring/)(const String\&) | Устанавливает число в виде строкового значения. Максимальное количество повторений частицы. |
| [set_MinOccurs](./set_minoccurs/)(Decimal) | Устанавливает минимальное количество повторений частицы. |
| [set_MinOccursString](./set_minoccursstring/)(const String\&) | Устанавливает число как строковое значение. Минимальное количество раз, которое частица может встречаться. |
| [XmlSchemaParticle](./xmlschemaparticle/)() | Инициализирует новый экземпляр класса [XmlSchemaParticle](./). |
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
