---
title: "System::DateTimeOffset::TryParse methode"
linktitle: "TryParse"
second_title: "Aspose.Page voor C++"
description: "System::DateTimeOffset::TryParse methode. Probeert de opgegeven string te converteren naar een DateTimeOffset-object met behulp van de opgegeven formatprovider en opmaakstijl in C++."
type: docs
weight: 5700
url: /nl/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Probeert de opgegeven string te converteren naar het [DateTimeOffset](../) object met behulp van de opgegeven formatprovider en opmaakstijl.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../string/) om te converteren. |
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
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Probeert de opgegeven string te converteren naar het [DateTimeOffset](../) object.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| input | const String\& | [String](../../string/) om te converteren. |
| result | DateTimeOffset\& | [DateTimeOffset](../) die gelijk is aan de **input**. |

### ReturnValue

true als de **input** succesvol is geconverteerd, anders - false.

## Zie ook

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
