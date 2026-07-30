---
title: "Класс System::Xml::Schema::XmlSchemaDocumentation"
linktitle: "XmlSchemaDocumentation"
second_title: "Aspose.Font для C++"
description: "Класс System::Xml::Schema::XmlSchemaDocumentation. Представляет элемент documentation из XML Schema, определённый World Wide Web Consortium (W3C). Этот класс задаёт информацию, предназначенную для чтения или использования людьми в аннотации на C++."
type: docs
weight: 2500
url: /ru/cpp/system.xml.schema/xmlschemadocumentation/
---
## XmlSchemaDocumentation class


Представляет элемент **documentation** из XML [Schema](../), определённый World Wide [Web](../../system.web/) Consortium (W3C). Этот класс задаёт информацию, предназначенную для чтения или использования людьми в **annotation**.

```cpp
class XmlSchemaDocumentation : public System::Xml::Schema::XmlSchemaObject
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_Language](./get_language/)() | Возвращает атрибут **xml:lang**. Он служит индикатором языка, используемого в содержимом. |
| [get_Markup](./get_markup/)() | Возвращает массив объектов [XmlNode](../../system.xml/xmlnode/), представляющих дочерние узлы documentation. |
| [get_Source](./get_source/)() | Возвращает Uniform Resource Identifier (URI) источник информации. |
| [set_Language](./set_language/)(const String\&) | Устанавливает атрибут **xml:lang**. Он служит индикатором языка, используемого в содержимом. |
| [set_Markup](./set_markup/)(const ArrayPtr\<SharedPtr\<XmlNode\>\>\&) | Устанавливает массив объектов [XmlNode](../../system.xml/xmlnode/), представляющих дочерние узлы documentation. |
| [set_Source](./set_source/)(const String\&) | Устанавливает Uniform Resource Identifier (URI) источник информации. |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [XmlSchemaObject](../xmlschemaobject/)
* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
