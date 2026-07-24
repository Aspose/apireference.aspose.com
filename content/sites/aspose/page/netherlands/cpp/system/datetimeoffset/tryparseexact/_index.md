---
title: "System::DateTimeOffset::TryParseExact methode"
linktitle: "TryParseExact"
second_title: "Aspose.Page voor C++"
description: "System::DateTimeOffset::TryParseExact methode. Probeert de opgegeven string te converteren naar een DateTimeOffset-object met behulp van de opgegeven formaten, formatprovider en opmaakstijl in C++."
type: docs
weight: 5800
url: /nl/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Probeert de opgegeven string te converteren naar een [DateTimeOffset](../)-object met behulp van de opgegeven formaten, formatprovider en opmaakstijl.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../string/) om te converteren. |
| formaten | const ArrayPtr\<String\>\& | Arrays van formaat‑strings. |
| provider | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| stijlen | Globalization::DateTimeStyles | Datum- en tijdopmaakstijlen |
| result | DateTimeOffset\& | [DateTimeOffset](../) die gelijk is aan de **input**. |

### ReturnValue

true als de **input** succesvol is geconverteerd, anders - false.

## Zie ook

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Probeert de opgegeven string te converteren naar een [DateTimeOffset](../) object met behulp van het opgegeven formaat, de formatprovider en de opmaakstijl.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../string/) om te converteren. |
| formaat | const String\& | Opmaakreeks. |
| provider | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| stijlen | Globalization::DateTimeStyles | Datum- en tijdopmaakstijlen |
| result | DateTimeOffset\& | [DateTimeOffset](../) die gelijk is aan de **input**. |

### ReturnValue

true als de **input** succesvol is geconverteerd, anders - false.

## Zie ook

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
