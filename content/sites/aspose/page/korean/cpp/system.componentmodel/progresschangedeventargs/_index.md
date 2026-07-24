---
title: "System::ComponentModel::ProgressChangedEventArgs 클래스"
linktitle: "ProgressChangedEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::ProgressChangedEventArgs 클래스. 이 클래스의 인스턴스는 ProgressChangedEventHandler 대리자에 인수로 전달됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고 이 포인터를 인수로 함수에 전달하십시오."
type: docs
weight: 1100
url: /ko/cpp/system.componentmodel/progresschangedeventargs/
---
## ProgressChangedEventArgs class


이 클래스의 인스턴스는 ProgressChangedEventHandler 대리자에 인수로 전달됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고 이 포인터를 인수로 함수에 전달하십시오.

```cpp
class ProgressChangedEventArgs : public System::EventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_ProgressPercentage](./get_progresspercentage/)() const | 비동기 작업 진행률 백분율을 가져옵니다. |
| [get_UserState](./get_userstate/)() const | 고유한 사용자 상태를 가져옵니다. |
| [ProgressChangedEventArgs](./progresschangedeventargs/)(int, System::SharedPtr\<System::Object\>) | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [EventArgs](../../system/eventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
