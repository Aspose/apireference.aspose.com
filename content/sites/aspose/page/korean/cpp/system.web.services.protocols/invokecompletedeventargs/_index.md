---
title: "System::Web::Services::Protocols::InvokeCompletedEventArgs class"
linktitle: "InvokeCompletedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::Web::Services::Protocols::InvokeCompletedEventArgs class. 이 클래스의 인스턴스는 InvokeCompletedEventHandler 대리자에 인수로 전달됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 인수로 함수에 전달하십시오. C++에서."
type: docs
weight: 200
url: /ko/cpp/system.web.services.protocols/invokecompletedeventargs/
---
## InvokeCompletedEventArgs class


이 클래스의 인스턴스는 InvokeCompletedEventHandler 대리자에 인수로 전달됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 타입의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 인수로 함수에 전달하십시오.

```cpp
class InvokeCompletedEventArgs : public System::ComponentModel::AsyncCompletedEventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Results](./get_results/)() | 비동기 작업 결과의 컬렉션을 반환합니다. |
| [InvokeCompletedEventArgs](./invokecompletedeventargs/)(Exception, bool, System::SharedPtr\<Object\>, System::ArrayPtr\<System::SharedPtr\<Object\>\>) | 새 인스턴스를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [AsyncCompletedEventArgs](../../system.componentmodel/asynccompletedeventargs/)
* Namespace [System::Web::Services::Protocols](../)
* Library [Aspose.Page for C++](../../)
