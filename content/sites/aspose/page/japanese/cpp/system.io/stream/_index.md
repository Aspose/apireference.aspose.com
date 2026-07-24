---
title: "System::IO::Stream クラス"
linktitle: "Stream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::Stream クラス。さまざまなストリーム実装の基底クラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 2100
url: /ja/cpp/system.io/stream/
---
## Stream class


さまざまなストリーム実装の基底クラスです。このクラスのオブジェクトは 【System::MakeObject()】(../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを 【System::SmartPtr】(../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class Stream : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [BeginRead](./beginread/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | 非同期読み取り操作を開始します。 |
| virtual [BeginWrite](./beginwrite/)(System::ArrayPtr\<uint8_t\>, int, int, System::AsyncCallback, System::SharedPtr\<System::Object\>) | 非同期書き込み操作を開始します。 |
| virtual [Close](./close/)() | ストリームを閉じます。 |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&) | バイトを指定されたストリームにコピーします。 |
| [CopyTo](./copyto/)(const SharedPtr\<Stream\>\&, int32_t) | 指定されたバッファサイズを使用して、バイトを指定されたストリームにコピーします。 |
| [Dispose](./dispose/)() override | 現在のオブジェクトが使用しているすべてのリソースを解放し、ストリームを閉じます。 |
| virtual [EndRead](./endread/)(System::SharedPtr\<System::IAsyncResult\>) | 指定された非同期読み取り操作が完了するまで待機します。 |
| virtual [EndWrite](./endwrite/)(System::SharedPtr\<System::IAsyncResult\>) | 非同期書き込み操作を終了します。指定された非同期書き込み操作が完了するまで待機します。 |
| virtual [Flush](./flush/)() | このストリームのバッファをクリアし、バッファされたすべてのデータを書き込み先のストレージに書き込みます。 |
| virtual [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) | このストリームのすべてのバッファを非同期的にクリアし、バッファされたデータを基になるデバイスに書き込み、キャンセル要求を監視します。 |
| [FlushAsync](./flushasync/)() | このストリームのすべてのバッファを非同期的にクリアし、バッファされたデータを基になるデバイスに書き込み、キャンセル要求を監視します。 |
| virtual [get_CanRead](./get_canread/)() const | ストリームが読み取り可能かどうかを判断します。 |
| virtual [get_CanSeek](./get_canseek/)() const | ストリームがシークをサポートしているかどうかを判断します。 |
| virtual [get_CanTimeout](./get_cantimeout/)() const | 現在のストリームがタイムアウトできるかどうかを決定する値を取得します。 |
| virtual [get_CanWrite](./get_canwrite/)() const | ストリームが書き込み可能かどうかを判断します。 |
| virtual [get_Length](./get_length/)() const | ストリームの長さ（バイト単位）を返します。 |
| virtual [get_Position](./get_position/)() const | ストリームの現在位置を返します。 |
| virtual [get_ReadTimeout](./get_readtimeout/)() const | ミリ秒単位で、ストリームがタイムアウトするまでに読み取りを試みる時間を決定する値を取得します。 |
| virtual [get_WriteTimeout](./get_writetimeout/)() const | ミリ秒単位で、ストリームがタイムアウトするまで書き込みを試みる時間を決定する値を取得します。 |
| virtual [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| virtual [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| virtual [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | 現在のストリームからバイトのシーケンスを非同期的に読み取り、読み取ったバイト数だけストリーム内の位置を進め、キャンセル要求を監視します。 |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 現在のストリームからバイトのシーケンスを非同期的に読み取り、読み取ったバイト数だけストリーム内の位置を進め、キャンセル要求を監視します。 |
| virtual [ReadByte](./readbyte/)() | ストリームから単一バイトを読み取り、読み取ったバイトの値に相当する 32 ビット整数値を返します。 |
| virtual [Seek](./seek/)(int64_t, SeekOrigin) | 現在のオブジェクトが表すストリームの位置を設定します。 |
| virtual [set_Position](./set_position/)(int64_t) | ストリームの位置を設定します。 |
| virtual [set_ReadTimeout](./set_readtimeout/)(int) | 現在のストリームがタイムアウトできるかどうかを決定する値を設定します。 |
| virtual [set_WriteTimeout](./set_writetimeout/)(int) | ミリ秒単位で、ストリームがタイムアウトするまで読み取りを試みる時間を決定する値を設定します。 |
| virtual [SetLength](./setlength/)(int64_t) | 現在のオブジェクトが表すストリームの長さを設定します。 |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| virtual [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [Write](./write/)(const System::Details::StackArray\<uint8_t, N\>\&, int32_t, int32_t) | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| virtual [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) | 現在のストリームにバイトのシーケンスを書き込み、書き込んだバイト数だけこのストリーム内の位置を進め、キャンセル要求を監視します（非同期）。 |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) | 現在のストリームにバイトのシーケンスを書き込み、書き込んだバイト数だけこのストリーム内の位置を進め、キャンセル要求を監視します（非同期）。 |
| virtual [WriteByte](./writebyte/)(uint8_t) | 指定された符号なし 8 ビット整数値をストリームに書き込みます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](./null/) | 基盤となるストレージを持たないストリームです。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | このクラスへの共有ポインタのエイリアスです。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
