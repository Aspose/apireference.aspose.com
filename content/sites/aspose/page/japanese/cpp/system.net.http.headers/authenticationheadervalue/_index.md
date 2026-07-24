---
title: "System::Net::Http::Headers::AuthenticationHeaderValue クラス"
linktitle: "AuthenticationHeaderValue"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::Http::Headers::AuthenticationHeaderValue クラス。このクラスは ''Authorization'', ''ProxyAuthorization'', ''WWW-Authenticate'', ''Proxy-Authenticate'' ヘッダーの値を表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ の関数に引数として渡す際にはそのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.net.http.headers/authenticationheadervalue/
---
## AuthenticationHeaderValue class


'Authorization', 'ProxyAuthorization', 'WWW-Authenticate', および 'Proxy-Authenticate' ヘッダーの値を表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、関数に引数として渡す際にはそのポインタを使用してください。

```cpp
class AuthenticationHeaderValue : public System::ICloneable
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String) | コンストラクタ。 |
| [AuthenticationHeaderValue](./authenticationheadervalue/)(String, String) | コンストラクタ。 |
| [Clone](./clone/)() override | RTTI 情報。 |
| [Equals](./equals/)(System::SharedPtr\<Object\>) override | C# の [Object.Equals](../../system/object/equals/) セマンティクスを使用してオブジェクトを比較します。 |
| [get_Parameter](./get_parameter/)() | 認証情報を含む資格情報を取得します。 |
| [get_Scheme](./get_scheme/)() | RTTI 情報。 |
| static [GetAuthenticationLength](./getauthenticationlength/)(String, int32_t, System::SharedPtr\<Object\>\&) | 指定された文字列を解析し、文字列表現の最後のインデックスを返します。 |
| [GetHashCode](./gethashcode/)() const override | C# の [Object.GetHashCode()](../../system/object/gethashcode/) メソッドの類似です。カスタムオブジェクトのハッシュ化を可能にします。 |
| static [Parse](./parse/)(String) | 渡された文字列を [AuthenticationHeaderValue](./) クラスのインスタンスに変換します。 |
| [ToString](./tostring/)() const override | C# の [Object.ToString()](../../system/object/tostring/) メソッドに相当します。カスタムオブジェクトを文字列に変換できるようにします。 |
| static [TryParse](./tryparse/)(String, System::SharedPtr\<AuthenticationHeaderValue\>\&) | 渡された文字列を [AuthenticationHeaderValue](./) クラスのインスタンスに変換しようとしています。 |
## 参照

* Class [ICloneable](../../system/icloneable/)
* Namespace [System::Net::Http::Headers](../)
* Library [Aspose.Page for C++](../../)
