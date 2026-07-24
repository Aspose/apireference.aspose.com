---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption classe"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page per C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption classe. Descrive le opzioni della funzionalità PageDeviceColorSpaceUsage in C++."
type: docs
weight: 200
url: /it/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Descrive le opzioni della funzionalità [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Campi

| Campo | Descrizione |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Se il dispositivo determina che il profilo specificato dal parametro [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) può essere utilizzato come profilo di spazio colore del dispositivo, tutti gli elementi che utilizzano lo stesso profilo sono trattati come già specificati nello spazio colore del dispositivo. Tutti gli altri elementi DEVONO utilizzare il profilo specificato per quell'elemento. Se il profilo non può essere utilizzato come profilo di spazio colore del dispositivo, gli elementi che utilizzano il profilo DEVONO essere gestiti a colori come qualsiasi altro elemento che utilizza il profilo colore. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Se il profilo specificato dal parametro [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) ha un numero di canali corrispondente al numero di primarie del dispositivo, dovrebbe essere utilizzato al posto della gestione interna del colore del dispositivo per tutti gli elementi. Gli elementi che utilizzano questo profilo si presumono essere nello spazio colore del dispositivo e non saranno ulteriormente gestiti a colori. |
## Vedi anche

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
