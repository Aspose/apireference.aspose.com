---
title: Class XpsMatrix
second_title: Aspose.Page for .NET API Referansı
description: Aspose.Page.XPS.XpsModel.XpsMatrix sınıf. Sınıf MatrixTransform özellik öğesi özelliklerini içerir. Bu öğe öğelerin koordinat sistemlerini değiştirmek için kullanılan gelişigüzel bir afin matris dönüşümünü tanımlar.
type: docs
weight: 3210
url: /tr/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Sınıf, MatrixTransform özellik öğesi özelliklerini içerir. Bu öğe, öğelerin koordinat sistemlerini değiştirmek için kullanılan gelişigüzel bir afin matris dönüşümünü tanımlar.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Özellikleri

| İsim | Tanım |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Bu örneğin birim matris olup olmadığını gösteren bir değer alır. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | M11 öğesini alır. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | M12 öğesini alır. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | M21 öğesini alır. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | M22 öğesini alır. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | M31 öğesini alır. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | M32 öğesini alır. |

## yöntemler

| İsim | Tanım |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Bu dönüşüm matrisini klonlar. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Belirtilenin olup olmadığını belirler.Object bu örneğe eşittir. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Bu örnek için bir karma kod döndürür. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | tarafından belirtilen matris ile bu matrisi çarpar.*matrix* varsayılan (Başa Ekle) sırayla. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | tarafından belirtilen matris ile bu matrisi çarpar.*matrix* varsayılan (Başa Ekle) sırayla. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | tarafından belirtilen matris ile bu matrisi çarpar.*matrix* tarafından belirtilen sırayla*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | tarafından belirtilen matris ile bu matrisi çarpar.*matrix* tarafından belirtilen sırayla*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Bu Matrisi birim matrise sıfırlar. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | tarafından saat yönünde döndürmeyi uygular*angle* bu Matrix'e varsayılan (Başa eklenen) sırayla. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | tarafından saat yönünde döndürmeyi uygular*angle* tarafından belirtilen order düzeninde bu Matrix'e*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | tarafından saat yönünde döndürmeyi uygular*angle* etrafında*pivot* bu Matrix'e varsayılan (Başına eklenen) sırayla. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | tarafından saat yönünde döndürmeyi uygular*angle* etrafında*pivot*tarafından belirtilen sırayla bu Matrix'e *matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Belirtilen ölçek vektörünü (scaleX ve scaleY) bu Matrise varsayılan (Başa Ekleme) sırayla uygular. |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Belirtilen ölçek vektörünü (scaleX ve scaleY) bu Matrise, tarafından belirtilen sırayla uygular.*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Belirtilen eğri dönüşümünü bu Matrise uygular. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Bunun dize gösterimini döndürür`XpsMatrix` örnek. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Bu Matris tarafından temsil edilen afin dönüşümü belirtilen bir dikdörtgene uygular. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Bu Matris tarafından temsil edilen afin dönüşümü belirtilen bir noktaya uygular. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Bu Matris tarafından temsil edilen benzeşim dönüşümünü belirtilen bir nokta dizisine uygular. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Bu Matris tarafından temsil edilen benzeşim dönüşümünü nokta dizisinin belirtilen bir bölümüne uygular. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Belirtilen öteleme vektörünü bu Matrise uygular. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Belirtilen öteleme vektörünü, belirtilen sırayla bu Matrise uygular.*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | Gerçek uygulama. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | ==. operatörünü uygular |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | !=. operatörünü uygular |

### Ayrıca bakınız

* class [XpsObject](../xpsobject/)
* ad alanı [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* toplantı [Aspose.Page](../../)


