---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource metodo"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Font per C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource metodo. Crea una sorgente di token collegata che si annulla quando uno qualsiasi dei token forniti si annulla in C++."
type: docs
weight: 600
url: /it/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Crea una sorgente di token collegata che si annulla quando uno qualsiasi dei token forniti viene annullato.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| token1 | const CancellationToken\& | Primo token di cancellazione da monitorare. |
| token2 | const CancellationToken\& | Secondo token di cancellazione da monitorare. |

### ReturnValue

Nuova sorgente di token che si annullerà quando uno dei token di input si annulla.
## Osservazioni



La sorgente restituita si annullerà immediatamente se uno dei token di input è già annullato.

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
