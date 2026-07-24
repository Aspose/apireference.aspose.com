---
title: "System::Security::Cryptography::Pkcs::SignedCms クラス"
linktitle: "SignedCms"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::Pkcs::SignedCms クラス。CMS/PKCS #7 標準に従ってコンテンツに署名します。実装されていません。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として使用してください。C++。"
type: docs
weight: 300
url: /ja/cpp/system.security.cryptography.pkcs/signedcms/
---
## SignedCms class


CMS/PKCS #7 標準に従ってコンテンツに署名します。実装されていません。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうすると実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class SignedCms : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ComputeSignature](./computesignature/)(const SharedPtr\<CmsSigner\>\&, bool) | 署名を作成します。 |
| [Encode](./encode/)() | CMS/PKCS #7 メッセージをエンコードします。 |
| [SignedCms](./signedcms/)(const SharedPtr\<ContentInfo\>\&, bool) | コンストラクタ。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography::Pkcs](../)
* Library [Aspose.Page for C++](../../)
