---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page voor .NET API-referentie
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption klas. Beschrijft dePageDeviceColorSpaceUsage functieopties.
type: docs
weight: 1940
url: /nl/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

Beschrijft de[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/) functie-opties.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## Eigenschappen

| Naam | Beschrijving |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Krijgt de elementnaam. |

## methoden

| Naam | Beschrijving |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Voegt een lijst met items toe aan het einde van de itemlijst van deze optie. Elk moet een[`ScoredProperty`](../scoredproperty/) of[`Property`](../property/) instantie. |

## Velden

| Naam | Beschrijving |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | Als het apparaat vaststelt dat het profiel gespecificeerd door de[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/) parameter kan worden gebruikt als een apparaatkleurruimteprofiel, alle elementen die hetzelfde profiel gebruiken, worden behandeld als reeds opgegeven in de apparaatkleurruimte. Alle andere elementen MOETEN het profiel gebruiken dat voor dat element is gespecificeerd. Als het profiel niet kan worden gebruikt als kleurruimteprofiel voor een apparaat, MOETEN elementen die het profiel gebruiken, worden beheerd zoals elk ander element dat het kleurprofiel gebruikt. |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | Als het profiel gespecificeerd door de PageDeviceColorSpaceProfileURI-parameter een aantal kanalen heeft dat overeenkomt met het aantal primaire kleuren van het apparaat, MOET dit worden gebruikt in plaats van het interne kleurbeheer van het apparaat voor alle elementen. Elementen die dit profiel gebruiken, worden geacht in apparaatkleur te zijn ruimte en wordt niet verder in kleur beheerd. |

### Zie ook

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* naamruimte [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* montage [Aspose.Page](../../)


