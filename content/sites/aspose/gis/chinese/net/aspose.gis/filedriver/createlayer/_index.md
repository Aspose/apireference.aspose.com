---
title: CreateLayer
second_title: Aspose.GIS for .NET API 参考
description: 创建图层并打开它以进行附加
type: docs
weight: 60
url: /zh/net/aspose.gis/filedriver/createlayer/
---
## CreateLayer(string) {#createlayer_4}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(string path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法创建矢量图层（请参阅[`CanCreateLayers`](../cancreatelayers)）。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath) {#createlayer}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(AbstractPath path)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法创建矢量图层（请参阅[`CanCreateLayers`](../cancreatelayers)）。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions) {#createlayer_5}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法创建矢量图层（请参阅[`CanCreateLayers`](../cancreatelayers)）。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions) {#createlayer_1}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(AbstractPath path, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序无法创建矢量图层（请参阅[`CanCreateLayers`](../cancreatelayers)）。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(string, SpatialReferenceSystem) {#createlayer_7}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(string path, SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem)检查是否支持空间参考系统。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, SpatialReferenceSystem) {#createlayer_3}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(AbstractPath path, SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem)检查是否支持空间参考系统。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(string, DriverOptions, SpatialReferenceSystem) {#createlayer_6}

创建图层并打开它以进行附加。

```csharp
public VectorLayer CreateLayer(string path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem)检查是否支持空间参考系统。 |
| NotSupportedException | 驱动程序无法创建矢量图层（请参阅[`CanCreateLayers`](../cancreatelayers)）。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

---

## CreateLayer(AbstractPath, DriverOptions, SpatialReferenceSystem) {#createlayer_2}

创建图层并打开它以进行附加。

```csharp
public abstract VectorLayer CreateLayer(AbstractPath path, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

一个实例[`VectorLayer`](../../vectorlayer).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将功能写入文件时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../supportsspatialreferencesystem)检查是否支持空间参考系统。 |
| NotSupportedException | 驱动程序无法创建矢量图层（请参阅[`CanCreateLayers`](../cancreatelayers)）。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer)
* class [AbstractPath](../../abstractpath)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [FileDriver](../../filedriver)
* 命名空间 [Aspose.Gis](../../filedriver)
* 部件 [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
