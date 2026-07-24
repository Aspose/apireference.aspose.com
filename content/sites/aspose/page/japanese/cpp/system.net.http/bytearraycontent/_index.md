---
title: "System::Net::Http::ByteArrayContent クラス"
linktitle: "ByteArrayContent"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::ByteArrayContent クラス。HTTP コンテンツをバイト配列として表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.net.http/bytearraycontent/
---
## ByteArrayContent class


HTTP コンテンツをバイト配列として表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ByteArrayContent : public System::Net::Http::HttpContent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>) | RTTI 情報。 |
| [ByteArrayContent](./bytearraycontent/)(System::ArrayPtr\<uint8_t\>, int32_t, int32_t) | 新しいインスタンスを構築します。 |
| [TryComputeLength](./trycomputelength/)(int64_t\&) override | バイト配列の長さを計算しようとします。 |
## フィールド

| フィールド | 説明 |
| --- | --- |
| static [DefaultStringEncoding](../httpcontent/defaultstringencoding/) | デフォルトのエンコーディングです。 |
| static [MaxBufferSize](../httpcontent/maxbuffersize/) | バイト数の最大値です。 |
## 参照

* Class [HttpContent](../httpcontent/)
* Namespace [System::Net::Http](../)
* Library [Aspose.Page for C++](../../)
