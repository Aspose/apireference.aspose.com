---
title: "класс Aspose::Page::XPS::XpsModel::XpsMatrix"
linktitle: "XpsMatrix"
second_title: "Aspose.Page для C++"
description: "класс Aspose::Page::XPS::XpsModel::XpsMatrix. Класс, инкапсулирующий свойства элемента MatrixTransform. Этот элемент определяет произвольное аффинное преобразование матрицы, используемое для манипулирования системами координат элементов в C++."
type: docs
weight: 2600
url: /ru/cpp/aspose.page.xps.xpsmodel/xpsmatrix/
---
## XpsMatrix class


Класс, инкапсулирующий свойства элемента свойства MatrixTransform. Этот элемент определяет произвольное аффинное матричное преобразование, используемое для манипуляции системами координат элементов.

```cpp
class XpsMatrix : public Aspose::Page::XPS::XpsModel::XpsObject
```

## Методы

| Метод | Описание |
| --- | --- |
| [Clone](./clone/)() | Клонирует эту матрицу преобразования. |
| [Equals](./equals/)(System::SharedPtr\<System::Object\>) override | Определяет, равен ли указанный [System::Object](../../system/object/) этому экземпляру. |
| static [Equals](./equals/)(System::SharedPtr\<XpsMatrix\>, System::SharedPtr\<XpsMatrix\>) | Фактическая реализация. |
| [get_IsIdentity](./get_isidentity/)() | Возвращает значение, указывающее, является ли этот экземпляр единичной матрицей. |
| [get_M11](./get_m11/)() | Возвращает элемент M11. |
| [get_M12](./get_m12/)() | Возвращает элемент M12. |
| [get_M21](./get_m21/)() | Возвращает элемент M21. |
| [get_M22](./get_m22/)() | Возвращает элемент M22. |
| [get_M31](./get_m31/)() | Возвращает элемент M31. |
| [get_M32](./get_m32/)() | Возвращает элемент M32. |
| [GetHashCode](./gethashcode/)() const override | Возвращает хеш-код для этого экземпляра. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>, System::Drawing::Drawing2D::MatrixOrder) | Умножает эту матрицу на матрицу, указанную в *matrix*, в порядке, указанном в *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | Умножает эту матрицу на матрицу, указанную в *matrix*  в порядке по умолчанию (Prepend). |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>, System::Drawing::Drawing2D::MatrixOrder) | Умножает эту матрицу на матрицу, указанную в *matrix*, в порядке, указанном в *matrixOrder*. |
| [Multiply](./multiply/)(System::SharedPtr\<XpsMatrix\>) | Умножает эту матрицу на матрицу, указанную в *matrix*  в порядке по умолчанию (Prepend). |
| [Reset](./reset/)() | Сбрасывает эту Matrix к единичной матрице. |
| [Rotate](./rotate/)(float, System::Drawing::Drawing2D::MatrixOrder) | Применяет вращение по часовой стрелке на *angle*  к этой Matrix в порядке, указанном в *matrixOrder* . |
| [Rotate](./rotate/)(float) | Применяет вращение по часовой стрелке на *angle*  к этой Matrix в порядке по умолчанию (Prepend). |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF, System::Drawing::Drawing2D::MatrixOrder) | Применяет вращение по часовой стрелке на *angle*  вокруг *pivot*  к этой Matrix в порядке, указанном в *matrixOrder* . |
| [RotateAround](./rotatearound/)(float, System::Drawing::PointF) | Применяет вращение по часовой стрелке на *angle*  вокруг *pivot*  к этой Matrix в порядке по умолчанию (Prepend). |
| [Scale](./scale/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Применяет указанный вектор масштабирования (scaleX и scaleY) к этой Matrix в порядке, указанном в *matrixOrder* . |
| [Scale](./scale/)(float, float) | Применяет указанный вектор масштабирования (scaleX и scaleY) к этой Matrix в порядке по умолчанию (Prepend). |
| [Skew](./skew/)(double, double) | Применяет указанное искажение к этой Matrix. |
| [ToString](./tostring/)() const override | Возвращает строковое представление этого экземпляра [XpsMatrix](./). |
| [Transform](./transform/)(System::Drawing::RectangleF) | Применяет аффинное преобразование, представленное этой Matrix, к указанному прямоугольнику. |
| [TransformPoint](./transformpoint/)(System::Drawing::PointF) | Применяет аффинное преобразование, представленное этой Matrix, к указанной точке. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>, int32_t, int32_t) | Применяет аффинное преобразование, представленное этой Matrix, к указанной части массива точек. |
| [TransformPoints](./transformpoints/)(System::ArrayPtr\<System::Drawing::PointF\>) | Применяет аффинное преобразование, представленное этой Matrix, к указанному массиву точек. |
| [Translate](./translate/)(float, float, System::Drawing::Drawing2D::MatrixOrder) | Применяет указанный вектор переноса к этой Matrix в порядке, указанном в *matrixOrder* . |
| [Translate](./translate/)(float, float) | Применяет указанный вектор переноса к этой Matrix. |
## См. также

* Class [XpsObject](../xpsobject/)
* Namespace [Aspose::Page::XPS::XpsModel](../)
* Library [Aspose.Page for C++](../../)
