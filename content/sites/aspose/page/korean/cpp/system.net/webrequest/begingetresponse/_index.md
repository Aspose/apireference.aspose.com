---
title: "System::Net::WebRequest::BeginGetResponse 메서드"
linktitle: "BeginGetResponse"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebRequest::BeginGetResponse 메서드. C++에서 리소스에 대한 비동기 요청을 시작합니다."
type: docs
weight: 1100
url: /ko/cpp/system.net/webrequest/begingetresponse/
---
## WebRequest::BeginGetResponse method


리소스에 대한 비동기 요청을 시작합니다.

```cpp
virtual System::SharedPtr<IAsyncResult> System::Net::WebRequest::BeginGetResponse(AsyncCallback callback, System::SharedPtr<Object> state)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 콜백 | AsyncCallback | 작업이 완료될 때 호출되는 콜백입니다. |
| 상태 | System::SharedPtr\<Object\> | 각 비동기 작업을 고유하게 식별하는 데 사용되는 사용자 제공 데이터입니다. |

### ReturnValue

시작된 비동기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Typedef [AsyncCallback](../../../system/asynccallback/)
* Class [Object](../../../system/object/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
