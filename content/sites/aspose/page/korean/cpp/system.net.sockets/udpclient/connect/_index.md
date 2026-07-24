---
title: "System::Net::Sockets::UdpClient::Connect 메서드"
linktitle: "Connect"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::UdpClient::Connect 메서드. 지정된 호스트의 지정된 포트에 C++에서 연결을 설정합니다."
type: docs
weight: 300
url: /ko/cpp/system.net.sockets/udpclient/connect/
---
## UdpClient::Connect(String, int32_t) method


지정된 호스트의 지정된 포트에 연결을 설정합니다.

```cpp
void System::Net::Sockets::UdpClient::Connect(String hostname, int32_t port)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 호스트명 | String | 연결하려는 원격 DNS 호스트의 이름. |
| 포트 | int32_t | 통신하려는 로컬 포트 번호. |

## 또 보기

* Class [String](../../../system/string/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPAddress\>, int32_t) method


지정된 포트의 지정된 주소에 있는 호스트와 연결을 설정합니다.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPAddress> addr, int32_t port)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| addr | System::SharedPtr\<IPAddress\> | 데이터를 전송할 원격 호스트의 [IPAddress](../../../system.net/ipaddress/)입니다. |
| 포트 | int32_t | 통신하려는 로컬 포트 번호. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## UdpClient::Connect(System::SharedPtr\<IPEndPoint\>) method


원격 엔드포인트에 연결을 설정합니다.

```cpp
void System::Net::Sockets::UdpClient::Connect(System::SharedPtr<IPEndPoint> endPoint)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| endPoint | System::SharedPtr\<IPEndPoint\> | UDP 연결을 바인딩할 엔드포인트입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IPEndPoint](../../../system.net/ipendpoint/)
* Class [UdpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
