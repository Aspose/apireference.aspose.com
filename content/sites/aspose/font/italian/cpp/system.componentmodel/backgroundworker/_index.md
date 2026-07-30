---
title: "Classe System::ComponentModel::BackgroundWorker"
linktitle: "BackgroundWorker"
second_title: "Aspose.Font per C++"
description: "Classe System::ComponentModel::BackgroundWorker. Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione System::MakeObject(). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore System::SmartPtr e utilizzare tale puntatore per passarlo alle funzioni come argomento in C++."
type: docs
weight: 200
url: /it/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


Gli oggetti di questa classe devono essere allocati solo utilizzando la funzione [System::MakeObject()](../../system/makeobject/). Non creare mai un'istanza di questo tipo sullo stack o usando l'operatore new, poiché ciò provocherà errori di runtime e/o fault di asserzione. Avvolgere sempre questa classe in un puntatore [System::SmartPtr](../../system/smartptr/) e utilizzare tale puntatore per passarlo alle funzioni come argomento.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## Metodi

| Metodo | Descrizione |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | Informazioni RTTI. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | Restituisce un valore che indica se il [System::ComponentModel::BackgroundWorker](./) può segnalare aggiornamenti di avanzamento. |
| [ReportProgress](./reportprogress/)(int) | Genera l'evento **System::ComponentModel::BackgroundWorker::ProgressChanged**. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | Genera l'evento **System::ComponentModel::BackgroundWorker::ProgressChanged** con l'oggetto userState. |
| [RunWorkerAsync](./runworkerasync/)() | Avvia l'esecuzione di un'operazione in background. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | Avvia l'esecuzione di un'operazione in background. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | Imposta un valore che indica se il [System::ComponentModel::BackgroundWorker](./) può segnalare aggiornamenti di avanzamento. |
| [~BackgroundWorker](./~backgroundworker/)() | Distruttore. |
## Vedi anche

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Font for C++](../../)
