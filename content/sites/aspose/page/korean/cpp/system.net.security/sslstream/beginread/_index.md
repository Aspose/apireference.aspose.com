---
title: "System::Net::Security::SslStream::BeginRead 메서드"
linktitle: "BeginRead"
second_title: "C++용 Aspose.Page"
description: "System::Net::Security::SslStream::BeginRead 메서드. 비동기 읽기 작업을 시작합니다(C++)."
type: docs
weight: 300
url: /ko/cpp/system.net.security/sslstream/beginread/
---
## SslStream::BeginRead method


비동기 읽기 작업을 시작합니다.

```cpp
System::SharedPtr<IAsyncResult> System::Net::Security::SslStream::BeginRead(System::ArrayPtr<uint8_t> buffer, int32_t offset, int32_t count, AsyncCallback asyncCallback, System::SharedPtr<Object> asyncState) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 데이터를 읽어올 바이트 배열. |
| offset | int32_t | 지정된 배열에서 바이트 단위의 오프셋입니다. |
| count | int32_t | 읽을 바이트 수입니다. |
| asyncCallback | AsyncCallback | 작업이 완료될 때 호출되는 콜백입니다. |
| asyncState | System::SharedPtr\<Object\> | 각 비동기 읽기 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터입니다. |

### ReturnValue

시작된 비동기 읽기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [SslStream](../)
* Namespace [System::Net::Security](../../)
* Library [Aspose.Page for C++](../../../)
