---
title: "System::Data::Common::DbConnection クラス"
linktitle: "DbConnection"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::Common::DbConnection クラス。データベース接続。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 200
url: /ja/cpp/system.data.common/dbconnection/
---
## DbConnection class


データベース接続。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class DbConnection : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_ConnectionString](./get_connectionstring/)() const | RTTI 情報。 |
| virtual [Open](./open/)() | データベースへの接続を開きます。 |
| virtual [set_ConnectionString](./set_connectionstring/)(String) const | 接続情報（例：サーバーとポート）を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
