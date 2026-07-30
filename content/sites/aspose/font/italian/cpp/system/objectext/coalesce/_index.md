---
title: "Metodo System::ObjectExt::Coalesce"
linktitle: "Coalesce"
second_title: "Aspose.Font per C++"
description: "Metodo System::ObjectExt::Coalesce. Implementazione della traduzione dell'operatore ''??'' per i tipi nullable in C++."
type: docs
weight: 500
url: /it/cpp/system/objectext/coalesce/
---
## ObjectExt::Coalesce(System::Nullable\<T0\>, T1) method


Implementazione della traduzione dell'operatore '??' per i tipi nullable.

```cpp
template<typename T0,typename T1> static T0 System::ObjectExt::Coalesce(System::Nullable<T0> value, T1 func)
```


| Parametro | Descrizione |
| --- | --- |
| T0 | Tipo di valore LHS. |
| T1 | Tipo di lambda che incapsula l'espressione RHS. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | System::Nullable\<T0\> | Valore LHS. |
| func | T1 | Espressione RHS. |

### ReturnValue

Se il valore LHS non è null, restituisce LHS, altrimenti calcola l'espressione RHS e restituisce il risultato.

## Vedi anche

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Coalesce(T0, T1) method


Implementazione della traduzione dell'operatore '??' per i tipi non nullable.

```cpp
template<typename T0,typename T1> static auto System::ObjectExt::Coalesce(T0 value, T1 func)
```


| Parametro | Descrizione |
| --- | --- |
| T0 | Tipo di valore LHS. |
| T1 | Tipo di lambda che incapsula l'espressione RHS. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| valore | T0 | Valore LHS. |
| func | T1 | Espressione RHS. |

### ReturnValue

Se il valore LHS non è null, restituisce LHS, altrimenti calcola l'espressione RHS e restituisce il risultato.

## Vedi anche

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
