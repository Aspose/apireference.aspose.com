---
title: "System::Drawing::SolidBrush class"
linktitle: "SolidBrush"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::SolidBrush クラス。単色ブラシを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 2400
url: /ja/cpp/system.drawing/solidbrush/
---
## SolidBrush class


単色ブラシを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡す際に使用してください。

```cpp
class SolidBrush : public System::Drawing::Brush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 現在のオブジェクトのコピーを作成します。 |
| [get_Color](./get_color/)() const | このブラシの色を返します。 |
| [set_Color](./set_color/)(Color) | このブラシの色を設定します。 |
| [SolidBrush](./solidbrush/)(const Color\&) | 新しい [SolidBrush](./) オブジェクトを作成し、指定された色で初期化します。 |
## 参照

* Class [Brush](../brush/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
