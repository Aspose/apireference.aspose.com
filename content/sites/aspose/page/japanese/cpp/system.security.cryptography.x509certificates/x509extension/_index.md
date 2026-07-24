---
title: "System::Security::Cryptography::X509Certificates::X509Extension クラス"
linktitle: "X509Extension"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509Extension クラス。X.509 証明書に関連付けられた追加情報を保持する拡張オブジェクト。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。"
type: docs
weight: 1200
url: /ja/cpp/system.security.cryptography.x509certificates/x509extension/
---
## X509Extension class


拡張オブジェクトは X.509 証明書に関連付けられた追加情報を保持します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class X509Extension : public System::Security::Cryptography::AsnEncodedData
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | 他のオブジェクトから拡張データをコピーします。 |
| [get_Critical](./get_critical/)() const | 拡張がクリティカルかどうかを確認します。 |
| [set_Critical](./set_critical/)(bool) | 拡張がクリティカルかどうかを定義します。 |
| [X509Extension](./x509extension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | RTTI 情報。 |
| [X509Extension](./x509extension/)(const SharedPtr\<Oid\>\&, const ByteArrayPtr\&, bool) | コンストラクタ。 |
| [X509Extension](./x509extension/)(const String\&, const ByteArrayPtr\&, bool) | コンストラクタ。 |
## 参照

* Class [AsnEncodedData](../../system.security.cryptography/asnencodeddata/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
