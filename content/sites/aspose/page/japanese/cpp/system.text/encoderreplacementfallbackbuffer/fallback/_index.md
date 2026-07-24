---
title: "System::Text::EncoderReplacementFallbackBuffer::Fallback メソッド"
linktitle: "Fallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderReplacementFallbackBuffer::Fallback メソッド。C++ でエンコード失敗を処理します。"
type: docs
weight: 200
url: /ja/cpp/system.text/encoderreplacementfallbackbuffer/fallback/
---
## EncoderReplacementFallbackBuffer::Fallback(char_t, int) method


エンコーディングの失敗を処理します。

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| charUnknown | char_t | 不明な文字です。無視されました。 |
| インデックス | int | 不明な文字位置です。無視されました。 |

### ReturnValue

置換文字列が提供されていて空でない場合は true、そうでない場合は false。

## 参照

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderReplacementFallbackBuffer::Fallback(char_t, char_t, int) method


エンコーディングの失敗を処理します。

```cpp
virtual bool System::Text::EncoderReplacementFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| charUnknownHigh | char_t | エラーを引き起こしたサロゲートペアの上位部。 |
| charUnknownLow | char_t | エラーを引き起こしたサロゲートペアの下位部。 |
| インデックス | int | 不明な文字位置です。無視されました。 |

### ReturnValue

置換文字列が提供されていて空でない場合は true、そうでない場合は false。

## 参照

* Class [EncoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
