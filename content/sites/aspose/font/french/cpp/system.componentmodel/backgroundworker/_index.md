---
title: "classe System::ComponentModel::BackgroundWorker"
linktitle: "BackgroundWorker"
second_title: "Aspose.Font pour C++"
description: "classe System::ComponentModel::BackgroundWorker. Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction System::MakeObject() function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into System::SmartPtr pointer and use this pointer to pass it to functions as argument in C++."
type: docs
weight: 200
url: /fr/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Les objets de cette classe ne doivent être alloués qu'en utilisant la fonction [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

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
* Library [Aspose.Font for C++](../../)
