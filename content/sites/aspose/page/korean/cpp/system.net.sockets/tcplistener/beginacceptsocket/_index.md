---
title: "System::Net::Sockets::TcpListener::BeginAcceptSocket 메서드"
linktitle: "BeginAcceptSocket"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::TcpListener::BeginAcceptSocket 메서드. C++에서 비동기 수락 작업을 시작합니다."
type: docs
weight: 500
url: /ko/cpp/system.net.sockets/tcplistener/beginacceptsocket/
---
## TcpListener::BeginAcceptSocket method


비동기 수락 작업을 시작합니다.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::TcpListener::BeginAcceptSocket(AsyncCallback callback, System::SharedPtr<Object> state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | AsyncCallback | 작업이 완료될 때 호출되는 콜백. |
| 상태 | System::SharedPtr\<Object\> | 각 비동기 연결 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터. |

### ReturnValue

시작된 비동기 수락 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [TcpListener](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
