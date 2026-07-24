---
title: "System::Web::HttpUtility::UrlEncodeToBytes メソッド"
linktitle: "UrlEncodeToBytes"
second_title: "C++ 用 Aspose.Page"
description: "System::Web::HttpUtility::UrlEncodeToBytes メソッド。C++ で URI フラグメントをエンコードします。"
type: docs
weight: 600
url: /ja/cpp/system.web/httputility/urlencodetobytes/
---
## HttpUtility::UrlEncodeToBytes(const String\&) method


URI フラグメントをエンコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | エンコードする URI フラグメント。 |

### ReturnValue

エンコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const String\&, const System::SharedPtr\<Text::Encoding\>\&) method


URI フラグメントをエンコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const String &str, const System::SharedPtr<Text::Encoding> &e)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| str | const String\& | エンコードする URI フラグメント。 |
| e | const System::SharedPtr\<Text::Encoding\>\& | 使用するエンコーディング。 |

### ReturnValue

エンコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Encoding](../../../system.text/encoding/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&) method


URI フラグメントをエンコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const System::ArrayPtr\<uint8_t\>\& | エンコードする URI フラグメント。 |

### ReturnValue

エンコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
## HttpUtility::UrlEncodeToBytes(const System::ArrayPtr\<uint8_t\>\&, int32_t, int32_t) method


URI フラグメントをエンコードします。

```cpp
static System::ArrayPtr<uint8_t> System::Web::HttpUtility::UrlEncodeToBytes(const System::ArrayPtr<uint8_t> &bytes, int32_t offset, int32_t count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const System::ArrayPtr\<uint8_t\>\& | エンコードする URI フラグメント。 |
| offset | int32_t | 指定されたバイト配列内のオフセット。 |
| count | int32_t | 読み取るバイト数。 |

### ReturnValue

エンコードされた URI フラグメント。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [HttpUtility](../)
* Namespace [System::Web](../../)
* Library [Aspose.Page for C++](../../../)
