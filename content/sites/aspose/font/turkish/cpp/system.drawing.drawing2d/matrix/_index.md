---
title: "System::Drawing::Drawing2D::Matrix class"
linktitle: "Matrix"
second_title: "Aspose.Font için C++"
description: "System::Drawing::Drawing2D::Matrix sınıfı. Dönüşüm işlemlerini tanımlayan 3x3 bir matris temsil eder. Bu sınıfın nesneleri yalnızca System::MakeObject() işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman System::SmartPtr işaretçisine sarın ve bu işaretçiyi C++'ta işlevlere argüman olarak geçirmek için kullanın."
type: docs
weight: 1000
url: /tr/cpp/system.drawing.drawing2d/matrix/
---
## Matrix class


3x3 bir matrisi temsil eder ve dönüşüm işlemlerini tanımlar. Bu sınıfın nesneleri yalnızca [System::MakeObject()](../../system/makeobject/) işlevi kullanılarak ayrılmalıdır. Bu tipin örneğini yığına (stack) ya da operator new ile asla oluşturmayın, çünkü çalışma zamanı hatalarına ve/veya doğrulama hatalarına yol açar. Bu sınıfı her zaman [System::SmartPtr](../../system/smartptr/) işaretçisine sarın ve bu işaretçiyi işlevlere argüman olarak geçirmek için kullanın.

```cpp
class Matrix : public System::Object
```

## Yöntemler

| Yöntem | Açıklama |
| --- | --- |
| [Clone](./clone/)() const | Geçerli nesnenin bir kopyasını oluşturur. |
| [Dispose](./dispose/)() | Geçerli nesne tarafından edinilen tüm işletim sistemi kaynaklarını serbest bırakır. |
| [Equals](./equals/)(ptr) override | Belirtilen nesnenin bir [Matrix](./) olup olmadığını ve bu nesneyle aynı olup olmadığını test eder. |
| [get_Elements](./get_elements/)() const | Matrisin elemanlarını aşağıdaki sırada içeren bir dizi döndürür: m11, m12, m21, m22, dx, dy. |
| [get_IsIdentity](./get_isidentity/)() const | Geçerli nesne tarafından temsil edilen matrisin bir birim (identity) matris olup olmadığını belirler. |
| [get_IsInvertible](./get_isinvertible/)() const | Geçerli nesne tarafından temsil edilen matrisin terslenebilir olup olmadığını belirler. |
| [get_OffsetX](./get_offsetx/)() const | Geçerli nesne tarafından temsil edilen matrisin X çeviri değerini döndürür. |
| [get_OffsetY](./get_offsety/)() const | Geçerli nesne tarafından temsil edilen matrisin Y çeviri değerini döndürür. |
| [Invert](./invert/)() | Geçerli nesne tarafından temsil edilen matrisi tersine çevirir. |
| [Matrix](./matrix/)() | Bir birim matris temsil eden yeni bir [Matrix](./) sınıf örneği oluşturur. |
| [Matrix](./matrix/)(float, float, float, float, float, float) | Yeni bir [Matrix](./) sınıf örneği oluşturur ve belirtilen değerlerle başlatır. |
| [Matrix](./matrix/)(const Rectangle\&, const ArrayPtr\<Point\>\&) | Belirtilen dikdörtgen ve nokta dizisi tarafından tanımlanan geometrik dönüşüme yönelik yeni bir [Matrix](./) sınıf örneği oluşturur. |
| [Matrix](./matrix/)(const RectangleF\&, const ArrayPtr\<PointF\>\&) | Belirtilen dikdörtgen ve nokta dizisi tarafından tanımlanan geometrik dönüşüme yönelik yeni bir [Matrix](./) sınıf örneği oluşturur. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&) | Geçerli nesne tarafından temsil edilen matrisi belirtilen matrisle çarpar. |
| [Multiply](./multiply/)(const SharedPtr\<Matrix\>\&, MatrixOrder) | Geçerli nesne tarafından temsil edilen matrisi belirtilen matrisle çarpar. |
| [Reset](./reset/)() | Geçerli nesne tarafından temsil edilen matrisi bir birim matris haline gelecek şekilde sıfırlar. |
| [Rotate](./rotate/)(float) | Geçerli nesne tarafından temsil edilen matrisi belirtilen açı kadar saat yönünde döndürür. |
| [Rotate](./rotate/)(float, MatrixOrder) | Geçerli nesne tarafından temsil edilen matrisi, orijinin etrafında belirtilen açı kadar saat yönünde döndürür. |
| [RotateAt](./rotateat/)(float, const PointF\&) | Geçerli nesne tarafından temsil edilen matrisi, belirtilen noktanın etrafında belirtilen açı kadar saat yönünde döndürür. |
| [RotateAt](./rotateat/)(float, const PointF\&, MatrixOrder) | Geçerli nesne tarafından temsil edilen matrisi, belirtilen noktanın etrafında belirtilen açı kadar saat yönünde döndürür. |
| [Scale](./scale/)(float, float) | Belirtilen ölçek vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Scale](./scale/)(float, float, MatrixOrder) | Belirtilen ölçek vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Shear](./shear/)(float, float) | Belirtilen kayma vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [Shear](./shear/)(float, float, MatrixOrder) | Belirtilen kayma vektörünü geçerli nesne tarafından temsil edilen matrise uygular. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<Point\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<Point\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformPoints](./transformpoints/)(const ArrayPtr\<PointF\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformPoints](./transformpoints/)(const System::Details::ArrayView\<PointF\>\&) | Geçerli nesne tarafından temsil edilen matris tarafından tanımlanan geometrik dönüşümü belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<Point\>\&) | Yalnızca geçerli nesne tarafından temsil edilen matrisin ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<Point\>\&) | Yalnızca geçerli nesne tarafından temsil edilen matrisin ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const ArrayPtr\<PointF\>\&) | Yalnızca geçerli nesne tarafından temsil edilen matrisin ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [TransformVectors](./transformvectors/)(const System::Details::ArrayView\<PointF\>\&) | Yalnızca geçerli nesne tarafından temsil edilen matrisin ölçek ve döndürme bileşenlerini belirtilen noktalara uygular. |
| [Translate](./translate/)(float, float) | Belirtilen çeviri vektörünü geçerli nesne tarafından temsil edilen matrisine uygular. |
| [Translate](./translate/)(float, float, MatrixOrder) | Belirtilen çeviri vektörünü geçerli nesne tarafından temsil edilen matrisine uygular. |
| [VectorTransformPoints](./vectortransformpoints/)(const ArrayPtr\<Point\>\&) | Bir dizideki her vektörü geçerli nesne tarafından temsil edilen matrisle çarpar. |
| [VectorTransformPoints](./vectortransformpoints/)(const System::Details::ArrayView\<Point\>\&) | Bir dizideki her vektörü geçerli nesne tarafından temsil edilen matrisle çarpar. |
| virtual [~Matrix](./~matrix/)() | Yıkıcı. |
## Ayrıca Bakınız

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Drawing2D](../)
* Library [Aspose.Font for C++](../../)
