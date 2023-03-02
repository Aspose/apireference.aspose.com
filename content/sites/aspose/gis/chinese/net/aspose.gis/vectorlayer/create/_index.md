---
title: VectorLayer.Create
second_title: Aspose.GIS for .NET API 参考
description: VectorLayer 方法. 创建层并打开它以添加新功能
type: docs
weight: 10
url: /zh/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

创建层并打开它以添加新功能。

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |

### 返回值

一个只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

创建层并打开它以添加新功能。

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

一个只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

创建层并打开它以添加新功能。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |

### 返回值

一个只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

创建层并打开它以添加新功能。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

一个只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

创建图层并打开它以进行附加。

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)检查是否支持空间参考系统。 |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

创建图层并打开它以进行附加。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)检查是否支持空间参考系统。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

创建图层并打开它以进行附加。

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |
| options | DriverOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)检查是否支持空间参考系统。 |

### 也可以看看

* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

创建图层并打开它以进行附加。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| driver | FileDriver | 驱动程序使用。 |
| options | DriverOptions | 特定于驱动程序的选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

的实例[`VectorLayer`](../).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`. |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception/) | 从文件读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用[`SupportsSpatialReferenceSystem`](../../filedriver/supportsspatialreferencesystem/)检查是否支持空间参考系统。 |

### 也可以看看

* class [AbstractPath](../../abstractpath/)
* class [FileDriver](../../filedriver/)
* class [DriverOptions](../../driveroptions/)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem/)
* class [VectorLayer](../)
* 命名空间 [Aspose.Gis](../../vectorlayer/)
* 部件 [Aspose.GIS](../../../)


