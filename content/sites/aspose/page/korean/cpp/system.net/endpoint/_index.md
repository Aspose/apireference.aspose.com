---
title: "System::Net::EndPoint 클래스"
linktitle: "EndPoint"
second_title: "C++용 Aspose.Page"
description: "System::Net::EndPoint 클래스. 이 추상 클래스는 네트워크 주소를 포함합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달하도록 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system.net/endpoint/
---
## EndPoint class


이 추상 클래스는 네트워크 주소를 포함합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인자로 전달하도록 사용하십시오.

```cpp
class EndPoint : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [Create](./create/)(System::SharedPtr\<SocketAddress\>) | 지정된 소켓 주소를 사용하여 [EndPoint](./) 클래스의 새 인스턴스를 생성합니다. |
| virtual [get_AddressFamily](./get_addressfamily/)() | RTTI 정보. |
| virtual [GetImpl](./getimpl/)() const | 구현에 대한 포인터를 반환합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ImplPtr](./implptr/) | 구현에 대한 포인터입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
