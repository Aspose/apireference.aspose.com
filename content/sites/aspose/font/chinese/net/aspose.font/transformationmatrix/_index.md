---
title: "类 TransformationMatrix"
second_title: "Aspose.Font for .NET API 参考"
description: "Aspose.Font.TransformationMatrix 类。表示 3x3 变换矩阵  A B 0   C D 0   TX TY 1 。以下方式转换坐标 x1  Ax  Cy  TX y1  Bx  Dy  TY"
type: docs
weight: 810
url: /zh/net/aspose.font/transformationmatrix/
---
## TransformationMatrix class

表示 3x3 变换矩阵 &#x7C; A B 0 &#x7C; &#x7C; C D 0 &#x7C; &#x7C; TX TY 1 &#x7C;。以以下方式转换坐标：x1 = A*x + C*y + TX; y1 = B*x + D*y + TY。

```csharp
public class TransformationMatrix : ICloneable
```

## 构造函数

| 名称 | 描述 |
| --- | --- |
| [TransformationMatrix](transformationmatrix/#constructor)() | 创建标准的 1 对 1 变换矩阵：[ A B C D TX TY ] = [ 1, 0, 0, 1, 0, 0]。 |
| [TransformationMatrix](transformationmatrix/#constructor_2)(double[]) | 接受具有以下数组表示的变换矩阵：[ A B C D TX TY ]。 |
| [TransformationMatrix](transformationmatrix/#constructor_1)(double, double, double, double, double, double) | 创建变换矩阵 [ A B C D TX TY ] |

## 属性

| 名称 | 描述 |
| --- | --- |
| [A](../../aspose.font/transformationmatrix/a/) { get; set; } | 获取或设置 A 变换矩阵值。 |
| [B](../../aspose.font/transformationmatrix/b/) { get; set; } | 获取或设置 B 变换矩阵值。 |
| [C](../../aspose.font/transformationmatrix/c/) { get; set; } | 获取或设置 C 变换矩阵值。 |
| [D](../../aspose.font/transformationmatrix/d/) { get; set; } | 获取或设置 D 变换矩阵的值。 |
| [Item](../../aspose.font/transformationmatrix/item/) { get; } | 提供对底层数组的访问。 |
| [TX](../../aspose.font/transformationmatrix/tx/) { get; set; } | 获取或设置 TX 变换矩阵的值。 |
| [TY](../../aspose.font/transformationmatrix/ty/) { get; set; } | 获取或设置 TY 变换矩阵的值。 |

## 方法

| 名称 | 描述 |
| --- | --- |
| [Multiply](../../aspose.font/transformationmatrix/multiply/)(TransformationMatrix) | 与另一个变换矩阵相乘。不会更改原始变换矩阵，返回一个新的 TransformationMatrix 对象。 |
| [Scale](../../aspose.font/transformationmatrix/scale/)(double, double, out double, out double) | 使用变换矩阵对 x 和 y 进行缩放：x1 = A*x + C*y; y1 = B*x + D*y。 |
| [ToArray](../../aspose.font/transformationmatrix/toarray/)() | 分配新数组，复制变换矩阵并返回它。 |
| [Transform](../../aspose.font/transformationmatrix/transform/)(double, double, out double, out double) | 使用变换矩阵转换 x 和 y：x1 = A*x + C*y + TX; y1 = B*x + D*y + TY。 |
| [UnScale](../../aspose.font/transformationmatrix/unscale/)(double, double, out double, out double) | 将 x1 和 y1 逆向缩放，返回变换矩阵之前的 x 和 y。 |
| [UnTransform](../../aspose.font/transformationmatrix/untransform/)(double, double, out double, out double) | 将 x1 和 y1 逆向转换，返回变换矩阵之前的 x 和 y。 |

### 另见

* namespace [Aspose.Font](../../aspose.font/)
* assembly [Aspose.Font](../../)


