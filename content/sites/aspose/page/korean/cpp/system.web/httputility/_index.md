---
title: "System::Web::HttpUtility 클래스"
linktitle: "HttpUtility"
second_title: "C++용 Aspose.Page"
description: "System::Web::HttpUtility 클래스. C++에서 URL 부분을 16진수 이스케이프 조각으로 인코딩 및 디코딩하는 서비스 클래스."
type: docs
weight: 300
url: /ko/cpp/system.web/httputility/
---
## HttpUtility class


URL 부분을 16진수 이스케이프 조각으로 인코딩 및 디코딩하는 서비스 클래스.

```cpp
class HttpUtility : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | HTML 조각을 디코딩합니다. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML 조각을 디코딩합니다. |
| static [HtmlEncode](./htmlencode/)(const String\&) | HTML 조각을 인코딩합니다. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | HTML 조각을 인코딩합니다. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML 조각을 인코딩합니다. |
| static [UrlDecode](./urldecode/)(String) | 문자열에서 URI 조각을 디코딩합니다. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | 문자열에서 URI 조각을 디코딩합니다. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | 바이트 배열에서 URI 조각을 디코딩합니다. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | 바이트 배열에서 URI 조각을 디코딩합니다. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | 바이트 배열에서 URI 조각을 디코딩합니다. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | 바이트 문자열에서 URI 조각을 디코딩합니다. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | 문자열에서 URI 조각을 디코딩합니다. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 바이트 배열에서 URI 조각을 디코딩합니다. |
| static [UrlEncode](./urlencode/)(String) | URI 조각을 인코딩합니다. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | URI 조각을 인코딩합니다. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | URI 조각을 인코딩합니다. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI 조각을 인코딩합니다. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | URI 조각을 인코딩합니다. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | URI 조각을 인코딩합니다. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | URI 조각을 인코딩합니다. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI 조각을 인코딩합니다. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | URI 조각을 유니코드로 인코딩합니다. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | URI 조각을 유니코드로 인코딩합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
