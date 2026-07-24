---
title: "System::Web::HttpUtility class"
linktitle: "HttpUtility"
second_title: "Aspose.Page voor C++"
description: "System::Web::HttpUtility class. Service‑klasse die URL‑onderdelen codeert en decodeert naar en van hex‑escape‑fragmenten in C++."
type: docs
weight: 300
url: /nl/cpp/system.web/httputility/
---
## HttpUtility class


Service‑klasse die URL‑onderdelen codeert en decodeert naar en van hex‑escape‑fragmenten.

```cpp
class HttpUtility : public System::Object
```

## Methoden

| Methode | Beschrijving |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Decodeert HTML‑fragment. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Decodeert HTML‑fragment. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Codeert HTML‑fragment. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Codeert HTML‑fragment. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Codeert HTML‑fragment. |
| static [UrlDecode](./urldecode/)(String) | Decodeert URI‑fragment van string. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Decodeert URI‑fragment van string. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodeert URI‑fragment van byte‑array. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Decodeert URI‑fragment van byte‑array. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Decodeert URI‑fragment van byte‑array. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Decodeert URI‑fragment van byte‑string. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Decodeert URI‑fragment van string. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Decodeert URI‑fragment van byte‑array. |
| static [UrlEncode](./urlencode/)(String) | Codeert URI‑fragment. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Codeert URI‑fragment. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Codeert URI‑fragment. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codeert URI‑fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Codeert URI‑fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Codeert URI‑fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Codeert URI‑fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Codeert URI‑fragment. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Codeert URI‑fragment met Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Codeert URI‑fragment met Unicode. |
## Zie ook

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
