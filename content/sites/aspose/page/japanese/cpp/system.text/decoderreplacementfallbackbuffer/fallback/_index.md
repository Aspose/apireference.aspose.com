---
title: "System::Text::DecoderReplacementFallbackBuffer::Fallback メソッド"
linktitle: "Fallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::DecoderReplacementFallbackBuffer::Fallback メソッド。C++ でデコード失敗を処理します。"
type: docs
weight: 200
url: /ja/cpp/system.text/decoderreplacementfallbackbuffer/fallback/
---
## DecoderReplacementFallbackBuffer::Fallback method


デコード失敗を処理します。

```cpp
virtual bool System::Text::DecoderReplacementFallbackBuffer::Fallback(ArrayPtr<uint8_t> bytesUnknown, int index) override
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| bytesUnknown | ArrayPtr\<uint8_t\> | 不明なバイトの [Array](../../../system/array/)；無視されます。 |
| インデックス | int | 不明なバイトのオフセット；無視されます。 |

### ReturnValue

置換文字列が提供されていて空でない場合は true、そうでない場合は false。

## 参照

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [DecoderReplacementFallbackBuffer](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
