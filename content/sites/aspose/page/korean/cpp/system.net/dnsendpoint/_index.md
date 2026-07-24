---
title: "System::Net::DnsEndPoint 클래스"
linktitle: "DnsEndPoint"
second_title: "C++용 Aspose.Page"
description: "System::Net::DnsEndPoint 클래스. 애플리케이션이 서비스에 연결하는 데 사용되는 정보를 포함합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하세요."
type: docs
weight: 800
url: /ko/cpp/system.net/dnsendpoint/
---
## DnsEndPoint class


애플리케이션이 서비스에 연결하는 데 사용되는 정보를 포함합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해서 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하세요.

```cpp
class DnsEndPoint : public System::Net::EndPoint
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t) | 새 인스턴스를 생성합니다. |
| [DnsEndPoint](./dnsendpoint/)(String, int32_t, System::Net::Sockets::AddressFamily) | 새 인스턴스를 생성합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI 정보. |
| [get_Host](./get_host/)() | RTTI 정보. |
| [get_Port](./get_port/)() | 포트 번호를 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
