---
title: Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption class
linktitle: PageDeviceColorSpaceUsageOption
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption class. Describes the PageDeviceColorSpaceUsage feature options in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Describes the [PageDeviceColorSpaceUsage](../) feature options.

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Fields

| Field | Description |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | If the device determines that the profile specified by the [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) parameter can be used as a device color space profile, all elements using the same profile are treated as already being specified in device color space. All other elements MUST use the profile specified for that element. If the profile cannot be used as a device color space profile, elements using the profile MUST be color managed like any other element using the color profile. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | If the profile specified by the [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) parameter has a number of channels matching the number of primaries of the device, it SHOULD be used instead of the devices internal color management for all elements. Elements using this profile are assumed to be in device color space and will not be color managed further. |
## See Also

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
