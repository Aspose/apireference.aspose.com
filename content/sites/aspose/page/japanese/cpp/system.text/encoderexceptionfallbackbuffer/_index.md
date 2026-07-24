---
title: "System::Text::EncoderExceptionFallbackBuffer クラス"
linktitle: "EncoderExceptionFallbackBuffer"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderExceptionFallbackBuffer クラス。例外をスローするエンコーディングフォールバック戦略用のバッファです。実際には何も保存せず、代わりに例外をスローします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 1100
url: /ja/cpp/system.text/encoderexceptionfallbackbuffer/
---
## EncoderExceptionFallbackBuffer class


[Buffer](../../system/buffer/) for exception-throwing encoding fallback strategy. Doesn't store anything actually, but throws instead. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class EncoderExceptionFallbackBuffer : public System::Text::EncoderFallbackBuffer
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [EncoderExceptionFallbackBuffer](./encoderexceptionfallbackbuffer/)() | コンストラクタ。 |
| [Fallback](./fallback/)(char_t, int) override | エンコーディングの失敗を処理します。 |
| [Fallback](./fallback/)(char_t, char_t, int) override | エンコーディングの失敗を処理します。 |
| [get_Remaining](./get_remaining/)() const override | 残りの文字数を取得します。 |
| [GetNextChar](./getnextchar/)() override | 次に利用可能な文字を取得します。 |
| [MovePrevious](./moveprevious/)() override | 前の文字に移動します。 |
## 参照

* Class [EncoderFallbackBuffer](../encoderfallbackbuffer/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
