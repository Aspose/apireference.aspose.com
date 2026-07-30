---
title: "Classe System::Threading::CancellationTokenSource"
linktitle: "CancellationTokenSource"
second_title: "Aspose.Font pour C++"
description: "Classe System::Threading::CancellationTokenSource. Une source de jeton d’annulation pouvant être utilisée pour déclencher des notifications d’annulation en C++."
type: docs
weight: 400
url: /fr/cpp/system.threading/cancellationtokensource/
---
## CancellationTokenSource class


Une source de jeton d'annulation qui peut être utilisée pour déclencher des notifications d'annulation.

```cpp
class CancellationTokenSource : public System::IDisposable
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Cancel](./cancel/)() | Communique une demande d’annulation. |
| [CancellationTokenSource](./cancellationtokensource/)() | Construit un nouveau [CancellationTokenSource](./). |
| static [CreateLinkedTokenSource](./createlinkedtokensource/)(const CancellationToken\&, const CancellationToken\&) | Crée une source de jeton liée qui s'annule lorsque l'un des jetons fournis est annulé. |
| [Dispose](./dispose/)() override | Libère toutes les ressources utilisées par le [CancellationTokenSource](./). |
| [get_IsCancellationRequested](./get_iscancellationrequested/)() const | Obtient si une annulation a été demandée. |
| [get_Token](./get_token/)() const | Obtient le jeton d'annulation associé à cette source. |
## Remarques


Fournit des mécanismes pour créer et contrôler les jetons d'annulation afin d'annuler de façon coopérative les opérations.
## Voir aussi

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Threading](../)
* Library [Aspose.Font for C++](../../)
