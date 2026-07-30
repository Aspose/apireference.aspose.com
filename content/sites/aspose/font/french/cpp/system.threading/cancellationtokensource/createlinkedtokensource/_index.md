---
title: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource méthode"
linktitle: "CreateLinkedTokenSource"
second_title: "Aspose.Font pour C++"
description: "System::Threading::CancellationTokenSource::CreateLinkedTokenSource méthode. Crée une source de jeton liée qui s'annule lorsque l'un des jetons fournis est annulé en C++."
type: docs
weight: 600
url: /fr/cpp/system.threading/cancellationtokensource/createlinkedtokensource/
---
## CancellationTokenSource::CreateLinkedTokenSource method


Crée une source de jeton liée qui s'annule lorsque l'un des jetons fournis est annulé.

```cpp
static SharedPtr<CancellationTokenSource> System::Threading::CancellationTokenSource::CreateLinkedTokenSource(const CancellationToken &token1, const CancellationToken &token2)
```


| Paramètre | Type | Description |
| --- | --- | --- |
| token1 | const CancellationToken\& | Premier jeton d'annulation à surveiller. |
| token2 | const CancellationToken\& | Deuxième jeton d'annulation à surveiller. |

### ReturnValue

Nouvelle source de jeton qui s'annulera lorsque l'un des jetons d'entrée sera annulé.
## Remarques



La source retournée s'annulera immédiatement si l'un des jetons d'entrée est déjà annulé.

## Voir aussi

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [CancellationTokenSource](../)
* Class [CancellationToken](../../cancellationtoken/)
* Class [CancellationTokenSource](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
