---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption класс"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page для C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption класс. Описывает параметры функции PageDeviceColorSpaceUsage в C++."
type: docs
weight: 200
url: /ru/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Описывает параметры функции [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Поля

| Поле | Описание |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Если устройство определяет, что профиль, указанный параметром [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/), может быть использован в качестве профиля цветового пространства устройства, все элементы, использующие тот же профиль, считаются уже заданными в цветовом пространстве устройства. Все остальные элементы ДОЛЖНЫ использовать профиль, указанный для данного элемента. Если профиль не может быть использован в качестве профиля цветового пространства устройства, элементы, использующие профиль, ДОЛЖНЫ управляться цветом так же, как любой другой элемент, использующий цветовой профиль. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Если профиль, указанный параметром [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/), имеет количество каналов, соответствующее количеству первичных цветов устройства, его СЛЕДУЕТ использовать вместо внутреннего управления цветом устройства для всех элементов. Считается, что элементы, использующие этот профиль, находятся в цветовом пространстве устройства и дальнейшее управление цветом для них не будет выполняться. |
## См. также

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
