---
title: "System::Net::IPAddress 클래스"
linktitle: "IPAddress"
second_title: "C++용 Aspose.Page"
description: "System::Net::IPAddress 클래스. IP 주소를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 2400
url: /ko/cpp/system.net/ipaddress/
---
## IPAddress class


IP 주소를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
class IPAddress : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# [Object.Equals](../../system/object/equals/) 의미에 따라 객체를 비교합니다. |
| [get_AddressFamily](./get_addressfamily/)() | 주소 패밀리를 반환합니다. |
| [get_IsIPv4MappedToIPv6](./get_isipv4mappedtoipv6/)() | 주소가 IPv4 주소이며 IPv6 주소에 매핑되는지 여부를 나타내는 값을 반환합니다. |
| [get_IsIPv6LinkLocal](./get_isipv6linklocal/)() | 주소가 IPv6 링크 로컬 주소인지 여부를 나타내는 값을 반환합니다. |
| [get_IsIPv6Multicast](./get_isipv6multicast/)() | 주소가 전역 IPv6 멀티캐스트 주소인지 여부를 나타내는 값을 반환합니다. |
| [get_IsIPv6SiteLocal](./get_isipv6sitelocal/)() | 주소가 IPv6 사이트 로컬 주소인지 여부를 나타내는 값을 반환합니다. |
| [get_IsIPv6Teredo](./get_isipv6teredo/)() | 주소가 IPv6 Teredo 주소인지 여부를 나타내는 값을 반환합니다. |
| [get_ScopeId](./get_scopeid/)() | IPv6 주소의 스코프 식별자를 가져옵니다. |
| [GetAddressBytes](./getaddressbytes/)() | IP 주소의 바이트 배열을 반환합니다. |
| [GetHashCode](./gethashcode/)() const override | C# [Object.GetHashCode()](../../system/object/gethashcode/) 메서드와 유사합니다. 사용자 정의 객체의 해싱을 가능하게 합니다. |
| [GetImpl](./getimpl/)() const | 구현에 대한 포인터를 반환합니다. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int64_t) | 지정된 호스트 바이트 순서를 해당 네트워크 바이트 순서로 변환합니다. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int32_t) | 지정된 호스트 바이트 순서를 해당 네트워크 바이트 순서로 변환합니다. |
| static [HostToNetworkOrder](./hosttonetworkorder/)(int16_t) | 지정된 호스트 바이트 순서를 해당 네트워크 바이트 순서로 변환합니다. |
| [IPAddress](./ipaddress/)(int64_t) | 새 인스턴스를 생성합니다. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>, int64_t) | 새 인스턴스를 생성합니다. |
| [IPAddress](./ipaddress/)(System::ArrayPtr\<uint8_t\>) | 새 인스턴스를 생성합니다. |
| [IPAddress](./ipaddress/)() | 새 인스턴스를 생성합니다. |
| static [IsLoopback](./isloopback/)(System::SharedPtr\<IPAddress\>) | 지정된 주소가 루프백 주소인지 여부를 나타내는 값을 반환합니다. |
| [MapToIPv4](./maptoipv4/)() | 주소를 IPv4 주소로 매핑합니다. |
| [MapToIPv6](./maptoipv6/)() | 주소를 IPv6 주소로 매핑합니다. |
| static [NetworkToHostOrder](./networktohostorder/)(int64_t) | 지정된 네트워크 바이트 순서를 해당 호스트 바이트 순서로 변환합니다. |
| static [NetworkToHostOrder](./networktohostorder/)(int32_t) | 지정된 네트워크 바이트 순서를 해당 호스트 바이트 순서로 변환합니다. |
| static [NetworkToHostOrder](./networktohostorder/)(int16_t) | 지정된 네트워크 바이트 순서를 해당 호스트 바이트 순서로 변환합니다. |
| static [Parse](./parse/)(String) | 전달된 문자열을 [IPAddress](./) 클래스의 인스턴스로 변환합니다. |
| [set_ScopeId](./set_scopeid/)(int64_t) | IPv6 주소의 범위 식별자를 설정합니다. |
| [SetImpl](./setimpl/)(ImplPtr) | 구현에 대한 포인터를 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<IPAddress\>\&) | 전달된 문자열을 [IPAddress](./) 클래스의 인스턴스로 변환하려고 시도합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [Any](./any/) | RTTI 정보. |
| static [Broadcast](./broadcast/) | IPv4 브로드캐스트 주소입니다. |
| static [IPv6Any](./ipv6any/) | 서버가 모든 네트워크 인터페이스를 수신해야 함을 나타내는 IPv6 주소입니다. |
| static [IPv6Loopback](./ipv6loopback/) | IPv6 루프백 주소입니다. |
| static [IPv6None](./ipv6none/) | 서버가 어떤 네트워크 인터페이스도 수신하면 안 됨을 나타내는 IPv6 주소입니다. |
| static [Loopback](./loopback/) | IPv4 루프백 주소입니다. |
| static [None](./none/) | 서버가 어떤 네트워크 인터페이스도 수신하면 안 됨을 나타내는 IPv4 주소입니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ImplPtr](./implptr/) | 구현 유형에 대한 포인터입니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
