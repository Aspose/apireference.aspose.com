---
title: "Метод System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace"
linktitle: "ValidateWhitespace"
second_title: "Aspose.Font для C++"
description: "Метод System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace. Проверяет, допускается ли пробельный символ в указанной строке в текущем контексте элемента, и собирает пробельные символы для проверки, если текущий элемент имеет простое содержимое в C++."
type: docs
weight: 2100
url: /ru/cpp/system.xml.schema/xmlschemavalidator/validatewhitespace/
---
## XmlSchemaValidator::ValidateWhitespace(const String\&) method


Проверяет, разрешены ли пробельные символы в указанной **string** в контексте текущего элемента, и собирает пробельные символы для проверки, если текущий элемент имеет простое содержимое.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(const String &elementValue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| elementValue | const String\& | Строка **string** с пробельными символами для проверки в текущем контексте элемента. |

## См. также

* Class [String](../../../system/string/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
## XmlSchemaValidator::ValidateWhitespace(XmlValueGetter) method


Проверяет, допускаются ли пробельные символы, возвращаемые объектом [XmlValueGetter](../../xmlvaluegetter/), в текущем контексте элемента, и собирает пробельные символы для проверки, если текущий элемент имеет простое содержимое.

```cpp
void System::Xml::Schema::XmlSchemaValidator::ValidateWhitespace(XmlValueGetter elementValue)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| elementValue | XmlValueGetter | Обратный вызов [XmlValueGetter](../../xmlvaluegetter/), используемый для передачи значения пробельных символов в виде типа, совместимого с типом XML [Schema](../../) Definition Language (XSD) атрибута. |

## См. также

* Typedef [XmlValueGetter](../../xmlvaluegetter/)
* Class [XmlSchemaValidator](../)
* Namespace [System::Xml::Schema](../../)
* Library [Aspose.Font for C++](../../../)
