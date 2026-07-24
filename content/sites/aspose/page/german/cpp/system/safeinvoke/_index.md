---
title: "System::SafeInvoke-Methode"
linktitle: "SafeInvoke"
second_title: "Aspose.Page für C++"
description: "System::SafeInvoke-Methode. Implementierung der Übersetzung des ''?.''-Operators in C++."
type: docs
weight: 36900
url: /de/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementierung der Übersetzung des '?.'-Operators.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parameter | Beschreibung |
| --- | --- |
| T0 | Ausdruckstyp. |
| T1 | Typ des Lambda‑Ausdrucks, der den 'WhenTrue'-Ausdruck kapselt. |

| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| expr | T0 | Ausdruckswert. |
| func | T1 | 'WhenTrue'-Ausdruck an Funktor gebunden. |

### ReturnValue

Wenn der expr‑Wert nicht null ist, wird func mit seinem Wert als erstem Argument aufgerufen und zurückgegeben, andernfalls wird null zurückgegeben.

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
