---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs 생성자"
linktitle: "InvokeCompletedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs 생성자. C++에서 새 인스턴스를 생성합니다."
type: docs
weight: 100
url: /ko/cpp/system.web.services.protocols/invokecompletedeventargs/invokecompletedeventargs/
---
## InvokeCompletedEventArgs::InvokeCompletedEventArgs constructor


새 인스턴스를 생성합니다.

```cpp
System::Web::Services::Protocols::InvokeCompletedEventArgs::InvokeCompletedEventArgs(Exception error, bool cancelled, System::SharedPtr<Object> userState, System::ArrayPtr<System::SharedPtr<Object>> results)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 오류 | Exception | 비동기 작업 중에 발생한 모든 오류. |
| 취소됨 | bool | 비동기 작업이 취소되었는지 여부를 나타내는 값. |
| userState | System::SharedPtr\<Object\> | 옵션인 사용자 제공 상태 객체를 [System.ComponentModel.BackgroundWorker.RunWorkerAsync](../../../system.componentmodel/backgroundworker/runworkerasync/)([System.Object](../../../system/object/)) 메서드에 전달합니다. |
| 결과 | System::ArrayPtr\<System::SharedPtr\<Object\>\> | 비동기 작업 결과의 컬렉션. |

## 또 보기

* Typedef [Exception](../../../system/exception/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [InvokeCompletedEventArgs](../)
* Namespace [System::Web::Services::Protocols](../../)
* Library [Aspose.Page for C++](../../../)
