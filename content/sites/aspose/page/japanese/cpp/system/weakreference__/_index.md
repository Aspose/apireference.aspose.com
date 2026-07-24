---
title: "System::WeakReference<> クラス"
linktitle: "WeakReference<>"
second_title: "C++ 用 Aspose.Page"
description: "System::WeakReference<> クラス。弱参照を表します。これはオブジェクトを参照しつつ、そのオブジェクトが C++ で削除されることを許可します。"
type: docs
weight: 7800
url: /ja/cpp/system/weakreference__/
---
## WeakReference<> class


オブジェクトを参照しつつ、対象オブジェクトが削除されることを許容する弱参照を表します。

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | 現在の [WeakReference](../weakreference/) オブジェクトが参照しているオブジェクトが削除されたかどうかの指標を取得します。 |
| [get_Target](./get_target/)() const | 現在の [WeakReference](../weakreference/) オブジェクトが参照しているオブジェクト（ターゲット）を取得します。 |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | 現在の [WeakReference](../weakreference/) オブジェクトが参照するオブジェクト（ターゲット）を設定します。 |
| [WeakReference](./weakreference/)() | デフォルトコンストラクタ。 |
| [WeakReference](./weakreference/)(std::nullptr_t) | nullptr からのコンストラクタです。 |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | 指定されたオブジェクトを参照する [WeakReference](../weakreference/) クラスの新しいインスタンスを初期化します。 |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | 指定されたオブジェクトを参照する [WeakReference](../weakreference/) クラスの新しいインスタンスを初期化します。 |
## 参照

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
