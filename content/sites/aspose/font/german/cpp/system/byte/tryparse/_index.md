---
title: "System::Byte::TryParse Methode"
linktitle: "TryParse"
second_title: "Aspose.Font für C++"
description: "Wie man die TryParse‑Methode der System::Byte‑Klasse in C++ verwendet."
type: docs
weight: 200
url: /de/cpp/system/byte/tryparse/
---
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::CultureInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::CultureInfo> &culture, uint8_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [CultureInfo](../../../system.globalization/cultureinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<Globalization::NumberFormatInfo\>\&, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<Globalization::NumberFormatInfo> &nfi, uint8_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [NumberFormatInfo](../../../system.globalization/numberformatinfo/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, uint8_t\&) method


Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer unter Verwendung der bereitgestellten Formatierungsinformationen und des Zahlenstils.

```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, uint8_t &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die Zeichenkette zum Konvertieren. |
| Stile | Globalization::NumberStyles | Eine bitweise Kombination von Werten des NumberStyles‑Enums, die den zulässigen Stil der Zeichenkettenrepräsentation einer Zahl festlegt. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Ein Zeiger auf ein Objekt, das die Zeichenkettenformatinformationen enthält. |
| result | uint8_t\& | Die Referenz auf eine 8‑Bit‑vorzeichenlose Ganzzahlvariable, in die das Ergebnis der Konvertierung geschrieben wird. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, sonst – falsch.

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, Globalization::NumberStyles, std::nullptr_t, uint8_t\&) method




```cpp
static bool System::Byte::TryParse(const String &value, Globalization::NumberStyles styles, std::nullptr_t, uint8_t &result)
```

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Byte::TryParse(const String\&, uint8_t\&) method


Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in das entsprechende vorzeichenlose 8‑Bit‑Integer.

```cpp
static bool System::Byte::TryParse(const String &value, uint8_t &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die Zeichenkette zum Konvertieren. |
| result | uint8_t\& | Die Referenz auf eine 8‑Bit‑vorzeichenlose Ganzzahlvariable, in die das Ergebnis der Konvertierung geschrieben wird. |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, sonst – falsch.

## Siehe auch

* Class [String](../../string/)
* Class [Byte](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
