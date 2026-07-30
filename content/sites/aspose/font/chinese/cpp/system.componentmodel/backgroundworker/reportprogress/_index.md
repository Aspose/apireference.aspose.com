---
title: "System::ComponentModel::BackgroundWorker::ReportProgress method"
linktitle: "ReportProgress"
second_title: "Aspose.Font 适用于 C++"
description: "System::ComponentModel::BackgroundWorker::ReportProgress method. 在 C++ 中引发 System::ComponentModel::BackgroundWorker::ProgressChanged 事件。"
type: docs
weight: 400
url: /zh/cpp/system.componentmodel/backgroundworker/reportprogress/
---
## BackgroundWorker::ReportProgress(int) method


引发 **System::ComponentModel::BackgroundWorker::ProgressChanged** 事件。

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| percentProgress | int | 后台操作已完成的百分比，范围从 0 到 100。 |

## 另见

* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
## BackgroundWorker::ReportProgress(int, const System::SharedPtr\<System::Object\>\&) method


使用 userState 对象引发 **System::ComponentModel::BackgroundWorker::ProgressChanged** 事件。

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress, const System::SharedPtr<System::Object> &userState)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| percentProgress | int | 后台操作已完成的百分比，范围从 0 到 100。 |
| userState | const System::SharedPtr\<System::Object\>\& | 传递给 System::ComponentModel::BackgroundWorker::RunWorkerAsync(System::Object) 的状态对象。 |

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Font for C++](../../../)
