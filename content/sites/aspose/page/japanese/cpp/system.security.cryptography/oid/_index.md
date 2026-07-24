---
title: "System::Security::Cryptography::Oid クラス"
linktitle: "Oid"
second_title: "C++ 用 Aspose.Page"
description: "System::Security::Cryptography::Oid クラス。暗号オブジェクト識別子。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 2500
url: /ja/cpp/system.security.cryptography/oid/
---
## Oid class


暗号オブジェクト識別子。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class Oid : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [FromFriendlyName](./fromfriendlyname/)(const String\&, OidGroup) | 指定された OID フレンドリ名から OID オブジェクトを作成します。 |
| static [FromOidValue](./fromoidvalue/)(const String\&, OidGroup) | 指定された OID 値から OID オブジェクトを作成します。 |
| [get_FriendlyName](./get_friendlyname/)() const | オブジェクトのユーザーフレンドリ名を取得します。 |
| [get_Value](./get_value/)() const | オブジェクト識別子文字列を取得します。 |
| [Oid](./oid/)() | RTTI 情報。 |
| [Oid](./oid/)(const SharedPtr\<Oid\>\&) | コピーコンストラクタ。 |
| [Oid](./oid/)(const String\&) | コンストラクタ。 |
| [Oid](./oid/)(const String\&, const String\&) | コンストラクタ。 |
| [set_FriendlyName](./set_friendlyname/)(const String\&) | オブジェクトのユーザーフレンドリ名を設定します。 |
| [set_Value](./set_value/)(const String\&) | オブジェクト識別子文字列を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Security::Cryptography](../)
* Library [Aspose.Page for C++](../../)
