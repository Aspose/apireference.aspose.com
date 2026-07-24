---
title: "System::Text::DecoderReplacementFallbackBuffer クラス"
linktitle: "DecoderReplacementFallbackBuffer"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::DecoderReplacementFallbackBuffer クラス。C++ におけるデコードフォールバック戦略を置き換えるためのバッファ。"
type: docs
weight: 800
url: /ja/cpp/system.text/decoderreplacementfallbackbuffer/
---
## DecoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing decoding fallback strategy.

```cpp
class DecoderReplacementFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DecoderReplacementFallbackBuffer](./decoderreplacementfallbackbuffer/)(const DecoderReplacementFallbackPtr\&) | コンストラクタ。 |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | デコード失敗を処理します。 |
| [get_Remaining](./get_remaining/)() const override | バッファ内の残り文字数を取得します。 |
| [GetNextChar](./getnextchar/)() override | 次に利用可能な文字を取得します。 |
| [MovePrevious](./moveprevious/)() override | 前の文字に移動します。 |
| [Reset](./reset/)() override | バッファを初期状態にリセットします（[Fallback()](./fallback/) 呼び出し前）。 |
## 参照

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
