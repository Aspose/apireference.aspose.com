---
title: "System::WeakReference< T > クラス"
linktitle: "WeakReference< T >"
second_title: "C++ 用 Aspose.Page"
description: "System::WeakReference< T > クラス。オブジェクトへの弱参照を表し、そのオブジェクトが削除されても参照を保持できるようにします（C++）。"
type: docs
weight: 7700
url: /ja/cpp/system/weakreference_t_/
---
## WeakReference< T > class


オブジェクトを参照しつつ、対象オブジェクトが削除されることを許容する弱参照を表します。

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| パラメーター | 説明 |
| --- | --- |
| T | 参照されているオブジェクトの型。 |
## メソッド

| メソッド | 説明 |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | 参照されているオブジェクトが null でないかチェックします。 |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | 参照されているオブジェクトを別のインスタンスの [WeakReference](../weakreference/) クラスと比較します。 |
| [operator==](./operator==/)(std::nullptr_t) const | 参照されているオブジェクトが null かどうかチェックします。 |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | 参照されているオブジェクトを別のインスタンスの [WeakReference](../weakreference/) クラスと比較します。 |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | 現在の [WeakReference](../weakreference/) オブジェクトが参照するオブジェクト（ターゲット）を設定します。 |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | 現在の [WeakReference](../weakreference/) オブジェクトが参照しているオブジェクト（ターゲット）を取得します。 |
| [WeakReference](./weakreference/)() | デフォルトコンストラクタ。 |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr からのコンストラクタです。 |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | 指定されたオブジェクトを参照する [WeakReference](../weakreference/) クラスの新しいインスタンスを初期化します。 |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | 指定されたオブジェクトを参照する [WeakReference](../weakreference/) クラスの新しいインスタンスを初期化します。 |

## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
