---
title: "System::Drawing::Drawing2D::CustomLineCap クラス"
linktitle: "CustomLineCap"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::CustomLineCap クラス。ユーザー定義のラインキャップを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ で関数の引数として渡すようにしてください。"
type: docs
weight: 400
url: /ja/cpp/system.drawing.drawing2d/customlinecap/
---
## CustomLineCap class


ユーザー定義のラインキャップを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上や operator new を使用してこの型のインスタンスを作成しないでください。そうするとランタイムエラーやアサーション失敗が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数の引数として渡すようにしてください。

```cpp
class CustomLineCap : public System::Object
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| virtual [Clone](./clone/)() | 現在のオブジェクトのコピーを返します。 |
| [CustomLineCap](./customlinecap/)(const SharedPtr\<GraphicsPath\>\&, const SharedPtr\<GraphicsPath\>\&, LineCap, float) | [CustomLineCap](./) クラスの新しいインスタンスを作成し、指定されたプロパティでユーザー定義のラインキャップを表します。 |
| [Dispose](./dispose/)() | 現在のオブジェクトが取得したすべてのオペレーティングシステムリソースを解放します。 |
| [get_BaseCap](./get_basecap/)() const | このカスタムキャップが作成される基礎ラインキャップを返します。 |
| [get_BaseInset](./get_baseinset/)() const | ラインとキャップ間の距離を返します。 |
| [get_StrokeJoin](./get_strokejoin/)() const | このカスタムキャップのラインがどのように結合されるかを決定する [LineJoin](../linejoin/) の値を返します。 |
| [get_WidthScale](./get_widthscale/)() const | このカスタムキャップのスケールを返します。 |
| [GetStrokeCaps](./getstrokecaps/)(LineCap\&, LineCap\&) | 現在のオブジェクトが表すカスタムキャップの開始および終了ラインキャップを取得します。 |
| [set_BaseCap](./set_basecap/)(LineCap) | このカスタムキャップの基礎ラインキャップ値を設定します。 |
| [set_BaseInset](./set_baseinset/)(float) | ラインとキャップ間の距離を設定します。 |
| [set_StrokeJoin](./set_strokejoin/)(LineJoin) | このカスタムキャップのラインがどのように結合されるかを決定する [LineJoin](../linejoin/) の値を設定します。 |
| [set_WidthScale](./set_widthscale/)(float) | このカスタムキャップのスケール値を設定します。 |
| [SetStrokeCaps](./setstrokecaps/)(LineCap, LineCap) | 現在のオブジェクトが表すカスタムキャップの開始および終了ラインキャップを設定します。 |
## 参照

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
