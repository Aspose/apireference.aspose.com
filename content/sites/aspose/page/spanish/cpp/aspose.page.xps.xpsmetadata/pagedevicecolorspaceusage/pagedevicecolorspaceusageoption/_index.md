---
title: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption clase"
linktitle: "PageDeviceColorSpaceUsageOption"
second_title: "Aspose.Page para C++"
description: "Aspose::Page::XPS::XpsMetadata::PageDeviceColorSpaceUsage::PageDeviceColorSpaceUsageOption clase. Describe las opciones de la característica PageDeviceColorSpaceUsage en C++."
type: docs
weight: 200
url: /es/cpp/aspose.page.xps.xpsmetadata/pagedevicecolorspaceusage/pagedevicecolorspaceusageoption/
---
## PageDeviceColorSpaceUsageOption class


Describe las opciones de la característica [PageDeviceColorSpaceUsage](../).

```cpp
class PageDeviceColorSpaceUsageOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Campos

| Campo | Descripción |
| --- | --- |
| static [MatchToDefault](./matchtodefault/) | Si el dispositivo determina que el perfil especificado por el parámetro [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) puede usarse como un perfil de espacio de color del dispositivo, todos los elementos que usan el mismo perfil se tratan como si ya estuvieran especificados en el espacio de color del dispositivo. Todos los demás elementos DEBEN usar el perfil especificado para ese elemento. Si el perfil no puede usarse como un perfil de espacio de color del dispositivo, los elementos que usan el perfil DEBEN gestionarse en color como cualquier otro elemento que use el perfil de color. |
| static [OverrideDeviceDefault](./overridedevicedefault/) | Si el perfil especificado por el parámetro [PageDeviceColorSpaceProfileURI](../../pagedevicecolorspaceprofileuri/) tiene un número de canales que coincide con el número de primarios del dispositivo, DEBERÍA usarse en lugar de la gestión interna de color del dispositivo para todos los elementos. Se asume que los elementos que usan este perfil están en el espacio de color del dispositivo y no se gestionarán más en color. |
## Ver también

* Class [Option](../../option/)
* Class [PageDeviceColorSpaceUsage](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
