---
title: "System::Collections::Generic::ICollection クラス"
linktitle: "ICollection"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::ICollection クラス。要素のコレクションのインターフェイス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 1900
url: /ja/cpp/system.collections.generic/icollection/
---
## ICollection class


要素のコレクションのインターフェイス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
template<typename T>class ICollection : public virtual System::Collections::Generic::IEnumerable<T>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Add](./add/)(const T\&) | コレクションに要素を追加します。 |
| virtual [Clear](./clear/)() | コレクションからすべての要素を削除します。 |
| virtual [Contains](./contains/)(const T\&) const | コレクションに要素が存在するか確認します。 |
| virtual [CopyTo](./copyto/)(System::ArrayPtr\<T\>, int) | すべてのコレクション要素を既存の配列要素にコピーします。 |
| virtual [get_Count](./get_count/)() const | コレクション内の要素数を取得します。 |
| virtual [get_IsReadOnly](./get_isreadonly/)() const | コレクションが読み取り専用かどうかを確認します。 |
| [get_SyncRoot](./get_syncroot/)() const | コレクションが同期されているオブジェクトを取得します。 |
| [ICollection](./icollection/)() | デフォルトコンストラクタ。 |
| [ICollection](./icollection/)(const ICollection\&) | コピーコンストラクタ。 |
| [ICollection](./icollection/)(ICollection\&&) | ムーブコンストラクタ。 |
| [operator=](./operator=/)(ICollection\&&) | ムーブ代入演算子。 |
| [operator=](./operator=/)(const ICollection\&) | ムーブ代入演算子。 |
| virtual [Remove](./remove/)(const T\&) | コレクションから要素を削除します。 |
| virtual [~ICollection](./~icollection/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [ThisType](./thistype/) | コレクションのタイプ名。 |
| [ValueType](./valuetype/) | RTTI 情報。 |

## 参照

* Class [IEnumerable](../ienumerable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
