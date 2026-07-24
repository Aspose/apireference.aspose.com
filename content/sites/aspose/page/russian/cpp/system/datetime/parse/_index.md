---
title: "System::DateTime::Parse метод"
linktitle: "Parse"
second_title: "Aspose.Page для C++"
description: "System::DateTime::Parse метод. Преобразует указанное строковое представление значения даты и времени в эквивалентный объект DateTime в C++."
type: docs
weight: 6600
url: /ru/cpp/system/datetime/parse/
---
## DateTime::Parse(const String\&) method


Преобразует указанное строковое представление значения даты и времени в эквивалентный объект [DateTime](../).

```cpp
static DateTime System::DateTime::Parse(const String &s)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строковое представление значения даты и времени для преобразования. |

### ReturnValue

Новый экземпляр класса [DateTime](../), представляющий значение даты и времени, эквивалентное тому, которое представлено указанной строкой.

## См. также

* Class [DateTime](../)
* Class [String](../../string/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::CultureInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::CultureInfo> &culture, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## См. также

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<Globalization::DateTimeFormatInfo\>\&, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<Globalization::DateTimeFormatInfo> &dtfi, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## См. также

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [DateTimeFormatInfo](../../../system.globalization/datetimeformatinfo/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Преобразует указанное строковое представление значения даты и времени в эквивалентный объект [DateTime](../), используя информацию о формате, специфичном для культуры.

```cpp
static DateTime System::DateTime::Parse(const String &s, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| s | const String\& | Строковое представление значения даты и времени для преобразования. |
| provider | const SharedPtr\<IFormatProvider\>\& | Объект [IFormatProvider](../../iformatprovider/), который предоставляет информацию о форматах, специфичную для культуры. |
| styles | Globalization::DateTimeStyles | Побитовая комбинация значений перечисления, которая предоставляет дополнительную информацию о **s**, о стилевых элементах, которые могут присутствовать в **s**, или о преобразовании **s** в объект [DateTime](../). |

### ReturnValue

Новый экземпляр класса [DateTime](../), представляющий значение даты и времени, эквивалентное тому, которое представлено указанной строкой.

## См. также

* Class [DateTime](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTime::Parse(const String\&, std::nullptr_t, Globalization::DateTimeStyles) method




```cpp
static DateTime System::DateTime::Parse(const String &s, std::nullptr_t, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```

## См. также

* Class [DateTime](../)
* Class [String](../../string/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTime](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
