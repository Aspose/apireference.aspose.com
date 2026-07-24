---
title: "Aspose::Page::IMultiPageDevice::OpenPage methode"
linktitle: "OpenPage"
second_title: "Aspose.Page voor C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage methode. Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van elke pagina in C++."
type: docs
weight: 400
url: /nl/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van elke pagina.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| width | float | Een breedte van de pagina. |
| height | float | Een hoogte van de pagina. |

### ReturnValue

Retourneert true als de geopende pagina een nummer heeft dat binnen een bereik van geselecteerde paginanummers valt en anders false.

## Zie ook

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Voert de noodzakelijke voorbereiding van het apparaat uit vóór het renderen van een pagina.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | Beschrijving |
| --- | --- | --- |
| titel | System::String | De paginatitel. |

### ReturnValue

True als de pagina binnen het gevraagde bereik valt, anders false. Wordt gebruikt in apparaten die een opgegeven reeks paginanummers kunnen renderen.

## Zie ook

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
