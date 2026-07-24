---
title: "System::ComponentModel::IContainer クラス"
linktitle: "IContainer"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::IContainer クラス。IContainer を使用するコードをコンパイルできるようにするダミーインターフェイスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡してください。"
type: docs
weight: 900
url: /ja/cpp/system.componentmodel/icontainer/
---
## IContainer class


IContainer を使用するコードをコンパイルできるようにするダミーインターフェイスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new でインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class IContainer : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Add](./add/)(System::SharedPtr\<IComponent\>) | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
