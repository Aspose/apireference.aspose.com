---
title: "System::Xml::XmlConvert::ToDateTimeOffset метод"
linktitle: "ToDateTimeOffset"
second_title: "Aspose.Page для C++"
description: "System::Xml::XmlConvert::ToDateTimeOffset метод. Преобразует предоставленную String в эквивалент DateTimeOffset в C++."
type: docs
weight: 1500
url: /ru/cpp/system.xml/xmlconvert/todatetimeoffset/
---
## XmlConvert::ToDateTimeOffset(const String\&) method


Преобразует предоставленную [String](../../../system/string/) в эквивалент [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строка для преобразования. Строка должна соответствовать подмножеству рекомендации W3C для типа XML dateTime. Для получения дополнительной информации см. раздел [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) спецификации XML [Schema](../../../system.xml.schema/). |

### ReturnValue

Эквивалент [DateTimeOffset](../../../system/datetimeoffset/) предоставленной строки.

## См. также

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const ArrayPtr\<String\>\&) method


Преобразует предоставленную [String](../../../system/string/) в эквивалент [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const ArrayPtr<String> &formats)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строка для преобразования. |
| formats | const ArrayPtr\<String\>\& | Массив форматов, из которых может быть преобразовано **s**. Каждый формат в **formats** может быть любым подмножеством рекомендации W3C для типа XML dateTime. Для получения дополнительной информации см. раздел [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) спецификации XML [Schema](../../../system.xml.schema/). Строка **s** проверяется на соответствие одному из этих форматов. |

### ReturnValue

Эквивалент [DateTimeOffset](../../../system/datetimeoffset/) предоставленной строки.

## См. также

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
## XmlConvert::ToDateTimeOffset(const String\&, const String\&) method


Преобразует предоставленную [String](../../../system/string/) в эквивалент [DateTimeOffset](../../../system/datetimeoffset/).

```cpp
static DateTimeOffset System::Xml::XmlConvert::ToDateTimeOffset(const String &s, const String &format)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строка для преобразования. |
| format | const String\& | Формат, из которого преобразуется **s**. Параметр format может быть любым подмножеством рекомендации W3C для типа XML dateTime. Для получения дополнительной информации см. раздел [dateTime](https://www.w3.org/TR/xmlschema-2/#dateTime) спецификации XML [Schema](../../../system.xml.schema/). Строка **s** проверяется на соответствие этому формату. |

### ReturnValue

Эквивалент [DateTimeOffset](../../../system/datetimeoffset/) предоставленной строки.

## См. также

* Class [DateTimeOffset](../../../system/datetimeoffset/)
* Class [String](../../../system/string/)
* Class [XmlConvert](../)
* Namespace [System::Xml](../../)
* Library [Aspose.Page for C++](../../../)
