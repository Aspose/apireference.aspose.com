---
title: "System::Net::Http::HttpClient 클래스"
linktitle: "HttpClient"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpClient 클래스. 요청을 보내고 응답을 받기 위한 HTTP 클라이언트의 기본 클래스를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 사용하여 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 200
url: /ko/cpp/system.net.http/httpclient/
---
## HttpClient class


요청을 보내고 응답을 받기 위한 HTTP 클라이언트의 기본 클래스를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 만들거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 사용하여 함수 인수로 전달하십시오.

```cpp
class HttpClient : public System::Net::Http::HttpMessageInvoker
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CancelPendingRequests](./cancelpendingrequests/)() | 모든 대기 중인 요청을 취소합니다. |
| [get_BaseAddress](./get_baseaddress/)() | 요청을 보내는 데 사용되는 리소스의 기본 주소를 가져옵니다. |
| [get_DefaultRequestHeaders](./get_defaultrequestheaders/)() | RTTI 정보. |
| [get_MaxResponseContentBufferSize](./get_maxresponsecontentbuffersize/)() | 응답 콘텐츠의 최대 바이트 수를 가져옵니다. |
| [get_Timeout](./get_timeout/)() | 요청이 시간 초과되기 전에 대기할 시간 간격을 가져옵니다. |
| [HttpClient](./httpclient/)() | 새 인스턴스를 생성합니다. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>) | 새 인스턴스를 생성합니다. |
| [HttpClient](./httpclient/)(System::SharedPtr\<HttpMessageHandler\>, bool) | 새 인스턴스를 생성합니다. |
| [Send](./send/)(System::SharedPtr\<HttpRequestMessage\>, HttpCompletionOption) | 지정된 HTTP 요청을 보냅니다. |
| [set_BaseAddress](./set_baseaddress/)(System::SharedPtr\<Uri\>) | 요청을 보내는 데 사용되는 리소스의 기본 주소를 설정합니다. |
| [set_MaxResponseContentBufferSize](./set_maxresponsecontentbuffersize/)(int64_t) | 응답 콘텐츠의 최대 바이트 수를 설정합니다. |
| [set_Timeout](./set_timeout/)(TimeSpan) | 요청이 시간 초과되기 전에 대기할 시간 간격을 설정합니다. |
## 또 보기

* Class [HttpMessageInvoker](../httpmessageinvoker/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
