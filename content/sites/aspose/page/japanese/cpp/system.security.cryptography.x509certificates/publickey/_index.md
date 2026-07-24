---
title: "System::Security::Cryptography::X509Certificates::PublicKey クラス"
linktitle: "PublicKey"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::PublicKey クラス。X509 証明書の公開鍵情報を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography.x509certificates/publickey/
---
## PublicKey class


X509 証明書の公開鍵情報を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class PublicKey : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_EncodedKeyValue](./get_encodedkeyvalue/)() const | ASN.1 エンコードされた公開鍵の値を取得します。 |
| [get_EncodedParameters](./get_encodedparameters/)() const | ASN.1 エンコードされた公開鍵パラメータを取得します。 |
| [get_Key](./get_key/)() const | [RSACryptoServiceProvider](../../system.security.cryptography/rsacryptoserviceprovider/) または [DSACryptoServiceProvider](../../system.security.cryptography/dsacryptoserviceprovider/) を取得します。 |
| [get_Oid](./get_oid/)() const | 公開鍵の識別子 (OID) を取得します。 |
| [PublicKey](./publickey/)(const SharedPtr\<Oid\>\&, const SharedPtr\<AsnEncodedData\>\&, const SharedPtr\<AsnEncodedData\>) | コンストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
