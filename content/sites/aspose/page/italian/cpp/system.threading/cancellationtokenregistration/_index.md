---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page per C++"
description: "System::Threading::CancellationTokenRegistration class. Rappresenta una registrazione per un callback di token di cancellazione in C++."
type: docs
weight: 300
url: /it/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Rappresenta una registrazione per una callback di token di cancellazione.

```cpp
class CancellationTokenRegistration
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [Dispose](./dispose/)() | Elimina la registrazione e rimuove il callback dal [CancellationTokenSource](../cancellationtokensource/) associato. Dopo aver chiamato questo metodo, il callback registrato non verrà più invocato quando il [CancellationTokenSource](../cancellationtokensource/) associato viene annullato. |
## Osservazioni


Questa classe consente la deregistrazione di un callback da un token di cancellazione. Quando eliminata, rimuove il callback dal [CancellationTokenSource](../cancellationtokensource/) associato.
Questa classe non dovrebbe essere creata direttamente - viene restituita dai metodi di registrazione di [CancellationToken](../cancellationtoken/).

## Vedi anche

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
