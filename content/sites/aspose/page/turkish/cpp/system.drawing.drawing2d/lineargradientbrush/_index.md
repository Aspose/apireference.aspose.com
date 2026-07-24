---
title: "System::Drawing::Drawing2D::LinearGradientBrush sınıfı"
linktitle: "LinearGradientBrush"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Drawing2D::LinearGradientBrush sınıfı. Lineer bir degrade fırçasını temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak oluşturulmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 900
url: /tr/cpp/system.drawing.drawing2d/lineargradientbrush/
---
## LinearGradientBrush class


Lineer bir degrade fırçasını temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak oluşturulmalıdır. Bu tipin örneğini yığıt üzerinde veya operator new kullanarak asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class LinearGradientBrush : public System::Drawing::Brush
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() override | Geçerli nesnenin bir kopyasını oluşturur. |
| [get_Blend](./get_blend/)() const | Bu fırça için temel renklerin faktörlerini ve konumlarını belirten bir karışım döndürür. |
| [get_GammaCorrection](./get_gammacorrection/)() const | Bu fırça için gama düzeltmesinin etkin olduğunu gösteren bir değer döndürür. |
| [get_InterpolationColors](./get_interpolationcolors/)() const | Çok renkli lineer bir degrade tanımlayan bir [ColorBlend](../colorblend/) nesnesi döndürür. |
| [get_LinearColors](./get_linearcolors/)() const | Bu degrade'nin başlangıç ve bitiş renklerini döndürür. |
| [get_Rectangle](./get_rectangle/)() | Sınırlayıcı bir dikdörtgen döndürür. |
| [get_Transform](./get_transform/)() const | Geçerli nesne tarafından temsil edilen fırça için geometrik dönüşümleri belirten bir [Matrix](../matrix/) nesnesinin kopyasını döndürür. |
| [get_WrapMode](./get_wrapmode/)() const | Sarma modunu döndürür. |
| [LinearGradientBrush](./lineargradientbrush/)(const PointF\&, const PointF\&, const Color\&, const Color\&) | RTTI bilgisi. |
| [LinearGradientBrush](./lineargradientbrush/)(const Point\&, const Point\&, const Color\&, const Color\&) | [LinearGradientBrush](./) yeni bir örnek oluşturur. |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./) yeni bir örnek oluşturur. |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, LinearGradientMode) | [LinearGradientBrush](./) yeni bir örnek oluşturur. |
| [LinearGradientBrush](./lineargradientbrush/)(const RectangleF\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./) yeni bir örnek oluşturur. |
| [LinearGradientBrush](./lineargradientbrush/)(const Rectangle\&, const Color\&, const Color\&, float, bool) | [LinearGradientBrush](./) yeni bir örnek oluşturur. |
| [MultiplyTransform](./multiplytransform/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Geçerli nesnenin dönüşüm matrisini belirtilen matrisle çarpar. |
| [ResetTransform](./resettransform/)() | Geçerli nesnenin dönüşüm matrisini sıfırlar. |
| [RotateTransform](./rotatetransform/)(float, MatrixOrder) | Geçerli nesnenin dönüşüm matrisini döndürür. |
| [ScaleTransform](./scaletransform/)(float, float, MatrixOrder) | Geçerli nesnenin dönüşüm matrisini ölçeklendirir. |
| [set_Blend](./set_blend/)(const SharedPtr\<Blend\>\&) | Bu fırça için temel renklerin faktörlerini ve konumlarını belirten bir karışım ayarlar. |
| [set_GammaCorrection](./set_gammacorrection/)(bool) | Bu fırça için gama düzeltme durumunu ayarlar. |
| [set_InterpolationColors](./set_interpolationcolors/)(const SharedPtr\<ColorBlend\>\&) | Çok renkli lineer bir degrade tanımlayan bir [ColorBlend](../colorblend/) nesnesi ayarlar. |
| [set_LinearColors](./set_linearcolors/)(const ArrayPtr\<Color\>\&) | Bu degrade'nin başlangıç ve bitiş renklerini ayarlar. |
| [set_Transform](./set_transform/)(const SharedPtr\<Matrix\>\&) | Mevcut nesne tarafından temsil edilen fırça için geometrik dönüşümleri belirten bir [Matrix](../matrix/) nesnesi ayarlar. |
| [set_WrapMode](./set_wrapmode/)(WrapMode) | Sarım modunu ayarlar. |
| [SetBlendTriangularShape](./setblendtriangularshape/)(float, float) | UYGULANMADI. |
| [SetSigmaBellShape](./setsigmabellshape/)(float, float) | UYGULANMADI. |
| [TranslateTransform](./translatetransform/)(float, float, Drawing2D::MatrixOrder) | Mevcut nesnenin dönüşüm matrisini çevirir. |
## Ayrıca Bakınız

* Class [Brush](../../system.drawing/brush/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
