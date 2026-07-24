---
title: "System::Net::Sockets::TcpClient::BeginConnect 메서드"
linktitle: "BeginConnect"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::TcpClient::BeginConnect 메서드. C++에서 비동기 연결 작업을 시작합니다."
type: docs
weight: 300
url: /ko/cpp/system.net.sockets/tcpclient/beginconnect/
---
## TcpClient::BeginConnect(String, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


비동기 연결 작업을 시작합니다.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(String host, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| host | String | 원격 호스트 이름. |
| 포트 | int32_t | 원격 호스트의 포트. |
| requestCallback | AsyncCallback | 작업이 완료될 때 호출되는 콜백. |
| 상태 | System::SharedPtr\<Object\> | 각 비동기 연결 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터. |

### ReturnValue

시작된 비동기 연결 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [String](../../../system/string/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::ArrayPtr\<System::SharedPtr\<IPAddress\>\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


비동기 연결 작업을 시작합니다.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::ArrayPtr<System::SharedPtr<IPAddress>> addresses, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| addresses | System::ArrayPtr\<System::SharedPtr\<IPAddress\>\> | 원격 호스트의 IP 주소들. |
| 포트 | int32_t | 원격 호스트의 포트. |
| requestCallback | AsyncCallback | 작업이 완료될 때 호출되는 콜백. |
| 상태 | System::SharedPtr\<Object\> | 각 비동기 연결 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터. |

### ReturnValue

시작된 비동기 연결 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## TcpClient::BeginConnect(System::SharedPtr\<IPAddress\>, int32_t, AsyncCallback, System::SharedPtr\<Object\>) method


비동기 연결 작업을 시작합니다.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpClient::BeginConnect(System::SharedPtr<IPAddress> address, int32_t port, AsyncCallback requestCallback, System::SharedPtr<Object> state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 주소 | System::SharedPtr\<IPAddress\> | 원격 호스트의 IP 주소. |
| 포트 | int32_t | 원격 호스트의 포트. |
| requestCallback | AsyncCallback | 작업이 완료될 때 호출되는 콜백. |
| 상태 | System::SharedPtr\<Object\> | 각 비동기 연결 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터. |

### ReturnValue

시작된 비동기 연결 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [IPAddress](../../../system.net/ipaddress/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpClient](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
