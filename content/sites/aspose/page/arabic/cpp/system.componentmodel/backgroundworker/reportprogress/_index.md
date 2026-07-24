---
title: "System::ComponentModel::BackgroundWorker::ReportProgress طريقة"
linktitle: "ReportProgress"
second_title: "Aspose.Page لـ C++"
description: "System::ComponentModel::BackgroundWorker::ReportProgress طريقة. يرفع حدث System::ComponentModel::BackgroundWorker::ProgressChanged في C++."
type: docs
weight: 400
url: /ar/cpp/system.componentmodel/backgroundworker/reportprogress/
---
## BackgroundWorker::ReportProgress(int) method


يُطلق حدث **System::ComponentModel::BackgroundWorker::ProgressChanged**.

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| percentProgress | int | النسبة المئوية، من 0 إلى 100، للعملية الخلفية التي اكتملت. |

## انظر أيضًا

* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## BackgroundWorker::ReportProgress(int, const System::SharedPtr\<System::Object\>\&) method


يُطلق حدث **System::ComponentModel::BackgroundWorker::ProgressChanged** مع كائن userState.

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress, const System::SharedPtr<System::Object> &userState)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| percentProgress | int | النسبة المئوية، من 0 إلى 100، للعملية الخلفية التي اكتملت. |
| userState | const System::SharedPtr\<System::Object\>\& | كائن الحالة الممرّر إلى System::ComponentModel::BackgroundWorker::RunWorkerAsync(System::Object). |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
