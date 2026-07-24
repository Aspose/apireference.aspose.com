---
title: "System::Net::HttpWebRequest::EndGetResponse 메서드"
linktitle: "EndGetResponse"
second_title: "C++용 Aspose.Page"
description: "System::Net::HttpWebRequest::EndGetResponse 메서드. C++에서 지정된 리소스에 대한 비동기 요청이 완료될 때까지 기다립니다."
type: docs
weight: 700
url: /ko/cpp/system.net/httpwebrequest/endgetresponse/
---
## HttpWebRequest::EndGetResponse method


지정된 리소스에 대한 비동기 요청이 완료될 때까지 기다립니다.

```cpp
System::SharedPtr<WebResponse> System::Net::HttpWebRequest::EndGetResponse(System::SharedPtr<IAsyncResult> asyncResult) override
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| asyncResult | System::SharedPtr\<IAsyncResult\> | 리소스에 대한 비동기 요청을 나타내는 [IAsyncResult](../../../system/iasyncresult/) 객체. |

### ReturnValue

웹 응답.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [WebResponse](../../webresponse/)
* Class [IAsyncResult](../../../system/iasyncresult/)
* Class [HttpWebRequest](../)
* Namespace [System::Net](../../)
* Library [Aspose.Page for C++](../../../)
