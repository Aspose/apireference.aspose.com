---
title: "System::Security::Cryptography::CryptoStream クラス"
linktitle: "CryptoStream"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::CryptoStream クラス。暗号機能で既存のストリームをラップするストリーム実装。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 500
url: /ja/cpp/system.security.cryptography/cryptostream/
---
## CryptoStream class


暗号機能で既存のストリームをラップするストリーム実装。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class CryptoStream : public System::IO::Stream
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Close](./close/)() override | 接続を閉じます。 |
| [CryptoStream](./cryptostream/)(const SharedPtr\<System::IO::Stream\>\&, const SharedPtr\<ICryptoTransform\>\&, CryptoStreamMode) | コンストラクタ。 |
| [Flush](./flush/)() override | バッファをラップされたストリームに書き出します。変換アルゴリズムがまだデータを待機している可能性があるため、何も行いません。 |
| [FlushFinalBlock](./flushfinalblock/)() | バッファに残っているデータをストリームに書き込みます。 |
| [get_CanRead](./get_canread/)() const override | ストリームが読み取り可能か確認します。 |
| [get_CanSeek](./get_canseek/)() const override | ストリームがシーク可能か確認します。 |
| [get_CanWrite](./get_canwrite/)() const override | ストリームが書き込み可能か確認します。 |
| [get_Length](./get_length/)() const override | ストリームの長さを取得します。サポートされていません。 |
| [get_Position](./get_position/)() const override | ストリームの現在位置を取得します。サポートされていません。 |
| [Read](./read/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | ストリームからデータを読み取ります。 |
| [Read](./read/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | ストリームからデータを読み取ります。 |
| [Seek](./seek/)(int64_t, IO::SeekOrigin) override | ストリーム内の位置をシークします。サポートされていません。 |
| [set_Position](./set_position/)(int64_t) override | ストリーム内の位置をシークします。サポートされていません。 |
| [SetLength](./setlength/)(int64_t) override | ストリームのサイズをシークします。サポートされていません。 |
| [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int32_t, int32_t) override | データをストリームに書き込みます。 |
| [Write](./write/)(const System::Details::ArrayView\<uint8_t\>\&, int32_t, int32_t) override | データをストリームに書き込みます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [Null](../../system.io/stream/null/) | 基盤となるストレージを持たないストリームです。 |
## 参照

* Class [Stream](../../system.io/stream/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
