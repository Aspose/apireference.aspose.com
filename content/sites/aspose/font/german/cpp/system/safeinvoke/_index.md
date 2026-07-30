---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Font für C++"
description: "System::SafeInvoke method. Implementierung der ''?.''‑Operator‑Übersetzung in C++."
type: docs
weight: 37000
url: /de/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementierung der '?.'-Operator‑Übersetzung.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 &&expr, T1 &&func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | Ausdruckstyp. |
| T1 | Typ des Lambda, das den Ausdruck 'WhenTrue' kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| expr | T0\&& | Ausdruckswert. |
| func | T1\&& | 'WhenTrue'-Ausdruck an Funktor gebunden. |

### ReturnValue

Wenn der Ausdruckswert nicht null ist, wird func mit seinem Wert als erstem Argument aufgerufen, andernfalls wird null zurückgegeben.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
