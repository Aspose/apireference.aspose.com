---
title: "System::IO::MemoryStream クラス"
linktitle: "MemoryStream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::MemoryStream クラス。メモリから読み書きするストリームを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 1800
url: /ja/cpp/system.io/memorystream/
---
## MemoryStream class


メモリから読み取り、書き込みを行うストリームを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class MemoryStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | ストリームを閉じます。 |
| [Flush](./flush/)() override | 何もしません。 |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取り可能かどうかを判断します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能かどうかを判断します。 |
| [get_Capacity](./get_capacity/)() | 基礎となるメモリバッファの現在の容量を返します。 |
| [get_Length](./get_length/)() const override | ストリームの長さ（バイト単位）を返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| virtual [GetBuffer](./getbuffer/)() | 基底バッファへのポインタを返します。 |
| [MemoryStream](./memorystream/)() | 初期容量が 0 の [MemoryStream](./) クラスの新しいインスタンスを構築します。 |
| [MemoryStream](./memorystream/)(int) | 指定されたサイズのメモリバッファに基づくストリームを表す [MemoryStream](./) クラスの新しいインスタンスを構築します。 |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, bool) | 指定されたメモリバッファに接続されたメモリストリームを表す [MemoryStream](./) クラスの新しいインスタンスを構築します。パラメータはストリームが書き込み可能かどうかを指定します。 |
| [MemoryStream](./memorystream/)(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) | 指定されたインデックスから開始し、指定された要素数を含む、指定されたメモリバッファのセグメントに接続されたメモリストリームを表す [MemoryStream](./) クラスの新しいインスタンスを構築します。パラメータはストリームが書き込み可能かどうか、そして GetBytes() メソッドを呼び出せるかどうかを指定します。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [ReadByte](./readbyte/)() override | ストリームから単一バイトを読み取り、読み取ったバイトの値に相当する 32 ビット整数値を返します。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Capacity](./set_capacity/)(int) | 基底メモリバッファの容量を設定します。 |
| [set_Position](./set_position/)(int64_t) override | ストリームの位置を設定します。 |
| [SetLength](./setlength/)(int64_t) override | 現在のオブジェクトが表すストリームの長さを設定します。 |
| virtual [ToArray](./toarray/)() | 基底メモリバッファのコピーをバイト配列として返します。 |
| [TryGetBuffer](./trygetbuffer/)(ArraySegment\<uint8_t\>\&) | このストリームが作成された符号なしバイトの配列を返します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [WriteByte](./writebyte/)(uint8_t) override | 指定された符号なし 8 ビット整数値をストリームに書き込みます。 |
| virtual [WriteTo](./writeto/)(SharedPtr\<Stream\>) | 基底バッファの内容を指定されたストリームに書き込みます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../stream/null/) | 基盤となるストレージを持たないストリームです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | 自身への共有ポインタのエイリアスです。 |
## 参照

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
