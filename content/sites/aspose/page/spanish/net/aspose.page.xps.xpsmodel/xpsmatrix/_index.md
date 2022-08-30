---
title: XpsMatrix
second_title: Referencia de la API de Aspose.Page para .NET
description: Clase que encapsula características del elemento de propiedad MatrixTransform. Este elemento define una transformación de matriz afín arbitraria utilizada para manipular los sistemas de coordenadas de elementos.
type: docs
weight: 3150
url: /es/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Clase que encapsula características del elemento de propiedad MatrixTransform. Este elemento define una transformación de matriz afín arbitraria utilizada para manipular los sistemas de coordenadas de elementos.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Propiedades

| Nombre | Descripción |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity) { get; } | Obtiene un valor que indica si esta instancia es una matriz de identidad. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11) { get; } | Obtiene el elemento M11. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12) { get; } | Obtiene el elemento M12. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21) { get; } | Obtiene el elemento M21. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22) { get; } | Obtiene el elemento M22. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31) { get; } | Obtiene el elemento M31. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32) { get; } | Obtiene el elemento M32. |

## Métodos

| Nombre | Descripción |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone)() | Clona esta matriz de transformación. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(object) | Determina si el especificadoObject es igual a esta instancia. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode)() | Devuelve un código hash para esta instancia. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_2)(Matrix) | Multiplica esta matriz por la matriz especificada por el*matrix* en orden predeterminado (antepuesto). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply)(XpsMatrix) | Multiplica esta matriz por la matriz especificada por el*matrix* en orden predeterminado (antepuesto). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_3)(Matrix, MatrixOrder) | Multiplica esta matriz por la matriz especificada por el*matrix* en el orden especificado por*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply#multiply_1)(XpsMatrix, MatrixOrder) | Multiplica esta matriz por la matriz especificada por el*matrix* en el orden especificado por*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset)() | Restablece esta Matriz a matriz de identidad. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate)(float) | Aplica rotación en el sentido de las agujas del reloj*angle* a esta Matriz en el orden predeterminado (Anteponer). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate#rotate_1)(float, MatrixOrder) | Aplica rotación en el sentido de las agujas del reloj*angle* a esta Matriz en order especificado por*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound)(float, PointF) | Aplica rotación en el sentido de las agujas del reloj*angle* alrededor de*pivot* a esta Matriz en el orden predeterminado (Anteponer). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound#rotatearound_1)(float, PointF, MatrixOrder) | Aplica rotación en el sentido de las agujas del reloj*angle* alrededor de*pivot* a esta Matriz en el orden especificado por*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale)(float, float) | Aplica el vector de escala especificado (escalaX y escalaY) a esta matriz en el orden predeterminado (anteponer). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale#scale_1)(float, float, MatrixOrder) | Aplica el vector de escala especificado (escalaX y escalaY) a esta Matriz en orden especificado por*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew)(double, double) | Aplica la transformación de sesgo especificada a esta matriz. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring)() | Devuelve la representación de cadena de este[`XpsMatrix`](../xpsmatrix) instancia. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform)(RectangleF) | Aplica la transformación afín representada por esta Matriz a un rectángulo especificado. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint)(PointF) | Aplica la transformación afín representada por esta Matriz a un punto especificado. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints)(PointF[]) | Aplica la transformación afín representada por esta Matriz a una matriz específica de puntos. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints#transformpoints_1)(PointF[], int, int) | Aplica la transformación afín representada por esta Matriz a una parte específica de la matriz de puntos. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate)(float, float) | Aplica el vector de traslación especificado a esta Matriz. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate#translate_1)(float, float, MatrixOrder) | Aplica el vector de traducción especificado a esta Matriz en el orden especificado por*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals)(XpsMatrix, XpsMatrix) | La implementación real. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality) | Implementa el operador ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality) | Implementa el operador !=. |

### Ver también

* class [XpsObject](../xpsobject)
* espacio de nombres [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel)
* asamblea [Aspose.Page](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.Page.dll -->
