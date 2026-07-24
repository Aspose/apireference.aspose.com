---
title: "System::Text::EncoderFallbackBuffer::Fallback メソッド"
linktitle: "Fallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderFallbackBuffer::Fallback メソッド。C++ で実際のフォールバック手順を実装します。"
type: docs
weight: 100
url: /ja/cpp/system.text/encoderfallbackbuffer/fallback/
---
## EncoderFallbackBuffer::Fallback(char_t, int) method


実際のフォールバック手順を実装します。

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknown, int index)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| charUnknown | char_t | 文字エンコーダがエンコードに失敗しました。 |
| インデックス | int | エラーを引き起こした文字のインデックス。 |

### ReturnValue

バッファが不明な文字を処理する場合は true、無視する場合は false。

## 参照

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderFallbackBuffer::Fallback(char_t, char_t, int) method


実際のフォールバック手順を実装します。

```cpp
virtual bool System::Text::EncoderFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| charUnknownHigh | char_t | エラーを引き起こしたサロゲートペアの上位部。 |
| charUnknownLow | char_t | エラーを引き起こしたサロゲートペアの下位部。 |
| インデックス | int | エラーを引き起こした文字のインデックス。 |

### ReturnValue

バッファが不明な文字を処理する場合は true、無視する場合は false。

## 参照

* Class [EncoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
