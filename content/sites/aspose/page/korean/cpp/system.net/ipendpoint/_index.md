---
title: "System::Net::IPEndPoint class"
linktitle: "IPEndPoint"
second_title: "C++용 Aspose.Page"
description: "System::Net::IPEndPoint 클래스. IP 주소와 포트를 포함하는 네트워크 엔드포인트를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 2500
url: /ko/cpp/system.net/ipendpoint/
---
## IPEndPoint class


IP 주소와 포트를 포함하는 네트워크 엔드포인트를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class IPEndPoint : public System::Net::EndPoint
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Create](./create/)(System::SharedPtr\<SocketAddress\>) override | 지정된 소켓 주소를 사용하여 [EndPoint](../endpoint/) 클래스의 새 인스턴스를 생성합니다. |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_Address](./get_address/)() | 엔드포인트 주소를 가져옵니다. |
| [get_AddressFamily](./get_addressfamily/)() override | RTTI 정보. |
| [get_Port](./get_port/)() | 포트 번호를 가져옵니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [GetImpl](./getimpl/)() const override | 구현에 대한 포인터를 반환합니다. |
| [IPEndPoint](./ipendpoint/)(int64_t, int32_t) | 새 인스턴스를 생성합니다. |
| [IPEndPoint](./ipendpoint/)(System::SharedPtr\<IPAddress\>, int32_t) | 새 인스턴스를 생성합니다. |
| [set_Address](./set_address/)(System::SharedPtr\<IPAddress\>) | 엔드포인트 주소를 설정합니다. |
| [set_Port](./set_port/)(int32_t) | 포트 번호를 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Any](./any/) | 모든 IPv4 주소와 모든 포트에 대한 엔드포인트입니다. |
| static [AnyPort](./anyport/) | 어떤 포트든 사용할 수 있는지를 나타내는 값입니다. |
| static [IPv6Any](./ipv6any/) | 모든 IPv6 주소와 모든 포트에 대한 엔드포인트입니다. |
| static [MaxPort](./maxport/) | 최대 포트 번호입니다. |
| static [MinPort](./minport/) | RTTI 정보. |
## 또 보기

* Class [EndPoint](../endpoint/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
