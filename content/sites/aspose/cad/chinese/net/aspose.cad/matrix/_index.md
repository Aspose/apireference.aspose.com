---
title: Matrix
second_title: Aspose.CAD for .NET API 参考
description: 替换 GDI  矩阵
type: docs
weight: 30090
url: /zh/net/aspose.cad/matrix/
---
## Matrix class

替换 GDI + 矩阵。

```csharp
public class Matrix
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [Matrix](matrix#constructor)() | 将 Matrix 类的新实例初始化为单位矩阵。 |
| [Matrix](matrix#constructor_1)(Rectangle, Point[]) | 初始化[`Matrix`](../matrix)类的新实例到由指定矩形和点数组定义的几何变换. |
| [Matrix](matrix#constructor_2)(RectangleF, PointF[]) | 初始化[`Matrix`](../matrix)类的新实例到由指定矩形和点数组定义的几何变换. |
| [Matrix](matrix#constructor_3)(float, float, float, float, float, float) | 初始化[`Matrix`](../matrix)类的新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Elements](../../aspose.cad/matrix/elements) { get; } | 获取一个浮点值数组，表示这个[`Matrix`](../matrix)的元素。 |
| [M11](../../aspose.cad/matrix/m11) { get; } | 获取第一行第一列的矩阵元素。表示沿 X 轴的比例。 |
| [M12](../../aspose.cad/matrix/m12) { get; } | 获取第一行第二列的矩阵元素。表示沿 Y 轴的剪切。 |
| [M21](../../aspose.cad/matrix/m21) { get; } | 获取第二行第一列的矩阵元素。表示沿 X 轴的剪切。 |
| [M22](../../aspose.cad/matrix/m22) { get; } | 获取第二行第二列的矩阵元素。表示沿 Y 轴的比例。 |
| [M31](../../aspose.cad/matrix/m31) { get; } | 获取第三行第一列的矩阵元素。表示沿 X 轴的平移。 |
| [M32](../../aspose.cad/matrix/m32) { get; } | 获取第三行第一列的矩阵元素。表示沿 Y 轴的平移。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| override [Equals](../../aspose.cad/matrix/equals)(object) | 判断指定的Object是否等于这个实例。 |
| [GetElements](../../aspose.cad/matrix/getelements)() | 获取矩阵元素的副本。 |
| override [GetHashCode](../../aspose.cad/matrix/gethashcode)() | 返回此实例的哈希码。 |
| [Multiply](../../aspose.cad/matrix/multiply#multiply)(Matrix) | 将此矩阵乘以在矩阵参数中指定的矩阵，使用（默认）前置顺序。 |
| [Multiply](../../aspose.cad/matrix/multiply#multiply_1)(Matrix, MatrixOrder) | 将此 Matrix 乘以 matrix 参数中指定的矩阵，并按照 order 参数中指定的顺序。 |
| [Reset](../../aspose.cad/matrix/reset)() | 将此矩阵重置为具有单位矩阵的元素。 |
| [Rotate](../../aspose.cad/matrix/rotate#rotate)(float) | 以默认（前置）顺序围绕该矩阵的原点（零 x 和 y 坐标）应用角度参数中指定的量的顺时针旋转。 |
| [Rotate](../../aspose.cad/matrix/rotate#rotate_1)(float, MatrixOrder) | 以指定顺序围绕该矩阵的原点（零 x 和 y 坐标）应用角度参数中指定的量的顺时针旋转。 |
| [RotateAt](../../aspose.cad/matrix/rotateat#rotateat)(float, PointF) | 以默认（前置）顺序围绕指定点顺时针旋转此矩阵。 |
| [RotateAt](../../aspose.cad/matrix/rotateat#rotateat_1)(float, PointF, MatrixOrder) | 以指定顺序围绕指定点顺时针旋转此矩阵。 |
| [Scale](../../aspose.cad/matrix/scale#scale)(float, float) | 使用（默认）前置顺序将指定的缩放向量（scaleX 和 scaleY）应用于此矩阵。 |
| [Scale](../../aspose.cad/matrix/scale#scale_1)(float, float, MatrixOrder) | 将指定的比例矢量（scaleX 和 scaleY）应用到这个[`Matrix`](../matrix)使用指定的顺序。 |
| override [ToString](../../aspose.cad/matrix/tostring)() | 返回一个String表示此实例。 |
| [TransformPoints](../../aspose.cad/matrix/transformpoints)(PointF[]) | 将此[`Matrix`](../matrix)表示的几何变换应用于指定的点数组。 |
| [Translate](../../aspose.cad/matrix/translate#translate)(float, float) | 将指定的平移向量应用于此[`Matrix`](../matrix)使用（默认）前置顺序。 |
| [Translate](../../aspose.cad/matrix/translate#translate_1)(float, float, MatrixOrder) | 以指定的顺序将指定的平移向量应用到此矩阵。 |
| static [Equals](../../aspose.cad/matrix/equals)(Matrix, Matrix) | 判断两个矩阵是否相等。 |
| [operator ==](../../aspose.cad/matrix/op_equality) | 实现运算符 ==。 |
| [operator !=](../../aspose.cad/matrix/op_inequality) | 实现运算符！=。 |

## 字段

| 姓名 | 描述 |
| --- | --- |
| const [TypeFlip](../../aspose.cad/matrix/typeflip) | 该标志位表示此对象定义的变换 围绕某个轴执行镜像翻转，从而改变 通常是右手坐标系到左手坐标系 除了其他标志位指示的转换之外的系统。 右手坐标系是正 X 轴逆时针旋转以覆盖正 Y 轴 类似于您手指的方向右手 当你盯着你的拇指时卷曲。 左手坐标系是正 X 轴顺时针旋转以覆盖正 Y 轴，类似于 到您手指的方向左手卷曲。 没有数学方法来确定 原始翻转或镜像变换的角度，因为在适当调整旋转的情况下，翻转的所有角度 都是相同的。 注意:在 GENERAL_TRANSFORM 公开后添加了 TypeFlip 循环和标志位不再方便 重新编号而不在外部引入二进制不兼容 代码。 |
| const [TypeGeneralRotation](../../aspose.cad/matrix/typegeneralrotation) | 该标志位表示该对象定义的变换 除了 还执行任意角度的旋转:其他标志位指示的转换。 旋转以相同的量改变向量的角度 无论向量的原始方向如何，并且没有 改变向量的长度。 该标志位与 |
| const [TypeGeneralScale](../../aspose.cad/matrix/typegeneralscale) | 通用比例将向量的长度乘以不同的 x 和 y 方向的数量而不改变角度 垂直向量之间。 该标志位与 TypeUniformScale 标志位互斥。 |
| const [TypeGeneralTransform](../../aspose.cad/matrix/typegeneraltransform) | 该常量表示该对象定义的变换 执行输入坐标的任意转换。 如果此转换可以按上述任何常量分类， 类型将是常量 TypeIdentity 或 适当标志位的组合对于此转换执行的各种坐标 转换。 |
| const [TypeIdentity](../../aspose.cad/matrix/typeidentity) | 恒等变换是一种输出坐标为 始终与输入坐标相同的变换。 如果此变换不是恒等变换， 类型将是常量 GENERAL_TRANSFORM 或 适当标志位的组合各种坐标 此转换执行的转换。 |
| const [TypeMaskRotation](../../aspose.cad/matrix/typemaskrotation) | 此常量是任何旋转标志位的位掩码。 |
| const [TypeMaskScale](../../aspose.cad/matrix/typemaskscale) | 此常量是任何比例标志位的位掩码。 |
| const [TypeQuadrantRotation](../../aspose.cad/matrix/typequadrantrotation) | 该标志位表示此对象定义的变换 在 中执行象限旋转 90 度的倍数:除了其他标志位指示的转换。 旋转以相同的量改变向量的角度 无论向量的原始方向如何，并且没有 改变向量的长度。 此标志位与 TypeGeneralRotation 标志互斥。 |
| const [TypeTranslation](../../aspose.cad/matrix/typetranslation) | 平移将坐标在 x 和 y 中移动一个常数，而不改变向量的长度或角度。 |
| const [TypeUniformScale](../../aspose.cad/matrix/typeuniformscale) | 统一比例将向量的长度乘以相同的数量 在 x 和 y 方向上，而不改变 之间的角度向量。 此标志位与 TypeGeneralScale 标志互斥。 |

### 评论

大多数算法取自 Sun 的 AffineTransform.java。 Java 内部使用的矩阵元素的名称。 java 名称到.net 的映射到描述: m00 M11 Scale X m10 M12 Shear Y m01 M21 Shear X m11 M22 比例 Y m02 M31 平移 X m12 M32 平移 Y

### 也可以看看

* 命名空间 [Aspose.CAD](../../aspose.cad)
* 部件 [Aspose.CAD](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.CAD.dll -->
