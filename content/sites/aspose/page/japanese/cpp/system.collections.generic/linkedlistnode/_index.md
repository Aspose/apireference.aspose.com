---
title: "System::Collections::Generic::LinkedListNode クラス"
linktitle: "LinkedListNode"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::LinkedListNode クラス。リンクドリストのノードです。リンクドリストでラップされた std::list のイテレータ上にラッパーを実装しています。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 3200
url: /ja/cpp/system.collections.generic/linkedlistnode/
---
## LinkedListNode class


リンクドリストのノードです。リンクドリストでラップされた std::list のイテレータ上にラッパーを実装しています。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
template<typename T>class LinkedListNode : public System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 格納される値の型です。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_List](./get_list/)() const | 含まれるリストを取得します。 |
| [get_Next](./get_next/)() const | 次のノードを取得します。 |
| [get_Previous](./get_previous/)() const | 前のノードを取得します。 |
| [get_Value](./get_value/)() const | 格納された値を取得します。 |
| [LinkedListNode](./linkedlistnode/)(const T\&) | コンストラクタ。 |
| [set_Value](./set_value/)(const T\&) | 格納された値を設定します。 |

## 参照

* Class [Object](../../system/object/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
