---
title: "Metodo System::Threading::CancellationToken::Register"
linktitle: "Registra"
second_title: "Aspose.Font per C++"
description: "System::Threading::CancellationToken::Register metodo. Registra una callback che verrà invocata quando viene richiesto l'annullamento in C++."
type: docs
weight: 400
url: /it/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Registra una callback che verrà invocata quando viene richiesta la cancellazione.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| callback | const Action<>\& | L'[Action<>](../../../system/action/) da eseguire quando viene richiesto l'annullamento. |

### ReturnValue

Un oggetto [CancellationTokenRegistration](../../cancellationtokenregistration/) che può essere usato per deregistrare la callback.
## Osservazioni



Se l'annullamento è già stato richiesto, la callback verrà invocata immediatamente.

## Vedi anche

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
