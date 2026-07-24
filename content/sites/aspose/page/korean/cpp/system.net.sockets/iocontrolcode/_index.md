---
title: "System::Net::Sockets::IOControlCode 열거형"
linktitle: "IOControlCode"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::IOControlCode 열거형. C++에서 IO 제어 코드를 열거합니다."
type: docs
weight: 900
url: /ko/cpp/system.net.sockets/iocontrolcode/
---
## IOControlCode enum


[IO](../../system.io/) 제어 코드를 열거합니다.

```cpp
enum class IOControlCode : int64_t
```

### 값

| 이름 | 값 | 설명 |
| --- | --- | --- |
| AsyncIO | -2147195267 | 소켓의 비동기 I/O 모드를 활성화하거나 비활성화합니다. |
| NonBlockingIO | -2147195266 | 소켓을 논블로킹으로 표시합니다. |
| DataToRead | 1074030207 | 읽을 수 있는 바이트 수를 반환합니다. |
| OobDataRead | 1074033415 | 수신 대기 중인 out-of-band 데이터에 대한 정보를 반환합니다. |
| AssociateHandle | -2013265919 | 이 소켓을 동반 인터페이스의 지정된 핸들과 연결합니다. |
| EnableCircularQueuing | 671088642 | 수신 메시지 큐가 가득 찼을 때 가장 오래된 대기 중인 데이터그램을 들어오는 데이터그램으로 교체합니다. |
| Flush | 671088644 | 이 소켓과 연결된 전송 큐의 현재 내용을 버립니다. |
| GetBroadcastAddress | 1207959557 | 현재 소켓의 주소 패밀리에 대한 브로드캐스트 주소를 포함하는 SOCKADDR 구조체를 반환합니다. |
| GetExtensionFunctionPointer | -939524090 | 연결된 서비스 제공자가 지원하는 지정된 확장 함수에 대한 포인터를 검색합니다. |
| GetQos | -939524089 | 소켓과 연결된 QOS 구조를 검색합니다. |
| GetGroupQos | -939524088 | 소켓 그룹에 대한 QOS 속성을 반환합니다. |
| MultipointLoopback | -2013265911 | 멀티캐스트 세션에서 로컬 컴퓨터의 애플리케이션이 보낸 데이터(같은 소켓에서 보낸 것이 아닐 수도 있음)가 루프백 인터페이스의 멀티캐스트 대상 그룹에 가입된 소켓에 수신되는지를 제어합니다. |
| MulticastScope | -2013265910 | 라우터가 멀티캐스트 패킷을 전달할 수 있는 횟수(일명 TTL 또는 홉 수)를 제어합니다. |
| SetQos | -2013265909 | 소켓에 대한 QOS 속성을 설정합니다. |
| SetGroupQos | -2013265908 | 소켓 그룹에 대한 QOS 속성을 설정합니다. |
| TranslateHandle | -939524083 | 동반 인터페이스 컨텍스트에서 유효한 소켓 핸들을 반환합니다. |
| RoutingInterfaceQuery | -939524076 | 지정된 원격 주소에 연결하는 데 사용할 수 있는 인터페이스 주소를 반환합니다. |
| RoutingInterfaceChange | -2013265899 | 원격 엔드포인트에 접근하는 데 사용되는 로컬 인터페이스가 변경될 때 알림을 받도록 활성화합니다. |
| AddressListQuery | 1207959574 | 소켓이 바인드할 수 있는 로컬 인터페이스 목록을 반환합니다. |
| AddressListChange | 671088663 | 소켓의 프로토콜 패밀리용 로컬 인터페이스 목록이 변경될 때 알림을 받도록 활성화합니다. |
| QueryTargetPnpHandle | 1207959576 | 기본 제공자의 SOCKET 핸들을 가져옵니다. |
| NamespaceChange | -2013265895 | 네임스페이스 쿼리가 무효가 될 때 소켓이 알림을 받는지 여부를 제어합니다. |
| AddressListSort | -939524071 | 연결을 만들기 위해 사용 가능한 최상의 주소를 결정하기 위해 IPv6 및 IPv4 목적지 주소 목록을 정렬합니다. |
| ReceiveAll | -1744830463 | 네트워크에서 모든 IPv4 패킷을 수신하도록 활성화합니다. |
| ReceiveAllMulticast | -1744830462 | 네트워크에서 모든 멀티캐스트 IPv4 패킷을 수신하도록 활성화합니다. |
| ReceiveAllIgmpMulticast | -1744830461 | 네트워크에서 모든 IGMP 패킷을 수신하도록 활성화합니다. |
| KeepAliveValues | -1744830460 | TCP keep-alive 패킷 전송 및 전송 간격을 제어합니다. |
| AbsorbRouterAlert | -1744830459 | 이 값은 Winsock 2 'SIO_ABSORB_RTRALERT' 상수와 같습니다. |
| UnicastInterface | -1744830458 | 송신 유니캐스트 패킷에 사용되는 인터페이스를 설정합니다. |
| LimitBroadcasts | -1744830457 | 이 값은 Winsock 2 'SIO_LIMIT_BROADCASTS' 상수와 같습니다. |
| BindToInterface | -1744830456 | 소켓을 지정된 인터페이스 인덱스에 바인드합니다. |
| MulticastInterface | -1744830455 | 송신 멀티캐스트 패킷에 사용되는 인터페이스를 설정합니다. |
| AddMulticastGroupOnInterface | -1744830454 | 인덱스로 식별된 인터페이스를 사용하여 멀티캐스트 그룹에 가입합니다. |
| DeleteMulticastGroupFromInterface | -1744830453 | 소켓을 멀티캐스트 그룹에서 제거합니다. |

## 또 보기

* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
