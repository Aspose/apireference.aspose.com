---
title: "System::SafeInvoke method"
linktitle: "SafeInvoke"
second_title: "Aspose.Font per C++"
description: "System::SafeInvoke method. Implementazione della traduzione dell'operatore ''?.'' in C++."
type: docs
weight: 37000
url: /it/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementazione della traduzione dell'operatore '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 &&expr, T1 &&func)
```


| Parametro | Descrizione |
| --- | --- |
| T0 | tipo di espressione. |
| T1 | Tipo di lambda che incapsula l'espressione 'WhenTrue'. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | T0\&& | valore dell'espressione. |
| func | T1\&& | 'WhenTrue' espressione legata al functor. |

### ReturnValue

Se il valore di expr non è nullo, restituisce func chiamato con il suo valore come primo argomento, altrimenti restituisce null.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
