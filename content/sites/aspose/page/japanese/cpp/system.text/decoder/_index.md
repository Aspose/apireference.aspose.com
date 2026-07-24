---
title: "System::Text::Decoder クラス"
linktitle: "Decoder"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::Decoder クラス。バイト列を文字列にデコードする機能をカプセル化します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡してください。"
type: docs
weight: 200
url: /ja/cpp/system.text/decoder/
---
## Decoder class


バイト列を文字列にデコードする機能をカプセル化します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class Decoder : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | バイトを文字に変換します。 |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | バイトを文字に変換します。 |
| [get_Fallback](./get_fallback/)() const | エラーハンドリングのフォールバックを取得します。 |
| [get_FallbackBuffer](./get_fallbackbuffer/)() const | フォールバックバッファを取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | バッファをデコードするのに必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | バッファをデコードするのに必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | バッファをデコードするのに必要な文字数を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | バッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | バッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | バッファをデコードした結果得られる文字列を取得します。 |
| virtual [Reset](./reset/)() | デコーダーの内部状態をクリアします。 |
| [set_Fallback](./set_fallback/)(const DecoderFallbackPtr\&) | エラーハンドリングのフォールバックを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
