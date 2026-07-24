---
title: "System::Collections::Generic::ISet クラス"
linktitle: "ISet"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::ISet クラス。ユニークな要素の集合を含むコレクションのインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 2700
url: /ja/cpp/system.collections.generic/iset/
---
## ISet class


ユニークな要素の集合を含むコレクションのインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename T>class ISet : public System::Collections::Generic::ICollection<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [ExceptWith](./exceptwith/)(IEnumerablePtr) | 要素のグループを削除します。 |
| virtual [IntersectWith](./intersectwith/)(IEnumerablePtr) | 別のコンテナに存在しない要素を削除します。 |
| virtual [IsProperSubsetOf](./ispropersubsetof/)(IEnumerablePtr) | 現在のセットが他のコンテナの真の部分集合であるかどうかを確認します。 |
| virtual [IsProperSupersetOf](./ispropersupersetof/)(IEnumerablePtr) | 現在のセットが他のコンテナの真の上位集合であるかどうかを確認します。 |
| virtual [IsSubsetOf](./issubsetof/)(IEnumerablePtr) | 現在のセットが他のコンテナの部分集合であるかどうかを確認します。 |
| virtual [IsSupersetOf](./issupersetof/)(IEnumerablePtr) | 現在のセットが他のコンテナの上位集合であるかどうかを確認します。 |
| virtual [Overlaps](./overlaps/)(IEnumerablePtr) | セットが他のコンテナと重複しているかどうかを確認します。 |
| virtual [SetEquals](./setequals/)(IEnumerablePtr) | セットとコンテナが同じ要素を含んでいるかどうかを確認します。 |
| virtual [SymmetricExceptWith](./symmetricexceptwith/)(IEnumerablePtr) | 2つのコンテナの対称差を計算します。両方のコンテナに存在するすべての要素を削除し、同時に **other** に存在し現在のセットに存在しないすべての要素を追加します。 |
| virtual [UnionWith](./unionwith/)(IEnumerablePtr) | 指定されたコレクションから、現在のセットにまだ存在しない要素を追加します。 |
| virtual [~ISet](./~iset/)() | デストラクタ。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | RTTI 情報。 |

## 参照

* Class [ICollection](../icollection/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
