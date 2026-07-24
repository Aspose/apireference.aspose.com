---
title: "System::Net::SocketAddress class"
linktitle: "SocketAddress"
second_title: "C++용 Aspose.Page"
description: "System::Net::SocketAddress 클래스. EndPoint 클래스 인스턴스에 대한 직렬화된 정보를 저장하는 데 사용됩니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 3300
url: /ko/cpp/system.net/socketaddress/
---
## SocketAddress class


이 클래스는 [EndPoint](../endpoint/) 클래스 인스턴스에 대한 직렬화된 정보를 저장하는 데 사용됩니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class SocketAddress : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Family](./get_family/)() | RTTI 정보. |
| [get_Size](./get_size/)() | 기본 버퍼 크기를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [idx_get](./idx_get/)(int32_t) | 지정된 인덱스에서 기본 버퍼의 값을 가져옵니다. |
| [idx_set](./idx_set/)(int32_t, uint8_t) | 지정된 인덱스에서 기본 버퍼의 값을 설정합니다. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily) | 새 인스턴스를 생성합니다. |
| [SocketAddress](./socketaddress/)(Sockets::AddressFamily, int32_t) | 새 인스턴스를 생성합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
