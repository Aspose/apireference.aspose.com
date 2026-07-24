---
title: "System::Text::Encoding::GetBytes メソッド"
linktitle: "GetBytes"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Encoding::GetBytes メソッド。C++ で文字バッファをエンコードした結果のバイト列を取得します。"
type: docs
weight: 1800
url: /ja/cpp/system.text/encoding/getbytes/
---
## Encoding::GetBytes(ArrayPtr\<char_t\>) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | エンコードする文字。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual int System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | エンコードする文字。 |
| char_index | int | 文字スライスの開始位置。 |
| char_count | int | 変換する文字数。 |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| byte_index | int | 出力バッファのオフセット。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | エンコードする文字。 |
| インデックス | int | 文字スライスの開始位置。 |
| count | int | 変換する文字数。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual int System::Text::Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | const char_t * | エンコードする文字。 |
| char_count | int | 変換する文字数。 |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| byte_count | int | 出力バッファのサイズ。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const String\&) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) をエンコードする文字列。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual int System::Text::Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) をエンコードする文字列。 |
| char_index | int | 文字スライスの開始位置。 |
| char_count | int | 変換する文字数。 |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| byte_index | int | 出力バッファのオフセット。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | エンコードする文字。 |
| インデックス | int | 文字スライスの開始位置。 |
| count | int | 変換する文字数。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | エンコードする文字。 |
| インデックス | int | 文字スライスの開始位置。 |
| count | int | 変換する文字数。 |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | エンコードする文字。 |
| char_index | int | 文字スライスの開始位置。 |
| char_count | int | 変換する文字数。 |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| byte_index | int | 出力バッファのオフセット。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


文字バッファをエンコードした結果得られるバイト列を取得します。

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | エンコードする文字。 |
| char_index | int | 文字スライスの開始位置。 |
| char_count | int | 変換する文字数。 |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) に文字を入れるためのバッファ。 |
| byte_index | int | 出力バッファのオフセット。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
