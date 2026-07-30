---
title: "System::Equals< float, float > Methode"
linktitle: "Gleich< float, float >"
second_title: "Aspose.Font für C++"
description: "System::Equals< float, float > Methode. Spezialisierung für Gleitkommawerte mit einfacher Genauigkeit. Obwohl zwei Gleitkomma‑NaNs gemäß IEC 60559:1989 immer als ungleich verglichen werden, verlangt der Vertrag für System.Object.Equals, dass Überschreibungen die Anforderungen eines Äquivalenzoperators erfüllen. Daher geben System.Double.Equals und System.Single.Equals True zurück, wenn zwei NaNs verglichen werden, während der Gleichheitsoperator in diesem Fall False zurückgibt, wie im C++‑Standard gefordert."
type: docs
weight: 18500
url: /de/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Spezialisierung für Gleitkommawerte mit einfacher Genauigkeit. Obwohl zwei Gleitkomma‑NaNs gemäß IEC 60559:1989 immer als ungleich verglichen werden, verlangt der Vertrag für [System.Object.Equals](../object/equals/), dass Überschreibungen die Anforderungen eines Äquivalenzoperators erfüllen. Daher geben System.Double.Equals und System.Single.Equals True zurück, wenn zwei NaNs verglichen werden, während der Gleichheitsoperator in diesem Fall False zurückgibt, wie im Standard gefordert.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | const float\& | Der erste Operand |
| b | const float\& | Der zweite Operand |

### ReturnValue

True, wenn beide Werte NaN sind oder gleich sind, sonst false

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
