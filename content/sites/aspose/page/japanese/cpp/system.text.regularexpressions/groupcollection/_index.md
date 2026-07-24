---
title: "System::Text::RegularExpressions::GroupCollection クラス"
linktitle: "GroupCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Text::RegularExpressions::GroupCollection クラス。単一のマッチにおけるキャプチャ グループのリスト。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.text.regularexpressions/groupcollection/
---
## GroupCollection class


単一のマッチにおけるキャプチャ グループのリスト。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。実行時エラーやアサーション失敗の原因になります。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class GroupCollection : public System::Collections::Generic::List<GroupPtr>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const GroupPtr\&) override | コレクションへの要素追加を無効にします。 |
| [AddGroup](./addgroup/)(const GroupPtr\&) | グループをコレクションに追加します。 |
| [Clear](./clear/)() override | コレクションから要素を削除することを無効にします。 |
| [get_Item](./get_item/)(int) const | [Group](../group/) アクセサです。 |
| [get_Item](./get_item/)(const String\&) const | [Group](../group/) アクセサです。 |
| [GroupCollection](./groupcollection/)(const WeakPtr\<Match\>\&) | コンストラクタ。 |
| virtual [idx_get](./idx_get/)(String) const | [Group](../group/) アクセサです。 |
| [idx_get](./idx_get/)(int) const override | [Group](../group/) アクセサです。 |
| [IsReadOnly](./isreadonly/)() const | コレクションを読み取り専用としてマークします。 |
| [operator[]](./operator[]/)(const String\&) const | [Group](../group/) アクセサです。 |
| [operator[]](./operator[]/)(int) | [Group](../group/) アクセサです。 |
| [operator[]](./operator[]/)(int) const | [Group](../group/) アクセサです。 |
| [Remove](./remove/)(const GroupPtr\&) override | コレクションから要素を削除することを無効にします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Base](./base/) | [Base](./base/) クラス。 |
## 参照

* Class [List](../../system.collections.generic/list/)
* Namespace [System::Text::RegularExpressions](../)
* Library [Aspose.Page for C++](../../)
