---
title: "System::Security::Cryptography::X509Certificates::X509Certificate class"
linktitle: "X509Certificate"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Certificate クラス。X.509 v.3 証明書です。暗号化された証明書はサポートされていません。サポートされているフラグは X509KeyStorageFlags::DefaultKeySet のみです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 300
url: /ja/cpp/system.security.cryptography.x509certificates/x509certificate/
---
## X509Certificate class


X.509 v.3 証明書です。暗号化された証明書はサポートされていません。サポートされているフラグは [X509KeyStorageFlags::DefaultKeySet](../x509keystorageflags/) のみです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class X509Certificate : public virtual System::Object,
                        public System::IDisposable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [CreateFromCertFile](./createfromcertfile/)(const String\&) | 指定された PKCS7 ファイルから証明書を作成します。 |
| static [CreateFromSignedFile](./createfromsignedfile/)(const String\&) | 指定された署名付きファイルから証明書を作成します。 |
| [Dispose](./dispose/)() override | 何もしません。 |
| [Equals](./equals/)(SharedPtr\<Object\>) override | 2 つの証明書を比較します。 |
| virtual [Export](./export/)(X509ContentType) const | 現在のオブジェクトを指定された形式でバイト配列にエクスポートします。未実装です。 |
| virtual [Export](./export/)(X509ContentType, const SecureStringPtr\&) const | 現在のオブジェクトを指定された形式でバイト配列にエクスポートします。未実装です。 |
| virtual [Export](./export/)(X509ContentType, const String\&) const | 現在のオブジェクトを指定された形式でバイト配列にエクスポートします。未実装です。 |
| [get_Handle](./get_handle/)() const | Microsoft Cryptographic API の証明書コンテキストへのハンドルを取得します。 |
| [get_Issuer](./get_issuer/)() const | X.509v3 証明書を発行した認証局の名前を取得します。 |
| [get_Subject](./get_subject/)() const | 証明書からサブジェクトの識別名を取得します。 |
| virtual [GetCertHash](./getcerthash/)() const | 現在のオブジェクトのハッシュをバイト配列として取得します。 |
| virtual [GetCertHash](./getcerthash/)(const HashAlgorithmName\&) const | 現在のオブジェクトのハッシュをバイト配列として取得します。 |
| virtual [GetCertHashString](./getcerthashstring/)() const | 現在のオブジェクトの [SHA1](../../system.security.cryptography/sha1/) ハッシュを16進文字列として取得します。 |
| virtual [GetCertHashString](./getcerthashstring/)(const HashAlgorithmName\&) const | 現在のオブジェクトの [SHA1](../../system.security.cryptography/sha1/) ハッシュを16進文字列として取得します。 |
| virtual [GetEffectiveDateString](./geteffectivedatestring/)() const | 現在の証明書の有効日付を取得します。 |
| virtual [GetExpirationDateString](./getexpirationdatestring/)() const | 現在の証明書の有効期限日付を取得します。 |
| virtual [GetFormat](./getformat/)() const | 証明書形式の名前を取得します。 |
| [GetHashCode](./gethashcode/)() const override | 証明書のハッシュコードを取得します。 |
| virtual [GetIssuerName](./getissuername/)() const | 現在の証明書を発行した認証局の名前を取得します。 |
| virtual [GetKeyAlgorithm](./getkeyalgorithm/)() const | 現在の証明書の鍵情報を文字列として取得します。 |
| virtual [GetKeyAlgorithmParameters](./getkeyalgorithmparameters/)() const | 現在の証明書の鍵情報をバイト配列として取得します。 |
| virtual [GetKeyAlgorithmParametersString](./getkeyalgorithmparametersstring/)() const | 現在の証明書の鍵情報を16進文字列として取得します。 |
| virtual [GetName](./getname/)() const | 現在の証明書が発行されたプリンシパルの名前を取得します。 |
| virtual [GetPublicKey](./getpublickey/)() const | 証明書から公開鍵をバイト配列として取得します。 |
| virtual [GetPublicKeyString](./getpublickeystring/)() const | 証明書から公開鍵を16進文字列として取得します。 |
| virtual [GetRawCertData](./getrawcertdata/)() const | 証明書から生データをバイト配列として取得します。 |
| virtual [GetRawCertDataString](./getrawcertdatastring/)() const | 証明書から生データを16進文字列として取得します。 |
| virtual [GetSerialNumber](./getserialnumber/)() const | 証明書からシリアル番号をバイト配列として取得します。 |
| virtual [GetSerialNumberString](./getserialnumberstring/)() const | 証明書からシリアル番号を16進文字列として取得します。 |
| virtual [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | 指定された証明書ファイルから情報をインポートします。未実装です。 |
| virtual [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) | 指定された証明書ファイルから情報をインポートします。未実装です。 |
| virtual [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | 指定された証明書データから情報をインポートします。未実装です。 |
| virtual [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | 指定された証明書データから情報をインポートします。未実装です。 |
| virtual [Import](./import/)(const String\&) | 指定された証明書ファイルから情報をインポートします。未実装です。 |
| virtual [Import](./import/)(const ByteArrayPtr\&) | 指定された証明書データから情報をインポートします。未実装です。 |
| [operator=](./operator=/)(const X509Certificate\&) |  |
| virtual [Reset](./reset/)() | 証明書の状態をリセットします。 |
| virtual [ToString](./tostring/)(bool) const | 証明書情報をテキスト形式で返します。 |
| [ToString](./tostring/)() const override | 証明書情報をテキスト形式で返します。 |
| [X509Certificate](./x509certificate/)(const X509Certificate\&) |  |
| [X509Certificate](./x509certificate/)() | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const String\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const SharedPtr\<X509Certificate\>\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const String\&, const String\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const String\&, const String\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate](./x509certificate/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | コンストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Ptr](./ptr/) | ポインタ型。 |
## 参照

* Class [Object](../../system/object/)
* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
