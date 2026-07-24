---
title: "System::EventArgs 클래스"
linktitle: "EventArgs"
second_title: "C++용 Aspose.Page"
description: "System::EventArgs 클래스. 이벤트가 발생했을 때 이벤트 구독자에게 전달되는 컨텍스트를 나타내는 클래스들의 기본 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인자로 전달하십시오."
type: docs
weight: 2500
url: /ko/cpp/system/eventargs/
---
## EventArgs class


이 클래스는 이벤트가 발생했을 때 이벤트 구독자에게 전달되는 컨텍스트를 나타내는 클래스들의 기본 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인자로 전달하십시오.

```cpp
class EventArgs : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [EventArgs](./eventargs/)() | 생성자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Empty](./empty/) | 빈 [EventArgs](./) 공유 포인터(널 포인터)를 나타내는 정적 멤버입니다. |
## 또 보기

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
