---
title: "System::Int64::TryParse Methode"
linktitle: "TryParse"
second_title: "Aspose.Font für C++"
description: "Wie man die TryParse‑Methode der System::Int64‑Klasse in C++ verwendet."
type: docs
weight: 200
url: /de/cpp/system/int64/tryparse/
---
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int64_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int64_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int64_t\&) method


Konvertiert die angegebene Zeichenkette, die die String-Darstellung einer Zahl enthält, in das entsprechende 64-Bit-Vorzeichen-Integer unter Verwendung der bereitgestellten Formatierungsinformationen und des Zahlenstils.

```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int64_t &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die Zeichenkette zum Konvertieren. |
| Stile | Globalization::NumberStyles | Eine bitweise Kombination von Werten des NumberStyles‑Enums, die den zulässigen Stil der Zeichenkettenrepräsentation einer Zahl festlegt. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Ein Zeiger auf ein Objekt, das die Zeichenkettenformatinformationen enthält. |
| result | int64_t\& | Die Referenz auf eine 64‑Bit vorzeichenbehaftete Integer‑Variable, in die das Ergebnis der Konvertierung geschrieben wird. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, sonst – falsch.

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int64_t\&) method




```cpp
static bool System::Int64::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int64_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int64::TryParse(const String\&, int64_t\&) method


Konvertiert die angegebene Zeichenkette, die die String-Darstellung einer Zahl enthält, in das entsprechende 64-Bit-Vorzeichen-Integer.

```cpp
static bool System::Int64::TryParse(const String &value, int64_t &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die Zeichenkette zum Konvertieren. |
| result | int64_t\& | Die Referenz auf eine 64‑Bit vorzeichenbehaftete Integer‑Variable, in die das Ergebnis der Konvertierung geschrieben wird. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, sonst – falsch.

## Siehe auch

* Class [String](../../string/)
* Class [Int64](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
