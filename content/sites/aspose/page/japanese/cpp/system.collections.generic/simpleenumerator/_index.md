---
title: "System::Collections::Generic::SimpleEnumerator クラス"
linktitle: "SimpleEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Collections::Generic::SimpleEnumerator クラス。rbegin() と rend() 関数を使用して要素を直接保持するシンプルなコンテナ用のイテレータクラス。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。"
type: docs
weight: 3900
url: /ja/cpp/system.collections.generic/simpleenumerator/
---
## SimpleEnumerator class


rbegin() と rend() 関数を使用して要素を直接保持するシンプルなコンテナ用のイテレータクラス。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
template<typename Container,typename Element>class SimpleEnumerator : public System::Collections::Generic::BaseEnumerator<Container, typename Container::value_type>
```


| パラメーター | 説明 |
| --- | --- |
| コンテナ | 反復処理するコンテナのタイプ。 |
| Element | 要素型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | 現在のイテレータをクローンします。 |
| [get_Current](./get_current/)() const override | 現在の要素を取得します。 |
| [SimpleEnumerator](./simpleenumerator/)(Object::ptr, Container\&) | シンプルなイテレータを作成します。 |

## 参照

* Class [BaseEnumerator](../baseenumerator/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
