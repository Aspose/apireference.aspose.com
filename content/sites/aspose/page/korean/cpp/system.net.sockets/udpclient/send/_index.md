---
title: "System::Net::Sockets::UdpClient::Send 메서드"
linktitle: "전송"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::UdpClient::Send 메서드. C++에서 UDP 데이터그램을 원격 호스트로 전송합니다."
type: docs
weight: 700
url: /ko/cpp/system.net.sockets/udpclient/send/
---
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t) method


원격 호스트에 UDP 데이터그램을 보냅니다.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 전송할 [Byte](../../../system/byte/) 유형의 배열. |
| 바이트 | int32_t | 데이터그램의 바이트 수. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, String, int32_t) method


지정된 원격 호스트의 지정된 포트에 UDP 데이터그램을 보냅니다.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, String hostname, int32_t port)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 전송할 [Byte](../../../system/byte/) 유형의 배열 |
| 바이트 | int32_t | 데이터그램의 바이트 수. |
| 호스트명 | String | 원격 호스트의 이름. |
| 포트 | int32_t | 원격 포트 번호. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Send(System::ArrayPtr\<uint8_t\>, int32_t, System::SharedPtr\<IPEndPoint\>) method


원격 엔드포인트의 호스트에 UDP 데이터그램을 보냅니다.

```cpp
int32_t System::Net::Sockets::UdpClient::Send(System::ArrayPtr<uint8_t> dgram, int32_t bytes, System::SharedPtr<IPEndPoint> endPoint)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| dgram | System::ArrayPtr\<uint8_t\> | 전송할 [Byte](../../../system/byte/) 유형의 배열 |
| 바이트 | int32_t | 데이터그램의 바이트 수. |
| endPoint | System::SharedPtr\<IPEndPoint\> | 데이터그램을 전송할 호스트와 포트를 나타내는 [IPEndPoint](../../../system.net/ipendpoint/)입니다. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
