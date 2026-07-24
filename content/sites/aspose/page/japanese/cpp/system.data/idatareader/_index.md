---
title: "System::Data::IDataReader クラス"
linktitle: "IDataReader"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::IDataReader クラス。データを順次読み取るためのインターフェイス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1200
url: /ja/cpp/system.data/idatareader/
---
## IDataReader class


データを順次読み取るためのインターフェイス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class IDataReader : public System::Data::IDataRecord
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Read](./read/)() | RTTI 情報。 |
## 参照

* Class [IDataRecord](../idatarecord/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
