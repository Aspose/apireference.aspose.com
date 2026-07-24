---
title: "System::Drawing::Drawing2D::AdjustableArrowCap class"
linktitle: "AdjustableArrowCap"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::AdjustableArrowCap class. 調整可能な矢印形状のラインキャップを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないとランタイムエラーやアサーションフォルトが発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡す際に使用してください。"
type: docs
weight: 100
url: /ja/cpp/system.drawing.drawing2d/adjustablearrowcap/
---
## AdjustableArrowCap class


調整可能な矢印形状のラインキャップを表します。このクラスのオブジェクトは、[System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション違反が発生します。このクラスは常に [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数への引数として使用してください。

```cpp
class AdjustableArrowCap : public System::Drawing::Drawing2D::CustomLineCap
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [AdjustableArrowCap](./adjustablearrowcap/)(float, float, bool) | 指定された幅と高さで [AdjustableArrowCap](./) の新しいインスタンスを構築します。 |
| [get_Filled](./get_filled/)() const | 現在のオブジェクトが表す矢印が塗りつぶされているかどうかを示す値を返します。 |
| [get_Height](./get_height/)() const | 現在のオブジェクトが表す矢印の高さを返します。 |
| [get_MiddleInset](./get_middleinset/)() const | 現在のオブジェクトが表すラインとキャップ間の距離を設定します。 |
| [get_Width](./get_width/)() const | 現在のオブジェクトが表す矢印の幅を返します。 |
| [set_Filled](./set_filled/)(bool) | 現在のオブジェクトが表す矢印が塗りつぶされているかどうかを指定する値を設定します。 |
| [set_Height](./set_height/)(float) | 現在のオブジェクトが表す矢印の高さを設定します。 |
| [set_MiddleInset](./set_middleinset/)(float) | 現在のオブジェクトが表すラインとキャップ間の距離を設定します。 |
| [set_Width](./set_width/)(float) | 現在のオブジェクトが表す矢印の幅を設定します。 |
## 参照

* Class [CustomLineCap](../customlinecap/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
