---
title: "System::Threading::CancellationTokenRegistration class"
linktitle: "CancellationTokenRegistration"
second_title: "Aspose.Page pour C++"
description: "System::Threading::CancellationTokenRegistration class. Représente un enregistrement pour un rappel de jeton d'annulation en C++."
type: docs
weight: 300
url: /fr/cpp/system.threading/cancellationtokenregistration/
---
## CancellationTokenRegistration class


Représente un enregistrement pour le rappel d'un jeton d'annulation.

```cpp
class CancellationTokenRegistration
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [Dispose](./dispose/)() | Libère l'enregistrement et supprime le rappel du [CancellationTokenSource](../cancellationtokensource/) associé. Après l'appel de cette méthode, le rappel enregistré ne sera plus invoqué lorsque le [CancellationTokenSource](../cancellationtokensource/) associé sera annulé. |
## Remarques


Cette classe permet de désenregistrer un rappel d'un jeton d'annulation. Lorsqu'elle est libérée, elle supprime le rappel du [CancellationTokenSource](../cancellationtokensource/) associé.
Cette classe ne doit pas être créée directement - elle est renvoyée par les méthodes d'enregistrement du [CancellationToken](../cancellationtoken/).

## Voir aussi

* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
