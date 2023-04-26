---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page för .NET API-referens
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption klass. BeskriverPageDeviceColorSpaceUsage funktionsalternativ.
type: docs
weight: 1950
url: /sv/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

Beskriver[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/) funktionsalternativ.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## Egenskaper

| namn | Beskrivning |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Hämtar elementets namn. |

## Metoder

| namn | Beskrivning |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Lägger till en lista med objekt i slutet av detta alternativs objektlista. Var och en måste vara en[`ScoredProperty`](../scoredproperty/) eller[`Property`](../property/) instans. |

## Fält

| namn | Beskrivning |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | Om enheten bestämmer att profilen som anges av[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/) parameter kan användas som en enhetsfärgrymdsprofil, alla element som använder samma profil behandlas som redan specificerade i enhetens färgrymd. Alla andra element MÅSTE använda den profil som anges för det elementet. Om profilen inte kan användas som en enhetsfärgrymdsprofil, MÅSTE element som använder profilen färghanteras som alla andra element som använder färgprofilen. |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | Om profilen som specificeras av parametern PageDeviceColorSpaceProfileURI har ett antal kanaler som matchar antalet primära för enheten, SKA den användas istället för enhetens interna färghantering för alla element. Element som använder denna profil antas vara i enhetsfärg utrymme och kommer inte att färghanteras ytterligare. |

### Se även

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* namnutrymme [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* hopsättning [Aspose.Page](../../)


