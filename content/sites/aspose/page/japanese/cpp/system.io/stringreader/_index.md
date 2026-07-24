---
title: "System::IO::StringReader クラス"
linktitle: "StringReader"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StringReader クラス。文字列から文字を読み取るリーダーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡してください。"
type: docs
weight: 2400
url: /ja/cpp/system.io/stringreader/
---
## StringReader class


文字列から文字を読み取るリーダーを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class StringReader : public System::IO::TextReader
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | ストリームを閉じます。 |
| [Dispose](./dispose/)() override | 何もしません。 |
| [Dispose](./dispose/)(bool) override | 何もしません。 |
| [Peek](./peek/)() override | ストリームの位置を変更せずに、ストリームから単一の文字を読み取ります。 |
| [Read](./read/)() override | ストリームから単一の文字を読み取ります。 |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | 指定された位置から開始して、ストリームから指定された文字数の文字を指定された文字配列に読み取ります。 |
| [ReadLine](./readline/)() override | ストリームから現在の行の終端まで文字を読み取ります。 |
| [ReadToEnd](./readtoend/)() override | ストリームの終端まで文字を読み取ります。 |
| [StringReader](./stringreader/)(const String\&) | 指定された文字列から文字を読み取る [StringReader](./) クラスの新しいインスタンスを構築します。 |
## 参照

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
