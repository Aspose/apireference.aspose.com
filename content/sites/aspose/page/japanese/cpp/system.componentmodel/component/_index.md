---
title: "System::ComponentModel::Component クラス"
linktitle: "Component"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::Component クラス。このクラスは Component クラスを使用した翻訳コードをコンパイル可能にするためのダミークラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.componentmodel/component/
---
## Component class


翻訳コードを [Component](./) クラスで使用できるようにするためのダミークラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class Component : public System::MarshalByRefObject,
                  public System::ComponentModel::IComponent
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Component](./component/)() | RTTI 情報。 |
| [Dispose](./dispose/)(bool) | Disposable パターンのサポート; 何もしません。 |
| [get_DesignMode](./get_designmode/)() | コンポーネントがデザインモードかどうかを確認します。 |
## 参照

* Class [MarshalByRefObject](../../system/marshalbyrefobject/)
* Class [IComponent](../icomponent/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
