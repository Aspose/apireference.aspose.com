---
title: "Aspose::Font::TransformationMatrix класс"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font для C++"
description: "Aspose::Font::TransformationMatrix класс. Представляет 3x3 матрицу преобразования | A B 0 | | C D 0 | | TX TY 1 | в C++."
type: docs
weight: 3000
url: /ru/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


Представляет 3x3 матрицу преобразования | A B 0 | | C D 0 | | TX TY 1 |.

```cpp
class TransformationMatrix : public System::ICloneable
```

## Методы

| Метод | Описание |
| --- | --- |
| [get_A](./get_a/)() const | Получает значение A матрицы преобразования. |
| [get_B](./get_b/)() const | Получает значение B матрицы преобразования. |
| [get_C](./get_c/)() const | Получает значение C матрицы преобразования. |
| [get_D](./get_d/)() const | Получает значение D матрицы преобразования. |
| [get_TX](./get_tx/)() const | Получает значение TX матрицы преобразования. |
| [get_TY](./get_ty/)() const | Получает значение TY матрицы преобразования. |
| [idx_get](./idx_get/)(int32_t) | Обеспечивает доступ к базовому массиву. |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | Умножает на другую матрицу преобразования. Не изменяет исходную матрицу преобразования, возвращает новый объект [TransformationMatrix](./). |
| [Scale](./scale/)(double, double, double\&, double\&) | Масштабирует x и y с помощью матрицы преобразования: x1 = A*x + C*y; y1 = B*x + D*y. |
| [set_A](./set_a/)(double) | Устанавливает значение A матрицы преобразования. |
| [set_B](./set_b/)(double) | Устанавливает значение B матрицы преобразования. |
| [set_C](./set_c/)(double) | Устанавливает значение C матрицы преобразования. |
| [set_D](./set_d/)(double) | Устанавливает значение D матрицы преобразования. |
| [set_TX](./set_tx/)(double) | Устанавливает значение TX матрицы преобразования. |
| [set_TY](./set_ty/)(double) | Устанавливает значение TY матрицы преобразования. |
| [ToArray](./toarray/)() | Выделяет новый массив, копирует матрицу преобразования и возвращает его. |
| [Transform](./transform/)(double, double, double\&, double\&) | Преобразует x и y с помощью матрицы преобразования: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY. |
| [TransformationMatrix](./transformationmatrix/)() | Создаёт стандартную матрицу преобразования 1 к 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]. |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | Принимает матрицу преобразования со следующим представлением массива: [ A B C D TX TY ]. |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | Создаёт матрицу преобразования [ A B C D TX TY ]. |
| [UnScale](./unscale/)(double, double, double\&, double\&) | Обратно масштабирует x1 и y1 и возвращает x и y до матрицы преобразования. |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | Обратно преобразует x1 и y1 и возвращает x и y до матрицы преобразования. |
## Примечания


Преобразует координаты следующим образом: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY.
## См. также

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
