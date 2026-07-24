---
title: "System::Text::EncoderFallback クラス"
linktitle: "EncoderFallback"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderFallback クラス。エンコードエラーを処理するためのフォールバック API を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1200
url: /ja/cpp/system.text/encoderfallback/
---
## EncoderFallback class


エンコードエラーを処理するためのフォールバック API を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class EncoderFallback : public System::Object
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
