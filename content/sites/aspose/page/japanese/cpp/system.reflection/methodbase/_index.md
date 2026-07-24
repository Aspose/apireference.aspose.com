---
title: "System::Reflection::MethodBase クラス"
linktitle: "MethodBase"
second_title: "C++ 用 Aspose.Page"
description: "System::Reflection::MethodBase クラス。メソッドに関する基本情報。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 800
url: /ja/cpp/system.reflection/methodbase/
---
## MethodBase class


メソッドに関する基本情報。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class MethodBase : public System::Reflection::MemberInfo
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_MemberType](./get_membertype/)() const override | メンバーの種類（メソッド、コンストラクタ、イベントなど）を示します。 |
| static [GetCurrentMethod](./getcurrentmethod/)(const String\&) | このメソッドは現在のメソッド名を取得できます。トランスレータはパラメータとして ASPOSE_CURRENT_FUNCTION を自動的に置き換えます。 |
| [MEMBER_FUNCTION_MAKE_OBJECT](./member_function_make_object/)(MethodBase, CODEPORTING_ARGS(const String\&full_name), CODEPORTING_ARGS(full_name)) |  |
| [MethodBase](./methodbase/)() | 新しい [MethodBase](./) クラスのインスタンスを初期化します。 |
## 参照

* Class [MemberInfo](../memberinfo/)
* Namespace [System::Reflection](../)
* Library [Aspose.Page for C++](../../)
