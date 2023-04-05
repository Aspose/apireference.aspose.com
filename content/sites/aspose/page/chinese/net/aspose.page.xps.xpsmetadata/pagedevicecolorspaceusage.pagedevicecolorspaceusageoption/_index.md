---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page for .NET API 参考
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption 班级. 描述了PageDeviceColorSpaceUsage功能选项.
type: docs
weight: 1940
url: /zh/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

描述了[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/)功能选项.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## 特性

| 姓名 | 描述 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 获取元素名称。 |

## 方法

| 姓名 | 描述 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | 将项目列表添加到此选项的项目列表的末尾。 每个必须是一个[`ScoredProperty`](../scoredproperty/)或者[`Property`](../property/)实例. |

## 字段

| 姓名 | 描述 |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | 如果设备确定由[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/)parameter 可用作设备颜色空间配置文件，使用相同配置文件的所有元素都被视为已在设备颜色空间中指定 。所有其他元素必须使用为该元素指定的配置文件。如果配置文件不能 用作设备颜色空间配置文件，则使用配置文件的元素必须像使用颜色配置文件的任何其他元素一样进行颜色管理。 |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | 如果由 PageDeviceColorSpaceProfileURI 参数指定的配置文件具有与设备原色数量 匹配的通道数，则应使用它代替所有元素的设备内部颜色管理。 使用此配置文件的元素被假定为设备颜色空间，不会进一步进行颜色管理。 |

### 也可以看看

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* 命名空间 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 部件 [Aspose.Page](../../)


