---
title: "System::Text::RegularExpressions::Capture クラス"
linktitle: "キャプチャ"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::Capture クラス。単一サブ式のマッチング結果です。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.text.regularexpressions/capture/
---
## Capture class


単一サブ式のマッチング結果です。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class Capture : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Capture](./capture/)(const UStringPtr\&, int, int) | コンストラクタ。 |
| [get_Index](./get_index/)() const | キャプチャされた部分文字列のインデックスを取得します。 |
| [get_Length](./get_length/)() const | キャプチャされた部分文字列の長さを取得します。 |
| [get_Value](./get_value/)() const | キャプチャされた部分文字列を取得します。 |
| [ToString](./tostring/)() const override | キャプチャされた部分文字列を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
