---
title: "System::IFormatProvider クラス"
linktitle: "IFormatProvider"
second_title: "C++ 用 Aspose.Page"
description: "System::IFormatProvider クラス。書式情報を提供するメソッドを定義します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数引数として渡すようにしてください。"
type: docs
weight: 3800
url: /ja/cpp/system/iformatprovider/
---
## IFormatProvider class


書式情報を提供するメソッドを定義します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使ってインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。このクラスは常に [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数の引数として渡してください。

```cpp
class IFormatProvider : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [GetFormat](./getformat/)(const TypeInfo\&) | 指定された型に対する書式サービスを提供するオブジェクトを返します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
