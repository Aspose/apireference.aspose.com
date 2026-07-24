---
title: "System::ComponentModel::BackgroundWorker klasse"
linktitle: "BackgroundWorker"
second_title: "Aspose.Page voor C++"
description: "System::ComponentModel::BackgroundWorker klasse. Objecten van deze klasse mogen alleen worden gealloceerd met de System::MakeObject()-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een System::SmartPtr-pointer en gebruik deze pointer om deze als argument aan functies door te geven in C++."
type: docs
weight: 200
url: /nl/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Objecten van deze klasse mogen alleen worden gealloceerd met de [System::MakeObject()](../../system/makeobject/)-functie. Maak nooit een instantie van dit type op de stack of met operator new, omdat dit leidt tot runtime-fouten en/of assertiefouten. Wikkel deze klasse altijd in een [System::SmartPtr](../../system/smartptr/)-pointer en gebruik deze pointer om deze als argument aan functies door te geven.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | RTTI-informatie. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | Haalt een waarde op die aangeeft of de [System::ComponentModel::BackgroundWorker](./) voortgangsupdates kan rapporteren. |
| [ReportProgress](./reportprogress/)(int) | Activeert het **System::ComponentModel::BackgroundWorker::ProgressChanged** event. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | Activeert het **System::ComponentModel::BackgroundWorker::ProgressChanged** event met een userState-object. |
| [RunWorkerAsync](./runworkerasync/)() | Start de uitvoering van een achtergrondbewerking. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | Start de uitvoering van een achtergrondbewerking. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | Stelt een waarde in die aangeeft of de [System::ComponentModel::BackgroundWorker](./) voortgangsupdates kan rapporteren. |
| [~BackgroundWorker](./~backgroundworker/)() | Destructor. |
## Zie ook

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
