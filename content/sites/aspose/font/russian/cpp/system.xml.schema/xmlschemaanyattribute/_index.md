---
title: "System::Xml::Schema::XmlSchemaAnyAttribute класс"
linktitle: "XmlSchemaAnyAttribute"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSchemaAnyAttribute класс. Представляет элемент anyAttribute консорциума World Wide Web (W3C) в C++."
type: docs
weight: 900
url: /ru/cpp/system.xml.schema/xmlschemaanyattribute/
---
## XmlSchemaAnyAttribute class


Представляет элемент **anyAttribute** консорциума World Wide [Web](../../system.web/) (W3C).

```cpp
class XmlSchemaAnyAttribute : public System::Xml::Schema::XmlSchemaAnnotated
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Namespace](./get_namespace/)() | Возвращает пространства имён, содержащие атрибуты, которые могут быть использованы. |
| [get_ProcessContents](./get_processcontents/)() | Возвращает информацию о том, как приложение или XML‑процессор должен обрабатывать проверку XML‑документов для атрибутов, указанных элементом **anyAttribute**. |
| [set_Namespace](./set_namespace/)(const String\&) | Устанавливает пространства имён, содержащие атрибуты, которые могут быть использованы. |
| [set_ProcessContents](./set_processcontents/)(XmlSchemaContentProcessing) | Устанавливает информацию о том, как приложение или XML‑процессор должен обрабатывать проверку XML‑документов для атрибутов, указанных элементом **anyAttribute**. |
| [XmlSchemaAnyAttribute](./xmlschemaanyattribute/)() | Инициализирует новый экземпляр класса [XmlSchemaAnyAttribute](./). |
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
