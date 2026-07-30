---
title: "Aspose::Font::TransformationMatrix class"
linktitle: "TransformationMatrix"
second_title: "Aspose.Font 适用于 C++"
description: "Aspose::Font::TransformationMatrix 类。表示 3x3 变换矩阵 | A B 0 | | C D 0 | | TX TY 1 |（C++ 中）。"
type: docs
weight: 3000
url: /zh/cpp/aspose.font/transformationmatrix/
---
## TransformationMatrix class


表示 3x3 变换矩阵 | A B 0 | | C D 0 | | TX TY 1 |。

```cpp
class TransformationMatrix : public System::ICloneable
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [get_A](./get_a/)() const | 获取 A 变换矩阵的值。 |
| [get_B](./get_b/)() const | 获取 B 变换矩阵的值。 |
| [get_C](./get_c/)() const | 获取 C 变换矩阵的值。 |
| [get_D](./get_d/)() const | 获取 D 变换矩阵的值。 |
| [get_TX](./get_tx/)() const | 获取 TX 变换矩阵的值。 |
| [get_TY](./get_ty/)() const | 获取 TY 变换矩阵的值。 |
| [idx_get](./idx_get/)(int32_t) | 提供对底层数组的访问。 |
| [Multiply](./multiply/)(const System::SharedPtr\<TransformationMatrix\>\&) | 与另一个变换矩阵相乘。不会更改原始变换矩阵，返回一个新的 [TransformationMatrix](./) 对象。 |
| [Scale](./scale/)(double, double, double\&, double\&) | 使用变换矩阵对 x 和 y 进行缩放：x1 = A*x + C*y; y1 = B*x + D*y。 |
| [set_A](./set_a/)(double) | 设置 A 变换矩阵的值。 |
| [set_B](./set_b/)(double) | 设置 B 变换矩阵的值。 |
| [set_C](./set_c/)(double) | 设置 C 变换矩阵的值。 |
| [set_D](./set_d/)(double) | 设置 D 变换矩阵的值。 |
| [set_TX](./set_tx/)(double) | 设置 TX 变换矩阵的值。 |
| [set_TY](./set_ty/)(double) | 设置 TY 变换矩阵的值。 |
| [ToArray](./toarray/)() | 分配新数组，复制变换矩阵并返回它。 |
| [Transform](./transform/)(double, double, double\&, double\&) | 使用变换矩阵对 x 和 y 进行变换：x1 = A*x + C*y + TX; y1 = B*x + D*y + TY。 |
| [TransformationMatrix](./transformationmatrix/)() | 创建标准的 1 对 1 变换矩阵：[ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]。 |
| [TransformationMatrix](./transformationmatrix/)(const System::ArrayPtr\<double\>\&) | 接受具有以下数组表示形式的变换矩阵: [ A B C D TX TY ]。 |
| [TransformationMatrix](./transformationmatrix/)(double, double, double, double, double, double) | 创建变换矩阵 [ A B C D TX TY ]。 |
| [UnScale](./unscale/)(double, double, double\&, double\&) | 将 x1 和 y1 缩放回原始值，并返回变换矩阵之前的 x 和 y。 |
| [UnTransform](./untransform/)(double, double, double\&, double\&) | 将 x1 和 y1 逆变换，并返回变换矩阵之前的 x 和 y。 |
## 备注


按以下方式转换坐标: x1 = A*x + C*y + TX; y1 = B*x + D*y + TY。
## 另见

* Class [ICloneable](../../system/icloneable/)
* Namespace [Aspose::Font](../)
* Library [Aspose.Font for C++](../../)
