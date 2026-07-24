---
title: "System::Data::DataTable クラス"
linktitle: "DataTable"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::DataTable クラス。データは行と列で構成されています。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 900
url: /ja/cpp/system.data/datatable/
---
## DataTable class


[Data](../) structured in rows and columns. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class DataTable : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Columns](./get_columns/)() | テーブルに存在する列を取得します。 |
| [get_DataSet](./get_dataset/)() | テーブルが属するデータセットを取得します。 |
| [get_Rows](./get_rows/)() | RTTI 情報。 |
| [get_TableName](./get_tablename/)() | テーブル名を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
