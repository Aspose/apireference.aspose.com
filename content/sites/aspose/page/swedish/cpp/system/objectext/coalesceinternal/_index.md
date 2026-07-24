---
title: "System::ObjectExt::CoalesceInternal metod"
linktitle: "CoalesceInternal"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::CoalesceInternal metod. Implementation av ''??'' operatoröversättning för icke‑nullbara typer. Överlagring för fallet om RT2 är konvertibel till RT1 i C++."
type: docs
weight: 600
url: /sv/cpp/system/objectext/coalesceinternal/
---
## ObjectExt::CoalesceInternal method


Implementation av översättning av '??'-operatorn för icke-nullbara typer. Överlagring för fallet då RT2 kan konverteras till RT1.

```cpp
template<typename RT1,typename RT2,typename F> static std::conditional<std::is_convertible<RT2, RT1>::value, RT1, RT2>::type System::ObjectExt::CoalesceInternal(RT1 value, F func)
```


| Parameter | Beskrivning |
| --- | --- |
| T0 | Värdetyp för LHS. |
| T1 | Typ av lambda som kapslar in RHS-uttrycket. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | RT1 | LHS värde. |
| func | F | RHS uttryck. |

### ReturnValue

Om LHS värde inte är null, returneras LHS, annars beräknas RHS uttryck och resultatet returneras.

## Se även

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
