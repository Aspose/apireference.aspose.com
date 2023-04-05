---
title: Class XpsMatrix
second_title: Справочник по Aspose.Page для .NET API
description: Aspose.Page.XPS.XpsModel.XpsMatrix сорт. Класс инкапсулирующий функции элемента свойства MatrixTransform. Этот элемент определяет произвольное аффинное матричное преобразование используемое для управления системами координат элементов.
type: docs
weight: 3210
url: /ru/net/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class

Класс, инкапсулирующий функции элемента свойства MatrixTransform. Этот элемент определяет произвольное аффинное матричное преобразование, используемое для управления системами координат элементов.

```csharp
public sealed class XpsMatrix : XpsObject
```

## Характеристики

| Имя | Описание |
| --- | --- |
| [IsIdentity](../../aspose.page.xps.xpsmodel/xpsmatrix/isidentity/) { get; } | Получает значение, указывающее, является ли этот экземпляр единичной матрицей. |
| [M11](../../aspose.page.xps.xpsmodel/xpsmatrix/m11/) { get; } | Получает элемент M11. |
| [M12](../../aspose.page.xps.xpsmodel/xpsmatrix/m12/) { get; } | Получает элемент M12. |
| [M21](../../aspose.page.xps.xpsmodel/xpsmatrix/m21/) { get; } | Получает элемент M21. |
| [M22](../../aspose.page.xps.xpsmodel/xpsmatrix/m22/) { get; } | Получает элемент M22. |
| [M31](../../aspose.page.xps.xpsmodel/xpsmatrix/m31/) { get; } | Получает элемент M31. |
| [M32](../../aspose.page.xps.xpsmodel/xpsmatrix/m32/) { get; } | Получает элемент M32. |

## Методы

| Имя | Описание |
| --- | --- |
| [Clone](../../aspose.page.xps.xpsmodel/xpsmatrix/clone/)() | Клонирует эту матрицу преобразования. |
| override [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(object) | Определяет, является ли указанныйObject равен этому экземпляру. |
| override [GetHashCode](../../aspose.page.xps.xpsmodel/xpsmatrix/gethashcode/)() | Возвращает хэш-код для этого экземпляра. |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_2)(Matrix) | Умножает эту матрицу на матрицу, заданную параметром*matrix* в порядке по умолчанию (в начале). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply)(XpsMatrix) | Умножает эту матрицу на матрицу, заданную параметром*matrix* в порядке по умолчанию (в начале). |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_3)(Matrix, MatrixOrder) | Умножает эту матрицу на матрицу, заданную параметром*matrix* в порядке, указанном*matrixOrder* . |
| [Multiply](../../aspose.page.xps.xpsmodel/xpsmatrix/multiply/#multiply_1)(XpsMatrix, MatrixOrder) | Умножает эту матрицу на матрицу, заданную параметром*matrix* в порядке, указанном*matrixOrder* . |
| [Reset](../../aspose.page.xps.xpsmodel/xpsmatrix/reset/)() | Сбрасывает эту матрицу в идентификационную матрицу. |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate)(float) | Применяет вращение по часовой стрелке на*angle* к этой матрице в порядке по умолчанию (Prepend). |
| [Rotate](../../aspose.page.xps.xpsmodel/xpsmatrix/rotate/#rotate_1)(float, MatrixOrder) | Применяет вращение по часовой стрелке на*angle* к этой Матрице в порядке указанном*matrixOrder* . |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound)(float, PointF) | Применяет вращение по часовой стрелке на*angle* вокруг*pivot* в эту матрицу в порядке по умолчанию (в начале). |
| [RotateAround](../../aspose.page.xps.xpsmodel/xpsmatrix/rotatearound/#rotatearound_1)(float, PointF, MatrixOrder) | Применяет вращение по часовой стрелке на*angle* вокруг*pivot* в эту матрицу в порядке, указанном*matrixOrder* . |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale)(float, float) | Применяет указанный вектор масштаба (scaleX и scaleY) к этой матрице в порядке по умолчанию (Prepend). |
| [Scale](../../aspose.page.xps.xpsmodel/xpsmatrix/scale/#scale_1)(float, float, MatrixOrder) | Применяет указанный вектор масштаба (scaleX и scaleY) к этой матрице в порядке , заданном*matrixOrder* . |
| [Skew](../../aspose.page.xps.xpsmodel/xpsmatrix/skew/)(double, double) | Применяет к этой матрице указанное косое преобразование. |
| override [ToString](../../aspose.page.xps.xpsmodel/xpsmatrix/tostring/)() | Возвращает строковое представление этого`XpsMatrix` экземпляр. |
| [Transform](../../aspose.page.xps.xpsmodel/xpsmatrix/transform/)(RectangleF) | Применяет аффинное преобразование, представленное этой матрицей, к указанному прямоугольнику. |
| [TransformPoint](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoint/)(PointF) | Применяет аффинное преобразование, представленное этой матрицей, к указанной точке. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints)(PointF[]) | Применяет аффинное преобразование, представленное этой матрицей, к указанному массиву точек. |
| [TransformPoints](../../aspose.page.xps.xpsmodel/xpsmatrix/transformpoints/#transformpoints_1)(PointF[], int, int) | Применяет аффинное преобразование, представленное этой матрицей, к указанной части массива точек. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate)(float, float) | Применяет указанный вектор переноса к этой матрице. |
| [Translate](../../aspose.page.xps.xpsmodel/xpsmatrix/translate/#translate_1)(float, float, MatrixOrder) | Применяет указанный вектор смещения к этой матрице в порядке, указанном*matrixOrder* . |
| static [Equals](../../aspose.page.xps.xpsmodel/xpsmatrix/equals/)(XpsMatrix, XpsMatrix) | Фактическая реализация. |
| [operator ==](../../aspose.page.xps.xpsmodel/xpsmatrix/op_equality/) | Реализует оператор ==. |
| [operator !=](../../aspose.page.xps.xpsmodel/xpsmatrix/op_inequality/) | Реализует оператор !=. |

### Смотрите также

* class [XpsObject](../xpsobject/)
* пространство имен [Aspose.Page.XPS.XpsModel](../../aspose.page.xps.xpsmodel/)
* сборка [Aspose.Page](../../)


