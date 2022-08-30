---
title: XpsMatrix
second_title: Aspose.Page for .NET API Referansı
description: MatrixTransform özellik öğesi özelliklerini içeren sınıf. Bu öğe koordinat öğe sistemlerini işlemek için kullanılan rastgele bir afin matris dönüşümünü tanımlar.
type: docs
weight: 3150
url: /tr/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

MatrixTransform özellik öğesi özelliklerini içeren sınıf. Bu öğe, koordinat öğe sistemlerini işlemek için kullanılan rastgele bir afin matris dönüşümünü tanımlar.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity) { get; } | Bu örneğin kimlik matrisi olup olmadığını gösteren bir değer alır. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11) { get; } | M11 öğesini alır. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12) { get; } | M12 öğesini alır. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21) { get; } | M21 öğesini alır. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22) { get; } | M22 öğesini alır. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31) { get; } | M31 öğesini alır. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32) { get; } | M32 öğesini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone)() | Bu dönüşüm matrisini klonlar. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(object) | BelirtilenObject bu örneğe eşittir. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode)() | Bu örnek için bir karma kod döndürür. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_2)(Matrix) | Bu matrisi, tarafından belirtilen matrisle çarpar.*matrix* varsayılan (Prepend) sırayla. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply)(XpsMatrix) | Bu matrisi, tarafından belirtilen matrisle çarpar.*matrix* varsayılan (Prepend) sırayla. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_3)(Matrix, MatrixOrder) | Bu matrisi, tarafından belirtilen matrisle çarpar.*matrix* tarafından belirtilen sırayla*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_1)(XpsMatrix, MatrixOrder) | Bu matrisi, tarafından belirtilen matrisle çarpar.*matrix* tarafından belirtilen sırayla*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset)() | Bu Matrisi kimlik matrisine sıfırlar. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate)(float) | Saat yönünde döndürmeyi şu şekilde uygular:*angle* varsayılan (Prepend) sırayla bu Matrix'e. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate_1)(float, MatrixOrder) | Saat yönünde döndürmeyi şu şekilde uygular:*angle* tarafından belirtilen order içinde bu Matrise*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound)(float, PointF) | Saat yönünde döndürmeyi şu şekilde uygular:*angle* etrafında*pivot* bu Matrix'e varsayılan (Prepend) sırayla. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound_1)(float, PointF, MatrixOrder) | Saat yönünde döndürmeyi şu şekilde uygular:*angle* etrafında*pivot*tarafından belirtilen sırayla bu Matrise *matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale)(float, float) | Belirtilen ölçek vektörünü (scaleX ve scaleY) varsayılan (Prepend) sırayla bu Matrise uygular. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale_1)(float, float, MatrixOrder) | Belirtilen ölçek vektörünü (scaleX ve scaleY) tarafından belirtilen order içinde bu Matrise uygular*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew)(double, double) | Belirtilen çarpık dönüşümü bu Matrix'e uygular. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring)() | Bunun dize temsilini döndürür[`XpsMatrix`](../xpsmatrix) örnek. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform)(RectangleF) | Bu Matris tarafından temsil edilen afin dönüşümü belirtilen bir dikdörtgene uygular. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint)(PointF) | Bu Matris tarafından temsil edilen afin dönüşümü belirtilen bir noktaya uygular. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints)(PointF[]) | Bu Matris tarafından temsil edilen afin dönüşümü belirli bir nokta dizisine uygular. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints_1)(PointF[], int, int) | Bu Matris tarafından temsil edilen afin dönüşümü, nokta dizisinin belirli bir bölümüne uygular. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate)(float, float) | Belirtilen çeviri vektörünü bu Matrix'e uygular. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate_1)(float, float, MatrixOrder) | Belirtilen çeviri vektörünü tarafından belirtilen sırayla bu Matrise uygular.*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(XpsMatrix, XpsMatrix) | Gerçek uygulama. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality) | ==. operatörünü uygular |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality) | Operatörünü uygular !=. |

### Ayrıca bakınız

* class [XpsObject](../xpsobject)
* ad alanı [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel)
* toplantı [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
