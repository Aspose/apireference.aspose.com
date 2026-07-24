---
title: "System::Text::DecoderFallback クラス"
linktitle: "DecoderFallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::DecoderFallback クラス。デコードエラーを処理するためのフォールバック API を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.text/decoderfallback/
---
## DecoderFallback class


デコードエラーを処理するためのフォールバック API を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class DecoderFallback : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CreateFallbackBuffer](./createfallbackbuffer/)() | フォールバックアルゴリズムに関連付けられたバッファを取得します。 |
| static [get_ExceptionFallback](./get_exceptionfallback/)() | デフォルトの例外フォールバック実装を取得します。 |
| virtual [get_MaxCharCount](./get_maxcharcount/)() const | フォールバックで返される可能な最大文字数を取得します。 |
| static [get_ReplacementFallback](./get_replacementfallback/)() | デフォルトの置換フォールバック実装を取得します。 |
| static [get_StandardSafeFallback](./get_standardsafefallback/)() | デフォルトの標準安全フォールバック実装を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
