---
title: FileDriver.EditLayer
second_title: Aspose.GIS for .NET API 参考
description: FileDriver 方法. 打开图层进行编辑
type: docs
weight: 70
url: /zh/net/aspose.gis/filedriver/editlayer/
---
## EditLayer(string, DriverOptions) {#editlayer_1}

打开图层进行编辑。

```csharp
public VectorLayer EditLayer(string path, DriverOptions options = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | String | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 从文件中读取特征时出错。 |
| IOException | 发生 I/O 错误。 |

### 也可以看看

* class [VectorLayer](../../vectorlayer/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 命名空间 [Aspose.Gis](../../filedriver/)
* 部件 [Aspose.GIS](../../../)

---

## EditLayer(AbstractPath, DriverOptions) {#editlayer}

打开图层进行编辑。

```csharp
public virtual VectorLayer EditLayer(AbstractPath path, DriverOptions options = null)
```

| 范围 | 类型 | 描述 |
| --- | --- | --- |
| path | AbstractPath | 文件的路径。 |
| options | DriverOptions | 特定于驱动程序的选项。 |

### 返回值

的实例[`VectorLayer`](../../vectorlayer/).

### 例外

| 例外 | （健康）状况 |
| --- | --- |
| ArgumentException | 此驱动程序的选项对象类型不正确。 |
| ArgumentNullException | 路径是`null`. |
| [GisException](../../gisexception/) | 从文件中读取特征时出错。 |
| NotSupportedException | 驱动程序无法编辑图层。 |
| IOException | 发生 I/O 错误。 |

### 评论

驱动程序创建一个包含所有功能的内层。但是我们可以选择使用磁盘空间而不是 RAM。 有驱动程序可以更优化地使用资源（请参阅特定的驱动程序文档）。 驱动程序还可以编辑图层，如果它可以创建和打开图层。

### 也可以看看

* class [VectorLayer](../../vectorlayer/)
* class [AbstractPath](../../abstractpath/)
* class [DriverOptions](../../driveroptions/)
* class [FileDriver](../)
* 命名空间 [Aspose.Gis](../../filedriver/)
* 部件 [Aspose.GIS](../../../)


