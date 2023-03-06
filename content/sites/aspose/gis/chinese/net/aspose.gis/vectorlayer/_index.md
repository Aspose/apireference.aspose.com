---
title: Class VectorLayer
second_title: Aspose.GIS for .NET API 参考
description: Aspose.Gis.VectorLayer 班级. 表示矢量图层 矢量图层是地理特征的集合存储在文件中
type: docs
weight: 2320
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
| override [Attributes](../../aspose.gis/vectorlayer/attributes/) { get; } | 获取此功能的自定义属性集合`VectorLayer`. |
| virtual [Count](../../aspose.gis/vectorlayer/count/) { get; } | 获取这一层的特征数。 |
| abstract [Driver](../../aspose.gis/vectorlayer/driver/) { get; } | 获取[`Driver`](./driver/)实例化了这一层. |
| abstract [GeometryType](../../aspose.gis/vectorlayer/geometrytype/) { get; } | 获取图层的几何类型。 |
| virtual [Item](../../aspose.gis/vectorlayer/item/) { get; } | 获取[`Feature`](../feature/)在指定的索引处. |
| abstract [SpatialReferenceSystem](../../aspose.gis/featuressequence/spatialreferencesystem/) { get; } | 获取此要素序列的空间参考系统。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| static [Create](../../aspose.gis/vectorlayer/create/#create)(AbstractPath, FileDriver) | 创建层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_4)(string, FileDriver) | 创建层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_1)(AbstractPath, FileDriver, DriverOptions) | 创建层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_3)(AbstractPath, FileDriver, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_5)(string, FileDriver, DriverOptions) | 创建层并打开它以添加新功能。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_7)(string, FileDriver, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_2)(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| static [Create](../../aspose.gis/vectorlayer/create/#create_6)(string, FileDriver, DriverOptions, SpatialReferenceSystem) | 创建图层并打开它以进行附加。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open)(AbstractPath, FileDriver) | 打开图层读取。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open_2)(string, FileDriver) | 打开图层读取。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open_1)(AbstractPath, FileDriver, DriverOptions) | 打开图层读取。 |
| static [Open](../../aspose.gis/vectorlayer/open/#open_3)(string, FileDriver, DriverOptions) | 打开图层读取。 |
| [Add](../../aspose.gis/vectorlayer/add/#add)(Feature) | 向图层添加新功能（如果支持）`VectorLayer`秒[`Driver`](./driver/). |
| virtual [Add](../../aspose.gis/vectorlayer/add/#add_1)(Feature, IFeatureStyle) | 向图层添加具有指定样式的新功能（如果支持）`VectorLayer`秒[`Driver`](./driver/). |
| [AsInMemory](../../aspose.gis/vectorlayer/asinmemory/)() | 创建层克隆作为 InMemory 格式。 |
| [ConstructFeature](../../aspose.gis/vectorlayer/constructfeature/)() | 创建（但不添加到层）一个新特征，其属性与该层的属性集合匹配。 完成特征的设置数据后，使用[`Add`](./add/)将特征添加到层。 |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes)(FeaturesSequence) | 复制其他属性`VectorLayer`到这个. |
| [CopyAttributes](../../aspose.gis/vectorlayer/copyattributes/#copyattributes_1)(FeaturesSequence, IAttributesConverter) | 复制其他属性`VectorLayer`到这个. |
| [Dispose](../../aspose.gis/vectorlayer/dispose/)() | 释放所使用的资源`VectorLayer`. |
| override [Equals](../../aspose.gis/vectorlayer/equals/)(object) | 判断指定对象是否等于当前对象。 |
| abstract [GetEnumerator](../../aspose.gis/featuressequence/getenumerator/)() | 返回一个遍历集合的枚举器。 |
| virtual [GetExtent](../../aspose.gis/featuressequence/getextent/)() | 获取该图层的空间范围。 |
| [Join](../../aspose.gis/vectorlayer/join/)(VectorLayer, JoinOptions) | 将图层加入当前图层。 |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto)(IPoint) | 获取离提供的点最近的要素。 |
| [NearestTo](../../aspose.gis/vectorlayer/nearestto/#nearestto_1)(double, double) | 获取距离提供的坐标最近的要素。 |
| virtual [RemoveAt](../../aspose.gis/vectorlayer/removeat/)(int) | 删除[`Feature`](../feature/)在指定的索引处. |
| virtual [ReplaceAt](../../aspose.gis/vectorlayer/replaceat/)(int, Feature) | 替换[`Feature`](../feature/)在指定的索引处. |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver) | 将特征序列保存到图层。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver) | 将特征序列保存到图层。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(AbstractPath, FileDriver, SavingOptions) | 将特征序列保存到图层。 |
| [SaveTo](../../aspose.gis/featuressequence/saveto/)(string, FileDriver, SavingOptions) | 将特征序列保存到图层。 |
| [SplitTo](../../aspose.gis/featuressequence/splitto/)() | 按几何类型拆分要素。 |
| virtual [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex)(AbstractPath, string, bool) | 加载属性索引以加速过滤方法中的属性值过滤，例如[`WhereGreater`](../featuressequence/wheregreater/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建. |
| [UseAttributesIndex](../../aspose.gis/vectorlayer/useattributesindex/#useattributesindex_1)(string, string, bool) | 加载属性索引以加速过滤方法中的属性值过滤，例如[`WhereGreater`](../featuressequence/wheregreater/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建. |
| virtual [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex)(AbstractPath, bool) | 加载空间索引以加速过滤方法中按属性值的过滤，例如[`WhereIntersects`](../featuressequence/whereintersects/) 和[`NearestTo`](./nearestto/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建. |
| [UseSpatialIndex](../../aspose.gis/vectorlayer/usespatialindex/#usespatialindex_1)(string, bool) | 加载空间索引以加速过滤方法中按属性值的过滤，例如[`WhereIntersects`](../featuressequence/whereintersects/) 和[`NearestTo`](./nearestto/). 如果索引不存在则首先创建它。使用*forceRebuild*强制索引重新创建. |
| virtual [WhereEqual&lt;T&gt;](../../aspose.gis/featuressequence/whereequal/)(string, T) | 选择属性值等于提供值的要素。 |
| virtual [WhereGreater&lt;T&gt;](../../aspose.gis/featuressequence/wheregreater/)(string, T) | 选择属性值大于提供值的要素。 |
| virtual [WhereGreaterOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheregreaterorequal/)(string, T) | 选择属性值大于或等于提供值的要素。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(Extent) | 根据范围过滤要素。 |
| [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(FeaturesSequence) | 根据其他特征序列中所有几何的并集过滤特征。 |
| virtual [WhereIntersects](../../aspose.gis/featuressequence/whereintersects/)(IGeometry) | 根据提供的几何过滤特征。 |
| virtual [WhereNotEqual&lt;T&gt;](../../aspose.gis/featuressequence/wherenotequal/)(string, T) | 选择属性值不等于提供值的要素。 |
| virtual [WhereNotNull](../../aspose.gis/featuressequence/wherenotnull/)(string) | 选择属性不等于 null 的要素。 |
| virtual [WhereNull](../../aspose.gis/featuressequence/wherenull/)(string) | 选择属性等于 null 的要素。 |
| virtual [WhereSet](../../aspose.gis/featuressequence/whereset/)(string) | 选择具有属性集的要素。 |
| virtual [WhereSmaller&lt;T&gt;](../../aspose.gis/featuressequence/wheresmaller/)(string, T) | 选择属性值小于提供值的要素。 |
| virtual [WhereSmallerOrEqual&lt;T&gt;](../../aspose.gis/featuressequence/wheresmallerorequal/)(string, T) | 选择属性值小于或等于提供值的要素。 |
| virtual [WhereUnset](../../aspose.gis/featuressequence/whereunset/)(string) | 选择未设置指定属性的功能。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert)(AbstractPath, FileDriver, AbstractPath, FileDriver) | 将图层转换为不同的格式。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_2)(string, FileDriver, string, FileDriver) | 将图层转换为不同的格式。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_1)(AbstractPath, FileDriver, AbstractPath, FileDriver, ConversionOptions) | 将图层转换为不同的格式。 |
| static [Convert](../../aspose.gis/vectorlayer/convert/#convert_3)(string, FileDriver, string, FileDriver, ConversionOptions) | 将图层转换为不同的格式。 |

### 也可以看看

* class [FeaturesSequence](../featuressequence/)
* 命名空间 [Aspose.Gis](../../aspose.gis/)
* 部件 [Aspose.GIS](../../)


