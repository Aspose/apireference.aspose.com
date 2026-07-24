---
title: "System::Security::Cryptography::RijndaelManaged クラス"
linktitle: "RijndaelManaged"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::RijndaelManaged クラス。マネージド Rijndael アルゴリズム。None パディングの ECB および CFB モード、None と Zeros パディングの CBC モードのみサポートします。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3100
url: /ja/cpp/system.security.cryptography/rijndaelmanaged/
---
## RijndaelManaged class


マネージド [Rijndael](../rijndael/) アルゴリズム。None パディングの ECB および CFB モード、None と Zeros パディングの CBC モードのみサポートします。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class RijndaelManaged : public System::Security::Cryptography::Rijndael
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

* Class [Rijndael](../rijndael/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
