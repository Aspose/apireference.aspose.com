---
title: "System::Text::Encoder クラス"
linktitle: "Encoder"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Encoder クラス。文字シーケンスをバイトシーケンスにエンコードする機能をカプセル化します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 900
url: /ja/cpp/system.text/encoder/
---
## Encoder class


文字シーケンスをバイトシーケンスにエンコードする機能をカプセル化します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class Encoder : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 文字をバイトに変換します。 |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 文字をバイトに変換します。 |
| [get_Fallback](./get_fallback/)() const | エラーハンドリングのフォールバックを取得します。 |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | フォールバックバッファを取得します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | バッファをエンコードするのに必要なバイト数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | バッファをエンコードするのに必要なバイト数を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [Reset](./reset/)() | エンコーダの内部状態をクリアします。 |
| [set_Fallback](./set_fallback/)(const EncoderFallbackPtr\&) | エラーハンドリングのフォールバックを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
