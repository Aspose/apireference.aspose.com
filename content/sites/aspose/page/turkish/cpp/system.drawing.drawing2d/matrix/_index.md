---
title: "System::Drawing::Drawing2D::Matrix class"
linktitle: "Matrix"
second_title: "Aspose.Page için C++"
description: "System::Drawing::Drawing2D::Matrix class. Dönüşüm işlemlerini tanımlayan 3x3 bir matris temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisiyle sarmalayın ve bu işaretçiyi C++'da fonksiyonlara argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


Dönüşüm işlemlerini tanımlayan 3x3 bir matrisi temsil eder. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da new operatörüyle oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisiyle sarmalayın ve bu işaretçiyi fonksiyonlara argüman olarak geçirmek için kullanın.

```cpp
class Matrix : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() const | Geçerli nesnenin bir kopyasını oluşturur. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Equals](./equals/)(ptr) override | Belirtilen nesnenin bir [Matrix](./) olup olmadığını ve bu nesneyle aynı olup olmadığını test eder. |
| [get_Elements](./get_elements/)() const | Matriksin elemanlarını aşağıdaki sırayla içeren bir dizi döndürür: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Geçerli nesne tarafından temsil edilen matrisin bir birim matris olup olmadığını belirler. |
| [get_IsInvertible](./get_isinvertible/)() const | Geçerli nesne tarafından temsil edilen matrisin terslenebilir olup olmadığını belirler. |
| [get_OffsetX](./get_offsetx/)() const | Geçerli nesne tarafından temsil edilen matrisin X çeviri değerini döndürür. |
| [get_OffsetY](./get_offsety/)() const | Geçerli nesne tarafından temsil edilen matrisin Y çeviri değerini döndürür. |
| [Invert](./invert/)() | Geçerli nesne tarafından temsil edilen matrisi tersine çevirir. |
| [Matrix](./matrix/)() | [Matrix](./) sınıfının bir birim matris temsil eden yeni bir örneğini oluşturur. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | [Matrix](./) sınıfının yeni bir örneğini oluşturur ve belirtilen değerlerle başlatır. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Belirtilen dikdörtgen ve nokta dizisi tarafından tanımlanan geometrik dönüşüme göre [Matrix](./) sınıfının yeni bir örneğini oluşturur. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Belirtilen dikdörtgen ve nokta dizisi tarafından tanımlanan geometrik dönüşüme göre [Matrix](./) sınıfının yeni bir örneğini oluşturur. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Geçerli nesne tarafından temsil edilen matrisi belirtilen matrisle çarpar. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Geçerli nesne tarafından temsil edilen matrisi belirtilen matrisle çarpar. |
| [Reset](./reset/)() | Geçerli nesne tarafından temsil edilen matrisi bir birim matris olacak şekilde sıfırlar. |
| [Rotate](./rotate/)(float) | Geçerli nesne tarafından temsil edilen matrisi belirtilen açı kadar saat yönünde döndürür. |
| [Rotate](./rotate/)(float, MatrixOrder) | Geçerli nesne tarafından temsil edilen matrisi orijinin etrafında belirtilen açı kadar saat yönünde döndürür. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Geçerli nesne tarafından temsil edilen matrisi belirtilen noktanın etrafında belirtilen açı kadar saat yönünde döndürür. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Geçerli nesne tarafından temsil edilen matrisi belirtilen noktanın etrafında belirtilen açı kadar saat yönünde döndürür. |
| [Scale](./scale/)(float, float) | Belirtilen ölçek vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Scale](./scale/)(float, float, MatrixOrder) | Belirtilen ölçek vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Shear](./shear/)(float, float) | Belirtilen kayma vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Shear](./shear/)(float, float, MatrixOrder) | Belirtilen kayma vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Geçerli nesne tarafından temsil edilen matrisin yalnızca ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Geçerli nesne tarafından temsil edilen matrisin yalnızca ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Geçerli nesne tarafından temsil edilen matrisin yalnızca ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Geçerli nesne tarafından temsil edilen matrisin yalnızca ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [Translate](./translate/)(float, float) | Belirtilen çeviri vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Translate](./translate/)(float, float, MatrixOrder) | Belirtilen çeviri vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Bir dizideki her vektörü geçerli nesne tarafından temsil edilen matrisle çarpar. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Bir dizideki her vektörü geçerli nesne tarafından temsil edilen matrisle çarpar. |
| virtual [~Matrix](./~matrix/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Page for C++](../../)
