---
title: "System::Globalization::TextElementEnumerator クラス"
linktitle: "TextElementEnumerator"
second_title: "C++ 用 Aspose.Page"
description: "System::Globalization::TextElementEnumerator クラス。文字列要素（文字）を列挙する列挙子。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、C++ で関数の引数として渡す際にそのポインタを使用してください。"
type: docs
weight: 2700
url: /ja/cpp/system.globalization/textelementenumerator/
---
## TextElementEnumerator class


文字列要素（文字）を列挙する列挙子。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。この型のインスタンスをスタック上で作成したり operator new を使用したりしないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class TextElementEnumerator : public virtual System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [get_Current](./get_current/)() const | 現在のテキスト要素を取得します。 |
| [get_ElementIndex](./get_elementindex/)() const | 現在のテキスト要素のインデックスを取得します。 |
| [GetTextElement](./gettextelement/)() const | 現在の要素を取得します。 |
| [MoveNext](./movenext/)() | 次の要素に移動します。 |
| [operator=](./operator=/)(const TextElementEnumerator\&) |  |
| [Reset](./reset/)() | 列挙子を初期位置に設定します。 |
| [TextElementEnumerator](./textelementenumerator/)(const TextElementEnumerator\&) |  |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Globalization](../)
* Library [Aspose.Page for C++](../../)
