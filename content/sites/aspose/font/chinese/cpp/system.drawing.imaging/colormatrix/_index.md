---
title: "System::Drawing::Imaging::ColorMatrix class"
linktitle: "ColorMatrix"
second_title: "Aspose.Font 适用于 C++"
description: "System::Drawing::Imaging::ColorMatrix 类。表示包含 RGBAW 颜色空间坐标的 5×5 矩阵。此类的对象应仅使用 System::MakeObject() 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为这会导致运行时错误和/或断言故障。始终将此类包装在 System::SmartPtr 指针中，并使用该指针将其作为参数传递给 C++ 函数。"
type: docs
weight: 300
url: /zh/cpp/system.drawing.imaging/colormatrix/
---
## ColorMatrix class


表示包含 RGBAW 颜色空间坐标的 5×5 矩阵。此类的对象应仅使用 [System::MakeObject()](../../system/makeobject/) 函数分配。切勿在栈上或使用 operator new 创建此类型的实例，因为会导致运行时错误和/或断言故障。始终将此类包装在 [System::SmartPtr](../../system/smartptr/) 指针中，并使用该指针将其作为参数传递给函数。

```cpp
class ColorMatrix : public System::Object
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [ColorMatrix](./colormatrix/)() | 构造一个新的 [ColorMatrix](./) 类实例，并使用单位矩阵的值进行初始化。 |
| [ColorMatrix](./colormatrix/)(const System::ArrayPtr\<System::ArrayPtr\<float\>\>\&) | 构造一个新的 [ColorMatrix](./) 类实例，并使用指定的值进行初始化。 |
| [get_Matrix00](./get_matrix00/)() const | 返回第 0 行第 0 列的值。 |
| [get_Matrix01](./get_matrix01/)() const | 返回第 0 行第 1 列的值。 |
| [get_Matrix02](./get_matrix02/)() const | 返回第 0 行第 2 列的值。 |
| [get_Matrix03](./get_matrix03/)() const | 返回第 0 行第 3 列的值。 |
| [get_Matrix04](./get_matrix04/)() const | 返回第 0 行第 4 列的值。 |
| [get_Matrix10](./get_matrix10/)() const | 返回第 1 行第 0 列的值。 |
| [get_Matrix11](./get_matrix11/)() const | 返回第 1 行第 1 列的值。 |
| [get_Matrix12](./get_matrix12/)() const | 返回第 1 行第 2 列的值。 |
| [get_Matrix13](./get_matrix13/)() const | 返回第1行第3列的值。 |
| [get_Matrix14](./get_matrix14/)() const | 返回第1行第4列的值。 |
| [get_Matrix20](./get_matrix20/)() const | 返回第2行第0列的值。 |
| [get_Matrix21](./get_matrix21/)() const | 返回第2行第1列的值。 |
| [get_Matrix22](./get_matrix22/)() const | 返回第2行第2列的值。 |
| [get_Matrix23](./get_matrix23/)() const | 返回第2行第3列的值。 |
| [get_Matrix24](./get_matrix24/)() const | 返回第2行第4列的值。 |
| [get_Matrix30](./get_matrix30/)() const | 返回第3行第0列的值。 |
| [get_Matrix31](./get_matrix31/)() const | 返回第3行第1列的值。 |
| [get_Matrix32](./get_matrix32/)() const | 返回第3行第2列的值。 |
| [get_Matrix33](./get_matrix33/)() const | 返回第3行第3列的值。 |
| [get_Matrix34](./get_matrix34/)() const | 返回第3行第4列的值。 |
| [get_Matrix40](./get_matrix40/)() const | 返回第4行第0列的值。 |
| [get_Matrix41](./get_matrix41/)() const | 返回第4行第1列的值。 |
| [get_Matrix42](./get_matrix42/)() const | 返回第4行第2列的值。 |
| [get_Matrix43](./get_matrix43/)() const | 返回第4行第3列的值。 |
| [get_Matrix44](./get_matrix44/)() const | 返回第4行第4列的值。 |
| [idx_get](./idx_get/)(int, int) | 返回指定行和列处的值。 |
| [idx_set](./idx_set/)(int, int, float) | 在矩阵的指定位置设置指定的值。 |
| [set_Matrix00](./set_matrix00/)(float) | 在第0行第0列设置一个值。 |
| [set_Matrix01](./set_matrix01/)(float) | 在第0行第1列设置一个值。 |
| [set_Matrix02](./set_matrix02/)(float) | 在第0行第2列设置一个值。 |
| [set_Matrix03](./set_matrix03/)(float) | 在第0行第3列设置一个值。 |
| [set_Matrix04](./set_matrix04/)(float) | 在第0行第4列设置一个值。 |
| [set_Matrix10](./set_matrix10/)(float) | 在第1行第0列设置一个值。 |
| [set_Matrix11](./set_matrix11/)(float) | 在第1行第1列设置一个值。 |
| [set_Matrix12](./set_matrix12/)(float) | 在第1行第2列设置一个值。 |
| [set_Matrix13](./set_matrix13/)(float) | 在第1行第3列设置一个值。 |
| [set_Matrix14](./set_matrix14/)(float) | 在第1行第4列设置一个值。 |
| [set_Matrix20](./set_matrix20/)(float) | 在第2行第0列设置一个值。 |
| [set_Matrix21](./set_matrix21/)(float) | 在第2行第1列设置一个值。 |
| [set_Matrix22](./set_matrix22/)(float) | 在第2行第2列设置一个值。 |
| [set_Matrix23](./set_matrix23/)(float) | 在第2行第3列设置一个值。 |
| [set_Matrix24](./set_matrix24/)(float) | 在第2行第4列设置一个值。 |
| [set_Matrix30](./set_matrix30/)(float) | 在第3行第0列设置一个值。 |
| [set_Matrix31](./set_matrix31/)(float) | 在第3行第1列设置一个值。 |
| [set_Matrix32](./set_matrix32/)(float) | 在第3行第2列设置一个值。 |
| [set_Matrix33](./set_matrix33/)(float) | 在第3行第3列设置一个值。 |
| [set_Matrix34](./set_matrix34/)(float) | 在第3行第4列设置一个值。 |
| [set_Matrix40](./set_matrix40/)(float) | 在第4行第0列设置一个值。 |
| [set_Matrix41](./set_matrix41/)(float) | 在第4行第1列设置一个值。 |
| [set_Matrix42](./set_matrix42/)(float) | 在第4行第2列设置一个值。 |
| [set_Matrix43](./set_matrix43/)(float) | 在第4行第3列设置一个值。 |
| [set_Matrix44](./set_matrix44/)(float) | 在第4行第4列设置一个值。 |
## 另见

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Font for C++](../../)
