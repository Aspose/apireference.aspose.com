---
title: "System::IO::BasicSTDOStreamWrapper クラス"
linktitle: "BasicSTDOStreamWrapper"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BasicSTDOStreamWrapper クラス。std::basic_ostream とその派生オブジェクト用の System.IO.Stream ライクなラッパーを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.io/basicstdostreamwrapper/
---
## BasicSTDOStreamWrapper class


【System.IO.Stream】(../stream/)-like ラッパーとして、std::basic_ostream とその派生オブジェクトを表します。このクラスのオブジェクトは 【System::MakeObject()】(../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを 【System::SmartPtr】(../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename T,typename>class BasicSTDOStreamWrapper : public virtual System::IO::STDIOStreamWrapperBase<T>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(std::basic_ostream\<char_type, traits_type\>\&, STDIOStreamWrappingMode) | [BasicSTDOStreamWrapper](./) の新しいインスタンスを構築します。 |
| [BasicSTDOStreamWrapper](./basicstdostreamwrapper/)(const BasicSTDOStreamWrapper\&) | コピーコンストラクタ。削除されています。 |
| [Flush](./flush/)() override | このストリームのバッファをクリアし、バッファされたすべてのデータを書き込み先のストレージに書き込みます。 |
| [operator=](./operator=/)(const BasicSTDOStreamWrapper\&) | コピー代入演算子。削除されています。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ラッピングモードがバイナリの場合、ストリームから指定されたバイト数を読み取り、そうでない場合は指定された文字数を読み取り、それらを uint8_t 型に変換します。読み取り結果を指定されたバイト配列に書き込みます。サポートされていません！ |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [ReadByte](./readbyte/)() override | ラッピングモードがバイナリの場合、最後にデコードされた文字ストレージから単一バイトを読み取り、そうでない場合はストリームから単一文字を読み取り、uint8_t 型に変換します。サポートされていません！ |
| [SetLength](./setlength/)(int64_t) override | 現在のオブジェクトが表すストリームの長さを設定します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ラッピングモードがバイナリの場合、指定されたバイト配列から指定されたバイトのサブレンジを書き込み、ストリームに出力します。そうでない場合は、指定されたバイト配列から指定されたバイトのサブレンジを [char_type](./char_type/) 型に変換し、結果をストリームに書き込みます。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [WriteByte](./writebyte/)(uint8_t) override | ラッピングモードがバイナリの場合、指定された符号なし 8 ビット整数値を書き込みます。そうでない場合はそれを [char_type](./char_type/) 型に変換し、結果をストリームに書き込みます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../stream/null/) | 基盤となるストレージを持たないストリームです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [BaseType](./basetype/) |  |
| [char_type](./char_type/) | RTTI 情報。 |
| [ThisType](./thistype/) |  |
| [ThisTypeBaseTypesInfo](./thistypebasetypesinfo/) |  |
| [traits_type](./traits_type/) |  |
## 参照

* Class [STDIOStreamWrapperBase](../stdiostreamwrapperbase/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
