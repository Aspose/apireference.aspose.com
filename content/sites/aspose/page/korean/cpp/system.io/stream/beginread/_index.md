---
title: "System::IO::Stream::BeginRead 메서드"
linktitle: "BeginRead"
second_title: "C++용 Aspose.Page"
description: "System::IO::Stream::BeginRead 메서드. C++에서 비동기 읽기 작업을 시작합니다."
type: docs
weight: 100
url: /ko/cpp/system.io/stream/beginread/
---
## Stream::BeginRead method


비동기 읽기 작업을 시작합니다.

```cpp
virtual System::SharedPtr<System::IAsyncResult> System::IO::Stream::BeginRead(System::ArrayPtr<uint8_t> buffer, int offset, int count, System::AsyncCallback callback, System::SharedPtr<System::Object> state)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 버퍼 | System::ArrayPtr\<uint8_t\> | 읽을 버퍼 |
| offset | int | 읽은 데이터를 쓰기 시작할 위치를 나타내는 **buffer** 내의 0 기반 오프셋 |
| count | int | 읽을 바이트 수 |
| 콜백 | System::AsyncCallback | 작업이 완료될 때 호출되는 콜백 |
| 상태 | System::SharedPtr\<System::Object\> | 각 비동기 읽기 작업을 고유하게 식별하기 위해 사용자 제공 데이터 |

### ReturnValue

시작된 비동기 읽기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [Stream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
