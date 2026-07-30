---
title: "System::Drawing::Drawing2D::PathGradientBrush sınıfı"
linktitle: "PathGradientBrush"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Drawing2D::PathGradientBrush sınıfı. Bir gradient ile bir GraphicsPath nesnesinin içini dolduran bir fırçayı temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt (stack) üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1200
url: /tr/cpp/system.drawing.drawing2d/pathgradientbrush/
---
## PathGradientBrush class


Bir gradient ile bir [GraphicsPath](../graphicspath/) nesnesinin içini dolduran bir fırçayı temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class PathGradientBrush : public System::Drawing::Brush
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Geçerli nesnenin bir kopyasını oluşturur. |
| [get_Blend](./get_blend/)() const | UYGULANMADI. |
| [get_CenterColor](./get_centercolor/)() const | Geçerli nesne tarafından doldurulan yolun merkezinde bulunan bir rengi döndürür. |
| [get_CenterPoint](./get_centerpoint/)() const | Gradientin merkez noktasını alır. |
| [get_FocusScales](./get_focusscales/)() const | Gradientin azalma (falloff) odak noktasını alır. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Çok renkli doğrusal bir gradient tanımlayan bir değeri döndürür. |
| [get_Rectangle](./get_rectangle/)() | UYGULANMADI. |
| [get_SurroundColors](./get_surroundcolors/)() const | Bu [PathGradientBrush](./) tarafından doldurulan yol içindeki noktalara karşılık gelen renkleri döndürür. |
| [get_Transform](./get_transform/)() const | Geçerli nesne tarafından temsil edilen fırça için geometrik dönüşümleri belirten bir [Matrix](../matrix/) nesnesinin kopyasını döndürür. |
| [get_WrapMode](./get_wrapmode/)() const | Sarma modunu döndürür. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Geçerli nesnenin dönüşüm matrisini belirtilen matrisle çarpar. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<PointF\>\&, WrapMode) | RTTI bilgisi. |
| [PathGradientBrush](./pathgradientbrush/)(const ArrayPtr\<Point\>\&, WrapMode) | [PathGradientBrush](./) sınıfının yeni bir örneğini oluşturur. |
| [PathGradientBrush](./pathgradientbrush/)(const SharedPtr\<GraphicsPath\>\&) | [PathGradientBrush](./) sınıfının yeni bir örneğini oluşturur. |
| [ResetTransform](./resettransform/)() | Geçerli nesnenin dönüşüm matrisini bir birim (identity) matris haline gelecek şekilde sıfırlar. |
| [RotateTransform](./rotatetransform/)(float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen açıyla ve belirtilen sırayla döndürür. |
| [ScaleTransform](./scaletransform/)(float, float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen faktörlerle ve belirtilen sırayla ölçeklendirir. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Bu fırça için temel renklerin faktörlerini ve konumlarını belirten bir karışım ayarlar. |
| [set_CenterColor](./set_centercolor/)(Color) | Geçerli nesne tarafından doldurulan yolun merkezinde bulunan bir rengi ayarlar. |
| [set_CenterPoint](./set_centerpoint/)(const PointF\&) | Gradientin merkez noktasını ayarlar. |
| [set_FocusScales](./set_focusscales/)(const PointF\&) | Gradientin azalma (falloff) odak noktasını ayarlar. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Çok renkli doğrusal bir degrade tanımlayan bir değeri ayarlar. |
| [set_SurroundColors](./set_surroundcolors/)(const ArrayPtr\<Color\>\&) | Bu [PathGradientBrush](./) tarafından doldurulan yol üzerindeki noktalara karşılık gelen renkleri ayarlar. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Geçerli nesne tarafından temsil edilen fırça için geometrik dönüşümleri belirten bir [Matrix](../matrix/) nesnesi ayarlar. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Sarım modunu ayarlar. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | UYGULANMADI. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | UYGULANMADI. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Yerel geometrik dönüşümü belirtilen boyutlarla ve belirtilen sırayla çevirir. |
## Ayrıca Bakınız

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
