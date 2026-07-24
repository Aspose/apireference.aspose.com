---
title: "System::Data::IDataRecord クラス"
linktitle: "IDataRecord"
second_title: "C++ 用 Aspose.Page"
description: "System::Data::IDataRecord クラス。列を持つレコードへのインターフェイス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 1300
url: /ja/cpp/system.data/idatarecord/
---
## IDataRecord class


列を持つレコードへのインターフェイス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class IDataRecord : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [get_FieldCount](./get_fieldcount/)() | RTTI 情報。 |
| virtual [GetName](./getname/)(const int32_t) | 指定された位置のフィールド名を取得します。 |
| virtual [idx_get](./idx_get/)(const int32_t) | 指定されたインデックスの値を取得します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Data](../)
* Library [Aspose.Page for C++](../../)
