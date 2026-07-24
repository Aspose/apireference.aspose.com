---
title: "System::Drawing::ColorTranslator class"
linktitle: "ColorTranslator"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::ColorTranslator クラス。色の変換を行います。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数に引数として渡すようにしてください。"
type: docs
weight: 600
url: /ja/cpp/system.drawing/colortranslator/
---
## ColorTranslator class


色の変換を行います。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class ColorTranslator
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| static [FromHtml](./fromhtml/)(const System::String\&) | 指定された HTML カラー表現を同等の [Color](../color/) オブジェクトに変換します。 |
| static [FromWin32](./fromwin32/)(int) | 指定された [Windows](../../system.windows/) カラーを同等の [Color](../color/) オブジェクトに変換します。 |
| static [ToHtml](./tohtml/)(const Color\&) | 指定された [Color](../color/) オブジェクトを同等の HTML カラーの文字列表現に変換します。 |
## 参照

* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
