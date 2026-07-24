---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption klasse"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption klasse. Beschrijft de PageDeviceColorSpaceUsage-functieopties in C++."
type: docs
weight: 200
url: /nl/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Beschrijft de [PageDeviceColorSpaceUsage](../) functieopties.

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Velden

| Veld | Beschrijving |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Als het apparaat bepaalt dat het profiel dat is opgegeven door de parameter [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) kan worden gebruikt als een apparaat‑kleurruimteprofiel, worden alle elementen die hetzelfde profiel gebruiken behandeld alsof ze al zijn gespecificeerd in de apparaat‑kleurruimte. Alle andere elementen MOETEN het voor dat element gespecificeerde profiel gebruiken. Als het profiel niet kan worden gebruikt als een apparaat‑kleurruimteprofiel, moeten elementen die het profiel gebruiken MOETEN kleurbeheerd worden zoals elk ander element dat het kleurprofiel gebruikt. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Als het profiel dat is opgegeven door de parameter [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) een aantal kanalen heeft dat overeenkomt met het aantal primaire kleuren van het apparaat, MOET het worden gebruikt in plaats van het interne kleurbeheer van het apparaat voor alle elementen. Elementen die dit profiel gebruiken, worden verondersteld zich in de apparaat‑kleurruimte te bevinden en zullen niet verder kleurbeheerd worden. |
## Zie ook

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
