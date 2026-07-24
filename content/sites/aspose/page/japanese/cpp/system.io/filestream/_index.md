---
title: "System::IO::FileStream クラス"
linktitle: "FileStream"
second_title: "C++ 用 Aspose.Page"
description: "System::IO::FileStream クラス。同期および非同期の読み書き操作をサポートするファイルストリームを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 1500
url: /ja/cpp/system.io/filestream/
---
## FileStream class


同期および非同期の読み書き操作をサポートするファイルストリームを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class FileStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | 現在の [FileStream](./) オブジェクトを閉じます。 |
| [FileStream](./filestream/)(const String\&, FileMode) | 指定されたパラメータで [FileStream](./) クラスの新しいインスタンスを作成し、初期化します。 |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, FileOptions) | 指定されたパラメータで [FileStream](./) クラスの新しいインスタンスを作成し、初期化します。 |
| [FileStream](./filestream/)(const String\&, FileMode, FileAccess, FileShare, int32_t, bool) | 指定されたパラメータで [FileStream](./) クラスの新しいインスタンスを作成し、初期化します。 |
| [FileStream](./filestream/)(const FileStream\&) |  |
| [Flush](./flush/)() override | このストリームのバッファをクリアし、すべてのバッファデータを基になるファイルに書き込みます。 |
| [Flush](./flush/)(bool) | このストリームのバッファをクリアし、すべてのバッファデータを基になるファイルに書き込みます。メソッド [Flush()](./flush/) の同義語です。 |
| [FlushAsync](./flushasync/)(const Threading::CancellationToken\&) override | このストリームのすべてのバッファを非同期的にクリアし、バッファされたデータを基になるデバイスに書き込み、キャンセル要求を監視します。 |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取り可能かどうかを判断します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシークをサポートしているかどうかを判断します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能かどうかを判断します。 |
| [get_Length](./get_length/)() const override | ストリームの長さ（バイト単位）を返します。 |
| [get_Name](./get_name/)() const | 現在の [FileStream](./) オブジェクトがカプセル化しているファイル名を返します。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を返します。 |
| [operator=](./operator=/)(const FileStream\&) |  |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームから指定されたバイト数を読み取り、指定されたバイト配列に書き込みます。 |
| [ReadAsync](./readasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | 現在のストリームからバイトのシーケンスを非同期的に読み取り、読み取ったバイト数だけストリーム内の位置を進め、キャンセル要求を監視します。 |
| [ReadByte](./readbyte/)() override | ストリームから単一バイトを読み取り、読み取ったバイトの値に相当する 32 ビット整数値を返します。 |
| [Seek](./seek/)(int64_t, SeekOrigin) override | 現在のオブジェクトが表すストリームの位置を設定します。 |
| [set_Position](./set_position/)(int64_t) override | ストリームをフラッシュし、続いてストリームの位置を設定します。 |
| [SetLength](./setlength/)(int64_t) override | 現在のオブジェクトが表すストリームの長さを設定します。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | 指定されたバイト配列の指定されたサブレンジを書き込み、ストリームに送ります。 |
| [WriteAsync](./writeasync/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t, const Threading::CancellationToken\&) override | 現在のストリームにバイトのシーケンスを書き込み、書き込んだバイト数だけこのストリーム内の位置を進め、キャンセル要求を監視します（非同期）。 |
| [WriteByte](./writebyte/)(uint8_t) override | 指定された符号なし 8 ビット整数値をストリームに書き込みます。 |
| [~FileStream](./~filestream/)() | デストラクタ。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static constexpr [DefaultBufferSize](./defaultbuffersize/) | 読み取りおよび書き込み操作中にバッファリングされるバイト数のデフォルト値。 |
| static [Null](../stream/null/) | 基盤となるストレージを持たないストリームです。 |
## 参照

* Class [Stream](../stream/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
