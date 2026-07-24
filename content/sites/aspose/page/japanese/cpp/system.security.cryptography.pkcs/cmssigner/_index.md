---
title: "System::Security::Cryptography::Pkcs::CmsSigner クラス"
linktitle: "CmsSigner"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::Pkcs::CmsSigner クラス。CMS を使用してオブジェクトに署名するための API を提供します。単体ではオブジェクトに署名しません。署名するには SignedCMS クラスを使用してください。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 100
url: /ja/cpp/system.security.cryptography.pkcs/cmssigner/
---
## CmsSigner class


CMS を使用してオブジェクトに署名するための API を提供します。単体ではオブジェクトに署名しません。署名するには SignedCMS クラスを使用してください。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class CmsSigner : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CmsSigner](./cmssigner/)(const SharedPtr\<X509Certificates::X509Certificate2\>\&) | X509 証明書で署名者を初期化します。 |
| [get_DigestAlgorithm](./get_digestalgorithm/)() const | 署名に使用するハッシュアルゴリズムを取得します。 |
| [get_IncludeOption](./get_includeoption/)() const | チェーン内のどの証明書が署名に含まれるかを確認します。 |
| [set_DigestAlgorithm](./set_digestalgorithm/)(const SharedPtr\<Oid\>\&) | 署名に使用するハッシュアルゴリズムを設定します。 |
| [set_IncludeOption](./set_includeoption/)(X509Certificates::X509IncludeOption) | 署名に含めるチェーン内の証明書を指定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
