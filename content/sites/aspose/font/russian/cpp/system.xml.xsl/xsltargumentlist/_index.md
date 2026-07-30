---
title: "System::Xml::Xsl::XsltArgumentList класс"
linktitle: "XsltArgumentList"
second_title: "Aspose.Font для C++"
description: "System::Xml::Xsl::XsltArgumentList класс. Содержит переменное количество аргументов, которые являются либо параметрами XSLT, либо объектами расширения в C++."
type: docs
weight: 400
url: /ru/cpp/system.xml.xsl/xsltargumentlist/
---
## XsltArgumentList class


Содержит переменное количество аргументов, которые являются либо параметрами XSLT, либо объектами расширения.

```cpp
class XsltArgumentList : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| [AddExtensionObject](./addextensionobject/)(const String\&, const SharedPtr\<Object\>\&) | Добавляет новый объект в [XsltArgumentList](./) и связывает его с URI пространства имён. |
| [AddParam](./addparam/)(const String\&, const String\&, const SharedPtr\<Object\>\&) | Добавляет параметр в [XsltArgumentList](./) и связывает его с квалифицированным именем пространства имён. |
| [Clear](./clear/)() | Удаляет все параметры и объекты расширения из [XsltArgumentList](./). |
| [GetExtensionObject](./getextensionobject/)(const String\&) | Возвращает объект, связанный с указанным пространством имён. |
| [GetParam](./getparam/)(const String\&, const String\&) | Возвращает параметр, связанный с квалифицированным именем пространства имён. |
| [RemoveExtensionObject](./removeextensionobject/)(const String\&) | Удаляет объект с URI пространства имён из [XsltArgumentList](./). |
| [RemoveParam](./removeparam/)(const String\&, const String\&) | Удаляет параметр из [XsltArgumentList](./). |
| [XsltArgumentList](./xsltargumentlist/)() | Создаёт новый экземпляр [XsltArgumentList](./). |
## Typedefs

| Определение типа | Описание |
| --- | --- |
| [Ptr](./ptr/) | Псевдоним для shared pointer к экземпляру этого класса. |
## Примечания



Объекты этого класса должны выделяться только с помощью функции [System::MakeObject()](../../system/makeobject/). Никогда не создавайте экземпляры этого типа в стеке или с помощью оператора new, так как это приведёт к ошибкам времени выполнения и/или сбоям утверждений. Всегда оборачивайте этот класс в указатель [System::SmartPtr](../../system/smartptr/) и используйте этот указатель для передачи его в функции в качестве аргумента.

## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Font for C++](../../)
