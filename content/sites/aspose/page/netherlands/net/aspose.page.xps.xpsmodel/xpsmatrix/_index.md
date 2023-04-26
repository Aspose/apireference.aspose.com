---
title: Class XpsMatrix
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsModel.XpsMatrix klas. Klasse die eigenschappen van het eigenschapselement MatrixTransform inkapselt. Dit element definieert een willekeurige affiene matrixtransformatie die wordt gebruikt om de coördinaten systemen van elementen te manipuleren.
type: docs
weight: 3220
url: /nl/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Klasse die eigenschappen van het eigenschapselement MatrixTransform inkapselt. Dit element definieert een willekeurige affiene matrixtransformatie die wordt gebruikt om de coördinaten systemen van elementen te manipuleren.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Krijgt een waarde die aangeeft of deze instantie een identiteitsmatrix is. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Haalt het M11-element op. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Haalt het M12-element op. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Haalt het M21-element op. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Haalt het M22-element op. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Haalt het M31-element op. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Haalt het M32-element op. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Kloont deze transformatiematrix. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Bepaalt of de opgegevenObject is gelijk aan deze instantie. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Retourneert een hash-code voor deze instantie. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de*matrix* in standaard (Prepend) volgorde. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de*matrix* in standaard (Prepend) volgorde. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de*matrix* in volgorde gespecificeerd door*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Vermenigvuldigt deze matrix met de matrix gespecificeerd door de*matrix* in volgorde gespecificeerd door*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Reset deze matrix naar identiteitsmatrix. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Past rechtsom draaien toe met*angle* naar deze Matrix in standaard (Prepend) volgorde. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Past rechtsom draaien toe met*angle* naar deze matrix in volgorde gespecificeerd door*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Past rechtsom draaien toe met*angle* rond de*pivot* naar deze Matrix in standaard (Prepend) volgorde. |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Past rechtsom draaien toe met*angle* rond de*pivot* naar deze Matrix in volgorde gespecificeerd door*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Past de opgegeven schaalvector (scaleX en scaleY) toe op deze matrix in de standaardvolgorde (Prepend). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Past de opgegeven schaalvector (scaleX en scaleY) toe op deze matrix in de volgorde gespecificeerd door*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Past gespecificeerde scheefheidstransformatie toe op deze matrix. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Geeft de tekenreeksrepresentatie hiervan terug`XpsMatrix` instantie. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Past de affiene transformatie die wordt weergegeven door deze matrix toe op een opgegeven rechthoek. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Past de affiene transformatie vertegenwoordigd door deze matrix toe op een gespecificeerd punt. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Past de affiene transformatie die wordt weergegeven door deze matrix toe op een gespecificeerde reeks punten. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Past de affiene transformatie vertegenwoordigd door deze matrix toe op een gespecificeerd deel van een reeks punten. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Past de opgegeven translatievector toe op deze matrix. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Past de gespecificeerde translatievector toe op deze Matrix in de volgorde gespecificeerd door*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | De daadwerkelijke implementatie. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Implementeert de operator ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Implementeert de operator !=. |

### Zie ook

* class [XpsObject](../xpsobject/)
* naamruimte [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* montage [Aspose.Page](../../)


