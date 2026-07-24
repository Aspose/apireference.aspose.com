---
title: "System::Text::EncoderExceptionFallback クラス"
linktitle: "EncoderExceptionFallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderExceptionFallback クラス。例外をスローするフォールバック戦略を提供します。このクラスのオブジェクトは、System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡してください。"
type: docs
weight: 1000
url: /ja/cpp/system.text/encoderexceptionfallback/
---
## EncoderExceptionFallback class


例外スローのフォールバック戦略を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class EncoderExceptionFallback : public System::Text::EncoderFallback
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateFallbackBuffer](./createfallbackbuffer/)() override | フォールバックバッファを作成します。 |
| [EncoderExceptionFallback](./encoderexceptionfallback/)() | コンストラクタ。 |
| [get_MaxCharCount](./get_maxcharcount/)() const override | インスタンスが返すことのできる最大文字数を取得します。 |
## 参照

* Class [EncoderFallback](../encoderfallback/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
