---
title: "System::Text::EncoderReplacementFallback クラス"
linktitle: "EncoderReplacementFallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderReplacementFallback クラス。誤ったシンボルをスタブに置き換えるフォールバック戦略を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 1400
url: /ja/cpp/system.text/encoderreplacementfallback/
---
## EncoderReplacementFallback class


誤ったシンボルをスタブに置き換えるフォールバック戦略を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class EncoderReplacementFallback : public System::Text::EncoderFallback
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | フォールバックバッファを作成します。 |
| [EncoderReplacementFallback](./encoderreplacementfallback/)() | デフォルトの "?" 置換文字列を使用するコンストラクタです。 |
| [EncoderReplacementFallback](./encoderreplacementfallback/)(const String\&) | コンストラクタ。 |
| [get_DefaultString](./get_defaultstring/)() const | 置換文字列を取得します。 |
| [get_MaxCharCount](./get_maxcharcount/)() const override | インスタンスが返すことのできる最大文字数を取得します。 |
## 参照

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
