---
title: VectorLayer
second_title: Aspose.GIS for .NET API 参考
description: 表示矢量图层 矢量图层是地理特征的集合存储在文件中
type: docs
weight: 2210
url: /zh/net/aspose.gis/vectorlayer/
---
## VectorLayer class

表示矢量图层。 矢量图层是地理特征的集合，存储在文件中。

```csharp
public abstract class VectorLayer : FeaturesSequence, IDisposable
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| override [Attributes](../../aspose.gis/vectorlayer/attributes) { get; } | 获取此[`VectorLayer`](../vectorlayer)中特征的自定义属性集合。 |
| virtual [Count](../../aspose.gis/vectorlayer/count) { get; } | 获取该层的特征数。 |
| abstract [Driver](../../aspose.gis/vectorlayer/driver) { get; } | 获取实例化该层的[`Driver`](./driver)。 |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype) { get; } | 获取层的几何类型。 |
| virtual [Item](../../aspose.gis/vectorlayer/item) { get; } | 获取指定索引处的[`Feature`](../feature)。 |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem) { get; } | 获取此要素序列的空间参考系统。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create#create)(AbstractPath, FileDriver) | 创建图层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_4)(string, FileDriver) | 创建图层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_1)(AbstractPath, FileDriver, DriverOptions) | 创建图层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | 创建图层并将其打开以进行附加。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_5)(string, FileDriver, DriverOptions) | 创建图层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_7)(string, FileDriver, SpatialReferenceSystem) | 创建图层并将其打开以进行附加。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | 创建图层并将其打开以进行附加。 |
| static [Create](../../aspose.gis/vectorlayer/create#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | 创建图层并将其打开以进行附加。 |
| static [Open](../../aspose.gis/vectorlayer/open#open)(AbstractPath, FileDriver) | 打开图层进行读取。 |
| static [Open](../../aspose.gis/vectorlayer/open#open_2)(string, FileDriver) | 打开图层进行读取。 |
| static [Open](../../aspose.gis/vectorlayer/open#open_1)(AbstractPath, FileDriver, DriverOptions) | 打开图层进行读取。 |
| static [Open](../../aspose.gis/vectorlayer/open#open_3)(string, FileDriver, DriverOptions) | 打开图层进行读取。 |
| [Add](../../aspose.gis/vectorlayer/add#add)(Feature) | 如果[`VectorLayer`](../vectorlayer)的P支持，则向图层添加新功能:Aspose.Gis.VectorLayer.Driver。 |
| virtual [Add](../../aspose.gis/vectorlayer/add#add_1)(Feature, IFeatureStyle) | 如果[`VectorLayer`](../vectorlayer)的支持，则向图层添加具有指定样式的新功能[`Driver`](./driver)。 |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature)() | 创建（但不添加到图层）具有与该图层的属性集合匹配的属性的新要素。 为要素设置数据后，使用[`Add`](./add)将要素添加到图层。 |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes)(FeaturesSequence) | 复制其他[`VectorLayer`](../vectorlayer)的属性到这个。 |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes#copyattributes_1)(FeaturesSequence, IAttributesConverter) | 复制其他[`VectorLayer`](../vectorlayer)的属性到这个。 |
| [Dispose](../../aspose.gis/vectorlayer/dispose)() | 释放[`VectorLayer`](../vectorlayer)使用的资源。 |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator)() | 返回一个遍历集合的枚举器。 |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent)() | 获取该图层的空间范围。 |
| [Join](../../aspose.gis/vectorlayer/join)(VectorLayer, JoinOptions) | 将图层连接到当前图层。 |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto)(IPoint) | 获取离所提供点最近的特征。 |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto#nearestto_1)(double, double) | 获取离所提供坐标最近的要素。 |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat)(int) | 删除指定索引处的[`Feature`](../feature)。 |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat)(int, Feature) | 替换指定索引处的[`Feature`](../feature)。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver) | 将特征序列保存到图层。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver) | 将特征序列保存到图层。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(AbstractPath, FileDriver, SavingOptions) | 将特征序列保存到图层。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto)(string, FileDriver, SavingOptions) | 将特征序列保存到图层。 |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex)(AbstractPath, string, bool) | 加载属性索引以加速过滤方法中的属性值过滤，例如[`WhereGreater`](../featuressequence/wheregreater)。 如果索引不存在，首先创建它。使用*forceRebuild*强制重新创建索引。 |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex#useattributesindex_1)(string, string, bool) | 加载属性索引以加速过滤方法中的属性值过滤，例如[`WhereGreater`](../featuressequence/wheregreater)。 如果索引不存在，首先创建它。使用*forceRebuild*强制重新创建索引。 |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex)(AbstractPath, bool) | 加载空间索引以加速过滤方法中的属性值过滤，例如[`WhereIntersects`](../featuressequence/whereintersects) 和[`NearestTo`](./nearestto)。 如果索引不存在，首先创建它。使用*forceRebuild*强制重新创建索引。 |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex#usespatialindex_1)(string, bool) | 加载空间索引以加速过滤方法中的属性值过滤，例如[`WhereIntersects`](../featuressequence/whereintersects) 和[`NearestTo`](./nearestto)。 如果索引不存在，首先创建它。使用*forceRebuild*强制重新创建索引。 |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal)(string, T) | 选择属性值等于提供值的要素。 |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater)(string, T) | 选择属性值大于提供值的要素。 |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal)(string, T) | 选择属性值大于或等于提供值的要素。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(Extent) | 根据范围过滤要素。 |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(FeaturesSequence) | 根据其他特征序列中所有几何图形的联合过滤特征。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects)(IGeometry) | 根据提供的几何体过滤特征。 |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal)(string, T) | 选择属性值不等于提供值的要素。 |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull)(string) | 选择属性不等于 null 的要素。 |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull)(string) | 选择属性等于 null 的要素。 |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset)(string) | 选择具有属性集的特征。 |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller)(string, T) | 选择属性值小于提供值的特征。 |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal)(string, T) | 选择属性值小于或等于提供值的特征。 |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset)(string) | 选择未设置指定属性的要素。 |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | 将图层转换为不同的格式。 |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_2)(string, FileDriver, string, FileDriver) | 将图层转换为不同的格式。 |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | 将图层转换为不同的格式。 |
| static [Convert](../../aspose.gis/vectorlayer/convert#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | 将图层转换为不同的格式。 |

### 也可以看看

* class [FeaturesSequence](../featuressequence)
* 命名空间 [Aspose.Gis](../../aspose.gis)
* 部件 [Aspose.GIS](../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
