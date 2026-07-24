---
title: "System::Text::EncoderFallbackBuffer クラス"
linktitle: "EncoderFallbackBuffer"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::EncoderFallbackBuffer クラス。フォールバック実装用のバッファを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 1300
url: /ja/cpp/system.text/encoderfallbackbuffer/
---
## EncoderFallbackBuffer class


フォールバック実装用のバッファを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class EncoderFallbackBuffer : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Fallback](./fallback/)(char_t, int) | 実際のフォールバック手順を実装します。 |
| virtual [Fallback](./fallback/)(char_t, char_t, int) | 実際のフォールバック手順を実装します。 |
| virtual [get_Remaining](./get_remaining/)() const | 処理すべき残りの文字数を取得します。 |
| virtual [GetNextChar](./getnextchar/)() | フォールバックバッファから次の文字を抽出します。 |
| virtual [MovePrevious](./moveprevious/)() | 可能であればバッファ位置を一つ戻します。 |
| virtual [Reset](./reset/)() | バッファを初期状態にリセットします。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
