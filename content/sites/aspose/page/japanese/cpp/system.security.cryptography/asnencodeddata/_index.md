---
title: "System::Security::Cryptography::AsnEncodedData クラス"
linktitle: "AsnEncodedData"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::AsnEncodedData クラス。ASN.1 エンコードされたデータ。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography/asnencodeddata/
---
## AsnEncodedData class


ASN.1 エンコードされたデータ。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class AsnEncodedData : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI 情報。 |
| [AsnEncodedData](./asnencodeddata/)(const ByteArrayPtr\&) | コンストラクタ。 |
| [AsnEncodedData](./asnencodeddata/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&) | コンストラクタ。 |
| [AsnEncodedData](./asnencodeddata/)(const String\&, const ByteArrayPtr\&) | コンストラクタ。 |
| virtual [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) | 別のオブジェクトからデータをコピーします。 |
| virtual [Format](./format/)(bool) const | データを人間が読みやすい形式に整形します。 |
| [get_Oid](./get_oid/)() const | エンコードされたデータのオブジェクト識別子を取得します。 |
| [get_RawData](./get_rawdata/)() const | 生のエンコードデータを取得します。 |
| [set_Oid](./set_oid/)(const SharedPtr\<Oid\>\&) | エンコードされたデータのオブジェクト識別子を設定します。 |
| [set_RawData](./set_rawdata/)(const ByteArrayPtr\&) | 生のエンコードデータを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
