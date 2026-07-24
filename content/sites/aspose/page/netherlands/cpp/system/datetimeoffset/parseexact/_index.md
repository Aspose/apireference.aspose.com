---
title: "System::DateTimeOffset::ParseExact methode"
linktitle: "ParseExact"
second_title: "Aspose.Page voor C++"
description: "System::DateTimeOffset::ParseExact methode. Converteert de opgegeven tekenreeks naar een DateTimeOffset-object met behulp van de opgegeven indelingen, formatprovider en opmaakstijl in C++."
type: docs
weight: 5600
url: /nl/cpp/system/datetimeoffset/parseexact/
---
## DateTimeOffset::ParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converteert de opgegeven tekenreeks naar een [DateTimeOffset](../) object met behulp van de opgegeven indelingen, formatprovider en opmaakstijl.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../string/) om te converteren. |
| formats | const ArrayPtr\<String\>\& | [Array](../../array/) van formatstrings. |
| provider | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| stijlen | Globalization::DateTimeStyles | Datum- en tijdopmaakstijlen |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Zie ook

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::ParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles) method


Converteert de opgegeven tekenreeks naar een [DateTimeOffset](../) object met behulp van de opgegeven indeling, formatprovider en opmaakstijl.

```cpp
static DateTimeOffset System::DateTimeOffset::ParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles=Globalization::DateTimeStyles::None)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../string/) om te converteren. |
| formaat | const String\& | Opmaakreeks. |
| provider | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| stijlen | Globalization::DateTimeStyles | Datum- en tijdopmaakstijlen |

### ReturnValue

[DateTimeOffset](../) that is equivalent to the **input**.

## Zie ook

* Class [DateTimeOffset](../)
* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
