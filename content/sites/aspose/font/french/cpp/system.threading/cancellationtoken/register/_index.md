---
title: "System::Threading::CancellationToken::Register méthode"
linktitle: "Enregistrer"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Threading::CancellationToken::Register. Enregistre un rappel qui sera invoqué lorsque l'annulation est demandée en C++."
type: docs
weight: 400
url: /fr/cpp/system.threading/cancellationtoken/register/
---
## CancellationToken::Register method


Enregistre un rappel qui sera invoqué lorsque l'annulation est demandée.

```cpp
CancellationTokenRegistration System::Threading::CancellationToken::Register(const Action<> &callback) const
```


| Paramètre | Type | Description |
| --- | --- | --- |
| callback | const Action<>\& | L'[Action<>](../../../system/action/) à exécuter lorsque l'annulation est demandée. |

### ReturnValue

Un objet [CancellationTokenRegistration](../../cancellationtokenregistration/) qui peut être utilisé pour désinscrire le rappel.
## Remarques



Si l'annulation a déjà été demandée, le rappel sera invoqué immédiatement.

## Voir aussi

* Class [CancellationTokenRegistration](../../cancellationtokenregistration/)
* Typedef [Action](../../../system/action/)
* Class [CancellationToken](../)
* Namespace [System::Threading](../../)
* Library [Aspose.Font for C++](../../../)
