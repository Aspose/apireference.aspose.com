---
title: "System::Web::HttpUtility クラス"
linktitle: "HttpUtility"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::HttpUtility クラス。C++ で URL 部分を 16 進エスケープフラグメントにエンコードおよびデコードするサービスクラスです。"
type: docs
weight: 300
url: /ja/cpp/system.web/httputility/
---
## HttpUtility class


URL 部分を 16 進エスケープフラグメントにエンコードおよびデコードするサービスクラス。

```cpp
class HttpUtility : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | HTML フラグメントをデコードします。 |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML フラグメントをデコードします。 |
| static [HtmlEncode](./htmlencode/)(const String\&) | HTML フラグメントをエンコードします。 |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | HTML フラグメントをエンコードします。 |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | HTML フラグメントをエンコードします。 |
| static [UrlDecode](./urldecode/)(String) | 文字列から URI フラグメントをデコードします。 |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | 文字列から URI フラグメントをデコードします。 |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | バイト配列から URI フラグメントをデコードします。 |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | バイト配列から URI フラグメントをデコードします。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | バイト配列から URI フラグメントをデコードします。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | バイト文字列から URI フラグメントをデコードします。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | 文字列から URI フラグメントをデコードします。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | バイト配列から URI フラグメントをデコードします。 |
| static [UrlEncode](./urlencode/)(String) | URI フラグメントをエンコードします。 |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | URI フラグメントをエンコードします。 |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | URI フラグメントをエンコードします。 |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI フラグメントをエンコードします。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | URI フラグメントをエンコードします。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | URI フラグメントをエンコードします。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | URI フラグメントをエンコードします。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | URI フラグメントをエンコードします。 |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | URI フラグメントを Unicode でエンコードします。 |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | URI フラグメントを Unicode でエンコードします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Page for C++](../../)
