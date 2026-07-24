---
title: "System::Equals< float, float > Methode"
linktitle: "Gleich< float, float >"
second_title: "Aspose.Page für C++"
description: "System::Equals< float, float > Methode. Spezialisierung für Gleitkommawerte mit einfacher Genauigkeit. Obwohl zwei Gleitkomma‑NaNs gemäß IEC 60559:1989 immer als ungleich verglichen werden, verlangt der Vertrag für System.Object.Equals, dass Überschreibungen die Anforderungen eines Äquivalenzoperators erfüllen. Daher geben System.Double.Equals und System.Single.Equals True zurück, wenn zwei NaNs verglichen werden, während der Gleichheitsoperator in diesem Fall False zurückgibt, wie im Standard für C++ gefordert."
type: docs
weight: 18400
url: /de/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Spezialisierung für Gleitkommawerte mit einfacher Genauigkeit. Obwohl zwei Gleitkomma‑NaNs gemäß IEC 60559:1989 immer als ungleich verglichen werden, verlangt der Vertrag für [System.Object.Equals](../object/equals/), dass Überschreibungen die Anforderungen eines Äquivalenzoperators erfüllen. Daher geben System.Double.Equals und System.Single.Equals True zurück, wenn zwei NaNs verglichen werden, während der Gleichheitsoperator in diesem Fall False zurückgibt, wie vom Standard gefordert.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| a | const float\& | Der erste Vergleichswert |
| b | const float\& | Der zweite Vergleichswert |

### ReturnValue

Wahr, wenn beide Werte NaN sind oder gleich sind, sonst - falsch

## Siehe auch

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
