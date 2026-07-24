---
title: "System::Security::Cryptography::RC2Managed クラス"
linktitle: "RC2Managed"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RC2Managed クラス。マネージド RC2 アルゴリズムです。サポートされている暗号モードは ECB、CFB、CBC のみです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2800
url: /ja/cpp/system.security.cryptography/rc2managed/
---
## RC2Managed class


マネージド [RC2](../rc2/) アルゴリズムです。サポートされている暗号モードは ECB、CFB、CBC のみです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class RC2Managed : public System::Security::Cryptography::RC2
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [CreateDecryptor](./createdecryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 明示的なパラメータで復号器オブジェクトを作成します。 |
| virtual [CreateDecryptor](./createdecryptor/)() | アルゴリズムオブジェクトで定義されたパラメータで復号器オブジェクトを作成します。 |
| [CreateEncryptor](./createencryptor/)(System::ArrayPtr\<uint8_t\>, System::ArrayPtr\<uint8_t\>) override | 明示的なパラメータで暗号化オブジェクトを作成します。 |
| virtual [CreateEncryptor](./createencryptor/)() | アルゴリズムオブジェクトで定義されたパラメータで暗号化オブジェクトを作成します。 |
| [GenerateIV](./generateiv/)() override | ランダムな初期ベクトルを作成し、アルゴリズムの内部に格納します。 |
| [GenerateKey](./generatekey/)() override | ランダムなキーを作成し、アルゴリズムの内部に格納します。 |
## 参照

* Class [RC2](../rc2/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
