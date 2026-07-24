---
title: "System::Net::Http::HttpResponseMessage 클래스"
linktitle: "HttpResponseMessage"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpResponseMessage 클래스. HTTP 응답 메시지를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system.net.http/httpresponsemessage/
---
## HttpResponseMessage class


HTTP 응답 메시지를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpResponseMessage : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() override | 현재 인스턴스를 해제합니다. 이 메서드는 HTTP 응답의 콘텐츠도 해제합니다. |
| [EnsureSuccessStatusCode](./ensuresuccessstatuscode/)() | 상태 코드를 확인합니다. 상태 코드가 2xx 범위에 속하지 않으면 [HttpRequestException](../httprequestexception/)이 발생합니다. |
| [get_Content](./get_content/)() const | HTTP 응답의 콘텐츠를 가져옵니다. |
| [get_Headers](./get_headers/)() const | HTTP 콘텐츠 헤더를 반환합니다. |
| [get_IsSuccessStatusCode](./get_issuccessstatuscode/)() const | 상태 코드가 클라이언트가 요청한 작업이 수신되고, 이해되었으며, 승인되었음을 나타내는지 확인합니다. |
| [get_ReasonPhrase](./get_reasonphrase/)() const | 서버가 상태 코드와 함께 전송하는 Reason-Phrase를 가져옵니다. |
| [get_RequestMessage](./get_requestmessage/)() const | HTTP 요청 메시지를 가져옵니다. |
| [get_StatusCode](./get_statuscode/)() const | HTTP 상태 코드를 가져옵니다. |
| [get_Version](./get_version/)() const | RTTI 정보. |
| [HttpResponseMessage](./httpresponsemessage/)() | 새 인스턴스를 생성합니다. |
| [HttpResponseMessage](./httpresponsemessage/)(HttpStatusCode) | 새 인스턴스를 생성합니다. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP 응답의 콘텐츠를 설정합니다. |
| [set_ReasonPhrase](./set_reasonphrase/)(String) | 서버가 상태 코드와 함께 전송하는 Reason-Phrase를 설정합니다. |
| [set_RequestMessage](./set_requestmessage/)(System::SharedPtr\<HttpRequestMessage\>) | HTTP 요청 메시지를 설정합니다. |
| [set_StatusCode](./set_statuscode/)(HttpStatusCode) | HTTP 상태 코드를 설정합니다. |
| [set_Version](./set_version/)(System::Version) | HTTP 버전을 설정합니다. |
| [ToString](./tostring/)() const override | [System::Object::ToString](../../system/object/tostring/). |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
