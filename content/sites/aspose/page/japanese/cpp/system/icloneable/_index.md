---
title: "System::ICloneable クラス"
linktitle: "ICloneable"
second_title: "C++ 用 Aspose.Page"
description: "System::ICloneable クラスです。オブジェクトのクローン作成（オブジェクトのコピー作成）を可能にするメソッドを定義します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数としてこのポインタを使用してください。"
type: docs
weight: 3200
url: /ja/cpp/system/icloneable/
---
## ICloneable class


オブジェクトのクローン作成（オブジェクトのコピー作成）を可能にするメソッドを定義します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してインスタンスを作成しないでください。そうしないとランタイムエラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../smartptr/) ポインタでラップし、関数の引数としてこのポインタを使用してください。

```cpp
class ICloneable : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Clone](./clone/)() | RTTI 情報。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
