---
title: "System::Xml::Schema::XmlSchemaNotation class"
linktitle: "XmlSchemaNotation"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaNotation class. Представляет элемент notation из XML Schema, как определено World Wide Web Consortium (W3C). Объявление XML Schemanotation является реконструкцией объявлений XML 1.0 NOTATION. Цель нотций — описать формат не‑XML данных внутри XML‑документа в C++."
type: docs
weight: 4800
url: /ru/cpp/system.xml.schema/xmlschemanotation/
---
## XmlSchemaNotation class


Представляет элемент **notation** из XML [Schema](../) в соответствии с World Wide [Web](../../system.web/) Consortium (W3C). Объявление XML [Schema](../)**notation** является реконструкцией объявлений **XML** 1.0 NOTATION. Цель нотций — описать формат не‑XML данных внутри XML‑документа.

```cpp
class XmlSchemaNotation : public System::Xml::Schema::XmlSchemaAnnotated
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Name](./get_name/)() | Возвращает имя notation. |
| [get_Public](./get_public/)() | Возвращает **public** идентификатор. |
| [get_System](./get_system/)() | Возвращает **system** идентификатор. |
| [set_Name](./set_name/)(const String\&) | Устанавливает имя обозначения. |
| [set_Public](./set_public/)(const String\&) | Устанавливает **public** идентификатор. |
| [set_System](./set_system/)(const String\&) | Устанавливает **system** идентификатор. |
| [XmlSchemaNotation](./xmlschemanotation/)() | Инициализирует новый экземпляр класса [XmlSchemaNotation](./). |
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
