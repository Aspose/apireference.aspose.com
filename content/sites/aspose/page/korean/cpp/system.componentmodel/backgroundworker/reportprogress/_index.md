---
title: "System::ComponentModel::BackgroundWorker::ReportProgress 메서드"
linktitle: "ReportProgress"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::BackgroundWorker::ReportProgress 메서드. C++에서 System::ComponentModel::BackgroundWorker::ProgressChanged 이벤트를 발생시킵니다."
type: docs
weight: 400
url: /ko/cpp/system.componentmodel/backgroundworker/reportprogress/
---
## BackgroundWorker::ReportProgress(int) method


**System::ComponentModel::BackgroundWorker::ProgressChanged** 이벤트를 발생시킵니다.

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| percentProgress | int | 완료된 백그라운드 작업의 백분율(0에서 100 사이)입니다. |

## 또 보기

* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## BackgroundWorker::ReportProgress(int, const System::SharedPtr\<System::Object\>\&) method


userState 객체와 함께 **System::ComponentModel::BackgroundWorker::ProgressChanged** 이벤트를 발생시�니다.

```cpp
void System::ComponentModel::BackgroundWorker::ReportProgress(int percentProgress, const System::SharedPtr<System::Object> &userState)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| percentProgress | int | 완료된 백그라운드 작업의 백분율(0에서 100 사이)입니다. |
| userState | const System::SharedPtr\<System::Object\>\& | System::ComponentModel::BackgroundWorker::RunWorkerAsync(System::Object) 에 전달되는 상태 객체입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [BackgroundWorker](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
