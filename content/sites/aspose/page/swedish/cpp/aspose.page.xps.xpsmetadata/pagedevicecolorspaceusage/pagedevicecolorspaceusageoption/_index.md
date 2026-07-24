---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption klass"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption klass. Beskriver alternativ för PageDeviceColorSpaceUsage-funktionen i C++."
type: docs
weight: 200
url: /sv/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Beskriver alternativ för [PageDeviceColorSpaceUsage](../)-funktionen.

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Fält

| Fält | Beskrivning |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Om enheten fastställer att profilen som anges av parametern [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) kan användas som en enhetsfärgrymdprofil, behandlas alla element som använder samma profil som om de redan är specificerade i enhetens färgrymd. Alla andra element MÅSTE använda den profil som anges för det elementet. Om profilen inte kan användas som en enhetsfärgrymdprofil, MÅSTE element som använder profilen färghanteras på samma sätt som alla andra element som använder färgprofilen. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Om profilen som anges av parametern [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) har ett antal kanaler som matchar antalet primärer i enheten, SKALL den användas i stället för enhetens interna färghantering för alla element. Element som använder denna profil antas vara i enhetens färgrymd och kommer inte att färghanteras vidare. |
## Se även

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
