---
title: "System::Text::ICUEncoding::GetChars メソッド"
linktitle: "GetChars"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUEncoding::GetChars メソッド。C++ でバイトバッファをデコードして得られる文字を取得します。"
type: docs
weight: 500
url: /ja/cpp/system.text/icuencoding/getchars/
---
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>) method


バイトバッファをデコードした結果得られる文字列を取得します。

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からバイトを読み取ります。 |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


バイトバッファをデコードした結果得られる文字列を取得します。

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からバイトを読み取ります。 |
| byte_index | int | 入力バッファのオフセット。 |
| byte_count | int | 入力バッファのサイズ。 |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| char_index | int | 出力バッファのオフセット。 |

### ReturnValue

書き込まれた文字数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


バイトバッファをデコードした結果得られる文字列を取得します。

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) からバイトを読み取ります。 |
| インデックス | int | 入力バッファのオフセット。 |
| count | int | 入力バッファのサイズ。 |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoding::GetChars(const uint8_t *, int, char_t *, int) method


バイトバッファをデコードした結果得られる文字列を取得します。

```cpp
int System::Text::ICUEncoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) からバイトを読み取ります。 |
| byte_count | int | 入力バッファのサイズ。 |
| chars | char_t * | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| char_count | int | 出力バッファのサイズ。 |

### ReturnValue

書き込まれた文字数。

## 参照

* Class [ICUEncoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
