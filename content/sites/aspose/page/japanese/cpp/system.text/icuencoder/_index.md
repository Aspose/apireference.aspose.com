---
title: "System::Text::ICUEncoder クラス"
linktitle: "ICUEncoder"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::ICUEncoder クラス。ICU を使用してエンコードするエンコーダーです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡してください。"
type: docs
weight: 2100
url: /ja/cpp/system.text/icuencoder/
---
## ICUEncoder class


[Encoder](../encoder/) that uses ICU for encoding. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class ICUEncoder : public System::Text::Encoder
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Convert](./convert/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, int, bool, int\&, int\&, bool\&) | 文字をバイトに変換します。 |
| virtual [Convert](./convert/)(const char_t *, int, uint8_t *, int, bool, int\&, int\&, bool\&) | 文字をバイトに変換します。 |
| virtual [GetByteCount](./getbytecount/)(ArrayPtr\<char_t\>, int, int, bool) | バッファをエンコードするのに必要なバイト数を取得します。 |
| virtual [GetByteCount](./getbytecount/)(const char_t *, int, bool) | バッファをエンコードするのに必要なバイト数を取得します。 |
| virtual [GetBytes](./getbytes/)(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int, bool) | バッファをエンコードした結果得られるバイト列を取得します。 |
| virtual [GetBytes](./getbytes/)(const char_t *, int, uint8_t *, int, bool) | バッファをエンコードした結果得られるバイト列を取得します。 |
| [ICUEncoder](./icuencoder/)(ICUEncoding *) | コンストラクタ。 |
| virtual [Reset](./reset/)() | 内部変数を初期状態に設定します。 |
| [~ICUEncoder](./~icuencoder/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Base](./base/) | [Base](./base/) 型。 |
## 参照

* Class [Encoder](../encoder/)
* Namespace [System::Text](../)
* Library [Aspose.Page for C++](../../)
