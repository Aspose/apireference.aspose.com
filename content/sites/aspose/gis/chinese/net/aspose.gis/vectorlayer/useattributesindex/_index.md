---
title: VectorLayer.UseAttributesIndex
second_title: Aspose.GIS for .NET API 参考
description: VectorLayer 方法. 加载属性索引以加速过滤方法中的属性值过滤例如WhereGreater. 如果索引不存在则首先创建它使用forceRebuild强制索引重新创建.
type: docs
weight: 180
url: /zh/net/aspose.gis/vectorlayer/useattributesindex/
---
## UseAttributesIndex(string, string, bool) {#useattributesindex_1}

加载属性索引以加速过滤方法中的属性值过滤，例如[`WhereGreater`](../../featuressequence/wheregreater/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建.

```csharp
public void UseAttributesIndex(string indexPath, string attributeName, bool forceRebuild = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| indexPath | String | 索引文件的路径。 |
| attributeName | String | 要建立索引的属性的名称。 |
| forceRebuild | Boolean | 是否重新创建索引，即使它已经存在。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 层中不存在具有此类名称的属性。 |
| IOException | 发生 I/O 错误。 |
| InvalidOperationException | 已为此层加载的指定属性的索引。 |
| [GisException](../../gisexception/) | 文件存在，它不是由 Aspose.GIS 创建的属性索引文件。 |

### 也可以看看

* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## UseAttributesIndex(AbstractPath, string, bool) {#useattributesindex}

加载属性索引以加速过滤方法中的属性值过滤，例如[`WhereGreater`](../../featuressequence/wheregreater/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建.

```csharp
public virtual void UseAttributesIndex(AbstractPath indexPath, string attributeName, 
    bool forceRebuild = false)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| indexPath | AbstractPath | 索引文件的路径。 |
| attributeName | String | 要建立索引的属性的名称。 |
| forceRebuild | Boolean | 是否重新创建索引，即使它已经存在。 |

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 参数是`null`. |
| ArgumentException | 层中不存在具有此类名称的属性。 |
| IOException | 发生 I/O 错误。 |
| InvalidOperationException | 已为此层加载的指定属性的索引。 |
| [GisException](../../gisexception/) | 文件存在，它不是由 Aspose.GIS 创建的属性索引文件。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)


