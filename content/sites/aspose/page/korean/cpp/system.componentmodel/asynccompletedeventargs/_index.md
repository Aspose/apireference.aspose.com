---
title: "System::ComponentModel::AsyncCompletedEventArgs 클래스"
linktitle: "AsyncCompletedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::AsyncCompletedEventArgs 클래스. 이 클래스의 인스턴스는 AsyncCompletedEventHandler 대리자에 인수로 전달됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 100
url: /ko/cpp/system.componentmodel/asynccompletedeventargs/
---
## AsyncCompletedEventArgs class


이 클래스의 인스턴스는 AsyncCompletedEventHandler 대리자에 인수로 전달됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
class AsyncCompletedEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)() | 생성자. |
| [AsyncCompletedEventArgs](./asynccompletedeventargs/)(const System::Exception\&, bool, const System::SharedPtr\<System::Object\>\&) | [System.ComponentModel.AsyncCompletedEventArgs](./) 클래스의 새 인스턴스를 초기화합니다. |
| [get_Cancelled](./get_cancelled/)() const | 비동기 작업이 취소되었는지 여부를 나타내는 값을 가져옵니다. 백그라운드 작업이 취소된 경우 true, 그렇지 않으면 false. 기본값은 false입니다. |
| [get_Error](./get_error/)() const | 비동기 작업 중 발생한 오류를 나타내는 값을 가져옵니다. |
| [get_UserState](./get_userstate/)() const | 비동기 작업의 고유 식별자를 가져옵니다. 비동기 작업을 고유하게 식별하는 객체 참조이며, 값이 설정되지 않은 경우 null을 반환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
