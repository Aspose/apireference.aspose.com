---
title: "Aspose::Page::EPS::GradientBrush class"
linktitle: "GradientBrush"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::EPS::GradientBrush クラス。このクラスは LinearGradientBrush と PathGradientBrush をカプセル化し、ラップモードを clamp に設定できるようにします。ネイティブのグラデーションブラシは、C++ で WrapMode プロパティを WrapMode.Clamp に設定しようとすると常に例外をスローします。"
type: docs
weight: 300
url: /ja/cpp/aspose.page.eps/gradientbrush/
---
## GradientBrush class


このクラスは LinearGradientBrush と PathGradientBrush をカプセル化し、ラップモードを Clamp に設定できるようにします。ネイティブのグラデーションブラシは、WrapMode プロパティを WrapMode.Clamp に設定しようとすると常に例外をスローします。

```cpp
class GradientBrush : public System::Drawing::Brush
```

## メソッド

| メソッド | 説明 |
| --- | --- |
| [Clone](./clone/)() override | このブラシをクローンします。 |
| [Dispose](./dispose/)() override | この [T:Aspose::Page::EPS::GradientBrush](../) オブジェクトが使用しているすべてのリソースを解放します。 |
| [get_Bounds](./get_bounds/)() const | このグラデーションブラシの境界を取得または指定します。 |
| [get_NativeBrush](./get_nativebrush/)() const | ネイティブのグラデーションブラシを返します。 |
| [get_WrapMode](./get_wrapmode/)() const | このグラデーションブラシのラップモードを取得または指定します。WrapMode.Clamp に設定すると、ネイティブのグラデーションブラシで例外がスローされます。 |
| [GradientBrush](./gradientbrush/)(System::SharedPtr\<System::Drawing::Brush\>) | 新しい [GradientBrush](./) のインスタンスを作成します。 |
| [set_Bounds](./set_bounds/)(System::Drawing::RectangleF) | このグラデーションブラシの境界を取得または指定します。 |
| [set_WrapMode](./set_wrapmode/)(System::Drawing::Drawing2D::WrapMode) | このグラデーションブラシのラップモードを取得または指定します。WrapMode.Clamp に設定すると、ネイティブのグラデーションブラシで例外がスローされます。 |
## 参照

* Class [Brush](../../system.drawing/brush/)
* Namespace [Aspose::Page::EPS](../)
* Library [Aspose.Page for C++](../../)
