---
title: "System::Text::ICUDecoder::Convert メソッド"
linktitle: "Convert"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUDecoder::Convert メソッド。バイトを文字に変換します（C++）。"
type: docs
weight: 300
url: /ja/cpp/system.text/icudecoder/convert/
---
## ICUDecoder::Convert(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) method


バイトを文字に変換します。

```cpp
virtual void System::Text::ICUDecoder::Convert(ArrayPtr<uint8_t> bytes, int byteIndex, int byteCount, ArrayPtr<char_t> chars, int charIndex, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | ArrayPtr\<uint8_t\> | デコードするバイト。 |
| byteIndex | int | 入力バッファのオフセット。 |
| byteCount | int | 入力バッファのサイズ。 |
| chars | ArrayPtr\<char_t\> | 出力文字バッファ。 |
| charIndex | int | 出力配列のオフセット。 |
| charCount | int | 目的配列のサイズ。 |
| flush | bool | true の場合、計算後に内部デコーダーの状態をクリアします。 |
| bytesUsed | int\& | 読み取ったバイト数を格納する変数への参照。 |
| charsUsed | int\& | 書き込まれた文字数を格納する変数への参照。 |
| completed | bool\& | 入力バッファが枯渇した場合は true、そうでない場合は false に設定される変数への参照。 |

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUDecoder::Convert(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) method


バイトを文字に変換します。

```cpp
virtual void System::Text::ICUDecoder::Convert(const uint8_t *bytes, int byteCount, char_t *chars, int charCount, bool flush, int &bytesUsed, int &charsUsed, bool &completed)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| バイト | const uint8_t * | デコードするバイト。 |
| byteCount | int | 入力バッファのサイズ。 |
| chars | char_t * | 出力文字バッファ。 |
| charCount | int | 目的配列のサイズ。 |
| flush | bool | true の場合、計算後に内部デコーダーの状態をクリアします。 |
| bytesUsed | int\& | 読み取ったバイト数を格納する変数への参照。 |
| charsUsed | int\& | 書き込まれた文字数を格納する変数への参照。 |
| completed | bool\& | 入力バッファが枯渇した場合は true、そうでない場合は false に設定される変数への参照。 |

## 参照

* Class [ICUDecoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
