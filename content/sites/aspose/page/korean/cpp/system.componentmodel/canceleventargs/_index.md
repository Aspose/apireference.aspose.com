---
title: "System::ComponentModel::CancelEventArgs 클래스"
linktitle: "CancelEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::CancelEventArgs 클래스. 취소 가능한 이벤트의 인수. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 300
url: /ko/cpp/system.componentmodel/canceleventargs/
---
## CancelEventArgs class


취소 가능한 이벤트의 인수. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class CancelEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CancelEventArgs](./canceleventargs/)(bool) | RTTI 정보. |
| [CancelEventArgs](./canceleventargs/)() | 생성자; Cancel 속성을 false로 설정합니다. |
| [get_Cancel](./get_cancel/)() | 이벤트를 취소해야 하는지 여부를 나타내는 값을 가져옵니다. |
| [set_Cancel](./set_cancel/)(bool) | 이벤트를 취소해야 하는지 여부를 나타내는 값을 설정합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
