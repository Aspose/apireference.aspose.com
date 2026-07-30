---
title: "System::Decimal::TryParse‑Methode"
linktitle: "TryParse"
second_title: "Aspose.Font für C++"
description: "System::Decimal::TryParse‑Methode. Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in den entsprechenden Decimal‑Wert in C++."
type: docs
weight: 5800
url: /de/cpp/system/decimal/tryparse/
---
## Decimal::TryParse(const String\&, Decimal\&) method


Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in den entsprechenden [Decimal](../)-Wert.

```cpp
static bool System::Decimal::TryParse(const String &value, Decimal &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die zu konvertierende Zeichenkette |
| result | Decimal\& | Die Referenz auf eine [Decimal](../)-Variable, in die das Ergebnis der Konvertierung geschrieben wird |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, andernfalls – falsch.

## Siehe auch

* Class [String](../../string/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Decimal::TryParse(const String\&, Globalization::NumberStyles, const SharedPtr\<IFormatProvider\>\&, Decimal\&) method


Konvertiert die angegebene Zeichenkette, die die Zeichenkettenrepräsentation einer Zahl enthält, in den entsprechenden [Decimal](../)-Wert unter Verwendung der bereitgestellten Formatierungsinformationen und des Zahlenstils.

```cpp
static bool System::Decimal::TryParse(const String &value, Globalization::NumberStyles styles, const SharedPtr<IFormatProvider> &provider, Decimal &result)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Wert | const String\& | Die zu konvertierende Zeichenkette |
| Stile | Globalization::NumberStyles | Eine bitweise Kombination von Werten des NumberStyles‑Enums, die den zulässigen Stil der Zeichenkettenrepräsentation einer Zahl festlegt. |
| Anbieter | const SharedPtr\<IFormatProvider\>\& | Ein Zeiger auf ein Objekt, das die Zeichenkettenformatinformationen enthält |
| result | Decimal\& | Ein Ausgabeparameter; enthält das Ergebnis der Konvertierung |

### ReturnValue

Wahr, wenn die Konvertierung erfolgreich war, andernfalls – falsch.

## Siehe auch

* Class [String](../../string/)
* Enum [NumberStyles](../../../system.globalization/numberstyles/)
* Typedef [SharedPtr](../../sharedptr/)
* Class [IFormatProvider](../../iformatprovider/)
* Class [Decimal](../)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
