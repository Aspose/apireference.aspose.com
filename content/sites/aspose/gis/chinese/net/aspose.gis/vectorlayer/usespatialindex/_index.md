---
title: VectorLayer.UseSpatialIndex
second_title: Aspose.GIS for .NET API 参考
description: VectorLayer 方法. 加载空间索引以加速过滤方法中按属性值的过滤例如WhereIntersects 和NearestTo. 如果索引不存在则首先创建它使用forceRebuild强制索引重新创建.
type: docs
weight: 190
url: /zh/net/aspose.gis/vectorlayer/usespatialindex/
---
## UseSpatialIndex(string, bool) {#usespatialindex_1}

加载空间索引以加速过滤方法中按属性值的过滤，例如[`WhereIntersects`](../../featuressequence/whereintersects/) 和[`NearestTo`](../nearestto/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建.

```csharp
public void UseSpatialIndex(string indexPath, bool forceRebuild = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| indexPath | String | 索引文件的路径。 |
| forceRebuild | Boolean | 是否重新创建索引，即使它已经存在。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| IOException | 发生 I/O 错误。 |
| InvalidOperationException | 已为该图层加载空间索引。 |
| [GisException](../../gisexception/) | 文件存在并且不是由 Aspose.GIS 创建的空间索引文件。 |

### 也可以看看

* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## UseSpatialIndex(AbstractPath, bool) {#usespatialindex}

加载空间索引以加速过滤方法中按属性值的过滤，例如[`WhereIntersects`](../../featuressequence/whereintersects/) 和[`NearestTo`](../nearestto/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建.

```csharp
public virtual void UseSpatialIndex(AbstractPath indexPath, bool forceRebuild = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| indexPath | AbstractPath | 索引文件的路径。 |
| forceRebuild | Boolean | 是否重新创建索引，即使它已经存在。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| IOException | 发生 I/O 错误。 |
| InvalidOperationException | 已为该图层加载空间索引。 |
| [GisException](../../gisexception/) | 文件存在并且不是由 Aspose.GIS 创建的空间索引文件。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)


