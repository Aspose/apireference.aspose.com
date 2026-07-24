---
title: "System::IDisposable クラス"
linktitle: "IDisposable"
second_title: "C++ 用 Aspose.Page"
description: "System::IDisposable クラス。現在のオブジェクトが所有するリソースを解放するメソッドを定義します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 3600
url: /ja/cpp/system/idisposable/
---
## IDisposable class


現在のオブジェクトが所有するリソースを解放するメソッドを定義します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class IDisposable : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Dispose](./dispose/)() | 何もしません。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
