---
title: "System::Web::HttpUtility::UrlDecode 方法"
linktitle: "UrlDecode"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::HttpUtility::UrlDecode 方法。对 C++ 中的字节数组解码 URI 片段。"
type: docs
weight: 300
url: /zh/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


从字节数组解码 URI 片段。

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const System::ArrayPtr\<uint8_t\>\& | 已编码的 URI 片段。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 要使用的编码。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


从字节数组解码 URI 片段。

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const System::ArrayPtr\<uint8_t\>\& | 已编码的 URI 片段。 |
| offset | int32_t | 给定字节数组中的偏移量。 |
| count | int32_t | 要读取的字节数。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 要使用的编码。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(String) method


从字符串解码 URI 片段。

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String | 已编码的 URI 片段。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


从字符串解码 URI 片段。

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | String | 已编码的 URI 片段。 |
| e | System::SharedPtr\<Text::Encoding\> | 要使用的编码。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
