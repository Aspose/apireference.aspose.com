---
title: "System::ComponentModel::BackgroundWorker::ReportProgress メソッド"
linktitle: "ReportProgress"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::BackgroundWorker::ReportProgress メソッド。C++ で System::ComponentModel::BackgroundWorker::ProgressChanged イベントを発生させます。"
type: docs
weight: 400
url: /ja/cpp/system.componentmodel/backgroundworker/reportprogress/
---
## BackgroundWorker::ReportProgress(int) method


**System::ComponentModel::BackgroundWorker::ProgressChanged** イベントを発生させます。

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| percentProgress | int | バックグラウンド操作の完了率（0 から 100 のパーセンテージ）。 |

## 参照

* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## BackgroundWorker::ReportProgress(int, const System::SharedPtr\<System::Object\>\&) method


userState オブジェクトを使用して **System::ComponentModel::BackgroundWorker::ProgressChanged** イベントを発生させます。

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress, const System::SharedPtr<System::Object> &userState)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| percentProgress | int | バックグラウンド操作の完了率（0 から 100 のパーセンテージ）。 |
| userState | const System::SharedPtr\<System::Object\>\& | System::ComponentModel::BackgroundWorker::RunWorkerAsync(System::Object) に渡される状態オブジェクトです。 |

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
