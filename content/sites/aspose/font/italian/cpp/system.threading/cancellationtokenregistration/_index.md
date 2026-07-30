---
title: "System::Threading::CancellationTokenRegistration classe"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Font per C++"
description: "System::Threading::CancellationTokenRegistration classe. Rappresenta una registrazione per un callback di token di cancellazione in C++."
type: docs
weight: 300
url: /it/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Rappresenta una registrazione per il callback di un token di cancellazione.

```cpp
class CancellationTokenRegistration
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() | Dispone la registrazione e rimuove il callback dalla [CancellationTokenSource](../cancellationtokensource/) associata. Dopo aver chiamato questo metodo, il callback registrato non verrà più invocato quando la [CancellationTokenSource](../cancellationtokensource/) associata viene annullata. |
## Osservazioni


Questa classe consente la deregistrazione di un callback da un token di cancellazione. Quando viene disposata, rimuove il callback dalla [CancellationTokenSource](../cancellationtokensource/) associata.
Questa classe non dovrebbe essere creata direttamente - viene restituita dai metodi di registrazione di [CancellationToken](../cancellationtoken/).

## Vedi anche

* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
