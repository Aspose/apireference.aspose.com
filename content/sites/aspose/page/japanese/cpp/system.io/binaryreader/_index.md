---
title: "System::IO::BinaryReader クラス"
linktitle: "BinaryReader"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BinaryReader クラス。特定のエンコーディングでプリミティブ データ型をバイナリ データとして読み取るリーダーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、関数への引数としてこのポインタを使用してください。"
type: docs
weight: 800
url: /ja/cpp/system.io/binaryreader/
---
## BinaryReader class


特定のエンコーディングでプリミティブ データ型をバイナリ データとして読み取るリーダーを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数への引数としてこのポインタを使用してください。

```cpp
class BinaryReader : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&) | 指定されたストリームからデータを読み取り、UTF-8 エンコーディングを使用する [BinaryReader](./) クラスのインスタンスを構築します。 |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&) | 指定されたストリームからデータを読み取り、指定されたエンコーディングを使用する [BinaryReader](./) クラスのインスタンスを構築します。 |
| [BinaryReader](./binaryreader/)(const SharedPtr\<Stream\>\&, const SharedPtr\<Text::Encoding\>\&, bool) | 指定されたストリームからデータを読み取り、指定されたエンコーディングを使用する [BinaryReader](./) クラスのインスタンスを構築します。 |
| virtual [Close](./close/)() | 現在の [BinaryReader](./) オブジェクトと基になる入力ストリームを閉じます。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、基になるストリームを閉じます。 |
| virtual [get_BaseStream](./get_basestream/)() | 入力ストリームを返します。 |
| virtual [PeekChar](./peekchar/)() | ストリームの読み取りカーソルを変更せずに、入力ストリームから単一の文字を読み取ります。 |
| virtual [Read](./read/)() | 入力ストリームから単一の文字を読み取ります。 |
| virtual [Read](./read/)(ArrayPtr\<uint8_t\>, int, int) | 入力ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| virtual [Read](./read/)(ArrayPtr\<char_t\>, int, int) | 入力ストリームから指定された文字数を読み取り、UTF-16 エンコーディングに変換し、指定された位置から開始して指定された文字配列に結果の UTF-16 文字を書き込みます。 |
| virtual [ReadBoolean](./readboolean/)() | 入力ストリームから単一のバイトを読み取り、そのブール表現を返します。 |
| virtual [ReadByte](./readbyte/)() | 入力ストリームから単一のバイトを読み取ります。 |
| virtual [ReadBytes](./readbytes/)(int) | 入力ストリームから指定されたバイト数を読み取ります。 |
| virtual [ReadChar](./readchar/)() | 入力ストリームから単一の文字を読み取ります。 |
| virtual [ReadChars](./readchars/)(int) | 入力ストリームから指定された文字数を読み取り、UTF-16 エンコーディングで返します。 |
| virtual [ReadDecimal](./readdecimal/)() | 未実装です。 |
| virtual [ReadDouble](./readdouble/)() | 入力ストリームから 8 バイトを読み取り、倍精度浮動小数点値として返します。 |
| virtual [ReadInt16](./readint16/)() | 入力ストリームから 2 バイトを読み取り、16 ビット整数値として返します。 |
| virtual [ReadInt32](./readint32/)() | 入力ストリームから4バイトを読み取り、32ビット整数値として返します。 |
| virtual [ReadInt64](./readint64/)() | 入力ストリームから8バイトを読み取り、64ビット整数値として返します。 |
| virtual [ReadSByte](./readsbyte/)() | 入力ストリームから1バイトを読み取り、符号付き8ビット整数値として返します。 |
| virtual [ReadSingle](./readsingle/)() | 入力ストリームから4バイトを読み取り、単精度浮動小数点値として返します。 |
| virtual [ReadString](./readstring/)() | 現在のストリームから文字列を読み取ります。文字列は長さがプレフィックスとして付与され、整数を7ビットずつエンコードした形式です。 |
| virtual [ReadUInt16](./readuint16/)() | 入力ストリームから2バイトを読み取り、符号なし16ビット整数値として返します。 |
| virtual [ReadUInt32](./readuint32/)() | 入力ストリームから4バイトを読み取り、符号なし32ビット整数値として返します。 |
| virtual [ReadUInt64](./readuint64/)() | 入力ストリームから8バイトを読み取り、符号なし64ビット整数値として返します。 |
| virtual [~BinaryReader](./~binaryreader/)() | デストラクタ。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
