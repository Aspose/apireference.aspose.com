---
title: "System::WeakPtr クラス"
linktitle: "WeakPtr"
second_title: "C++ 用 Aspose.Page"
description: "System::WeakPtr クラス。構築時に自身を弱モードに設定する System::SmartPtr のサブクラスです。set_Mode() は依然としてアクセス可能なため、このクラスはインスタンスが常に弱モードのままであることを保証しません。この型は他のオブジェクトの削除を管理するポインタです。スタック上に割り当て、関数には値渡しまたは const 参照で渡すべきです。"
type: docs
weight: 7500
url: /ja/cpp/system/weakptr/
---
## WeakPtr class


構築時に自身を弱モードに設定する [System::SmartPtr](../smartptr/) のサブクラスです。このクラスはインスタンスが常に弱モードのままであることを保証しません。なぜなら [set_Mode()](../smartptr/set_mode/) が依然としてアクセス可能だからです。この型は他のオブジェクトの削除を管理するポインタで、スタック上に割り当て、関数には値渡しまたは const 参照で渡すべきです。

```cpp
template<class T>class WeakPtr : public System::SmartPtr<T>
```


| パラメーター | 説明 |
| --- | --- |
| T | 指し示す型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [expired](./expired/)() const | 参照されたオブジェクトがすでに削除されているか確認します。 |
| [get_weak](./get_weak/)() const | 参照されたオブジェクトを取得します。ポインタが弱モードであることをアサートします。 |
| [operator=](./operator=/)(Q\&&) | 弱ポインタに値を代入します。[SmartPtr_](./smartptr_/) の特定の代入演算子を呼び出します。 |
| [operator==](./operator==/)(std::nullptr_t) const | 弱ポインタが null かどうかを確認します。 |
| [WeakPtr](./weakptr/)(std::nullptr_t) | null ポインタを作成します。 |
| [WeakPtr](./weakptr/)(Pointee_ *) | 指定されたオブジェクトへの弱ポインタを作成します。 |
| [WeakPtr](./weakptr/)(const SmartPtr_\&) | ptr が指す同じポインタを参照する弱ポインタを作成します。 |
| [WeakPtr](./weakptr/)(const SmartPtr\<Q\>\&) | x が指す同じポインタを参照する弱ポインタを作成します。 |
| [WeakPtr](./weakptr/)(const WeakPtr_\&) | 弱ポインタをコピー構築します。 |
| [WeakPtr](./weakptr/)(const WeakPtr\<Q\>\&) | 弱ポインタをコピー構築します。 |
| [WeakPtr](./weakptr/)(SmartPtr_\&&) | 弱ポインタをムーブ構築します。 |
## Typedefs

| 型定義 | 説明 |
| --- | --- |
| [Pointee_](./pointee_/) | 指し示す型。 |
| [SmartPtr_](./smartptr_/) | 対応する [SmartPtr](../smartptr/) クラスのエイリアスです。 |
| [WeakPtr_](./weakptr_/) | 自身の型のエイリアスです。 |

## 参照

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
