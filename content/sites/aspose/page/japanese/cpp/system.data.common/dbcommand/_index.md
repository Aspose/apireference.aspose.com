---
title: "System::Data::Common::DbCommand クラス"
linktitle: "DbCommand"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::Common::DbCommand クラス。データベースコマンド。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.data.common/dbcommand/
---
## DbCommand class


データベースコマンド。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class DbCommand : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [ExecuteNonQuery](./executenonquery/)() | クエリ以外のコマンドを実行します。 |
| virtual [ExecuteReader](./executereader/)() | クエリコマンドを実行します。 |
| virtual [get_CommandText](./get_commandtext/)() const | RTTI 情報。 |
| virtual [get_Connection](./get_connection/)() const | コマンドに関連付けられたデータベース接続を取得します。 |
| virtual [set_CommandText](./set_commandtext/)(String) const | DB コマンドテキストを設定します。 |
| virtual [set_Connection](./set_connection/)(SharedPtr\<System::Data::Common::DbConnection\>) | コマンドに関連付けられたデータベース接続を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
