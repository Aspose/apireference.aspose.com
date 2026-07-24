---
title: "System::Equals< float, float >‑metod"
linktitle: "Lika< float, float >"
second_title: "Aspose.Page för C++"
description: "System::Equals< float, float >‑metod. Specialisering för enkelprecisionsflyttal. Även om två flyttals‑NaN‑värden definieras av IEC 60559:1989 att alltid jämföras som olika, kräver kontraktet för System.Object.Equals att överskrivningar måste uppfylla kraven för en ekvivalensoperator. Därför returnerar System.Double.Equals och System.Single.Equals True när två NaN jämförs, medan likhetsoperatorn returnerar False i det fallet, enligt standarden i C++."
type: docs
weight: 18400
url: /sv/cpp/system/equals_float,float_/
---
## System::Equals< float, float > method


Specialisering för enkelprecisionsflyttal. Även om två flyttals‑NaN‑värden definieras av IEC 60559:1989 att alltid jämföras som olika, kräver kontraktet för [System.Object.Equals](../object/equals/) att överskrivningar måste uppfylla kraven för en ekvivalensoperator. Därför returnerar System.Double.Equals och System.Single.Equals True när två NaN jämförs, medan likhetsoperatorn returnerar False i det fallet, enligt standarden.

```cpp
bool System::Equals<float, float>(const float &a, const float &b)
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| en | const float\& | Den första jämförelsetermen |
| b | const float\& | Den andra jämförelsetermen |

### ReturnValue

Sant om båda värdena är NaN eller är lika, annars - falskt

## Se även

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
