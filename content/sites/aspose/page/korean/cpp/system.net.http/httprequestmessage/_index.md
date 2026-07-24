---
title: "System::Net::Http::HttpRequestMessage class"
linktitle: "HttpRequestMessage"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::HttpRequestMessage 클래스. HTTP 요청 메시지를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 800
url: /ko/cpp/system.net.http/httprequestmessage/
---
## HttpRequestMessage class


HTTP 요청 메시지를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpRequestMessage : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dispose](./dispose/)() override | 현재 인스턴스를 해제합니다. 이 메서드는 HTTP 요청의 콘텐츠도 해제합니다. |
| [get_Content](./get_content/)() | HTTP 요청의 콘텐츠를 가져옵니다. |
| [get_Headers](./get_headers/)() | HTTP 콘텐츠 헤더를 반환합니다. |
| [get_Method](./get_method/)() | HTTP 요청 메서드를 가져옵니다. |
| [get_Properties](./get_properties/)() | HTTP 요청 속성들의 컬렉션을 반환합니다. |
| [get_RequestUri](./get_requesturi/)() | 요청된 리소스의 URI를 가져옵니다. |
| [get_Version](./get_version/)() | RTTI 정보. |
| [HttpRequestMessage](./httprequestmessage/)() | 새 인스턴스를 생성합니다. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, System::SharedPtr\<Uri\>) | 새 인스턴스를 생성합니다. |
| [HttpRequestMessage](./httprequestmessage/)(System::SharedPtr\<HttpMethod\>, String) | 새 인스턴스를 생성합니다. |
| [MarkAsSent](./markassent/)() | 현재 요청을 전송된 것으로 표시합니다. |
| [set_Content](./set_content/)(System::SharedPtr\<HttpContent\>) | HTTP 요청의 내용을 설정합니다. |
| [set_Method](./set_method/)(System::SharedPtr\<HttpMethod\>) | HTTP 요청 메서드를 설정합니다. |
| [set_RequestUri](./set_requesturi/)(System::SharedPtr\<Uri\>) | 요청된 리소스의 URI를 설정합니다. |
| [set_Version](./set_version/)(System::Version) | HTTP 버전을 설정합니다. |
| [ToString](./tostring/)() const override | C# [Object.ToString()](../../system/object/tostring/) 메서드의 유사 구현입니다. 사용자 정의 객체를 문자열로 변환할 수 있게 합니다. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
