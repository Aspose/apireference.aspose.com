---
title: "System::Xml::Schema::XmlSchemaKeyref класс"
linktitle: "XmlSchemaKeyref"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaKeyref класс. Этот класс представляет элемент keyref из XMLSchema, определённый World Wide Web Consortium (W3C) в C++."
type: docs
weight: 4000
url: /ru/cpp/system.xml.schema/xmlschemakeyref/
---
## XmlSchemaKeyref class


Этот класс представляет элемент **keyref** из XMLSchema, определённый World Wide [Web](../../system.web/) Consortium (W3C).

```cpp
class XmlSchemaKeyref : public System::Xml::Schema::XmlSchemaIdentityConstraint
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Refer](./get_refer/)() | Возвращает имя ключа, на который ссылается это ограничение в другом простом или сложном типе. |
| [set_Refer](./set_refer/)(const SharedPtr\<XmlQualifiedName\>\&) | Устанавливает имя ключа, на который ссылается это ограничение в другом простом или сложном типе. |
| [XmlSchemaKeyref](./xmlschemakeyref/)() | Инициализирует новый экземпляр класса [XmlSchemaKeyref](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaIdentityConstraint](../xmlschemaidentityconstraint/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
