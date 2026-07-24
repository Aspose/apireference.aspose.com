---
title: "System::Net::FileWebRequest::EndGetRequestStream 메서드"
linktitle: "EndGetRequestStream"
second_title: "C++용 Aspose.Page"
description: "System::Net::FileWebRequest::EndGetRequestStream 메서드. C++에서 지정된 스트림 획득 비동기 작업이 완료될 때까지 대기합니다."
type: docs
weight: 500
url: /ko/cpp/system.net/filewebrequest/endgetrequeststream/
---
## FileWebRequest::EndGetRequestStream method


지정된 스트림을 가져오는 비동기 작업이 완료될 때까지 기다립니다.

```cpp
System::SharedPtr<IO::Stream> System::Net::FileWebRequest::EndGetRequestStream(System::SharedPtr<IAsyncResult> asyncResult) override
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
* Class [FileWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
