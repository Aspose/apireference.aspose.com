---
title: "System::Web::HttpUtility::UrlDecodeToBytes 方法"
linktitle: "UrlDecodeToBytes"
second_title: "Aspose.Font 适用于 C++"
description: "System::Web::HttpUtility::UrlDecodeToBytes 方法。对 C++ 中的字节字符串解码 URI 片段。"
type: docs
weight: 400
url: /zh/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


从字节字符串解码 URI 片段。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | 已编码的 URI 片段。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


从字符串解码 URI 片段。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| str | const String\& | 已编码的 URI 片段。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 要使用的编码。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


从字节数组解码 URI 片段。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const System::ArrayPtr\<uint8_t\>\& | 已编码的 URI 片段。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


从字节数组解码 URI 片段。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| 参数 | 类型 | 描述 |
| --- | --- | --- |
| 字节 | const System::ArrayPtr\<uint8_t\>\& | 已编码的 URI 片段。 |
| offset | int32_t | 给定字节数组中的偏移量。 |
| count | int32_t | 要读取的字节数。 |

### ReturnValue

已解码的 URI 片段。

## 另见

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Font for C++](../../../)
