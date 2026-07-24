---
title: "فئة System::Web::HttpUtility"
linktitle: "HttpUtility"
second_title: "Aspose.Page لـ C++"
description: "فئة System::Web::HttpUtility. فئة خدمة تقوم بترميز وفك ترميز أجزاء URL إلى ومن شظايا الهروب السداسي في C++."
type: docs
weight: 300
url: /ar/cpp/system.web/httputility/
---
## HttpUtility class


فئة خدمة تقوم بترميز وفك ترميز أجزاء URL إلى ومن أجزاء الهروب الست عشرية.

```cpp
class HttpUtility : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | يفكّ ترميز شظية HTML. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | يفكّ ترميز شظية HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&) | يُرمّز شظية HTML. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | يُرمّز شظية HTML. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | يُرمّز شظية HTML. |
| static [UrlDecode](./urldecode/)(String) | يفكّ ترميز شظية URI من سلسلة. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | يفكّ ترميز شظية URI من سلسلة. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | يفكّ ترميز شظية URI من مصفوفة بايت. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | يفكّ ترميز شظية URI من مصفوفة بايت. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | يفكّ ترميز شظية URI من مصفوفة بايت. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | يفكّ ترميز شظية URI من سلسلة بايت. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | يفكّ ترميز شظية URI من سلسلة. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يفكّ ترميز شظية URI من مصفوفة بايت. |
| static [UrlEncode](./urlencode/)(String) | يُرمّز شظية URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | يُرمّز شظية URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | يُرمّز شظية URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يُرمّز شظية URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | يُرمّز شظية URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | يُرمّز شظية URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | يُرمّز شظية URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يُرمّز شظية URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | يقوم بترميز جزء URI باستخدام Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | يقوم بترميز جزء URI باستخدام Unicode. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
