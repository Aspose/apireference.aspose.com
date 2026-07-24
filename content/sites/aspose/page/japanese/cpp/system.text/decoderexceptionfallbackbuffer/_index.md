---
title: "System::Text::DecoderExceptionFallbackBuffer クラス"
linktitle: "DecoderExceptionFallbackBuffer"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::DecoderExceptionFallbackBuffer クラス。例外をスローするデコードフォールバック戦略用のバッファです。実際には何も保存せず、代わりにスローします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.text/decoderexceptionfallbackbuffer/
---
## DecoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing decoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DecoderExceptionFallbackBuffer : public System::Text::DecoderFallbackBuffer
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [DecoderExceptionFallbackBuffer](./decoderexceptionfallbackbuffer/)() | コンストラクタ。 |
| [Fallback](./fallback/)(ArrayPtr\<uint8_t\>, int) override | デコード失敗を処理します。 |
| [get_Remaining](./get_remaining/)() const override | 残りの文字数を取得します。 |
| [GetNextChar](./getnextchar/)() override | 次に利用可能な文字を取得します。 |
| [MovePrevious](./moveprevious/)() override | 前の文字に移動します。 |
## 参照

* Class [DecoderFallbackBuffer](../decoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
