---
title: "System::Web::HttpUtility sınıfı"
linktitle: "HttpUtility"
second_title: "Aspose.Font için C++"
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
| static [UrlDecode](./urldecode/)(String) | Bir dizeden URI fragmentini çözer. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Bir dizeden URI fragmentini çözer. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Bayt dizisinden URI fragmentini çözer. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Bayt dizisinden URI fragmentini çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Bayt dizisinden URI fragmentini çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Bayt dizesinden URI fragmentini çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Bir dizeden URI fragmentini çözer. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Bayt dizisinden URI fragmentini çözer. |
| static [UrlEncode](./urlencode/)(String) | URI fragmentini kodlar. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | URI fragmentini kodlar. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | URI fragmentini kodlar. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI fragmentini kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | URI fragmentini kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | URI fragmentini kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | URI fragmentini kodlar. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI fragmentini kodlar. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Unicode kullanarak URI fragmentini kodlar. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Unicode kullanarak URI fragmentini kodlar. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Font for C++](../../)
