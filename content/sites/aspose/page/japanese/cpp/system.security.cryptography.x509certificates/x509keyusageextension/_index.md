---
title: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension クラス"
linktitle: "X509KeyUsageExtension"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::X509Certificates::X509KeyUsageExtension クラス。キーの使用法に関する追加情報を保持する拡張オブジェクトです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 1600
url: /ja/cpp/system.security.cryptography.x509certificates/x509keyusageextension/
---
## X509KeyUsageExtension class


キーの使用法に関する追加情報を保持する拡張オブジェクトです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class X509KeyUsageExtension : public System::Security::Cryptography::X509Certificates::X509Extension
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CopyFrom](./copyfrom/)(const SharedPtr\<AsnEncodedData\>\&) override | 他のオブジェクトから拡張データをコピーします。 |
| [get_KeyUsages](./get_keyusages/)() | キーの使用法を取得します。 |
| [X509KeyUsageExtension](./x509keyusageextension/)() | RTTI 情報。 |
| [X509KeyUsageExtension](./x509keyusageextension/)(const SharedPtr\<AsnEncodedData\>\&, bool) | コンストラクタ。 |
| [X509KeyUsageExtension](./x509keyusageextension/)(X509KeyUsageFlags, bool) | コンストラクタ。 |
## 参照

* Class [X509Extension](../x509extension/)
* Namespace [System::Security::Cryptography::X509Certificates](../)
* Library [Aspose.Page for C++](../../)
