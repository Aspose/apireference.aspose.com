---
title: "System::Net::HttpWebResponse 클래스"
linktitle: "HttpWebResponse"
second_title: "C++용 Aspose.Page"
description: "System::Net::HttpWebResponse 클래스. HTTP 웹 응답을 나타냅니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 2100
url: /ko/cpp/system.net/httpwebresponse/
---
## HttpWebResponse class


HTTP 웹 응답을 나타냅니다. 이 클래스의 객체는 반드시 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택이나 operator new를 사용하여 이 유형의 인스턴스를 생성하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class HttpWebResponse : public System::Net::WebResponse
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Close](./close/)() override | 응답 스트림을 닫습니다. |
| [get_CharacterSet](./get_characterset/)() | 구현되지 않음. |
| [get_ContentLength](./get_contentlength/)() override | RTTI 정보. |
| [get_ContentType](./get_contenttype/)() override | 리소스의 MIME 유형을 반환합니다. |
| virtual [get_Cookies](./get_cookies/)() | 웹 응답과 연관된 쿠키를 반환합니다. |
| [get_Headers](./get_headers/)() override | 현재 응답과 연관된 헤더 컬렉션을 반환합니다. |
| virtual [get_Method](./get_method/)() | HTTP 메서드를 반환합니다. |
| [get_ResponseUri](./get_responseuri/)() override | 리소스의 URI를 반환합니다. |
| virtual [get_StatusCode](./get_statuscode/)() | 웹 응답과 연결된 HTTP 상태 코드를 반환합니다. |
| virtual [get_StatusDescription](./get_statusdescription/)() | 상태 코드의 문자열 표현을 반환합니다. |
| [get_SupportsHeaders](./get_supportsheaders/)() override | 현재 응답이 헤더를 지원하는지 여부를 나타내는 값을 반환합니다. |
| [GetResponseHeader](./getresponseheader/)(String) | 지정된 헤더 이름에 해당하는 값을 반환합니다. |
| [GetResponseStream](./getresponsestream/)() override | 응답 스트림을 반환합니다. |
| [HttpWebResponse](./httpwebresponse/)(System::SharedPtr\<Http::HttpResponseMessage\>, System::SharedPtr\<Uri\>, System::SharedPtr\<CookieContainer\>) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [WebResponse](../webresponse/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
