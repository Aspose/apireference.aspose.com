---
title: "System::ComponentModel::BackgroundWorker 클래스"
linktitle: "BackgroundWorker"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::BackgroundWorker 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 200
url: /ko/cpp/system.componentmodel/backgroundworker/
---
## BackgroundWorker class


이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
class BackgroundWorker : public System::ComponentModel::Component
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BackgroundWorker](./backgroundworker/)() | RTTI 정보. |
| [get_WorkerReportsProgress](./get_workerreportsprogress/)() const | 해당 [System::ComponentModel::BackgroundWorker](./)가 진행 상황 업데이트를 보고할 수 있는지 여부를 나타내는 값을 가져옵니다. |
| [ReportProgress](./reportprogress/)(int) | **System::ComponentModel::BackgroundWorker::ProgressChanged** 이벤트를 발생시킵니다. |
| [ReportProgress](./reportprogress/)(int, const System::SharedPtr\<System::Object\>\&) | userState 객체와 함께 **System::ComponentModel::BackgroundWorker::ProgressChanged** 이벤트를 발생시�니다. |
| [RunWorkerAsync](./runworkerasync/)() | 백그라운드 작업의 실행을 시작합니다. |
| [RunWorkerAsync](./runworkerasync/)(const System::SharedPtr\<System::Object\>\&) | 백그라운드 작업의 실행을 시작합니다. |
| [set_WorkerReportsProgress](./set_workerreportsprogress/)(bool) | 해당 [System::ComponentModel::BackgroundWorker](./)가 진행 상황 업데이트를 보고할 수 있는지 여부를 나타내는 값을 설정합니다. |
| [~BackgroundWorker](./~backgroundworker/)() | 소멸자. |
## 또 보기

* Class [Component](../component/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
