---
title: "System::Text::EncoderReplacementFallbackBuffer クラス"
linktitle: "EncoderReplacementFallbackBuffer"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderReplacementFallbackBuffer クラス。エンコーディングのフォールバック戦略を置き換えるためのバッファです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡してください。"
type: docs
weight: 1500
url: /ja/cpp/system.text/encoderreplacementfallbackbuffer/
---
## EncoderReplacementFallbackBuffer class


[Buffer](../../system/buffer/) for replacing encoding fallback strategy. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderReplacementFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EncoderReplacementFallbackBuffer](./encoderreplacementfallbackbuffer/)(const EncoderReplacementFallbackPtr\&) | コンストラクタ。 |
| [Fallback](./fallback/)(char_t, int) override | エンコーディングの失敗を処理します。 |
| [Fallback](./fallback/)(char_t, char_t, int) override | エンコーディングの失敗を処理します。 |
| [get_Remaining](./get_remaining/)() const override | バッファ内の残り文字数を取得します。 |
| [GetNextChar](./getnextchar/)() override | 次に利用可能な文字を取得します。 |
| [MovePrevious](./moveprevious/)() override | 前の文字に移動します。 |
| [Reset](./reset/)() override | バッファを初期状態にリセットします（[Fallback()](./fallback/) 呼び出し前）。 |
## 参照

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
