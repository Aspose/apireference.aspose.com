---
title: "System::Drawing::Drawing2D::HatchBrush クラス"
linktitle: "HatchBrush"
second_title: "C++ 用 Aspose.Page"
description: "System::Drawing::Drawing2D::HatchBrush クラス。ハッチスタイル、前景色、背景色を持つ矩形ブラシを表します。このクラスのオブジェクトは System::MakeObject() 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを System::SmartPtr ポインタでラップし、そのポインタを C++ の関数に引数として渡す際に使用してください。"
type: docs
weight: 800
url: /ja/cpp/system.drawing.drawing2d/hatchbrush/
---
## HatchBrush class


ハッチスタイル、前景色、背景色を持つ矩形ブラシを表します。このクラスのオブジェクトは [System::MakeObject()](../../system/makeobject/) 関数を使用してのみ割り当てるべきです。スタック上で、または operator new を使用してこの型のインスタンスを作成しないでください。そうしないと実行時エラーやアサーション障害が発生します。常にこのクラスを [System::SmartPtr](../../system/smartptr/) ポインタでラップし、そのポインタを関数に引数として渡す際に使用してください。

```cpp
class HatchBrush : public System::Drawing::Brush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | 現在のオブジェクトの正確なコピーを作成します。 |
| [get_BackgroundColor](./get_backgroundcolor/)() const | このブラシの背景色を示す値を返します。 |
| [get_ForegroundColor](./get_foregroundcolor/)() const | このブラシの前景色を示す値を返します。 |
| [get_HatchStyle](./get_hatchstyle/)() const | このブラシのハッチスタイルを示す値を返します。 |
| [HatchBrush](./hatchbrush/)(HatchStyle, Color, Color) | RTTI 情報。 |
## 参照

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
