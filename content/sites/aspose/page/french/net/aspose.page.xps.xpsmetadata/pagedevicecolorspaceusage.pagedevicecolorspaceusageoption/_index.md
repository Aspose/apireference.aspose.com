---
title: Class PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption
second_title: Aspose.Page pour la référence de l'API .NET
description: Aspose.Page.XPS.XpsMetadata.PageDeviceColorSpaceUsagePageDeviceColorSpaceUsageOption classe. Décrit lePageDeviceColorSpaceUsage options de fonctionnalité.
type: docs
weight: 1950
url: /fr/net/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage.pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsage.PageDeviceColorSpaceUsageOption class

Décrit le[`PageDeviceColorSpaceUsage`](../pagedevicecolorspaceusage/) options de fonctionnalité.

```csharp
public sealed class PageDeviceColorSpaceUsageOption : Option
```

## Propriétés

| Nom | La description |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | Obtient le nom de l'élément. |

## Méthodes

| Nom | La description |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | Ajoute une liste d'éléments à la fin de la liste d'éléments de cette option. Chacun doit être un[`ScoredProperty`](../scoredproperty/) ou[`Property`](../property/) instance. |

## Des champs

| Nom | La description |
| --- | --- |
| static [MatchToDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/matchtodefault/) | Si l'appareil détermine que le profil spécifié par le[`PageDeviceColorSpaceProfileURI`](../pagedevicecolorspaceprofileuri/) Le paramètre peut être utilisé comme profil d'espace colorimétrique de périphérique, tous les éléments utilisant le même profil sont traités comme étant déjà spécifiés dans l'espace colorimétrique de périphérique. Tous les autres éléments DOIVENT utiliser le profil spécifié pour cet élément. Si le profil ne peut pas être utilisé comme profil d'espace colorimétrique de périphérique, les éléments utilisant le profil DOIVENT être gérés en couleur comme tout autre élément utilisant le profil de couleur. |
| static [OverrideDeviceDefault](../../aspose.page.xps.xpsmetadata/pagedevicecolorspaceusageoption/overridedevicedefault/) | Si le profil spécifié par le paramètre PageDeviceColorSpaceProfileURI a un certain nombre de canaux correspondant au nombre de primaires de l'appareil, il DEVRAIT être utilisé à la place de la gestion interne des couleurs de l'appareil pour tous les éléments. Les éléments utilisant ce profil sont supposés être dans la couleur de l'appareil l'espace et ne sera plus géré par la couleur. |

### Voir également

* class [Option](../option/)
* class [PageDeviceColorSpaceUsage](../pagedevicecolorspaceusage/)
* espace de noms [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* Assemblée [Aspose.Page](../../)


