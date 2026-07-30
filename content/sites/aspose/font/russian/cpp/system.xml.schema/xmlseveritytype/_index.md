---
title: "System::Xml::Schema::XmlSeverityType enum"
linktitle: "XmlSeverityType"
second_title: "Aspose.Font для C++"
description: "System::Xml::Schema::XmlSeverityType enum. Представляет степень важности события проверки в C++."
type: docs
weight: 8100
url: /ru/cpp/system.xml.schema/xmlseveritytype/
---
## XmlSeverityType enum


Представляет степень важности события проверки.

```cpp
enum class XmlSeverityType
```

### Значения

| Имя | Значение | Описание |
| --- | --- | --- |
| Error | 0 | Указывает, что при проверке экземпляра документа произошла ошибка валидации. Это относится к определениям типов документов (DTDs) и XML [Schema](../) языка определения (XSD) схем. Ограничения валидности World Wide [Web](../../system.web/) Consortium (W3C) считаются ошибками. Если обработчик событий валидации не был создан, ошибки вызывают исключение. |
| Warning | 1 | Указывает, что событие валидации произошло, но не является ошибкой. Предупреждение обычно выдаётся, когда отсутствует DTD или XML [Schema](../) для проверки конкретного элемента или атрибута. В отличие от ошибок, предупреждения не вызывают исключение, если обработчик событий валидации отсутствует. |

## См. также

* Namespace [System::Xml::Schema](../)
* Library [Aspose.Font for C++](../../)
