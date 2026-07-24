---
title: "System::Net::WebRequest::EndGetRequestStream 메서드"
linktitle: "EndGetRequestStream"
second_title: "C++용 Aspose.Page"
description: "System::Net::WebRequest::EndGetRequestStream 메서드. C++에서 스트림을 가져오는 지정된 비동기 작업이 완료될 때까지 대기합니다."
type: docs
weight: 1200
url: /ko/cpp/system.net/webrequest/endgetrequeststream/
---
## WebRequest::EndGetRequestStream method


지정된 스트림을 가져오는 비동기 작업이 완료될 때까지 기다립니다.

```cpp
virtual System::SharedPtr<IO::Stream> System::Net::WebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult)=0
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 스트림을 가져오는 비동기 작업을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체. |

### ReturnValue

리소스에 데이터를 쓰기 위한 스트림.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [WebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
