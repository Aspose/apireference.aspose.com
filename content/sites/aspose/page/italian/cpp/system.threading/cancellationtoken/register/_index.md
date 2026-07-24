---
title: "System::Threading::CancellationToken::Register metodo"
linktitle: "Register"
second_title: "Aspose.Page per C++"
description: "System::Threading::CancellationToken::Register metodo. Registra una callback che verrà invocata quando viene richiesta la cancellazione in C++."
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
| callback | const Action<>\& | Il [Action<>](../../../system/action/) da eseguire quando viene richiesta la cancellazione. |

### ReturnValue

Un oggetto [CancellationTokenRegistration](../../cancellationtokenregistration/) che può essere usato per deregistrare la callback.
## Osservazioni



Se la cancellazione è già stata richiesta, la callback verrà invocata immediatamente.

## Vedi anche

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Page for C++](../../../)
