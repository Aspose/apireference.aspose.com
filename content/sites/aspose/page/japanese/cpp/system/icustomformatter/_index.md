---
title: "System::ICustomFormatter クラス"
linktitle: "ICustomFormatter"
second_title: "C++ 用 Aspose.Page"
description: "System::ICustomFormatter クラス。指定されたオブジェクトが表す値の文字列表現をカスタムフォーマットするメソッドを定義します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に System::SmartPtr ポインタでラップし、そのポインタを C++ の関数への引数として渡してください。"
type: docs
weight: 3500
url: /ja/cpp/system/icustomformatter/
---
## ICustomFormatter class


指定されたオブジェクトが表す値の文字列表現をカスタムフォーマットするメソッドを定義します。このクラスのオブジェクトは [System::MakeObject()](../makeobject/) 関数を使用してのみ割り当てるべきです。このタイプのインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション失敗が発生します。このクラスは常に [System::SmartPtr](../smartptr/) ポインタでラップし、そのポインタを関数への引数として渡してください。

```cpp
class ICustomFormatter : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Format](./format/)(System::String, System::SharedPtr\<System::Object\>, System::SharedPtr\<System::IFormatProvider\>) | 指定されたフォーマットを使用して、現在のオブジェクトが表す値の文字列表現を返します。 |
## 参照

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
