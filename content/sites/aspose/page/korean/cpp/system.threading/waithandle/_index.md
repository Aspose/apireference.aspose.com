---
title: "System::Threading::WaitHandle 클래스"
linktitle: "WaitHandle"
second_title: "C++용 Aspose.Page"
description: "System::Threading::WaitHandle 클래스. 대기 기본 원시 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인자로 전달하는 데 사용하십시오."
type: docs
weight: 1700
url: /ko/cpp/system.threading/waithandle/
---
## WaitHandle class


대기 기본 원시 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인자로 전달하는 데 사용하십시오.

```cpp
class WaitHandle : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Close](./close/)() | 핸들과 연관된 모든 리소스를 해제합니다. |
| [get_Handle](./get_handle/)() | 핸들을 가져옵니다. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | RTTI 정보. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | 모든 핸들이 발생할 때까지 대기합니다. |
| static [WaitAll](./waitall/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | 모든 핸들이 발생할 때까지 대기합니다. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, int) | 핸들 중 하나가 발생할 때까지 대기합니다. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&, TimeSpan) | 핸들 중 하나가 발생할 때까지 대기합니다. |
| static [WaitAny](./waitany/)(const System::ArrayPtr\<System::SharedPtr\<WaitHandle\>\>\&) | 핸들 중 하나가 발생할 때까지 대기합니다. |
| virtual [WaitOne](./waitone/)() | 핸들이 무한 기간 동안 발생하기를 기다립니다. |
| virtual [WaitOne](./waitone/)(int) | 핸들이 발생하기를 기다립니다. |
| virtual [WaitOne](./waitone/)(TimeSpan) | 핸들이 발생하기를 기다립니다. |
| virtual [WaitOne](./waitone/)(int, bool) | 핸들이 발생하기를 기다립니다. |
| virtual [~WaitHandle](./~waithandle/)() | 소멸자. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [WaitTimeout](./waittimeout/) | 함수가 반환할 특수 값이며, 타임아웃이 초과되고 아무 것도 신호를 보내지 않을 경우 배열에서 신호된 객체의 인덱스를 반환합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Threading](../)
* Library [Aspose.Page for C++](../../)
