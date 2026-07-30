---
title: "System::DateTimeOffset::TryParse Methode"
linktitle: "TryParse"
second_title: "Aspose.Font für C++"
description: "System::DateTimeOffset::TryParse Methode. Versucht, die angegebene Zeichenkette in ein DateTimeOffset-Objekt zu konvertieren, wobei der angegebene Formatprovider und der Formatstil in C++ verwendet werden."
type: docs
weight: 5700
url: /de/cpp/system/datetimeoffset/tryparse/
---
## DateTimeOffset::TryParse(const String\&, const SharedPtr\<IFormatProvider\>\&, Globalization::DateTimeStyles, DateTimeOffset\&) method


Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](../)-Objekt zu konvertieren, wobei der angegebene Formatprovider und der Formatstil verwendet werden.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, const SharedPtr<IFormatProvider> &provider, Globalization::DateTimeStyles styles, DateTimeOffset &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../string/) zum Konvertieren. |
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
## DateTimeOffset::TryParse(const String\&, DateTimeOffset\&) method


Versucht, die angegebene Zeichenkette in ein [DateTimeOffset](../)-Objekt zu konvertieren.

```cpp
static bool System::DateTimeOffset::TryParse(const String &input, DateTimeOffset &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| input | const String\& | [String](../../string/) zum Konvertieren. |
| result | DateTimeOffset\& | [DateTimeOffset](../), das dem **input** entspricht. |

### ReturnValue

true, wenn der **input** erfolgreich konvertiert wurde, sonst - false.

## Siehe auch

* Class [String](../../string/)
* Class [DateTimeOffset](../)
* Class [DateTimeOffset](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
