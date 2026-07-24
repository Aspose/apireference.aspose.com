---
title: "System::Net::Sockets::NetworkStream クラス"
linktitle: "NetworkStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Sockets::NetworkStream クラス。このクラスはネットワークアクセス用データの基礎となるストリームを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.net.sockets/networkstream/
---
## NetworkStream class


ネットワークアクセス用データの基礎となるストリームを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class NetworkStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 非同期読み取り操作を開始します。 |
| [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t, AsyncCallback, System::SharedPtr\<Object\>) override | 非同期書き込み操作を開始します。 |
| [Close](./close/)(int) | 指定された時間が経過した後、現在のインスタンスを閉じます。 |
| [EndRead](./endread/)(System::SharedPtr\<IAsyncResult\>) override | 指定された非同期読み取り操作が完了するまで待機します。 |
| [EndWrite](./endwrite/)(System::SharedPtr\<IAsyncResult\>) override | 非同期書き込み操作を終了します。指定された非同期書き込み操作が完了するまで待機します。 |
| [Flush](./flush/)() override | このストリームのバッファをクリアし、バッファされたすべてのデータを書き込み先のストレージに書き込みます。 |
| [get_CanRead](./get_canread/)() const override | RTTI 情報。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanTimeout](./get_cantimeout/)() const override | 現在のストリームがタイムアウトできるかどうかを決定する値を取得します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能かどうかを判断します。 |
| [get_DataAvailable](./get_dataavailable/)() const | 読み取り可能なデータがあるかどうかを示す値を返します。 |
| [get_Length](./get_length/)() const override | ストリームの長さ（バイト単位）を返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| [get_ReadTimeout](./get_readtimeout/)() const override | ミリ秒単位で、ストリームがタイムアウトするまでに読み取りを試みる時間を決定する値を取得します。 |
| [get_Socket](./get_socket/)() | 基礎となる [Socket](../socket/) を取得します。 |
| [get_WriteTimeout](./get_writetimeout/)() const override | ミリ秒単位で、ストリームがタイムアウトするまで書き込みを試みる時間を決定する値を取得します。 |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>) | 新しいインスタンスを構築します。 |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, System::IO::FileAccess, bool) | 新しいインスタンスを構築します。 |
| [NetworkStream](./networkstream/)(System::SharedPtr\<System::Net::Sockets::Socket\>, bool) | 新しいインスタンスを構築します。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Position](./set_position/)(int64_t) override | ストリームの位置を設定します。 |
| [set_ReadTimeout](./set_readtimeout/)(int32_t) override | 現在のストリームがタイムアウトできるかどうかを決定する値を設定します。 |
| [set_WriteTimeout](./set_writetimeout/)(int32_t) override | ミリ秒単位で、ストリームがタイムアウトするまで読み取りを試みる時間を決定する値を設定します。 |
| [SetLength](./setlength/)(int64_t) override | 現在のオブジェクトが表すストリームの長さを設定します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| virtual [~NetworkStream](./~networkstream/)() | 現在のインスタンスを破棄します。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 基盤となるストレージを持たないストリームです。 |
## 参照

* Class [Stream](../../system.io/stream/)
* Namespace [System::Net::Sockets](../)
* Library [Aspose.Page for C++](../../)
