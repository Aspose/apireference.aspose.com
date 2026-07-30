---
title: "System::Int16::TryParse Methode"
linktitle: "TryParse"
second_title: "Aspose.Font für C++"
description: "Wie man die TryParse‑Methode der System::Int16‑Klasse in C++ verwendet."
type: docs
weight: 200
url: /de/cpp/system/int16/tryparse/
---
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, int16_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, int16_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, int16_t\&) method


Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende 16‑Bit‑vorzeichenbehaftete Integer unter Verwendung der bereitgestellten Formatierungsinformationen und des Zahlenstils.

```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, int16_t &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die Zeichenkette zum Konvertieren. |
| Stile | Globalization::NumberStyles | Eine bitweise Kombination von Werten des NumberStyles‑Enums, die den zulässigen Stil der Zeichenkettenrepräsentation einer Zahl festlegt. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Ein Zeiger auf ein Objekt, das die Zeichenkettenformatinformationen enthält. |
| result | int16_t\& | Die Referenz auf eine 16‑Bit vorzeichenbehaftete Integer‑Variable, in die das Ergebnis der Konvertierung geschrieben wird. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, sonst – falsch.

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, int16_t\&) method




```cpp
static bool System::Int16::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, int16_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Int16::TryParse(const String\&, int16_t\&) method


Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende 16‑Bit‑vorzeichenbehaftete Integer.

```cpp
static bool System::Int16::TryParse(const String &value, int16_t &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die Zeichenkette zum Konvertieren. |
| result | int16_t\& | Die Referenz auf eine 16‑Bit vorzeichenbehaftete Integer‑Variable, in die das Ergebnis der Konvertierung geschrieben wird. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, sonst – falsch.

## Siehe auch

* Class [String](../../string/)
* Class [Int16](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
