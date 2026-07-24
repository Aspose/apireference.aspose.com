---
title: "classe Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page pour C++"
description: "classe Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption. Décrit les options de fonctionnalité PageDeviceColorSpaceUsage en C++."
type: docs
weight: 200
url: /fr/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Décrit les options de fonctionnalité [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Champs

| Champ | Description |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Si l'appareil détermine que le profil spécifié par le paramètre [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) peut être utilisé comme profil d'espace couleur de l'appareil, tous les éléments utilisant le même profil sont considérés comme déjà spécifiés dans l'espace couleur de l'appareil. Tous les autres éléments MUST utiliser le profil spécifié pour cet élément. Si le profil ne peut pas être utilisé comme profil d'espace couleur de l'appareil, les éléments utilisant le profil MUST être gérés colorimétriquement comme tout autre élément utilisant le profil couleur. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Si le profil spécifié par le paramètre [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) possède un nombre de canaux correspondant au nombre de primaires de l'appareil, il SHOULD être utilisé à la place de la gestion interne des couleurs de l'appareil pour tous les éléments. Les éléments utilisant ce profil sont supposés être dans l'espace couleur de l'appareil et ne seront pas gérés colorimétriquement davantage. |
## Voir aussi

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
