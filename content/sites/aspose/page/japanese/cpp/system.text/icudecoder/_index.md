---
title: "System::Text::ICUDecoder クラス"
linktitle: "ICUDecoder"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUDecoder クラス。ICU を使用してデコードするデコーダーです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 2000
url: /ja/cpp/system.text/icudecoder/
---
## ICUDecoder class


[Decoder](../decoder/) that uses ICU for decoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUDecoder : public System::Text::Decoder
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, int, bool, int\&, int\&, bool\&) | バイトを文字に変換します。 |
| virtual [Convert](./convert/)(const uint8_t *, int, char_t *, int, bool, int\&, int\&, bool\&) | バイトを文字に変換します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int) | バッファをデコードするのに必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(ArrayPtr\<uint8_t\>, int, int, bool) | バッファをデコードするのに必要な文字数を取得します。 |
| virtual [GetCharCount](./getcharcount/)(const uint8_t *, int, bool) | バッファをデコードするのに必要な文字数を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) | バッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int, bool) | バッファをデコードした結果得られる文字列を取得します。 |
| virtual [GetChars](./getchars/)(const uint8_t *, int, char_t *, int, bool) | バッファをデコードした結果得られる文字列を取得します。 |
| [ICUDecoder](./icudecoder/)(ICUEncoding *) | コンストラクタ。 |
| virtual [Reset](./reset/)() | 内部変数を初期状態に設定します。 |
| virtual [~ICUDecoder](./~icudecoder/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 型。 |
## 参照

* Class [Decoder](../decoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
