---
title: "System::Web::HttpUtility::UrlDecode メソッド"
linktitle: "UrlDecode"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::HttpUtility::UrlDecode メソッド。C++ でバイト配列から URI フラグメントをデコードします。"
type: docs
weight: 300
url: /ja/cpp/system.web/httputility/urldecode/
---
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, const System::SharedPtr\<Text::Encoding\>\&) method


バイト配列から URI フラグメントをデコードします。

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, const System::SharedPtr<Text::Encoding> &e)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const System::ArrayPtr\<uint8_t\>\& | エンコードされた URI フラグメント。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 使用するエンコーディング。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const System::SharedPtr\<Text::Encoding\>\&) method


バイト配列から URI フラグメントをデコードします。

```cpp
static String System::Web::HttpUtility::UrlDecode(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count, const System::SharedPtr<Text::Encoding> &e)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const System::ArrayPtr\<uint8_t\>\& | エンコードされた URI フラグメント。 |
| offset | int32_t | 指定されたバイト配列内のオフセット。 |
| count | int32_t | 読み取るバイト数。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 使用するエンコーディング。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String) method


文字列から URI フラグメントをデコードします。

```cpp
static String System::Web::HttpUtility::UrlDecode(String str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String | エンコードされた URI フラグメント。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlDecode(String, System::SharedPtr\<Text::Encoding\>) method


文字列から URI フラグメントをデコードします。

```cpp
static String System::Web::HttpUtility::UrlDecode(String str, System::SharedPtr<Text::Encoding> e)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | String | エンコードされた URI フラグメント。 |
| e | System::SharedPtr\<Text::Encoding\> | 使用するエンコーディング。 |

### ReturnValue

デコードされた URI フラグメント。

## 参照

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
