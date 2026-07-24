---
title: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs 생성자"
linktitle: "AsyncCompletedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs 생성자. C++에서의 생성자."
type: docs
weight: 100
url: /ko/cpp/system.componentmodel/asynccompletedeventargs/asynccompletedeventargs/
---
## AsyncCompletedEventArgs::AsyncCompletedEventArgs() constructor


생성자.

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs()
```

## 또 보기

* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
## AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) constructor


새 인스턴스를 초기화합니다 [System.ComponentModel.AsyncCompletedEventArgs](../) 클래스.

```cpp
System::ComponentModel::AsyncCompletedEventArgs::AsyncCompletedEventArgs(const System::Exception &error, bool canceled, const System::SharedPtr<System::Object> &userState)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 오류 | const System::Exception\& | 비동기 작업 중에 발생한 모든 오류. |
| 취소됨 | bool | 비동기 작업이 취소되었는지 여부를 나타내는 값. |
| userState | const System::SharedPtr\<System::Object\>\& | 선택적 사용자 제공 상태 객체로, [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) 메서드에 전달됩니다. |

## 또 보기

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [AsyncCompletedEventArgs](../)
* Namespace [System::ComponentModel](../../)
* Library [Aspose.Page for C++](../../../)
