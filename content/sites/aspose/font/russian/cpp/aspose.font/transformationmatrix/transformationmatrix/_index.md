---
title: "Конструктор Aspose::Font::TransformationMatrix::TransformationMatrix"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font для C++"
description: "Конструктор Aspose::Font::TransformationMatrix::TransformationMatrix. Создаёт стандартную матрицу преобразования 1 к 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0] в C++."
type: docs
weight: 100
url: /ru/cpp/aspose.font/transformationmatrix/transformationmatrix/
---
## TransformationMatrix::TransformationMatrix() constructor


Создаёт стандартную матрицу преобразования 1 к 1: [ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0].

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix()
```

## См. также

* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## TransformationMatrix::TransformationMatrix(const System::ArrayPtr\<double\>\&) constructor


Принимает матрицу преобразования со следующим представлением массива: [ A B C D TX TY ].

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix(const System::ArrayPtr<double> &matrixArray)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| matrixArray | const System::ArrayPtr\<double\>\& | Массив со значениями матрицы преобразования, должен содержать 6 элементов. |

## См. также

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
## TransformationMatrix::TransformationMatrix(double, double, double, double, double, double) constructor


Создаёт матрицу преобразования [ A B C D TX TY ].

```cpp
Aspose::Font::TransformationMatrix::TransformationMatrix(double a, double b, double c, double d, double tx, double ty)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| a | double | A. |
| b | double | B. |
| c | double | C. |
| d | double | D. |
| tx | double | TX. |
| ty | double | TY. |

## См. также

* Class [TransformationMatrix](../)
* Namespace [Aspose::Font](../../)
* Library [Aspose.Font for C++](../../../)
