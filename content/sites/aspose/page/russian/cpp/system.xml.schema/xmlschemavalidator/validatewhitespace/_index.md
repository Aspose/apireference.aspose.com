---
title: "Метод System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace"
linktitle: "ValidateWhitespace"
second_title: "Aspose.Page для C++"
description: "Метод System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace. Проверяет, допускаются ли пробелы в указанной строке в текущем контексте элемента, и собирает пробелы для проверки, если текущий элемент имеет простой контент, в C++."
type: docs
weight: 2100
url: /ru/cpp/system.xml.schema/xmlschemavalidator/validatewhitespace/
---
## XmlSchemaValidator::ValidateWhitespace(const String\&) method


Проверяет, разрешены ли пробелы в указанной **строке**, в текущем контексте элемента, и собирает пробелы для проверки, если текущий элемент имеет простое содержимое.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(const String &elementValue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| elementValue | const String\& | Строка **string** с пробелами для проверки в текущем контексте элемента. |

## См. также

* Class [String](../../../system/string/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
## XmlSchemaValidator::ValidateWhitespace(XmlValueGetter) method


Проверяет, допускаются ли пробелы, возвращаемые указанным объектом [XmlValueGetter](../../xmlvaluegetter/), в текущем контексте элемента, и собирает пробелы для проверки, если текущий элемент имеет простой контент.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(XmlValueGetter elementValue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| elementValue | XmlValueGetter | Обратный вызов [XmlValueGetter](../../xmlvaluegetter/), используемый для передачи значения пробелов в виде типа, совместимого с типом XML [Schema](../../) Definition Language (XSD) атрибута. |

## См. также

* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Page for C++](../../../)
