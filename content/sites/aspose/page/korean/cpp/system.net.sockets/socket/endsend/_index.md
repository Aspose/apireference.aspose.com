---
title: "System::Net::Sockets::Socket::EndSend method"
linktitle: "EndSend"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::EndSend method. C++에서 지정된 비동기 전송 작업이 완료될 때까지 대기합니다."
type: docs
weight: 1600
url: /ko/cpp/system.net.sockets/socket/endsend/
---
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>) method


지정된 비동기 전송 작업이 완료될 때까지 기다립니다.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 비동기 전송 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
## Socket::EndSend(System::SharedPtr\<IAsyncResult\>, SocketError\&) method


지정된 비동기 전송 작업이 완료될 때까지 기다립니다.

```cpp
int32_t System::Net::Sockets::Socket::EndSend(System::SharedPtr<IAsyncResult> asyncResult, SocketError &errorCode)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 비동기 전송 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체. |
| errorCode | SocketError\& | 전송 작업이 실패할 때 오류 코드가 할당되는 출력 매개변수. |

### ReturnValue

전송된 바이트 수.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Enum [SocketError](../../socketerror/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
