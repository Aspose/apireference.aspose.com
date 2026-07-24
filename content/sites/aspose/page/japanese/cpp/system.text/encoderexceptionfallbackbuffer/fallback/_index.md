---
title: "System::Text::EncoderExceptionFallbackBuffer::Fallback メソッド"
linktitle: "Fallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderExceptionFallbackBuffer::Fallback メソッド。C++ でエンコード失敗を処理します。"
type: docs
weight: 200
url: /ja/cpp/system.text/encoderexceptionfallbackbuffer/fallback/
---
## EncoderExceptionFallbackBuffer::Fallback(char_t, int) method


エンコーディングの失敗を処理します。

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknown, int index) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| charUnknown | char_t | 不明な文字; 無視されます。 |
| インデックス | int | 不明な文字のオフセット; 無視されます。 |

### ReturnValue

実際には返さず、例外をスローします。

## 参照

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## EncoderExceptionFallbackBuffer::Fallback(char_t, char_t, int) method


エンコーディングの失敗を処理します。

```cpp
virtual bool System::Text::EncoderExceptionFallbackBuffer::Fallback(char_t charUnknownHigh, char_t charUnknownLow, int index) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| charUnknownHigh | char_t | エラーを引き起こしたサロゲートペアの上位部。 |
| charUnknownLow | char_t | エラーを引き起こしたサロゲートペアの下位部。 |
| インデックス | int | 不明な文字のオフセット; 無視されます。 |

### ReturnValue

実際には返さず、例外をスローします。

## 参照

* Class [EncoderExceptionFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
