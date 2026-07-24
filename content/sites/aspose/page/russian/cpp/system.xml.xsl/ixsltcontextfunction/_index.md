---
title: "System::Xml::Xsl::IXsltContextFunction class"
linktitle: "IXsltContextFunction"
second_title: "Aspose.Page для C++"
description: "System::Xml::Xsl::IXsltContextFunction class. Предоставляет интерфейс к заданной функции, определённой в таблице стилей Extensible Stylesheet Language for Transformations (XSLT), во время выполнения в C++."
type: docs
weight: 100
url: /ru/cpp/system.xml.xsl/ixsltcontextfunction/
---
## IXsltContextFunction class


Предоставляет интерфейс к заданной функции, определённой в таблице стилей Extensible Stylesheet Language for Transformations (XSLT) во время выполнения.

```cpp
class IXsltContextFunction : public System::Object
```

## Методы

| Метод | Описание |
| --- | --- |
| virtual [get_ArgTypes](./get_argtypes/)() | Возвращает предоставленные типы XML Path Language ([XPath](../../system.xml.xpath/)) для списка аргументов функции. Эта информация может использоваться для определения сигнатуры функции, что позволяет различать перегруженные функции. |
| virtual [get_Maxargs](./get_maxargs/)() | Возвращает максимальное количество аргументов функции. Это позволяет пользователю различать перегруженные функции. |
| virtual [get_Minargs](./get_minargs/)() | Возвращает минимальное количество аргументов функции. Это позволяет пользователю различать перегруженные функции. |
| virtual [get_ReturnType](./get_returntype/)() | Возвращает XPathResultType, представляющий тип [XPath](../../system.xml.xpath/), возвращаемый функцией. |
| virtual [Invoke](./invoke/)(SharedPtr\<XsltContext\>, ArrayPtr\<SharedPtr\<Object\>\>, SharedPtr\<System::Xml::XPath::XPathNavigator\>) | Предоставляет метод для вызова функции с заданными аргументами в указанном контексте. |
## См. также

* Class [Object](../../system/object/)
* Namespace [System::Xml::Xsl](../)
* Library [Aspose.Page for C++](../../)
