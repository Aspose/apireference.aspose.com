---
title: "System::IO::TextReader クラス"
linktitle: "TextReader"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::TextReader クラス。さまざまなソースから文字シーケンスを読み取るリーダーを表すクラスの基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数へ引数として渡す際に使用してください。"
type: docs
weight: 2600
url: /ja/cpp/system.io/textreader/
---
## TextReader class


さまざまなソースから文字シーケンスを読み取るリーダーを表すクラスの基底クラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class TextReader : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Close](./close/)() | ストリームを閉じ、取得したリソースを解放します。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、基になるストリームを閉じます。 |
| virtual [Peek](./peek/)() | ストリームから単一の文字を読み取りますが、ストリームの読み取りカーソルは変更しません。 |
| virtual [Read](./read/)() | ストリームから単一の文字を読み取ります。 |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | ストリームから指定された文字数を読み取り、指定された位置から始まる指定された文字配列に書き込みます。 |
| virtual [ReadBlock](./readblock/)(ArrayPtr\<char_t\>, int, int) | 現在の TextReader から指定された最大文字数を読み取り、指定されたインデックスから始まるバッファにデータを書き込みます。 |
| virtual [ReadLine](./readline/)() | ストリームから現在の行の終端まで文字を読み取ります。 |
| virtual [ReadToEnd](./readtoend/)() | ストリームの終端まで文字を読み取ります。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
