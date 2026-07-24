---
title: "Aspose::Page::XPS::XpsModel::XpsMatrix clase"
linktitle: "XpsMatrix"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsModel::XpsMatrix clase. Clase que encapsula las características del elemento de la propiedad MatrixTransform. Este elemento define una transformación matricial afín arbitraria utilizada para manipular los sistemas de coordenadas de los elementos en C++."
type: docs
weight: 2600
url: /es/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Clase que encapsula características del elemento de propiedad MatrixTransform. Este elemento define una transformación matricial afín arbitraria utilizada para manipular los sistemas de coordenadas de los elementos.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Métodos

| Método | Descripción |
| --- | --- |
| [Clone](./clone/)() | Clona esta matriz de transformación. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Determina si el [System::Object](../../system/object/) especificado es igual a esta instancia. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | La implementación real. |
| [get_IsIdentity](./get_isidentity/)() | Obtiene un valor que indica si esta instancia es una matriz identidad. |
| [get_M11](./get_m11/)() | Obtiene el elemento M11. |
| [get_M12](./get_m12/)() | Obtiene el elemento M12. |
| [get_M21](./get_m21/)() | Obtiene el elemento M21. |
| [get_M22](./get_m22/)() | Obtiene el elemento M22. |
| [get_M31](./get_m31/)() | Obtiene el elemento M31. |
| [get_M32](./get_m32/)() | Obtiene el elemento M32. |
| [GetHashCode](./gethashcode/)() const override | Devuelve un código hash para esta instancia. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplica esta matriz por la matriz especificada por *matrix* en el orden especificado por *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Multiplica esta matriz por la matriz especificada por el *matrix* en orden predeterminado (Prepend). |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Multiplica esta matriz por la matriz especificada por *matrix* en el orden especificado por *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Multiplica esta matriz por la matriz especificada por el *matrix* en orden predeterminado (Prepend). |
| [Reset](./reset/)() | Restablece esta Matriz a la matriz identidad. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Aplica una rotación en sentido horario por *angle* a esta Matriz en el orden especificado por *matrixOrder*. |
| [Rotate](./rotate/)(float) | Aplica una rotación en sentido horario por *angle* a esta Matriz en orden predeterminado (Prepend). |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Aplica una rotación en sentido horario por *angle* alrededor del *pivot* a esta Matriz en el orden especificado por *matrixOrder*. |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Aplica una rotación en sentido horario por *angle* alrededor del *pivot* a esta Matriz en orden predeterminado (Prepend). |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Aplica el vector de escala especificado (scaleX y scaleY) a esta Matriz en el orden especificado por *matrixOrder*. |
| [Scale](./scale/)(float, float) | Aplica el vector de escala especificado (scaleX y scaleY) a esta Matriz en orden predeterminado (Prepend). |
| [Skew](./skew/)(double, double) | Aplica la transformación de sesgo especificada a esta Matriz. |
| [ToString](./tostring/)() const override | Devuelve la representación en cadena de esta instancia [XpsMatrix](./). |
| [Transform](./transform/)(System::Drawing::RectangleF) | Aplica la transformación afín representada por esta Matriz a un rectángulo especificado. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Aplica la transformación afín representada por esta Matriz a un punto especificado. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Aplica la transformación afín representada por esta Matriz a una parte especificada del arreglo de puntos. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Aplica la transformación afín representada por esta Matriz a un arreglo de puntos especificado. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Aplica el vector de traslación especificado a esta Matriz en el orden especificado por *matrixOrder*. |
| [Translate](./translate/)(float, float) | Aplica el vector de traslación especificado a esta Matriz. |
## Ver también

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
