---
title: Matrix
second_title: Aspose.Drawing for .NET API Referansı
description: Geometrik bir dönüşümü temsil eden 3e 3 afin matrisi kapsüller. Bu sınıf devralınamaz.
type: docs
weight: 360
url: /tr/net/system.drawing.drawing2d/matrix/
---
## Matrix class

Geometrik bir dönüşümü temsil eden 3'e 3 afin matrisi kapsüller. Bu sınıf devralınamaz.

```csharp
public sealed class Matrix : IDisposable
```

## yapıcılar

| İsim | Tanım |
| --- | --- |
| [Matrix](matrix#constructor)() | Kimlik matrisi olarak Matrix sınıfının yeni bir örneğini başlatır. |
| [Matrix](matrix#constructor_2)(Rectangle, Point[]) | Yeni bir örneğini başlatır[`Matrix`](../matrix) belirtilen dikdörtgen ve nokta dizisi tarafından tanımlanan geometrik dönüşüme sınıf. |
| [Matrix](matrix#constructor_3)(RectangleF, PointF[]) | Yeni bir örneğini başlatır[`Matrix`](../matrix) belirtilen dikdörtgen ve nokta dizisi tarafından tanımlanan geometrik dönüşüme sınıf. |
| [Matrix](matrix#constructor_1)(float, float, float, float, float, float) | Belirtilen öğelerle Matrix sınıfının yeni bir örneğini başlatır. |

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [Elements](../../system.drawing.drawing2d/matrix/elements) { get; } | Bu Matrisin öğelerini temsil eden bir dizi kayan nokta değeri alır. |
| [IsIdentity](../../system.drawing.drawing2d/matrix/isidentity) { get; } | Bu Matrisin kimlik matrisi olup olmadığını gösteren bir değer alır. |
| [IsInvertible](../../system.drawing.drawing2d/matrix/isinvertible) { get; } | Bu Matrix'in ters çevrilebilir olup olmadığını gösteren bir değer alır. |
| [OffsetX](../../system.drawing.drawing2d/matrix/offsetx) { get; } | Bu Matrix'in x çeviri değerini (dx değeri veya üçüncü satır ve ilk sütundaki öğe) alır. |
| [OffsetY](../../system.drawing.drawing2d/matrix/offsety) { get; } | y çeviri değerini alır (`ölmek` değeri veya bu Matrix'in üçüncü satırındaki ve ikinci sütunundaki öğe). |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../system.drawing.drawing2d/matrix/clone)() | Bu Matrix'in tam bir kopyasını oluşturur. |
| [Dispose](../../system.drawing.drawing2d/matrix/dispose)() | Bu Matrix tarafından kullanılan tüm kaynakları serbest bırakır. |
| [Invert](../../system.drawing.drawing2d/matrix/invert)() | Tersine çevrilebilirse, bu Matrisi tersine çevirir. |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply)(Matrix) | Bunu çarparMatrix belirtilen matris tarafından*matrix* parametre, belirtilenin başına eklenerekMatrix . |
| [Multiply](../../system.drawing.drawing2d/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | Bunu çarparMatrix belirtilen matris tarafından*matrix* parametresi, ve içinde belirtilen sırada*order* parametre. |
| [Reset](../../system.drawing.drawing2d/matrix/reset)() | Bunu sıfırlarMatrixkimlik matrisinin öğelerine sahip olmak için. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate)(float) | Bunun başına ekleMatrix orijin etrafında ve belirtilen açıyla saat yönünde dönüş. |
| [Rotate](../../system.drawing.drawing2d/matrix/rotate#rotate_1)(float, MatrixOrder) | Bunun için orijin (sıfır x ve y koordinatları) etrafında açı parametresinde belirtilen bir miktarın saat yönünde dönüşünü uygularMatrix . |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat)(float, PointF) | Bu Matrise, nokta parametresinde belirtilen nokta etrafında ve dönüşün başına eklenerek saat yönünde bir dönüş uygular. |
| [RotateAt](../../system.drawing.drawing2d/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | Bu Matrix'e belirtilen sırada belirtilen nokta etrafında saat yönünde bir dönüş uygular. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale)(float, float) | Ölçek vektörünü başa ekleyerek belirtilen ölçek vektörünü bu Matrise uygular. |
| [Scale](../../system.drawing.drawing2d/matrix/scale#scale_1)(float, float, MatrixOrder) | Belirtilen ölçek vektörünü (scaleX ve scaleY) belirtilen sırayı kullanarak bu Matrise uygular. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear)(float, float) | Kayma dönüşümünü başına ekleyerek belirtilen kesme vektörünü bu Matrise uygular. |
| [Shear](../../system.drawing.drawing2d/matrix/shear#shear_1)(float, float, MatrixOrder) | Belirtilen kesme vektörünü bu Matrix'e belirtilen sırada uygular. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints)(PointF[]) | Bununla temsil edilen geometrik dönüşümü uygular.Matrix belirli bir nokta dizisine. |
| [TransformPoints](../../system.drawing.drawing2d/matrix/transformpoints#transformpoints_1)(Point[]) | Bununla temsil edilen geometrik dönüşümü uygular.Matrix belirli bir nokta dizisine. |
| [TransformVectors](../../system.drawing.drawing2d/matrix/transformvectors)(PointF[]) | Bir dizideki her vektörü matrisle çarpar. Bu matrisin (üçüncü satır) çeviri öğeleri yok sayılır. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate)(float, float) | Belirtilen çeviri vektörünü (offsetX ve offsetY), çeviri vektörünü başa ekleyerek bu Matrise uygular. |
| [Translate](../../system.drawing.drawing2d/matrix/translate#translate_1)(float, float, MatrixOrder) | Belirtilen çeviri vektörünü belirtilen sırayla bu Matrix'e uygular. |

### Ayrıca bakınız

* ad alanı [System.Drawing.Drawing2D](../../system.drawing.drawing2d)
* toplantı [Aspose.Drawing](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Drawing.dll -->
