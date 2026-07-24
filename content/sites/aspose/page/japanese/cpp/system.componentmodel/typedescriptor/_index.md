---
title: "System::ComponentModel::TypeDescriptor クラス"
linktitle: "TypeDescriptor"
second_title: "C++ 用 Aspose.Page"
description: "System::ComponentModel::TypeDescriptor クラス。翻訳後に TypeDescriptor を使用するコードがコンパイルできるようにするためのダミークラスです。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡すようにしてください。"
type: docs
weight: 1500
url: /ja/cpp/system.componentmodel/typedescriptor/
---
## TypeDescriptor class


翻訳後にコンパイルできるように TypeDescriptor を使用したコード用のダミークラスです。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上でインスタンスを作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として渡すようにしてください。

```cpp
class TypeDescriptor : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [GetConverter](./getconverter/)(const TypeInfo\&) | RTTI 情報。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
