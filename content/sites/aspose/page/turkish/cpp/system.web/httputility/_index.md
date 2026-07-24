---
title: "System::Web::HttpUtility sınıfı"
linktitle: "HttpUtility"
second_title: "Aspose.Page için C++"
description: "System::Web::HttpUtility sınıfı. C++'ta URL bölümlerini onaltılık kaçış parçalarına kodlayan ve çözen hizmet sınıfı."
type: docs
weight: 300
url: /tr/cpp/system.web/httputility/
---
## HttpUtility class


URL bölümlerini hex kaçış parçalarına kodlayan ve çözen hizmet sınıfı.

```cpp
class HttpUtility : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | HTML parçacığını çözer. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML parçacığını çözer. |
| static [HtmlEncode](./htmlencode/)(const String\&) | HTML parçacığını kodlar. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | HTML parçacığını kodlar. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML parçacığını kodlar. |
| static [UrlDecode](./urldecode/)(String) | Dizgeden URI parçacığını çözer. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Dizgeden URI parçacığını çözer. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Bayt dizisinden URI parçacığını çözer. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Bayt dizisinden URI parçacığını çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Bayt dizisinden URI parçacığını çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Bayt dizesinden URI parçacığını çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Dizgeden URI parçacığını çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Bayt dizisinden URI parçacığını çözer. |
| static [UrlEncode](./urlencode/)(String) | URI parçacığını kodlar. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | URI parçacığını kodlar. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | URI parçacığını kodlar. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI parçacığını kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | URI parçacığını kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | URI parçacığını kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | URI parçacığını kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI parçacığını kodlar. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | URI parçacığını Unicode kullanarak kodlar. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | URI parçacığını Unicode kullanarak kodlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
