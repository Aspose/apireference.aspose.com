---
title: "Metodo System::ComponentModel::BackgroundWorker::ReportProgress"
linktitle: "ReportProgress"
second_title: "Aspose.Font per C++"
description: "Metodo System::ComponentModel::BackgroundWorker::ReportProgress. Genera l'evento System::ComponentModel::BackgroundWorker::ProgressChanged in C++."
type: docs
weight: 400
url: /it/cpp/system.componentmodel/backgroundworker/reportprogress/
---
## BackgroundWorker::ReportProgress(int) method


Genera l'evento **System::ComponentModel::BackgroundWorker::ProgressChanged**.

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percentProgress | int | La percentuale, da 0 a 100, dell'operazione in background completata. |

## Vedi anche

* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## BackgroundWorker::ReportProgress(int, const System::SharedPtr\<System::Object\>\&) method


Genera l'evento **System::ComponentModel::BackgroundWorker::ProgressChanged** con l'oggetto userState.

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress, const System::SharedPtr<System::Object> &userState)
```


| Parametro | Tipo | Descrizione |
| --- | --- | --- |
| percentProgress | int | La percentuale, da 0 a 100, dell'operazione in background completata. |
| userState | const System::SharedPtr\<System::Object\>\& | L'oggetto di stato passato a System::ComponentModel::BackgroundWorker::RunWorkerAsync(System::Object). |

## Vedi anche

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
