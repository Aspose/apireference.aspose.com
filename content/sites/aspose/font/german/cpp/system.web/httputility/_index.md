---
title: "System::Web::HttpUtility Klasse"
linktitle: "HttpUtility"
second_title: "Aspose.Font für C++"
description: "System::Web::HttpUtility Klasse. Service-Klasse, die URL‑Teile in Hex‑Escape‑Fragmente kodiert und dekodiert in C++."
type: docs
weight: 300
url: /de/cpp/system.web/httputility/
---
## HttpUtility class


Dienstklasse, die URL‑Teile in hexadezimale Escape‑Fragmente kodiert und dekodiert.

```cpp
class HttpUtility : public System::Object
```

## Methoden

| Methode | Beschreibung |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | Dekodiert HTML‑Fragment. |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Dekodiert HTML‑Fragment. |
| static [HtmlEncode](./htmlencode/)(const String\&) | Kodiert HTML‑Fragment. |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | Kodiert HTML‑Fragment. |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | Kodiert HTML‑Fragment. |
| static [UrlDecode](./urldecode/)(String) | Dekodiert URI‑Fragment aus einem String. |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | Dekodiert URI‑Fragment aus einem String. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | Dekodiert URI-Fragment aus einem Byte-Array. |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | Dekodiert URI-Fragment aus einem Byte-Array. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Dekodiert URI-Fragment aus einem Byte-Array. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | Dekodiert URI-Fragment aus einem Byte-String. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Dekodiert URI‑Fragment aus einem String. |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Dekodiert URI-Fragment aus einem Byte-Array. |
| static [UrlEncode](./urlencode/)(String) | Kodiert URI-Fragment. |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | Kodiert URI-Fragment. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | Kodiert URI-Fragment. |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Kodiert URI-Fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | Kodiert URI-Fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | Kodiert URI-Fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | Kodiert URI-Fragment. |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | Kodiert URI-Fragment. |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | Kodiert URI-Fragment unter Verwendung von Unicode. |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | Kodiert URI-Fragment unter Verwendung von Unicode. |
## Siehe auch

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Font for C++](../../)
