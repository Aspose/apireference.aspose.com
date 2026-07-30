---
title: "System::Web::HttpUtility 类"
linktitle: "HttpUtility"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::HttpUtility 类。服务类，用于在 C++ 中对 URL 部分进行十六进制转义片段的编码和解码。"
type: docs
weight: 300
url: /zh/cpp/system.web/httputility/
---
## HttpUtility class


对 URL 部分进行十六进制转义片段的编码和解码的服务类。

```cpp
class HttpUtility : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| static [HtmlDecode](./htmldecode/)(const String\&) | 解码 Html 片段。 |
| static [HtmlDecode](./htmldecode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | 解码 Html 片段。 |
| static [HtmlEncode](./htmlencode/)(const String\&) | 编码 Html 片段。 |
| static [HtmlEncode](./htmlencode/)(const SharedPtr\<Object\>\&) | 编码 Html 片段。 |
| static [HtmlEncode](./htmlencode/)(const String\&, const SharedPtr\<IO::TextWriter\>\&) | 编码 Html 片段。 |
| static [UrlDecode](./urldecode/)(String) | 从字符串解码 URI 片段。 |
| static [UrlDecode](./urldecode/)(String, System::SharedPtr\<Text::Encoding\>) | 从字符串解码 URI 片段。 |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) | 从字节数组解码 URI 片段。 |
| static [UrlDecode](./urldecode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) | 从字节数组解码 URI 片段。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | 从字节数组解码 URI 片段。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&) | 从字节字符串解码 URI 片段。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | 从字符串解码 URI 片段。 |
| static [UrlDecodeToBytes](./urldecodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 从字节数组解码 URI 片段。 |
| static [UrlEncode](./urlencode/)(String) | 编码 URI 片段。 |
| static [UrlEncode](./urlencode/)(String, const System::SharedPtr\<Text::Encoding\>\&) | 编码 URI 片段。 |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&) | 编码 URI 片段。 |
| static [UrlEncode](./urlencode/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 编码 URI 片段。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&) | 编码 URI 片段。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const String\&, const System::SharedPtr\<Text::Encoding\>\&) | 编码 URI 片段。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&) | 编码 URI 片段。 |
| static [UrlEncodeToBytes](./urlencodetobytes/)(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 编码 URI 片段。 |
| static [UrlEncodeUnicode](./urlencodeunicode/)(const String\&) | 使用 Unicode 编码 URI 片段。 |
| static [UrlEncodeUnicodeToBytes](./urlencodeunicodetobytes/)(const String\&) | 使用 Unicode 编码 URI 片段。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Web](../)
* Library [Aspose.Font for C++](../../)
