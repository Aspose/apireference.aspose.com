---
title: "فئة System::Web::HttpUtility"
linktitle: "HttpUtility"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Web::HttpUtility. فئة خدمة تقوم بترميز وفك ترميز أجزاء URL إلى ومن أجزاء هروب سداسية عشرية في C++."
type: docs
weight: 300
url: /ar/cpp/system.web/httputility/
---
## HttpUtility class


فئة خدمة تقوم بترميز وفك ترميز أجزاء URL إلى ومن شظايا الهروب الست عشرية.

```cpp
class HttpUtility : public System::Object
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | يفك ترميز مقطع Html. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | يفك ترميز مقطع Html. |
| static [HtmlEncode](./htmlencode/)(const String\&) | يقوم بترميز مقطع Html. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | يقوم بترميز مقطع Html. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | يقوم بترميز مقطع Html. |
| static [UrlDecode](./urldecode/)(String) | يفك ترميز مقطع URI من سلسلة. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | يفك ترميز مقطع URI من سلسلة. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | يفك تشفير جزء URI من مصفوفة البايتات. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | يفك تشفير جزء URI من مصفوفة البايتات. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | يفك تشفير جزء URI من مصفوفة البايتات. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | يفك تشفير جزء URI من سلسلة البايتات. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | يفك ترميز مقطع URI من سلسلة. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يفك تشفير جزء URI من مصفوفة البايتات. |
| static [UrlEncode](./urlencode/)(String) | يقوم بترميز جزء URI. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | يقوم بترميز جزء URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | يقوم بترميز جزء URI. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يقوم بترميز جزء URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | يقوم بترميز جزء URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | يقوم بترميز جزء URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | يقوم بترميز جزء URI. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | يقوم بترميز جزء URI. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | يقوم بترميز جزء URI باستخدام Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | يقوم بترميز جزء URI باستخدام Unicode. |
## انظر أيضًا

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Font for C++](../../)
