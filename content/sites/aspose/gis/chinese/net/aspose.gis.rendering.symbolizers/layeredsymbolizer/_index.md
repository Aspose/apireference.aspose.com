---
title: Class LayeredSymbolizer
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.Rendering.Symbolizers.LayeredSymbolizer 班级. 呈现多个其他符号器的符号器
type: docs
weight: 1830
url: /zh/net/aspose.gis.rendering.symbolizers/layeredsymbolizer/
---
## LayeredSymbolizer class

呈现多个其他符号器的符号器。

```csharp
public class LayeredSymbolizer : VectorSymbolizer, IReadOnlyList<VectorSymbolizer>
```

## 构造函数

| 姓名 | 描述 |
| --- | --- |
| [LayeredSymbolizer](layeredsymbolizer/#constructor)() | 创建新实例。 |
| [LayeredSymbolizer](layeredsymbolizer/#constructor_1)(RenderingOrder) | 创建新实例。 |

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Count](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/count/) { get; } | 获取符号数。 |
| [Item](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/item/) { get; } | 获取指定索引处的符号器。 |
| [RenderingOrder](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/renderingorder/) { get; set; } | 确定渲染顺序。 ByFeatures - 渲染该特征的所有符号，然后继续下一个特征。ByLayers - 使用符号器渲染所有特征，然后继续下一个符号器。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/add/)(VectorSymbolizer) | 添加指定的符号。 |
| [GetEnumerator](../../aspose.gis.rendering.symbolizers/layeredsymbolizer/getenumerator/)() | 返回循环访问集合的枚举器。 |

### 也可以看看

* class [VectorSymbolizer](../vectorsymbolizer/)
* 命名空间 [Aspose.Gis.Rendering.Symbolizers](../../aspose.gis.rendering.symbolizers/)
* 部件 [Aspose.GIS](../../)


