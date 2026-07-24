---
title: "System::ObjectExt::Coalesce-metod"
linktitle: "Coalesce"
second_title: "Aspose.Page för C++"
description: "System::ObjectExt::Coalesce-metod. Implementation av ''??''-operatorns översättning för nullable-typer i C++."
type: docs
weight: 500
url: /sv/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implementation av översättning av '??'-operatorn för nullable-typer.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parameter | Beskrivning |
| --- | --- |
| T0 | Värdetyp för LHS. |
| T1 | Typ av lambda som kapslar in RHS-uttrycket. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | System::Nullable\<T0\> | LHS värde. |
| func | T1 | RHS uttryck. |

### ReturnValue

Om LHS värde inte är null, returneras LHS, annars beräknas RHS uttryck och resultatet returneras.

## Se även

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implementation av översättning av '??'-operatorn för icke-nullbara typer.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parameter | Beskrivning |
| --- | --- |
| T0 | Värdetyp för LHS. |
| T1 | Typ av lambda som kapslar in RHS-uttrycket. |

| Parameter | Type | Beskrivning |
| --- | --- | --- |
| value | T0 | LHS värde. |
| func | T1 | RHS uttryck. |

### ReturnValue

Om LHS värde inte är null, returneras LHS, annars beräknas RHS uttryck och resultatet returneras.

## Se även

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
