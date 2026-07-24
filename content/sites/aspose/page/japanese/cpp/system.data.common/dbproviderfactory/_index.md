---
title: "System::Data::Common::DbProviderFactory クラス"
linktitle: "DbProviderFactory"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::Common::DbProviderFactory クラス。データベースにアクセスするためのプロバイダー。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 600
url: /ja/cpp/system.data.common/dbproviderfactory/
---
## DbProviderFactory class


データベースにアクセスするためのプロバイダー。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class DbProviderFactory : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CreateCommand](./createcommand/)() | RTTI 情報。 |
| virtual [CreateConnection](./createconnection/)() | データベース接続を作成します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data::Common](../)
* Library [Aspose.Page for C++](../../)
