---
title: "System::Decimal::Round-Methode"
linktitle: "Runden"
second_title: "Aspose.Page für C++"
description: "System::Decimal::Round-Methode. Rundet den angegebenen Wert auf den nächstgelegenen Wert mit der angegebenen Anzahl von Nachkommastellen. Ein Parameter gibt das Verhalten der Funktion an, wenn der angegebene Wert gleich weit von zwei nächstgelegenen Zahlen entfernt ist, in C++."
type: docs
weight: 4400
url: /de/cpp/system/decimal/round/
---
## Decimal::Round(const Decimal\&, int, MidpointRounding) method


Rundet den angegebenen Wert auf den nächsten Wert mit der angegebenen Anzahl von Nachkommastellen. Ein Parameter gibt das Verhalten der Funktion an, wenn der angegebene Wert gleich weit von zwei nächsten Zahlen entfernt ist.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, int digits, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| d | const Decimal\& | Der zu rundende Wert |
| Ziffern | int | Die Anzahl der Nachkommastellen im gerundeten Wert |
| mode | MidpointRounding | Gibt an, wie das Runden durchgeführt wird, wenn **value** gleich weit von zwei nächstgelegenen Zahlen entfernt ist. |

### ReturnValue

Die Zahl mit der angegebenen Ziffernanzahl, die **value** am nächsten liegt

## Siehe auch

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Decimal::Round(const Decimal\&, MidpointRounding) method


Rundet den angegebenen Wert auf die nächste ganze Zahl. Ein Parameter gibt das Verhalten der Funktion an, wenn der angegebene Wert gleich weit von zwei nächsten Zahlen entfernt ist.

```cpp
static Decimal System::Decimal::Round(const Decimal &d, MidpointRounding mode=MidpointRounding::ToEven)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| d | const Decimal\& | Der zu rundende Wert |
| mode | MidpointRounding | Gibt an, wie das Runden durchgeführt wird, wenn **value** gleich weit von zwei nächstgelegenen Zahlen entfernt ist. |

### ReturnValue

**d** rounded to the nearest integral value

## Siehe auch

* Class [Decimal](../)
* Enum [MidpointRounding](../../midpointrounding/)
* Class [Decimal](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
