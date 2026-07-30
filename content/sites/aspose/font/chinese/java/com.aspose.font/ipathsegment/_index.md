---
title: "IPathSegment"
second_title: "Aspose.Font 适用于 Java API 参考"
description: "表示任意路径段的接口。"
type: docs
weight: 131
url: /zh/java/com.aspose.font/ipathsegment/
---
**All Implemented Interfaces:**
java.lang.Cloneable
```
public interface IPathSegment extends Cloneable
```

表示任意路径段的接口。
## 方法

| 方法 | 描述 |
| --- | --- |
| [copy()](#copy--) | 创建段对象的副本。 |
| [shift(double dx, double dy)](#shift-double-double-) | 通过 x 和 y 坐标执行平移。 |
| [transform(TransformationMatrix matrix)](#transform-com.aspose.font.TransformationMatrix-) | 使用变换矩阵转换坐标。 |
### copy() {#copy--}
```
public abstract IPathSegment copy()
```


创建段对象的副本。

**Returns:**
[IPathSegment](../../com.aspose.font/ipathsegment) - Copy of the segment object.
### shift(double dx, double dy) {#shift-double-double-}
```
public abstract void shift(double dx, double dy)
```


通过 x 和 y 坐标执行平移。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| dx | double | dx 的值。 |
| dy | double | dy 的值。 |

### transform(TransformationMatrix matrix) {#transform-com.aspose.font.TransformationMatrix-}
```
public abstract void transform(TransformationMatrix matrix)
```


使用变换矩阵转换坐标。

**Parameters:**
| 参数 | 类型 | 描述 |
| --- | --- | --- |
| matrix | [TransformationMatrix](../../com.aspose.font/transformationmatrix) | 变换矩阵。 |

