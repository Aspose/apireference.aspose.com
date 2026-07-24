---
title: "System::SafeInvoke metodo"
linktitle: "SafeInvoke"
second_title: "Aspose.Page per C++"
description: "System::SafeInvoke metodo. Implementazione della traduzione dell'operatore ''?.'' in C++."
type: docs
weight: 36900
url: /it/cpp/system/safeinvoke/
---
## System::SafeInvoke method


Implementazione della traduzione dell'operatore '?.'.

```cpp
template<typename T0,typename T1> static auto System::SafeInvoke(T0 expr, T1 func)
```


| Parametro | Descrizione |
| --- | --- |
| T0 | tipo di espressione. |
| T1 | Tipo di lambda che incapsula l'espressione 'WhenTrue'. |

| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| expr | T0 | valore dell'espressione. |
| func | T1 | Espressione 'WhenTrue' legata al functor. |

### ReturnValue

Se il valore di expr non è null, restituisce func chiamato con il suo valore come primo argomento, altrimenti restituisce null.

## Vedi anche

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
