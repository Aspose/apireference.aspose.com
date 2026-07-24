---
title: "System::Security::Cryptography::TripleDESManaged クラス"
linktitle: "TripleDESManaged"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::TripleDESManaged クラス。Managed TripleDES 実装。None パディングの ECB および CFB モードと、None、Zeros、PKCS7 パディングの CBC モードのみをサポートします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 5200
url: /ja/cpp/system.security.cryptography/tripledesmanaged/
---
## TripleDESManaged class


Managed [TripleDES](../tripledes/) 実装。None パディングの ECB および CFB モードと、None、Zeros、PKCS7 パディングの CBC モードのみをサポートします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数として渡す際にそのポインタを使用してください。

```cpp
class TripleDESManaged : public System::Security::Cryptography::TripleDES
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

* Class [TripleDES](../tripledes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
