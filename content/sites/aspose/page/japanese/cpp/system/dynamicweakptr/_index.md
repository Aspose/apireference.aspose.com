---
title: "System::DynamicWeakPtr クラス"
linktitle: "DynamicWeakPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::DynamicWeakPtr クラス。格納されたオブジェクトのテンプレート引数のポインタモードを追跡し、各代入後に更新するスマートポインタクラス。この型は他のオブジェクトの削除を管理するポインタです。C++ ではスタック上に割り当て、関数には値渡しまたは const 参照で渡すべきです。"
type: docs
weight: 2200
url: /ja/cpp/system/dynamicweakptr/
---
## DynamicWeakPtr class


格納オブジェクトのテンプレート引数のポインタモードを追跡し、各代入後に更新するスマートポインタクラスです。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、値渡しまたは const 参照で関数に渡すべきです。

```cpp
template<typename T,SmartPtrMode,unsigned int ...>class DynamicWeakPtr : public System::SmartPtr<T>
```


| パラメーター | 説明 |
| --- | --- |
| Pointee | 型。 |
| trunkMode | スマートポインタ自身のモード、shared または weak。 |
| weakLeafs | 弱ポインタモードに設定すべき、格納型のテンプレート引数のインデックス。 |
## Nested classes

* Class [Reference](./reference/)
## メソッド

| メソッド | 説明 |
| --- | --- |
| [DynamicWeakPtr](./dynamicweakptr/)(std::nullptr_t) | null スマートポインタを作成します。 |
| [DynamicWeakPtr](./dynamicweakptr/)(Pointee_ *) | 指定されたオブジェクトを指すスマートポインタを作成します。 |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr_\&) | スマートポインタをコピー構築します。 |
| [DynamicWeakPtr](./dynamicweakptr/)(const SmartPtr\<Q\>\&) | スマートポインタをコピー構築します。 |
| [DynamicWeakPtr](./dynamicweakptr/)(const DynamicWeakPtr_\&) | スマートポインタをコピー構築します。 |
| [DynamicWeakPtr](./dynamicweakptr/)(SmartPtr_\&&) | スマートポインタをムーブ構築します。 |
| [operator=](./operator=/)(SmartPtr_\&&) | スマートポインタにムーブ代入します。 |
| [operator=](./operator=/)(const SmartPtr_\&) | スマートポインタにコピー代入します。 |
| [operator=](./operator=/)(const SmartPtr\<Q\>\&) | スマートポインタにコピー代入します。 |
| [operator=](./operator=/)(typename SmartPtr_::Pointee_ *) | スマートポインタを代入します。 |
| [operator=](./operator=/)(std::nullptr_t) | スマートポインタを null に設定します。 |
| [operator==](./operator==/)(std::nullptr_t) const | スマートポインタがnullかどうかをチェックします。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [DynamicWeakPtr_](./dynamicweakptr_/) | 自己型エイリアス。 |
| [Pointee_](./pointee_/) | 指し示す型。 |
| [SmartPtr_](./smartptr_/) | ベースクラスエイリアス [SmartPtr](../smartptr/)。 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
