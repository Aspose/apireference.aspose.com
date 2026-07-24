---
title: "System::Security::Cryptography::HMACSHA512 クラス"
linktitle: "HMACSHA512"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::HMACSHA512 クラス。SHA512 ハッシュ関数を使用するハッシュベースのメッセージ認証コードです。部分的に実装されています。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1900
url: /ja/cpp/system.security.cryptography/hmacsha512/
---
## HMACSHA512 class


ハッシュベースのメッセージ [Authentication](../../system.security.authentication/) コードで、[SHA512](../sha512/) ハッシュ関数を使用します。部分的に実装されています。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class HMACSHA512 : public System::Security::Cryptography::HashAlgorithm
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ComputeHash](./computehash/)(const ArrayPtr\<uint8_t\>\&) | [HMAC](../hmac/) を計算します。 |
| [HMACSHA512](./hmacsha512/)() | コンストラクタ。 |
| [HMACSHA512](./hmacsha512/)(const System::ArrayPtr\<uint8_t\>\&) | コンストラクタ。 |
## 参照

* Class [HashAlgorithm](../hashalgorithm/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
