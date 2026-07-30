---
title: "System::Xml::Schema::XmlSchemaChoice класс"
linktitle: "XmlSchemaChoice"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaChoice класс. Представляет элемент choice (композитор) из XML Schema, как указано консорциумом World Wide Web (W3C). Элемент choice позволяет появиться только одному из его дочерних элементов в экземпляре в C++."
type: docs
weight: 1400
url: /ru/cpp/system.xml.schema/xmlschemachoice/
---
## XmlSchemaChoice class


Представляет элемент **choice** (композитор) из XML [Schema](../), как указано Всемирным консорциумом [Web](../../system.web/) (W3C). Элемент **choice** позволяет появиться только одному из его дочерних элементов в экземпляре.

```cpp
class XmlSchemaChoice : public System::Xml::Schema::XmlSchemaGroupBase
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Items](./get_items/)() override | Возвращает коллекцию элементов, содержащихся в композиторе (**choice**): [XmlSchemaElement](../xmlschemaelement/), [XmlSchemaGroupRef](../xmlschemagroupref/), [XmlSchemaChoice](./), [XmlSchemaSequence](../xmlschemasequence/), или [XmlSchemaAny](../xmlschemaany/). |
| [XmlSchemaChoice](./xmlschemachoice/)() | Инициализирует новый экземпляр класса [XmlSchemaChoice](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaGroupBase](../xmlschemagroupbase/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
