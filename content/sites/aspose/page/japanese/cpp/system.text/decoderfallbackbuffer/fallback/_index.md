---
title: "System::Text::DecoderFallbackBuffer::Fallback メソッド"
linktitle: "Fallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::DecoderFallbackBuffer::Fallback メソッド。実際のフォールバック手順を実装します（C++）。"
type: docs
weight: 100
url: /ja/cpp/system.text/decoderfallbackbuffer/fallback/
---
## DecoderFallbackBuffer::Fallback method


実際のフォールバック手順を実装します。

```cpp
virtual bool System::Text::DecoderFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index)=0
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | [Array](../../../system/array/) バイトの配列（デコーダがデコードに失敗したバイトを含む）。 |
| インデックス | int | エラーを引き起こしたバイトのインデックス。 |

### ReturnValue

バッファが不明なバイトを処理する場合は true、無視する場合は false。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
