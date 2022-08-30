---
title: XpsMatrix
second_title: Aspose.Page per riferimento all'API .NET
description: Caratteristiche dellelemento della proprietà MatrixTransform incapsulante della classe. Questo elemento definisce una trasformazione di matrice affine arbitraria utilizzata per manipolare i sistemi di elementi coordinate .
type: docs
weight: 3150
url: /it/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Caratteristiche dell'elemento della proprietà MatrixTransform incapsulante della classe. Questo elemento definisce una trasformazione di matrice affine arbitraria utilizzata per manipolare i sistemi di elementi coordinate .

```csharp
public sealed class XpsMatrix : XpsObject
```

## Proprietà

| Nome | Descrizione |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity) { get; } | Ottiene un valore che indica se questa istanza è una matrice di identità. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11) { get; } | Ottiene l'elemento M11. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12) { get; } | Ottiene l'elemento M12. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21) { get; } | Ottiene l'elemento M21. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22) { get; } | Ottiene l'elemento M22. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31) { get; } | Ottiene l'elemento M31. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32) { get; } | Ottiene l'elemento M32. |

## Metodi

| Nome | Descrizione |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone)() | Clona questa matrice di trasformazione. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(object) | Determina se è specificatoObject è uguale a questa istanza. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode)() | Restituisce un codice hash per questa istanza. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_2)(Matrix) | Moltiplica questa matrice per la matrice specificata da*matrix* nell'ordine predefinito (Anteprima). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply)(XpsMatrix) | Moltiplica questa matrice per la matrice specificata da*matrix* nell'ordine predefinito (Anteprima). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_3)(Matrix, MatrixOrder) | Moltiplica questa matrice per la matrice specificata da*matrix* nell'ordine specificato da*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_1)(XpsMatrix, MatrixOrder) | Moltiplica questa matrice per la matrice specificata da*matrix* nell'ordine specificato da*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset)() | Reimposta questa matrice su matrice identità. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate)(float) | Applica la rotazione in senso orario di*angle* a questa matrice nell'ordine predefinito (Anteprima). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate_1)(float, MatrixOrder) | Applica la rotazione in senso orario di*angle* a questa matrice nell'ordine specificato da*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound)(float, PointF) | Applica la rotazione in senso orario di*angle* attorno a*pivot* a questa matrice nell'ordine predefinito (anteriore). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound_1)(float, PointF, MatrixOrder) | Applica la rotazione in senso orario di*angle* attorno a*pivot* a questa matrice nell'ordine specificato da*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale)(float, float) | Applica il vettore di scala specificato (scaleX e scaleY) a questa matrice nell'ordine predefinito (Anteprima). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale_1)(float, float, MatrixOrder) | Applica il vettore di scala specificato (scaleX e scaleY) a questa matrice nell'ordine specificato da*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew)(double, double) | Applica la trasformazione di inclinazione specificata a questa matrice. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring)() | Restituisce la rappresentazione di stringa di questo[`XpsMatrix`](../xpsmatrix) istanza. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform)(RectangleF) | Applica la trasformazione affine rappresentata da questa matrice a un rettangolo specificato. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint)(PointF) | Applica la trasformazione affine rappresentata da questa Matrice a un punto specificato. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints)(PointF[]) | Applica la trasformazione affine rappresentata da questa matrice a una matrice di punti specificata. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints_1)(PointF[], int, int) | Applica la trasformazione affine rappresentata da questa Matrice a una parte specificata dell'array di punti. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate)(float, float) | Applica il vettore di traslazione specificato a questa matrice. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate_1)(float, float, MatrixOrder) | Applica il vettore di traslazione specificato a questa matrice nell'ordine specificato da*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(XpsMatrix, XpsMatrix) | L'effettiva implementazione. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality) | Implementa l'operatore ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality) | Implementa l'operatore !=. |

### Guarda anche

* class [XpsObject](../xpsobject)
* spazio dei nomi [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel)
* assemblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
