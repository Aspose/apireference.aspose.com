---
title: "System::Threading::SynchronizationContext classe"
linktitle: "SynchronizationContext"
second_title: "Aspose.Page pour C++"
description: "System::Threading::SynchronizationContext classe. Fournit la fonctionnalité de base pour propager un contexte de synchronisation à travers diverses opérations de synchronisation en C++."
type: docs
weight: 1100
url: /fr/cpp/system.threading/synchronizationcontext/
---
## SynchronizationContext class


Fournit les fonctionnalités de base pour propager un contexte de synchronisation à travers diverses opérations de synchronisation.

```cpp
class SynchronizationContext : public System::Object
```

## Méthodes

| Méthode | Description |
| --- | --- |
| static [get_Current](./get_current/)() | Obtient le contexte de synchronisation pour le thread actuel. |
| static [SetSynchronizationContext](./setsynchronizationcontext/)(const SharedPtr\<SynchronizationContext\>\&) | Définit le contexte de synchronisation pour le thread actuel. |
| [SynchronizationContext](./synchronizationcontext/)() | Informations RTTI. |
## Remarques


Cette classe permet la propagation du contexte de synchronisation entre les threads et est utilisée pour transmettre les rappels ou les invocations au thread ou au contexte de synchronisation approprié.
Implémentation factice.

## Voir aussi

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
