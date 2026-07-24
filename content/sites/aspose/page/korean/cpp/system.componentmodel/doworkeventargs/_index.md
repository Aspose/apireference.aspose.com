---
title: "System::ComponentModel::DoWorkEventArgs 클래스"
linktitle: "DoWorkEventArgs"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::DoWorkEventArgs 클래스. DoWork 이벤트 인수입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용해 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.componentmodel/doworkeventargs/
---
## DoWorkEventArgs class


DoWork 이벤트 인수입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용해 함수 인수로 전달하십시오.

```cpp
class DoWorkEventArgs : public System::ComponentModel::CancelEventArgs
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DoWorkEventArgs](./doworkeventargs/)(const SharedPtr\<System::Object\>\&) | RTTI 정보. |
| [get_Argument](./get_argument/)() | Argument 속성을 가져옵니다; 구현되지 않음. |
| [get_Result](./get_result/)() | Result 속성을 가져옵니다; 구현되지 않음. |
| [set_Result](./set_result/)(const SharedPtr\<System::Object\>\&) | Result 속성을 설정합니다; 구현되지 않음. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](../../system/eventargs/empty/) | 정적 멤버로, "빈" [EventArgs](../../system/eventargs/) 공유 포인터(null-pointer)를 나타냅니다. |
## 또 보기

* Class [CancelEventArgs](../canceleventargs/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
