---
title: "System::Web::HttpUtility::UrlDecodeToBytes メソッド"
linktitle: "UrlDecodeToBytes"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::HttpUtility::UrlDecodeToBytes メソッド。C++ でバイト文字列から URI フラグメントをデコードします。"
type: docs
weight: 400
url: /ja/cpp/system.web/httputility/urldecodetobytes/
---
## HttpUtility::UrlDecodeToBytes(const String\&) method


バイト文字列から URI フラグメントをデコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | エンコードされた URI フラグメント。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


文字列から URI フラグメントをデコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | エンコードされた URI フラグメント。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 使用するエンコーディング。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


バイト配列から URI フラグメントをデコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const System::ArrayPtr\<uint8_t\>\& | エンコードされた URI フラグメント。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


バイト配列から URI フラグメントをデコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlDecodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const System::ArrayPtr\<uint8_t\>\& | エンコードされた URI フラグメント。 |
| offset | int32_t | 指定されたバイト配列内のオフセット。 |
| count | int32_t | 読み取るバイト数。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
