---
title: "System::Net::Http::HttpContent クラス"
linktitle: "HttpContent"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::HttpContent クラス。HTTPエンティティのコンテンツを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.net.http/httpcontent/
---
## HttpContent class


HTTPエンティティのコンテンツを表します。このクラスの [Object](../../system/object/) は [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class HttpContent : public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Dispose](./dispose/)() override | 現在のインスタンスを破棄します。このメソッドは、'ReadAsStream' が返すストリームと、作成された場合のメモリバッファも破棄します。 |
| [get_Headers](./get_headers/)() | HTTP コンテンツヘッダーを返します。 |
| [LoadIntoBuffer](./loadintobuffer/)() | コンテンツをメモリバッファにシリアライズします。 |
| [LoadIntoBuffer](./loadintobuffer/)(int64_t) | コンテンツをメモリバッファにシリアライズします。 |
| [ReadAsByteArray](./readasbytearray/)() | コンテンツをシリアライズし、バイト配列を返します。 |
| [ReadAsStream](./readasstream/)() | コンテンツをシリアライズし、ストリームを返します。 |
| [ReadAsString](./readasstring/)() | コンテンツをシリアライズし、文字列を返します。 |
| virtual [TryComputeLength](./trycomputelength/)(int64_t\&) | コンテンツサイズの計算を試みます。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [DefaultStringEncoding](./defaultstringencoding/) | デフォルトのエンコーディングです。 |
| static [MaxBufferSize](./maxbuffersize/) | バイト数の最大値です。 |
## 参照

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
