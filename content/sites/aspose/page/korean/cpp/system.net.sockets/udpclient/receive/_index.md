---
title: "System::Net::Sockets::UdpClient::Receive 메서드"
linktitle: "수신"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::UdpClient::Receive 메서드. C++에서 서버가 보낸 데이터그램을 반환합니다."
type: docs
weight: 600
url: /ko/cpp/system.net.sockets/udpclient/receive/
---
## UdpClient::Receive method


서버가 보낸 데이터그램을 반환합니다.

```cpp
System::ArrayPtr<uint8_t> System::Net::Sockets::UdpClient::Receive(System::SharedPtr<IPEndPoint> &remoteEP)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| remoteEP | System::SharedPtr\<IPEndPoint\>\& | 데이터가 전송된 원격 호스트를 나타내는 [IPEndPoint](../../../system.net/ipendpoint/) |

### ReturnValue

수신된 데이터가 할당될 바이트 배열.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
