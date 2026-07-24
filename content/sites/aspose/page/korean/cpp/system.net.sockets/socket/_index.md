---
title: "System::Net::Sockets::Socket class"
linktitle: "Socket"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket class. Socket 클래스는 C++에서 Berkeley 소켓 인터페이스를 구현합니다."
type: docs
weight: 400
url: /ko/cpp/system.net.sockets/socket/
---
## Socket class


그 [Socket](./) 클래스는 Berkeley 소켓 인터페이스를 구현합니다.

```cpp
class Socket : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Accept](./accept/)() | 새로 생성된 연결을 위해 새로운 소켓을 생성합니다. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<EndPoint\>, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [BeginConnect](./beginconnect/)(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [BeginConnect](./beginconnect/)(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [BeginConnect](./beginconnect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 연결 작업을 시작합니다. |
| [BeginReceive](./beginreceive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 쓰기 작업을 시작합니다. |
| [BeginSend](./beginsend/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, AsyncCallback, System::SharedPtr\<Object\>) | 비동기 전송 작업을 시작합니다. |
| [Bind](./bind/)(System::SharedPtr\<EndPoint\>) | 소켓을 지정된 로컬 엔드포인트에 바인딩합니다. |
| [Close](./close/)() | 소켓 연결을 종료합니다. |
| [Close](./close/)(int) | 대기 중인 데이터를 전송할 수 있도록 지정된 시간 제한으로 소켓 연결을 종료합니다. |
| [Connect](./connect/)(System::SharedPtr\<EndPoint\>) | 지정된 원격 엔드포인트에 연결을 설정합니다. |
| [Connect](./connect/)(System::SharedPtr\<IPAddress\>, int32_t) | 지정된 원격 엔드포인트에 연결을 설정합니다. |
| [Connect](./connect/)(String, int32_t) | 지정된 원격 엔드포인트에 연결을 설정합니다. |
| [Connect](./connect/)(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t) | 지정된 원격 엔드포인트에 연결을 설정합니다. |
| [Dispose](./dispose/)() override | 아무 작업도 수행하지 않습니다. |
| [EndConnect](./endconnect/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 연결 작업이 완료될 때까지 기다립니다. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 수신 작업이 완료될 때까지 기다립니다. |
| [EndReceive](./endreceive/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | 지정된 비동기 수신 작업이 완료될 때까지 기다립니다. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>) | 지정된 비동기 전송 작업이 완료될 때까지 기다립니다. |
| [EndSend](./endsend/)(System::SharedPtr\<IAsyncResult\>, SocketError\&) | 지정된 비동기 전송 작업이 완료될 때까지 기다립니다. |
| [get_AddressFamily](./get_addressfamily/)() | 주소 패밀리를 반환합니다. |
| [get_Available](./get_available/)() | 네트워크에서 수신된 바이트 수와 읽을 수 있는 바이트 수를 가져옵니다. |
| [get_Blocking](./get_blocking/)() | 소켓이 블로킹 모드인지 여부를 나타내는 값을 가져옵니다. |
| [get_Connected](./get_connected/)() | 소켓이 원격 호스트에 연결되어 있는지 여부를 나타내는 값을 반환합니다. |
| [get_DontFragment](./get_dontfragment/)() | 소켓이 IP 데이터그램을 조각화하도록 허용하는지 여부를 나타내는 값을 가져옵니다. |
| [get_DualMode](./get_dualmode/)() | 소켓이 듀얼 모드인지 여부를 나타내는 값을 가져옵니다. |
| [get_EnableBroadcast](./get_enablebroadcast/)() | 소켓이 브로드캐스트 패킷을 허용하는지 여부를 나타내는 값을 가져옵니다. |
| [get_ExclusiveAddressUse](./get_exclusiveaddressuse/)() | 소켓을 포트에 바인드할 수 있는 프로세스가 하나만 가능한지 여부를 나타내는 값을 가져옵니다. |
| [get_IsBound](./get_isbound/)() | 소켓이 특정 로컬 포트에 바인드되어 있는지 여부를 나타내는 값을 반환합니다. |
| [get_LingerState](./get_lingerstate/)() | 소켓이 모든 보류 중인 데이터를 전송하려고 닫기를 지연시킬지 여부를 나타내는 값을 가져옵니다. |
| [get_LocalEndPoint](./get_localendpoint/)() | 로컬 엔드포인트를 반환합니다. |
| [get_MulticastLoopback](./get_multicastloopback/)() | 소켓이 송신 멀티캐스트 패킷을 수신하는지 여부를 나타내는 값을 가져옵니다. |
| [get_NoDelay](./get_nodelay/)() | 소켓이 Nagle 알고리즘을 사용하는지 여부를 나타내는 값을 가져옵니다. |
| static [get_OSSupportsIPv4](./get_ossupportsipv4/)() | 운영 체제와 네트워크 어댑터가 IPv4를 지원하는지 여부를 나타내는 값을 반환합니다. |
| static [get_OSSupportsIPv6](./get_ossupportsipv6/)() | 운영 체제와 네트워크 어댑터가 IPv6를 지원하는지 여부를 나타내는 값을 반환합니다. |
| [get_ProtocolType](./get_protocoltype/)() | 프로토콜 유형을 반환합니다. |
| [get_ReceiveBufferSize](./get_receivebuffersize/)() | 수신 버퍼 크기를 가져옵니다. |
| [get_ReceiveTimeout](./get_receivetimeout/)() | 'Receive' 호출이 시간 초과될 때까지의 기간을 가져옵니다. |
| [get_RemoteEndPoint](./get_remoteendpoint/)() | 원격 엔드포인트를 반환합니다. |
| [get_SendBufferSize](./get_sendbuffersize/)() | 전송 버퍼 크기를 가져옵니다. |
| [get_SendTimeout](./get_sendtimeout/)() | 'Send' 호출이 시간 초과될 때까지의 기간을 가져옵니다. |
| [get_SocketType](./get_sockettype/)() | 소켓 유형을 반환합니다. |
| static [get_SupportsIPv4](./get_supportsipv4/)() | RTTI 정보. |
| [get_Ttl](./get_ttl/)() | TTL 값을 가져옵니다. |
| [GetImpl](./getimpl/)() const | 구현에 대한 포인터를 반환합니다. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName) | 지정된 옵션 이름에 해당하는 값을 반환합니다. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | 지정된 옵션 이름에 해당하는 값을 가져옵니다. |
| [GetSocketOption](./getsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | 지정된 옵션 이름에 해당하는 값을 반환합니다. |
| [IOControl](./iocontrol/)(int32_t, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 소켓에 대한 저수준 운영 모드를 설정합니다. |
| [IOControl](./iocontrol/)(IOControlCode, System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) | 소켓에 대한 저수준 운영 모드를 설정합니다. |
| [Listen](./listen/)(int32_t) | 소켓 상태를 'listen'으로 변경합니다. |
| [Poll](./poll/)(int32_t, SelectMode) | 지정된 폴링 모드에 따라 소켓의 상태를 반환합니다. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | 소켓에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | 소켓에서 데이터를 수신하고 지정된 바이트 배열들에 기록합니다. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | 소켓에서 데이터를 수신하고 지정된 바이트 배열들에 기록합니다. |
| [Receive](./receive/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | 소켓에서 데이터를 수신하고 지정된 바이트 배열들에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveFrom](./receivefrom/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [ReceiveMessageFrom](./receivemessagefrom/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags\&, System::SharedPtr\<EndPoint\>\&, IPPacketInformation\&) | 지정된 엔드포인트에서 데이터를 수신하고 지정된 바이트 배열에 기록합니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::SharedPtr\<Collections::Generic::IList\<ArraySegment\<uint8_t\>\>\>, SocketFlags, SocketError\&) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, SocketError\&) | 지정된 데이터를 소켓으로 전송합니다. |
| [Send](./send/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, SocketError\&) | 지정된 데이터를 소켓으로 전송합니다. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, int32_t, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, SocketFlags, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::ArrayPtr\<uint8_t\>, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::ArrayView\<uint8_t\>, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [SendTo](./sendto/)(System::Details::StackArray\<uint8_t, N\>\&, System::SharedPtr\<EndPoint\>) | 지정된 데이터를 지정된 엔드포인트로 전송합니다. |
| [set_Blocking](./set_blocking/)(bool) | 소켓이 차단 모드인지 여부를 나타내는 값을 설정합니다. |
| [set_ConnectionTimeout](./set_connectiontimeout/)(int32_t) | 연결 제한 시간을 설정합니다. |
| [set_DontFragment](./set_dontfragment/)(bool) | 소켓이 IP 데이터그램을 조각화하도록 허용하는지 여부를 나타내는 값을 설정합니다. |
| [set_DualMode](./set_dualmode/)(bool) | 소켓이 듀얼 모드인지 여부를 나타내는 값을 설정합니다. |
| [set_EnableBroadcast](./set_enablebroadcast/)(bool) | 소켓이 브로드캐스트 패킷을 허용하는지 여부를 나타내는 값을 설정합니다. |
| [set_ExclusiveAddressUse](./set_exclusiveaddressuse/)(bool) | 하나의 프로세스만 소켓을 포트에 바인드할 수 있는지 여부를 나타내는 값을 설정합니다. |
| [set_LingerState](./set_lingerstate/)(System::SharedPtr\<LingerOption\>) | 소켓이 모든 보류 중인 데이터를 전송하려고 닫기를 지연시킬지 여부를 나타내는 값을 설정합니다. |
| [set_MulticastLoopback](./set_multicastloopback/)(bool) | 소켓이 송신 멀티캐스트 패킷을 수신하는지 여부를 나타내는 값을 설정합니다. |
| [set_NoDelay](./set_nodelay/)(bool) | 소켓이 Nagle 알고리즘을 사용하는지 여부를 나타내는 값을 설정합니다. |
| [set_ReceiveBufferSize](./set_receivebuffersize/)(int32_t) | 수신 버퍼 크기를 설정합니다. |
| [set_ReceiveTimeout](./set_receivetimeout/)(int32_t) | 'Receive' 호출이 시간 초과되는 기간을 설정합니다. |
| [set_SendBufferSize](./set_sendbuffersize/)(int32_t) | 전송 버퍼 크기를 설정합니다. |
| [set_SendTimeout](./set_sendtimeout/)(int32_t) | 'Send' 호출이 시간 초과되는 기간을 설정합니다. |
| [set_Ttl](./set_ttl/)(int16_t) | TTL 값을 설정합니다. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, int32_t) | 지정된 소켓 옵션을 지정된 값으로 설정합니다. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::ArrayPtr\<uint8_t\>) | 지정된 소켓 옵션을 지정된 값으로 설정합니다. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, bool) | 지정된 소켓 옵션을 지정된 값으로 설정합니다. |
| [SetSocketOption](./setsocketoption/)(SocketOptionLevel, SocketOptionName, System::SharedPtr\<Object\>) | 지정된 소켓 옵션을 지정된 값으로 설정합니다. |
| [Shutdown](./shutdown/)(SocketShutdown) | 소켓의 송수신 작업을 비활성화합니다. |
| [Socket](./socket/)(System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | 새 인스턴스를 생성합니다. |
| [Socket](./socket/)(System::Net::Sockets::AddressFamily, System::Net::Sockets::SocketType, System::Net::Sockets::ProtocolType) | 새 인스턴스를 생성합니다. |
| virtual [~Socket](./~socket/)() | 현재 인스턴스를 소멸시킵니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ImplPtr](./implptr/) | 소켓 구현입니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
