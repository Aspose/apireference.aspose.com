---
title: "System::DateTimeOffset::TryParseExact-Methode"
linktitle: "TryParseExact"
second_title: "Aspose.Font für C++"
description: "System::DateTimeOffset::TryParseExact-Methode. Versucht, die angegebene Zeichenkette in ein DateTimeOffset-Objekt zu konvertieren, wobei die angegebenen Formate, der Formatprovider und der Formatstil verwendet werden in C++."
type: docs
weight: 5800
url: /de/cpp/system/datetimeoffset/tryparseexact/
---
## DateTimeOffset::TryParseExact(const String\&, const ArrayPtr\<String\>\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](../)-Objekt zu konvertieren, wobei die angegebenen Formate, der Formatprovider und der Formatstil verwendet werden.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const ArrayPtr<String> &formats, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../string/) zum Konvertieren. |
| Formate | const ArrayPtr\<String\>\& | Arrays von Formatzeichenketten. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| Stile | Globalization::DateTimeStyles | Datums- und Zeitformatierungsstile. |
| result | DateTimeOffset\& | [DateTimeOffset](../), das dem **input** entspricht. |

### ReturnValue

true, wenn der **input** erfolgreich konvertiert wurde, sonst - false.

## Siehe auch

* Class [String](../../string/)
* Typedef [ArrayPtr](../../arrayptr/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## DateTimeOffset::TryParseExact(const String\&, const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](../)-Objekt zu konvertieren, wobei das angegebene Format, der Formatprovider und der Formatstil verwendet werden.

```cpp
static bool System::DateTimeOffset::TryParseExact(const String &input, const String &format, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../string/) zum Konvertieren. |
| Format | const String\& | Formatzeichenfolge. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Formatprovider. |
| Stile | Globalization::DateTimeStyles | Datums- und Zeitformatierungsstile. |
| result | DateTimeOffset\& | [DateTimeOffset](../), das dem **input** entspricht. |

### ReturnValue

true, wenn der **input** erfolgreich konvertiert wurde, sonst - false.

## Siehe auch

* Class [String](../../string/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Enum [DateTimeStyles](../../../system.globalization/datetimestyles/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
