---
title: "System::Windows::Forms::Control::ControlCollection クラス"
linktitle: "ControlCollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Windows::Forms::Control::ControlCollection クラス。コントロールのコレクション。C++ では実装されていません。"
type: docs
weight: 200
url: /ja/cpp/system.windows.forms/control/controlcollection/
---
## ControlCollection class


コントロールのコレクション。実装されていません。

```cpp
class ControlCollection : public System::Collections::Generic::IList<System::SharedPtr<Control>>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Add](./add/)(const System::SharedPtr\<Control\>\&) override | コレクションにコントロールを追加します。 |
| virtual [AddRange](./addrange/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>) | コレクションに複数のコントロールを追加します。 |
| [Clear](./clear/)() override | コレクションからすべてのコントロールを削除します。 |
| [Contains](./contains/)(const System::SharedPtr\<Control\>\&) const override | 特定のコントロールがコレクションに存在するか確認します。 |
| virtual [ContainsKey](./containskey/)(System::String) const | 特定の名前を持つコントロールがコレクションに存在するか確認します。 |
| [ControlCollection](./controlcollection/)(const System::SharedPtr\<Control\>\&) | コンストラクタ。 |
| [CopyTo](./copyto/)(System::ArrayPtr\<System::SharedPtr\<Control\>\>, int) override | コレクションの内容を既存の配列要素にコピーします。 |
| [Find](./find/)(const System::String\&, bool) const | コレクション内で名前付きコントロールを検索します。必要に応じて、含まれるコントロールのコレクションを再帰的にチェックします。 |
| [get_Count](./get_count/)() const override | コレクション内のコントロール数を取得します。 |
| [get_Owner](./get_owner/)() const | コレクションの所有者コントロールを取得します。 |
| [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&) const | 特定のコントロールを検索します。 |
| virtual [GetChildIndex](./getchildindex/)(const System::SharedPtr\<Control\>\&, bool) const | 特定のコントロールを検索します。 |
| [GetEnumerator](./getenumerator/)() override | コレクションを反復処理するための列挙子を取得します。 |
| [idx_get](./idx_get/)(int) const override | インデックスによるアクセサー。 |
| virtual [idx_get](./idx_get/)(System::String) const | 名前によるアクセッサー。 |
| [idx_set](./idx_set/)(int, System::SharedPtr\<Control\>) override | インデックスによるアクセサー。 |
| virtual [idx_set](./idx_set/)(System::String, System::SharedPtr\<Control\>) | 名前によるアクセッサー。 |
| [IndexOf](./indexof/)(const System::SharedPtr\<Control\>\&) const override | コレクション内のコントロールを検索します。 |
| virtual [IndexOfKey](./indexofkey/)(System::String) const | コレクション内の名前付きコントロールを検索します。 |
| [Insert](./insert/)(int, const System::SharedPtr\<Control\>\&) override | コレクションにコントロールを挿入します。 |
| [Remove](./remove/)(const System::SharedPtr\<Control\>\&) override | コレクションからコントロールを削除します。 |
| [RemoveAt](./removeat/)(int) override | コレクションからコントロールを削除します。 |
| virtual [RemoveByKey](./removebykey/)(System::String) | コレクションからコントロールを削除します。 |
| virtual [SetChildIndex](./setchildindex/)(const System::SharedPtr\<Control\>\&, int) | コントロールを新しい位置に移動します。 |
## 参照

* Class [IList](../../../system.collections.generic/ilist/)
* Class [Control](../)
* Namespace [System::Windows::Forms](../../)
* Library [Aspose.Page for C++](../../../)
