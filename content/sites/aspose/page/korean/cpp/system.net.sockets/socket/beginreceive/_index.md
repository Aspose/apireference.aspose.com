---
title: "System::Net::Sockets::Socket::BeginReceive method"
linktitle: "BeginReceive"
second_title: "C++용 Aspose.Page"
description: "System::Net::Sockets::Socket::BeginReceive method. C++에서 비동기 쓰기 작업을 시작합니다."
type: docs
weight: 800
url: /ko/cpp/system.net.sockets/socket/beginreceive/
---
## Socket::BeginReceive method


비동기 쓰기 작업을 시작합니다.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Sockets::Socket::BeginReceive(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t size, SocketFlags socketFlags, AsyncCallback callback, System::SharedPtr<Object> state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 수신된 데이터가 할당될 버퍼. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| size | int32_t | 지정된 배열에서 'offset' 매개변수부터 시작하는 바이트 수. |
| socketFlags | SocketFlags | 수신 동작. |
| 콜백 | AsyncCallback | 작업이 완료될 때 호출되는 콜백. |
| 상태 | System::SharedPtr\<Object\> | 각 비동기 수신 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터. |

### ReturnValue

시작된 비동기 수신 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Enum [SocketFlags](../../socketflags/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Socket](../)
* Namespace [System::Net::Sockets](../../)
* Library [Aspose.Page for C++](../../../)
