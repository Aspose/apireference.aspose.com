---
title: "System::Net::CredentialCache クラス"
linktitle: "CredentialCache"
second_title: "C++ 用 Aspose.Page"
description: "System::Net::CredentialCache クラス。認証情報のストレージを提供します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.net/credentialcache/
---
## CredentialCache class


認証情報のストレージを提供します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class CredentialCache : public System::Net::ICredentials,
                        public System::Net::ICredentialsByHost
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(System::SharedPtr\<Uri\>, String, System::SharedPtr\<NetworkCredential\>) | 指定されたネットワーク認証情報をキャッシュに追加します。 |
| [Add](./add/)(String, int32_t, String, System::SharedPtr\<NetworkCredential\>) | 指定されたネットワーク認証情報をキャッシュに追加します。 |
| [CredentialCache](./credentialcache/)() | 新しいインスタンスを構築します。 |
| static [get_DefaultCredentials](./get_defaultcredentials/)() | RTTI 情報。 |
| static [get_DefaultNetworkCredentials](./get_defaultnetworkcredentials/)() | 現在のユーザーまたはアプリケーションのネットワーク認証情報を返します。 |
| [GetCredential](./getcredential/)(System::SharedPtr\<Uri\>, String) override | 指定された URI プレフィックスと認証タイプに対する認証情報を返します。 |
| [GetCredential](./getcredential/)(String, int32_t, String) override | 指定されたホスト名、ポート、および認証タイプの資格情報を返します。 |
| [Remove](./remove/)(System::SharedPtr\<Uri\>, String) | 指定された URI プレフィックスと認証タイプに対するネットワーク認証情報を削除します。 |
| [Remove](./remove/)(String, int32_t, String) | 指定されたホスト名、ポート、認証タイプに対するネットワーク認証情報を削除します。 |
## 参照

* Class [ICredentials](../icredentials/)
* Class [ICredentialsByHost](../icredentialsbyhost/)
* Namespace [System::Net](../)
* Library [Aspose.Page for C++](../../)
