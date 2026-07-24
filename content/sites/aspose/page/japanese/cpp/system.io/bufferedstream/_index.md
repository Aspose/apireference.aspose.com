---
title: "System::IO::BufferedStream クラス"
linktitle: "BufferedStream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::BufferedStream クラス。別のストリームの上にバッファリング層を追加します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として使用してください。"
type: docs
weight: 1000
url: /ja/cpp/system.io/bufferedstream/
---
## BufferedStream class


別のストリームの上にバッファリング層を追加します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうすると実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class BufferedStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&) | 指定されたストリームをラップし、4096 バイトの長さのバッファを使用する [BufferedStream](./) オブジェクトを構築します。 |
| [BufferedStream](./bufferedstream/)(const SharedPtr\<Stream\>\&, int) | 指定されたストリームをラップし、指定サイズのバッファを使用する [BufferedStream](./) オブジェクトを構築します。 |
| [Flush](./flush/)() override | バッファの内容を基底ストリームに書き込みます。 |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取り可能かどうかを判断します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能かどうかを判断します。 |
| [get_Length](./get_length/)() const override | ストリームの長さを返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 基底ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 基底ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [ReadByte](./readbyte/)() override | 基底ストリームから 1 バイトを読み取り、読み取ったバイトの値に相当する 32 ビット整数値を返します。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Position](./set_position/)(int64_t) override | バッファを基になるストリームにフラッシュし、続いてストリームの位置を設定します。 |
| [SetLength](./setlength/)(int64_t) override | 現在のオブジェクトが表すストリームの長さを設定します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列から指定されたバイトのサブレンジを書き込み、基になるストリームに出力します。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列から指定されたバイトのサブレンジを書き込み、基になるストリームに出力します。 |
| [WriteByte](./writebyte/)(uint8_t) override | 指定された符号なし 8 ビット整数値を基になるストリームに書き込みます。 |
| virtual [~BufferedStream](./~bufferedstream/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../stream/null/) | 基盤となるストレージを持たないストリームです。 |
## 参照

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
