---
title: "System::IO::StreamReader クラス"
linktitle: "StreamReader"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::StreamReader クラス。バイトストリームから文字を読み取るリーダーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2200
url: /ja/cpp/system.io/streamreader/
---
## StreamReader class


バイトストリームから文字を読み取るリーダーを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class StreamReader : public System::IO::TextReader
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | 現在のストリームと基になるストリームを閉じます。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、基になるストリームを閉じます。 |
| [get_BaseStream](./get_basestream/)() const | 基になるストリームを表すオブジェクトへの共有ポインタを返します。 |
| [get_CurrentEncoding](./get_currentencoding/)() | 現在使用されているエンコーディングを返します。 |
| [get_EndOfStream](./get_endofstream/)() | ストリームの末尾に達したかどうかを示す値を返します。 |
| [Peek](./peek/)() override | ストリームから単一の文字を読み取りますが、ストリームの読み取りカーソルは変更しません。 |
| [Read](./read/)() override | ストリームから単一の文字を読み取ります。 |
| [Read](./read/)(ArrayPtr\<char_t\>, int, int) override | ストリームから指定された文字数を読み取り、UTF-16 エンコーディングに変換し、指定された位置から始まる指定された文字配列に結果の UTF-16 文字を書き込みます。 |
| [ReadLine](./readline/)() override | ストリームから現在の行の終端まで文字を読み取ります。 |
| [ReadToEnd](./readtoend/)() override | ストリームの終端まで文字を読み取ります。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&) | UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基底ストリームから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, bool) | UTF-8 エンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基底ストリームから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&) | 指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基底ストリームから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) | 指定されたエンコーディングとデフォルトサイズ 1024 バイトのバッファを使用して、指定された基底ストリームから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。 |
| [StreamReader](./streamreader/)(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) | 指定されたエンコーディングと指定されたサイズのバッファを使用して、指定された基底ストリームから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。パラメータはバイトオーダーマーク検出を有効にするかどうかを指定します。 |
| [StreamReader](./streamreader/)(const System::String\&) | UTF-8 エンコーディングとデフォルトサイズ 4096 バイトのバッファを使用して、指定されたファイルから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。 |
| [StreamReader](./streamreader/)(const System::String\&, bool) | 指定されたファイルから文字を読み取るために、UTF-8 エンコーディングとデフォルトサイズ 4096 バイトのバッファを使用する [StreamReader](./) オブジェクトのインスタンスを作成します。パラメーターはバイトオーダーマーク検出を有効にするかどうかを指定します。 |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&) | 指定されたエンコーディングとデフォルトサイズ 4096 バイトのバッファを使用して、指定されたファイルから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。 |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool) | 指定されたエンコーディングとデフォルトサイズ 4096 バイトのバッファを使用して、指定された基礎ストリームから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。パラメーターはバイトオーダーマーク検出を有効にするかどうかを指定します。 |
| [StreamReader](./streamreader/)(const System::String\&, const EncodingPtr\&, bool, int) | 指定されたエンコーディングと指定されたサイズのバッファを使用して、指定されたファイルから文字を読み取る [StreamReader](./) オブジェクトのインスタンスを作成します。パラメーターはバイトオーダーマーク検出を有効にするかどうかを指定します。 |
| [~StreamReader](./~streamreader/)() | デストラクタ。 |
## 参照

* Class [TextReader](../textreader/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
