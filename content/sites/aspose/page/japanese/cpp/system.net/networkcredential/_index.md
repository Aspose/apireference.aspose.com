---
title: "System::Net::NetworkCredential クラス"
linktitle: "NetworkCredential"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::NetworkCredential クラス。パスワードベースの認証方式のための資格情報を提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 2900
url: /ja/cpp/system.net/networkcredential/
---
## NetworkCredential class


パスワードベースの認証方式のための資格情報を提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class NetworkCredential : public System::Net::ICredentials,
                          public System::Net::ICredentialsByHost,
                          public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Domain](./get_domain/)() | 資格情報を検証するドメインを取得します。 |
| [get_Password](./get_password/)() | パスワードを取得します。 |
| [get_UserName](./get_username/)() | RTTI 情報。 |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | 指定された URI と認証タイプの資格情報を返します。 |
| [GetCredential](./getcredential/)(String, int32_t, String) override | 指定されたホスト名、ポート、および認証タイプの資格情報を返します。 |
| [NetworkCredential](./networkcredential/)() | 新しいインスタンスを構築します。 |
| [NetworkCredential](./networkcredential/)(String, String) | 新しいインスタンスを構築します。 |
| [NetworkCredential](./networkcredential/)(String, String, String) | 新しいインスタンスを構築します。 |
| [set_Domain](./set_domain/)(String) | 資格情報を検証するドメインを設定します。 |
| [set_Password](./set_password/)(String) | パスワードを設定します。 |
| [set_UserName](./set_username/)(String) | ユーザー名を設定します。 |
## 参照

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Class [Object](../../system/object/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
