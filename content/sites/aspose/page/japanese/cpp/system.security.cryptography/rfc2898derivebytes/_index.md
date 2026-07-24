---
title: "System::Security::Cryptography::Rfc2898DeriveBytes クラス"
linktitle: "Rfc2898DeriveBytes"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::Rfc2898DeriveBytes クラス。パスワードベースのキー導出（PBKDF2）を実装します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2900
url: /ja/cpp/system.security.cryptography/rfc2898derivebytes/
---
## Rfc2898DeriveBytes class


パスワードベースのキー導出（PBKDF2）を実装します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class Rfc2898DeriveBytes : public System::Security::Cryptography::DeriveBytes
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [GetBytes](./getbytes/)(int32_t) override | 既存の配列要素を疑似乱数キー バイトで埋めます。 |
| [Reset](./reset/)() override |  |
| [Rfc2898DeriveBytes](./rfc2898derivebytes/)(ArrayPtr\<uint8_t\>, ArrayPtr\<uint8_t\>, int32_t) | RTTI 情報。 |
## 参照

* Class [DeriveBytes](../derivebytes/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
