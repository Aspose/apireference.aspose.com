---
title: "System::Net::Http::Headers::HttpContentHeaders 클래스"
linktitle: "HttpContentHeaders"
second_title: "C++용 Aspose.Page"
description: "System::Net::Http::Headers::HttpContentHeaders 클래스. ''Content'' 헤더의 컬렉션을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고 해당 포인터를 C++에서 함수 인수로 전달하도록 사용하십시오."
type: docs
weight: 600
url: /ko/cpp/system.net.http.headers/httpcontentheaders/
---
## HttpContentHeaders class


'Content' 헤더의 컬렉션을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고 해당 포인터를 함수 인수로 전달하도록 사용하십시오.

```cpp
class HttpContentHeaders : public System::Net::Http::Headers::HttpHeaders
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [AddKnownHeaders](./addknownheaders/)(System::SharedPtr\<Collections::Generic::HashSet\<String\>\>) | 알려진 헤더를 지정된 컬렉션에 추가합니다. |
| [get_Allow](./get_allow/)() | RTTI 정보. |
| [get_ContentDisposition](./get_contentdisposition/)() | 'Content-Disposition' 헤더의 값을 가져옵니다. |
| [get_ContentEncoding](./get_contentencoding/)() | 'Content-Encoding' 헤더의 값을 가져옵니다. |
| [get_ContentLanguage](./get_contentlanguage/)() | 'Content-Language' 헤더의 값을 가져옵니다. |
| [get_ContentLength](./get_contentlength/)() | 'Content-Length' 헤더의 값을 가져옵니다. |
| [get_ContentLocation](./get_contentlocation/)() | 'Content-Location' 헤더의 값을 가져옵니다. |
| [get_ContentMD5](./get_contentmd5/)() | 'Content-MD5' 헤더의 값을 가져옵니다. |
| [get_ContentRange](./get_contentrange/)() | 'Content-Range' 헤더의 값을 가져옵니다. |
| [get_ContentType](./get_contenttype/)() | 'Content-Type' 헤더의 값을 가져옵니다. |
| [get_Expires](./get_expires/)() | 'Expires' 헤더의 값을 가져옵니다. |
| [get_LastModified](./get_lastmodified/)() | 'Last-Modified' 헤더의 값을 가져옵니다. |
| [HttpContentHeaders](./httpcontentheaders/)(HeaderFunc\<Nullable\<int64_t\>\>) | 새 인스턴스를 생성합니다. |
| [set_ContentDisposition](./set_contentdisposition/)(System::SharedPtr\<ContentDispositionHeaderValue\>) | 'Content-Disposition' 헤더의 값을 설정합니다. |
| [set_ContentLength](./set_contentlength/)(Nullable\<int64_t\>) | 'Content-Length' 헤더의 값을 설정합니다. |
| [set_ContentLocation](./set_contentlocation/)(System::SharedPtr\<Uri\>) | 'Content-Location' 헤더의 값을 설정합니다. |
| [set_ContentMD5](./set_contentmd5/)(System::ArrayPtr\<uint8_t\>) | 'Content-MD5' 헤더의 값을 설정합니다. |
| [set_ContentRange](./set_contentrange/)(System::SharedPtr\<ContentRangeHeaderValue\>) | 'Content-Range' 헤더의 값을 설정합니다. |
| [set_ContentType](./set_contenttype/)(System::SharedPtr\<MediaTypeHeaderValue\>) | 'Content-Type' 헤더의 값을 설정합니다. |
| [set_Expires](./set_expires/)(Nullable\<DateTimeOffset\>) | 'Expires' 헤더의 값을 설정합니다. |
| [set_LastModified](./set_lastmodified/)(Nullable\<DateTimeOffset\>) | 'Last-Modified' 헤더의 값을 설정합니다. |
## 또 보기

* Class [HttpHeaders](../httpheaders/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
