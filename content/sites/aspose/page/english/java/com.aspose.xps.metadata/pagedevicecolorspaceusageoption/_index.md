---
title: PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page for Java API Reference
description: Describes the PageDeviceColorSpaceUsage feature options.
type: docs
weight: 10
url: /java/com.aspose.xps.metadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
**Inheritance:**
java.lang.Object, [com.aspose.xps.metadata.PrintTicketElement](../../com.aspose.xps.metadata/printticketelement), [com.aspose.xps.metadata.CompositePrintTicketElement](../../com.aspose.xps.metadata/compositeprintticketelement), [com.aspose.xps.metadata.Option](../../com.aspose.xps.metadata/option)
```
public static final class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption extends Option
```

Describes the \`\`\` PageDeviceColorSpaceUsage \`\`\` feature options.
## Fields

| Field | Description |
| --- | --- |
| [MatchToDefault](#MatchToDefault) | If the device determines that the profile specified by the \`\`\` PageDeviceColorSpaceProfileURI \`\`\` parameter can be used as a device color space profile, all elements using the same profile are treated as already being specified in device color space. |
| [OverrideDeviceDefault](#OverrideDeviceDefault) | If the profile specified by the PageDeviceColorSpaceProfileURI parameter has a number of channels matching the number of primaries of the device, it SHOULD be used instead of the devices internal color management for all elements. |
### MatchToDefault {#MatchToDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption MatchToDefault
```


If the device determines that the profile specified by the \`\`\` PageDeviceColorSpaceProfileURI \`\`\` parameter can be used as a device color space profile, all elements using the same profile are treated as already being specified in device color space. All other elements MUST use the profile specified for that element. If the profile cannot be used as a device color space profile, elements using the profile MUST be color managed like any other element using the color profile.

### OverrideDeviceDefault {#OverrideDeviceDefault}
```
public static PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption OverrideDeviceDefault
```


If the profile specified by the PageDeviceColorSpaceProfileURI parameter has a number of channels matching the number of primaries of the device, it SHOULD be used instead of the devices internal color management for all elements. Elements using this profile are assumed to be in device color space and will not be color managed further.

