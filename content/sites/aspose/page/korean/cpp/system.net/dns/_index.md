---
title: "System::Net::Dns 클래스"
linktitle: "Dns"
second_title: "C++용 Aspose.Page"
description: "System::Net::Dns 클래스. C++에서 DNS를 다루는 메서드를 제공합니다."
type: docs
weight: 700
url: /ko/cpp/system.net/dns/
---
## Dns class


DNS와 작업하기 위한 메서드를 제공합니다.

```cpp
class Dns : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [BeginGetHostAddresses](./begingethostaddresses/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 지정된 호스트 이름 또는 IP 주소를 포함하는 문자열을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성하는 비동기 작업을 시작합니다. |
| static [BeginGetHostByName](./begingethostbyname/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 지정된 호스트 이름을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성하는 비동기 작업을 시작합니다. |
| static [BeginGetHostEntry](./begingethostentry/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 지정된 호스트 이름 또는 IP 주소를 포함하는 문자열을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성하는 비동기 작업을 시작합니다. |
| static [BeginGetHostEntry](./begingethostentry/)(System::SharedPtr\<IPAddress\>, AsyncCallback, System::SharedPtr\<Object\>) | 지정된 IP 주소를 사용하여 새로운 IPHostEntry-class 인스턴스를 생성하는 비동기 작업을 시작합니다. |
| static [BeginResolve](./beginresolve/)(String, AsyncCallback, System::SharedPtr\<Object\>) | 지정된 호스트 이름을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성하는 비동기 작업을 시작합니다. |
| [Dns](./dns/)() | 삭제된 기본 생성자. |
| static [EndGetHostAddresses](./endgethostaddresses/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 작업이 새로운 IPHostEntry-class 인스턴스를 생성할 때까지 대기합니다. |
| static [EndGetHostByName](./endgethostbyname/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 작업이 새로운 IPHostEntry-class 인스턴스를 생성할 때까지 대기합니다. |
| static [EndGetHostEntry](./endgethostentry/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 작업이 새로운 IPHostEntry-class 인스턴스를 생성할 때까지 대기합니다. |
| static [EndResolve](./endresolve/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 작업이 새로운 IPHostEntry-class 인스턴스를 생성할 때까지 대기합니다. |
| static [GetHostAddresses](./gethostaddresses/)(String) | 지정된 호스트 이름 또는 IP 주소에 대한 IP 주소 컬렉션을 반환합니다. |
| static [GetHostByAddress](./gethostbyaddress/)(String) | 지정된 IP 주소의 문자열 표현을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성합니다. |
| static [GetHostByAddress](./gethostbyaddress/)(System::SharedPtr\<IPAddress\>) | 지정된 IP 주소를 사용하여 새로운 IPHostEntry-class 인스턴스를 생성합니다. |
| static [GetHostByName](./gethostbyname/)(String) | RTTI 정보. |
| static [GetHostEntry](./gethostentry/)(String) | 호스트 이름 또는 IP 주소를 포함하는 지정된 문자열을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성합니다. |
| static [GetHostEntry](./gethostentry/)(System::SharedPtr\<IPAddress\>) | 지정된 IP 주소를 사용하여 새로운 IPHostEntry-class 인스턴스를 생성합니다. |
| static [GetHostName](./gethostname/)() | 로컬 머신의 호스트 이름을 반환합니다. |
| static [Resolve](./resolve/)(String) | 지정된 호스트 이름을 사용하여 새로운 IPHostEntry-class 인스턴스를 생성합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
