---
title: "System::Data::DataRow クラス"
linktitle: "DataRow"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::DataRow クラス。データセット内の行。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 500
url: /ja/cpp/system.data/datarow/
---
## DataRow class


データセット内の行。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class DataRow : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Table](./get_table/)() | 所属するテーブル行を取得します。 |
| [GetChildRows](./getchildrows/)(const System::SharedPtr\<System::Data::DataRelation\>\&) | 指定されたリレーションを通じて子として扱われる行を取得します。 |
| [idx_get](./idx_get/)(const int32_t) | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
