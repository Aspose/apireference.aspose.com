---
title: "System::IO::StreamWriter クラス"
linktitle: "StreamWriter"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamWriter クラス。バイトストリームに文字を書き込むライターを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2300
url: /ja/cpp/system.io/streamwriter/
---
## StreamWriter class


バイトストリームに文字を書き込むライターを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class StreamWriter : public System::IO::TextWriter
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | ストリームを閉じ、取得したリソースを解放します。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、基になるストリームを閉じます。 |
| [Flush](./flush/)() override | バッファの内容を基になるストリームにフラッシュし、続いて基になるストリームをフラッシュします。 |
| [get_AutoFlush](./get_autoflush/)() const | [StreamWriter](./) がメソッド [StreamWriter::Write](./write/) 呼び出しごとにデータを基になるストリームにフラッシュするかどうかを示す値を返します。 |
| [get_BaseStream](./get_basestream/)() const | 基になるストリームを表すオブジェクトへの共有ポインタを返します。 |
| [get_Encoding](./get_encoding/)() override | 現在使用されているエンコーディングを返します。 |
| [set_AutoFlush](./set_autoflush/)(bool) | [StreamWriter](./) がメソッド [StreamWriter::Write](./write/) 呼び出しごとにデータを基になるストリームにフラッシュすべきかどうかを指定する値を返します。 |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&) | UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基になるストリームに文字を書き込む [StreamWriter](./) オブジェクトのインスタンスを構築します。 |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | 指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基になるストリームに文字を書き込む [StreamWriter](./) オブジェクトのインスタンスを構築します。 |
| [StreamWriter](./streamwriter/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) | 指定されたエンコーディングと指定サイズのバッファを使用して、指定された基になるストリームに文字を書き込む [StreamWriter](./) オブジェクトのインスタンスを構築します。パラメータは、[StreamWriter](./) オブジェクトが破棄される際に基になるストリームを閉じるかどうかを指定します。 |
| [StreamWriter](./streamwriter/)(const String\&) | UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定されたファイルに文字を書き込む [StreamWriter](./) オブジェクトのインスタンスを構築します。 |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&) | 指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定されたファイルに文字を書き込む [StreamWriter](./) オブジェクトのインスタンスを構築します。パラメータは、データをファイルに追記するか、ファイルを上書きするかを指定します。 |
| [StreamWriter](./streamwriter/)(const String\&, bool, const EncodingPtr\&, int) | 指定されたエンコーディングとバッファサイズを使用して、指定されたファイルに文字を書き込む [StreamWriter](./) オブジェクトのインスタンスを構築します。パラメータは、データをファイルに追記するか、ファイルを上書きするかを指定します。 |
| [Write](./write/)(char_t) override | 指定された文字を書き込みます。 |
| [Write](./write/)(const String\&) override | 指定された文字列を書き込みます。 |
| [Write](./write/)(const SharedPtr\<Object\>\&) override | 指定されたオブジェクトの文字列表現を書き込みます。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&) override | 指定された配列のすべての文字を書き込みます。 |
| [Write](./write/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 指定された文字配列から指定された UTF-16 文字のサブレンジを書き込みます。 |
| [Write](./write/)(const char_t *) override | 指定された c-string を書き込みます。 |
| [Write](./write/)(const System::SharedPtr\<T\>\&) | 指定されたオブジェクトの文字列表現を書き込みます。 |
| [WriteLine](./writeline/)() override | 行終端文字を書き込みます。 |
| [WriteLine](./writeline/)(const String\&) override | 指定された文字列を書き込み、続けて改行文字をストリームに書き込みます。 |
| [WriteLine](./writeline/)(const SharedPtr\<Object\>\&) override | 指定されたオブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&) override | 指定された配列のすべての文字を書き込み、続けて改行文字をストリームに書き込みます。 |
| [WriteLine](./writeline/)(const ArrayPtr\<char_t\>\&, int32_t, int32_t) override | 指定された文字配列から指定された UTF-16 文字のサブレンジを書き込み、続けて改行文字をストリームに書き込みます。 |
| [WriteLine](./writeline/)(const char_t *) override | 指定された C 文字列を書き込み、続けて改行文字をストリームに書き込みます。 |
| [WriteLine](./writeline/)(const System::SharedPtr\<T\>\&) | 指定されたオブジェクトの文字列表現を書き込み、続いて行終端文字を書き込みます。 |
| [~StreamWriter](./~streamwriter/)() | デストラクタ。 |
## 参照

* Class [TextWriter](../textwriter/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
