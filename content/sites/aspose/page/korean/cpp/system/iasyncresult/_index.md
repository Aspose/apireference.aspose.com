---
title: "System::IAsyncResult 클래스"
linktitle: "IAsyncResult"
second_title: "C++용 Aspose.Page"
description: "System::IAsyncResult 클래스. 비동기 작업의 상태를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용해 C++ 함수에 인수로 전달하세요."
type: docs
weight: 3100
url: /ko/cpp/system/iasyncresult/
---
## IAsyncResult class


비동기 작업의 상태를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 래핑하고 해당 포인터를 사용해 함수에 인수로 전달하세요.

```cpp
class IAsyncResult : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_AsyncState](./get_asyncstate/)() | 비동기 작업에 대한 정보를 포함하는 객체를 반환합니다. |
| virtual [get_AsyncWaitHandle](./get_asyncwaithandle/)() | 비동기 작업이 완료될 때까지 대기하는 데 사용할 수 있는 WaitHandle 인스턴스를 반환합니다. |
| virtual [get_CompletedSynchronously](./get_completedsynchronously/)() | 비동기 작업이 동기적으로 완료되었는지 여부를 나타내는 값을 반환합니다. |
| virtual [get_IsCompleted](./get_iscompleted/)() | 비동기 작업이 완료되었는지 여부를 나타내는 값을 반환합니다. |
| virtual [~IAsyncResult](./~iasyncresult/)() | 소멸자. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [smart_ptr](./smart_ptr/) | [IAsyncResult](./)에 대한 공유 포인터. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
