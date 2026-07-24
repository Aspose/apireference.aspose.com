---
title: "System::Text::ICUEncoder::GetBytes メソッド"
linktitle: "GetBytes"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUEncoder::GetBytes メソッド。C++ でバッファをエンコードした結果得られるバイトを取得します。"
type: docs
weight: 500
url: /ja/cpp/system.text/icuencoder/getbytes/
---
## ICUEncoder::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) method


バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual int System::Text::ICUEncoder::GetBytes(ArrayPtr<char_t> chars, int charIndex, int charCount, ArrayPtr<uint8_t> bytes, int byteIndex, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | エンコードする文字。 |
| charIndex | int | ソース配列のオフセット。 |
| charCount | int | ソースサブ配列の長さ。 |
| バイト | ArrayPtr\<uint8_t\> | 出力バイト バッファ。 |
| byteIndex | int | デスティネーション バッファのオフセット。 |
| flush | bool | true の場合、計算後に内部エンコーダの状態をクリアします。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## ICUEncoder::GetBytes(const char_t *, int, uint8_t *, int, bool) method


バッファをエンコードした結果得られるバイト列を取得します。

```cpp
virtual int System::Text::ICUEncoder::GetBytes(const char_t *chars, int charCount, uint8_t *bytes, int byteCount, bool flush)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| chars | const char_t * | エンコードする文字。 |
| charCount | int | ソース配列の長さ。 |
| バイト | uint8_t * | 出力バイト バッファ。 |
| byteCount | int | デスティネーション バッファのサイズ。 |
| flush | bool | true の場合、計算後に内部エンコーダの状態をクリアします。 |

### ReturnValue

書き込まれたバイト数。

## 参照

* Class [ICUEncoder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
