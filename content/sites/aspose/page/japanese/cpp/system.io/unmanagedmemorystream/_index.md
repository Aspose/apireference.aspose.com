---
title: "System::IO::UnmanagedMemoryStream クラス"
linktitle: "UnmanagedMemoryStream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::UnmanagedMemoryStream クラス。アンマネージドメモリへのアクセスを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 2800
url: /ja/cpp/system.io/unmanagedmemorystream/
---
## UnmanagedMemoryStream class


アンマネージドメモリへのアクセスを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class UnmanagedMemoryStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Flush](./flush/)() override | 何もしません。 |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取り可能かどうかを判断します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能かどうかを判断します。 |
| virtual [get_Capacity](./get_capacity/)() const | 基礎となるメモリバッファの現在の容量を返します。 |
| [get_Length](./get_length/)() const override | ストリームの長さ（バイト単位）を返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| [get_PositionPointer](./get_positionpointer/)() | 未実装です。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Position](./set_position/)(int64_t) override | ストリームの位置を設定します。 |
| [set_PositionPointer](./set_positionpointer/)(uint8_t *) | 未実装です。 |
| [SetLength](./setlength/)(int64_t) override | 未実装です。 |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t) | [UnmanagedMemoryStream](./) の新しいインスタンスを構築します。 |
| [UnmanagedMemoryStream](./unmanagedmemorystream/)(uint8_t *, int64_t, int64_t, FileAccess) | [UnmanagedMemoryStream](./) の新しいインスタンスを構築します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 未実装です。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 未実装です。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../stream/null/) | 基盤となるストレージを持たないストリームです。 |
## 参照

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
