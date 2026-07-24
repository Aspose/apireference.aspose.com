---
title: "System::Data::SqlClient::SqlConnectionStringBuilder class"
linktitle: "SqlConnectionStringBuilder"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::SqlClient::SqlConnectionStringBuilder クラス。SQL ベースの接続ビルダー。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数に引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.data.sqlclient/sqlconnectionstringbuilder/
---
## SqlConnectionStringBuilder class


SQL ベースの接続ビルダー。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class SqlConnectionStringBuilder : public System::Data::Common::DbConnectionStringBuilder
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_DataSource](./get_datasource/)() const | データソースを取得します（例: ホスト名とポート）。 |
| [get_Encrypt](./get_encrypt/)() const | 行で暗号化が有効かどうかをチェックします。 |
| [get_InitialCatalog](./get_initialcatalog/)() const | 接続に関連付けられたデータベースの名前を取得します。 |
| [get_NetworkLibrary](./get_networklibrary/)() const | 使用されているネットワークライブラリ名を取得します。 |
| [get_Password](./get_password/)() const | データベース接続に使用されるパスワードを取得します。 |
| [get_TrustServerCertificate](./get_trustservercertificate/)() const | 接続が信頼できるサーバー証明書で保護されているかどうかをチェックします。 |
| [get_UserID](./get_userid/)() const | 接続に使用されるユーザー ID を取得します。 |
| [idx_get](./idx_get/)(String) override | RTTI 情報。 |
| [idx_set](./idx_set/)(String, Object::ptr) override | キー付きオブジェクトを設定します。 |
| [set_DataSource](./set_datasource/)(const String\&) | データソースを取得します（例: ホスト名とポート）。 |
| [set_Encrypt](./set_encrypt/)(bool) | 暗号化をオンまたはオフに切り替えます。 |
| [set_InitialCatalog](./set_initialcatalog/)(const String\&) | 接続に関連付けられたデータベースの名前を設定します。 |
| [set_NetworkLibrary](./set_networklibrary/)(const String\&) | 使用するネットワークライブラリを選択します。 |
| [set_Password](./set_password/)(const String\&) | データベースに接続するために使用するパスワードを設定します。 |
| [set_TrustServerCertificate](./set_trustservercertificate/)(bool) | 接続が信頼できるサーバー証明書で保護されているかどうかを判断します。 |
| [set_UserID](./set_userid/)(const String\&) | 接続に使用するユーザー ID を設定します。 |
## 参照

* Class [DbConnectionStringBuilder](../../system.data.common/dbconnectionstringbuilder/)
* Namespace [System::Data::SqlClient](../)
* Library [Aspose.Page for C++](../../)
