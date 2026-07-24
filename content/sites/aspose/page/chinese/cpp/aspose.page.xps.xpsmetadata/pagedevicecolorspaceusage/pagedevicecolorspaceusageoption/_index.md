---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption 类"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption 类. 描述 PageDeviceColorSpaceUsage 功能选项（C++）。"
type: docs
weight: 200
url: /zh/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


描述 [PageDeviceColorSpaceUsage](../) 功能选项。

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## 字段

| 字段 | 描述 |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | 如果设备确定由 [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) 参数指定的配置文件可以用作设备颜色空间配置文件，则使用相同配置文件的所有元素将被视为已在设备颜色空间中指定。所有其他元素必须使用该元素指定的配置文件。如果该配置文件不能用作设备颜色空间配置文件，则使用该配置文件的元素必须像使用其他颜色配置文件的元素一样进行颜色管理。 |
| static [OverrideDeviceDefault](./overridedevicedefault/) | 如果 [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) 参数指定的配置文件的通道数与设备的基色数量匹配，则应在所有元素中使用该配置文件来替代设备内部的颜色管理。使用此配置文件的元素被视为位于设备颜色空间中，不会再进行颜色管理。 |
## 另见

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
