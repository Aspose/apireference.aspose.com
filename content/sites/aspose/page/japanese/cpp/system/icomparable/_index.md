---
title: "System::IComparable クラス"
linktitle: "IComparable"
second_title: "C++ 用 Aspose.Page"
description: "System::IComparable クラス。二つのオブジェクトを比較するメソッドを定義します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 3300
url: /ja/cpp/system/icomparable/
---
## IComparable class


二つのオブジェクトを比較するメソッドを定義します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
template<typename T>class IComparable : public virtual System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 現在のオブジェクトが比較されるオブジェクトの型 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [CompareTo](./compareto/)(T) | 現在のオブジェクトを指定されたオブジェクトと比較します。 |

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
