---
title: "System::Text::EncodingEncoder::Convert メソッド"
linktitle: "Convert"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncodingEncoder::Convert メソッド。C++ で文字をバイトに変換します。"
type: docs
weight: 100
url: /ja/cpp/system.text/encodingencoder/convert/
---
## EncodingEncoder::Convert(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) method


文字をバイトに変換します。

```cpp
virtual void System::Text::EncodingEncoder::Convert(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | エンコードする文字。 |
| charIndex | int | 入力バッファのオフセット。 |
| charCount | int | 入力バッファのサイズ。 |
| バイト | ArrayPtr\<uint8_t\> | 出力バイト バッファ。 |
| byteIndex | int | 出力配列のオフセット。 |
| byteCount | int | 目的配列のサイズ。 |
| flush | bool | true の場合、計算後に内部エンコーダの状態をクリアします。 |
| charsUsed | int\& | 読み取った文字数を格納する変数への参照。 |
| bytesUsed | int\& | 書き込まれたバイト数を格納する変数への参照。 |
| completed | bool\& | 入力バッファが枯渇した場合は true、そうでない場合は false に設定される変数への参照。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncodingEncoder::Convert(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) method


文字をバイトに変換します。

```cpp
virtual void System::Text::EncodingEncoder::Convert(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush, int &charsUsed, int &bytesUsed, bool &completed)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | const char_t * | エンコードする文字。 |
| charCount | int | 入力バッファのサイズ。 |
| バイト | uint8_t * | 出力バイト バッファ。 |
| byteCount | int | 目的配列のサイズ。 |
| flush | bool | true の場合、計算後に内部エンコーダの状態をクリアします。 |
| charsUsed | int\& | 読み取った文字数を格納する変数への参照。 |
| bytesUsed | int\& | 書き込まれたバイト数を格納する変数への参照。 |
| completed | bool\& | 入力バッファが枯渇した場合は true、そうでない場合は false に設定される変数への参照。 |

## 参照

* Class [EncodingEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
