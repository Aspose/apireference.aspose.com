---
title: "System::Text::Decoder::GetChars メソッド"
linktitle: "GetChars"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Decoder::GetChars メソッド。C++ でバッファをデコードした結果得られる文字を取得します。"
type: docs
weight: 500
url: /ja/cpp/system.text/decoder/getchars/
---
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


バッファをデコードした結果得られる文字列を取得します。

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | ArrayPtr\<uint8_t\> | デコードするバイト。 |
| byteIndex | int | 入力バッファのオフセット。 |
| byteCount | int | 入力バッファのサイズ。 |
| chars | ArrayPtr\<char_t\> | 出力文字バッファ。 |
| charIndex | int | 出力配列のオフセット。 |

### ReturnValue

書き込まれた文字数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) method


バッファをデコードした結果得られる文字列を取得します。

```cpp
virtual int System::Text::Decoder::GetChars(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | ArrayPtr\<uint8_t\> | デコードするバイト。 |
| byteIndex | int | 入力バッファのオフセット。 |
| byteCount | int | 入力バッファのサイズ。 |
| chars | ArrayPtr\<char_t\> | 出力文字バッファ。 |
| charIndex | int | 出力配列のオフセット。 |
| flush | bool | true の場合、計算後に内部デコーダーの状態をクリアします。 |

### ReturnValue

書き込まれた文字数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## Decoder::GetChars(const uint8_t *, int, char_t *, int, bool) method


バッファをデコードした結果得られる文字列を取得します。

```cpp
virtual int System::Text::Decoder::GetChars(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const uint8_t * | デコードするバイト。 |
| byteCount | int | 入力バッファのサイズ。 |
| chars | char_t * | 出力文字バッファ。 |
| charCount | int | 目的配列のサイズ。 |
| flush | bool | true の場合、計算後に内部デコーダーの状態をクリアします。 |

### ReturnValue

書き込まれた文字数。

## 参照

* Class [Decoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
