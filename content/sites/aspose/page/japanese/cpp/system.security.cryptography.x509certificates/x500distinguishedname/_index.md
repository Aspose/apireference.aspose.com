---
title: "System::Security::Cryptography::X509Certificates::X500DistinguishedName クラス"
linktitle: "X500DistinguishedName"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X500DistinguishedName クラス。X509 証明書の識別名を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.security.cryptography.x509certificates/x500distinguishedname/
---
## X500DistinguishedName class


X509 証明書の識別名を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class X500DistinguishedName : public System::Security::Cryptography::AsnEncodedData
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Decode](./decode/)(X500DistinguishedNameFlags) const | フラグで指定されたパラメータを使用して名前をデコードします。 |
| [Format](./format/)(bool) const override | 印刷用に名前をフォーマットします。 |
| [get_Name](./get_name/)() const | 証明書の識別名を取得します。 |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<AsnEncodedData\>\&) | RTTI 情報。 |
| [X500DistinguishedName](./x500distinguishedname/)(const ByteArrayPtr\&) | コンストラクタ。 |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&) | コンストラクタ。 |
| [X500DistinguishedName](./x500distinguishedname/)(const SharedPtr\<X500DistinguishedName\>\&) | コピーコンストラクタ。 |
| [X500DistinguishedName](./x500distinguishedname/)(const String\&, X500DistinguishedNameFlags) | コンストラクタ。 |
## 参照

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
