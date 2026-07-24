---
title: "classe System::ComponentModel::BackgroundWorker"
linktitle: "BackgroundWorker"
second_title: "Aspose.Page pour C++"
description: "classe System::ComponentModel::BackgroundWorker. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject(). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur System::SmartPtr et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument en C++."
type: docs
weight: 200
url: /fr/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/). Ne créez jamais d'instance de ce type sur la pile ou avec l'opérateur new, car cela entraînera des erreurs d'exécution et/ou des échecs d'assertion. Enveloppez toujours cette classe dans un pointeur [System::SmartPtr](../../system/smartptr/) et utilisez ce pointeur pour la passer aux fonctions en tant qu'argument.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## Méthodes

| Méthode | Description |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | Informations RTTI. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | Obtient une valeur indiquant si le [System::ComponentModel::BackgroundWorker](./) peut signaler des mises à jour de progression. |
| [ReportProgress](./reportprogress/)(int) | Déclenche l'événement **System::ComponentModel::BackgroundWorker::ProgressChanged**. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | Déclenche l'événement **System::ComponentModel::BackgroundWorker::ProgressChanged** avec l'objet userState. |
| [RunWorkerAsync](./runworkerasync/)() | Démarre l'exécution d'une opération en arrière-plan. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | Démarre l'exécution d'une opération en arrière-plan. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | Définit une valeur indiquant si le [System::ComponentModel::BackgroundWorker](./) peut signaler des mises à jour de progression. |
| [~BackgroundWorker](./~backgroundworker/)() | Destructeur. |
## Voir aussi

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
