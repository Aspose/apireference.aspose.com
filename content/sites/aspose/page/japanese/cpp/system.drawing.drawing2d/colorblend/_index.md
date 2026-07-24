---
title: "System::Drawing::Drawing2D::ColorBlend class"
linktitle: "ColorBlend"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::ColorBlend クラス。マルチカラーグラデーションで色のブレンドを補間するために使用される色と位置の配列を含みます。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 300
url: /ja/cpp/system.drawing.drawing2d/colorblend/
---
## ColorBlend class


マルチカラーグラデーションで色のブレンドを補間するために使用される色と位置の配列を含みます。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class ColorBlend : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [ColorBlend](./colorblend/)() | 新しい [ColorBlend](./) クラスのインスタンスを構築します。 |
| [ColorBlend](./colorblend/)(int) | 新しい [Blend](../blend/) クラスのインスタンスを構築します。 |
| [get_Colors](./get_colors/)() | グラデーション上の対応する位置で使用する色の配列を返します。 |
| [get_Positions](./get_positions/)() | グラデーション上のブレンド位置の配列を返します。 |
| [set_Colors](./set_colors/)(const ArrayPtr\<Color\>\&) | グラデーション上の対応する位置で使用する色の配列を設定します。 |
| [set_Positions](./set_positions/)(const ArrayPtr\<float\>\&) | グラデーション上のブレンド位置の配列を設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
