---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption Klasse"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption Klasse. Beschreibt die PageDeviceColorSpaceUsage‑Funktionsoptionen in C++."
type: docs
weight: 200
url: /de/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Beschreibt die [PageDeviceColorSpaceUsage](../) Funktionsoptionen.

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Felder

| Feld | Beschreibung |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Wenn das Gerät feststellt, dass das durch den Parameter [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) angegebene Profil als Gerätefarbraumprofil verwendet werden kann, werden alle Elemente, die dasselbe Profil verwenden, so behandelt, als seien sie bereits im Gerätefarbraum angegeben. Alle anderen Elemente MÜSSEN das für dieses Element angegebene Profil verwenden. Wenn das Profil nicht als Gerätefarbraumprofil verwendet werden kann, MÜSSEN Elemente, die das Profil verwenden, farblich verwaltet werden wie jedes andere Element, das das Farbprofil verwendet. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Wenn das durch den Parameter [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) angegebene Profil eine Kanalanzahl hat, die der Anzahl der Primärfarben des Geräts entspricht, SOLLTE es anstelle der internen Farbverwaltung des Geräts für alle Elemente verwendet werden. Elemente, die dieses Profil verwenden, werden angenommen, sich bereits im Gerätefarbraum zu befinden, und werden nicht weiter farblich verwaltet. |
## Siehe auch

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
