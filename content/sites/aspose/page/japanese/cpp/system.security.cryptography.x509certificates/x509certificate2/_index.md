---
title: "System::Security::Cryptography::X509Certificates::X509Certificate2 クラス"
linktitle: "X509Certificate2"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Certificate2 クラス。X509 証明書を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 400
url: /ja/cpp/system.security.cryptography.x509certificates/x509certificate2/
---
## X509Certificate2 class


X509 証明書を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class X509Certificate2 : public System::Security::Cryptography::X509Certificates::X509Certificate
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Archived](./get_archived/)() const | 証明書がアーカイブされていることを示す値を取得します。 |
| [get_Extensions](./get_extensions/)() const | 証明書に関連付けられた拡張オブジェクトのコレクションを取得します。 |
| [get_FriendlyName](./get_friendlyname/)() const | 証明書のフレンドリ名を取得します。 |
| [get_HasPrivateKey](./get_hasprivatekey/)() const | 証明書がプライベートキーを持っているかどうかを確認します。 |
| [get_IssuerName](./get_issuername/)() const | 証明書を発行した主体の名前を取得します。 |
| [get_NotAfter](./get_notafter/)() const | 証明書が無効になる日時（ローカル）を取得します。 |
| [get_NotBefore](./get_notbefore/)() const | 証明書が有効になる日時（ローカル）を取得します。 |
| [get_PrivateKey](./get_privatekey/)() const | 証明書に関連付けられたプライベートキーを取得します。 |
| [get_PublicKey](./get_publickey/)() const | 証明書の [PublicKey](../publickey/) オブジェクトを取得します。 |
| [get_RawData](./get_rawdata/)() const | 証明書の生データを取得します。 |
| [get_SerialNumber](./get_serialnumber/)() const | 証明書のシリアル番号を取得します。 |
| [get_SignatureAlgorithm](./get_signaturealgorithm/)() const | 証明書の署名を作成するために使用されるアルゴリズムを取得します。 |
| [get_SubjectName](./get_subjectname/)() const | 証明書からサブジェクト名を取得します。 |
| [get_Thumbprint](./get_thumbprint/)() const | 証明書のサムプリントを取得します。 |
| [get_Version](./get_version/)() const | 証明書のフォーマットバージョンを取得します。 |
| static [GetCertContentType](./getcertcontenttype/)(const ByteArrayPtr\&) | 指定されたバイト配列に含まれる証明書のタイプを取得します。 |
| static [GetCertContentType](./getcertcontenttype/)(const String\&) | 指定されたファイルに含まれる証明書のタイプを取得します。 |
| [GetDSAPrivateKey](./getdsaprivatekey/)() const | [RSA](../../system.security.cryptography/rsa/) のプライベートキーを取得します。 |
| [GetDSAPublicKey](./getdsapublickey/)() const | [RSA](../../system.security.cryptography/rsa/) のパブリックキーを取得します。 |
| [GetECDsaPrivateKey](./getecdsaprivatekey/)() const | [RSA](../../system.security.cryptography/rsa/) のプライベートキーを取得します。 |
| [GetECDsaPublicKey](./getecdsapublickey/)() const | [RSA](../../system.security.cryptography/rsa/) のパブリックキーを取得します。 |
| [GetNameInfo](./getnameinfo/)(X509NameType, bool) const | 証明書からサブジェクトまたは発行者名を取得します。 |
| [GetRSAPrivateKey](./getrsaprivatekey/)() const | [RSA](../../system.security.cryptography/rsa/) のプライベートキーを取得します。 |
| [GetRSAPublicKey](./getrsapublickey/)() const | [RSA](../../system.security.cryptography/rsa/) のパブリックキーを取得します。 |
| [Import](./import/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) override | 指定された証明書ファイルから情報をインポートします。 |
| [Import](./import/)(const String\&, const String\&, X509KeyStorageFlags) override | 指定された証明書ファイルから情報をインポートします。 |
| [Import](./import/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) override | 指定された証明書データから情報をインポートします。 |
| [Import](./import/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) override | 指定された証明書データから情報をインポートします。 |
| [Import](./import/)(const String\&) override | 指定された証明書ファイルから情報をインポートします。 |
| [Import](./import/)(const ByteArrayPtr\&) override | 指定された証明書データから情報をインポートします。 |
| [Reset](./reset/)() override | 証明書の状態をリセットします。 |
| [set_Archived](./set_archived/)(bool) const | 証明書がアーカイブされていることを示す値を設定します。 |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | 証明書のフレンドリーネームを設定します。 |
| [set_PrivateKey](./set_privatekey/)(const SharedPtr\<AsymmetricAlgorithm\>\&) | 証明書に関連付けられたプライベートキーを設定またはクリアします。 |
| [ToString](./tostring/)(bool) const override | 証明書情報をテキスト形式で返します。 |
| [ToString](./tostring/)() const override | 証明書情報をテキスト形式で返します。 |
| [Verify](./verify/)() const | 証明書チェーンを検証します。 |
| [X509Certificate2](./x509certificate2/)() | 空の [X509Certificate2](./) を構築します。 |
| [X509Certificate2](./x509certificate2/)(const String\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const SharedPtr\<X509Certificate\>\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const String\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const SecureStringPtr\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const String\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const String\&, const SecureStringPtr\&, X509KeyStorageFlags) | コンストラクタ。 |
| [X509Certificate2](./x509certificate2/)(const ByteArrayPtr\&, const ByteArrayPtr\&, X509KeyStorageFlags) | コンストラクタ。 |
## 参照

* Class [X509Certificate](../x509certificate/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
