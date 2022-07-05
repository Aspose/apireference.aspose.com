---
title: Create
second_title: Aspose.GIS for .NET API 参考
description: 创建图层并打开它以添加新功能
type: docs
weight: 10
url: /zh/net/aspose.gis/vectorlayer/create/
---
## Create(string, FileDriver) {#create_4}

创建图层并打开它以添加新功能。

```csharp
public static VectorLayer Create(string path, FileDriver driver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |

### 返回值

只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| ArgumentException | 该驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions) {#create_5}

创建图层并打开它以添加新功能。

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |
| options | DriverOptions | 驱动程序特定选项。 |

### 返回值

只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| ArgumentException | 该驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver) {#create}

创建图层并打开它以添加新功能。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |

### 返回值

只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| ArgumentException | 该驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions) {#create_1}

创建图层并打开它以添加新功能。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |
| options | DriverOptions | 驱动程序特定选项。 |

### 返回值

只写层。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| ArgumentException | 该驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 将特征写入文件时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, SpatialReferenceSystem) {#create_7}

创建图层并将其打开以进行附加。

```csharp
public static VectorLayer Create(string path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

[`VectorLayer`](../../vectorlayer)的一个实例。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| [GisException](../../gisexception) | 在文件中读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用SpatialReferenceSystem)检查是否支持空间参考系统。 |

### 也可以看看

* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, SpatialReferenceSystem) {#create_3}

创建图层并将其打开以进行附加。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

[`VectorLayer`](../../vectorlayer)的一个实例。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| [GisException](../../gisexception) | 在文件中读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用SpatialReferenceSystem)检查是否支持空间参考系统。 |

### 也可以看看

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(string, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_6}

创建图层并将其打开以进行附加。

```csharp
public static VectorLayer Create(string path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |
| options | DriverOptions | 驱动程序特定选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

[`VectorLayer`](../../vectorlayer)的一个实例。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| ArgumentException | 该驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 在文件中读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用SpatialReferenceSystem)检查是否支持空间参考系统。 |

### 也可以看看

* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

---

## Create(AbstractPath, FileDriver, DriverOptions, SpatialReferenceSystem) {#create_2}

创建图层并将其打开以进行附加。

```csharp
public static VectorLayer Create(AbstractPath path, FileDriver driver, DriverOptions options, 
    SpatialReferenceSystem spatialReferenceSystem)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件路径。 |
| driver | FileDriver | 要使用的驱动程序。 |
| options | DriverOptions | 驱动程序特定选项。 |
| spatialReferenceSystem | SpatialReferenceSystem | 空间参考系统。 |

### 返回值

[`VectorLayer`](../../vectorlayer)的一个实例。

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentNullException | 路径是`null`。 |
| ArgumentException | 该驱动程序的选项对象类型不正确。 |
| [GisException](../../gisexception) | 在文件中读取或写入特征时出错。 |
| IOException | 发生 I/O 错误。 |
| NotSupportedException | 驱动程序不支持空间参考系统。 使用SpatialReferenceSystem)检查是否支持空间参考系统。 |

### 也可以看看

* class [AbstractPath](../../abstractpath)
* class [FileDriver](../../filedriver)
* class [DriverOptions](../../driveroptions)
* class [SpatialReferenceSystem](../../../aspose.gis.spatialreferencing/spatialreferencesystem)
* class [VectorLayer](../../vectorlayer)
* 命名空间 [Aspose.Gis](../../vectorlayer)
* 部件 [Aspose.GIS](../../../)

<!-- DO NOT EDIT: generated by xmldocmd for Aspose.GIS.dll -->
