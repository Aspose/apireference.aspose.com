---
title: "Aspose::Page::IMultiPageDevice::OpenPage Methode"
linktitle: "OpenPage"
second_title: "Aspose.Page für C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage Methode. Führt die notwendige Vorbereitung des Geräts vor jeder Seitenrenderung in C++ durch."
type: docs
weight: 400
url: /de/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Führt die notwendige Vorbereitung des Geräts vor jeder Seitenrenderung durch.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| width | float | Eine Breite der Seite. |
| height | float | Eine Höhe der Seite. |

### ReturnValue

Gibt true zurück, wenn die geöffnete Seite eine Nummer hat, die in den Bereich der ausgewählten Seitenzahlen fällt, und sonst false.

## Siehe auch

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Führt die notwendige Vorbereitung des Geräts vor der Seitenrenderung durch.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Typ | Beschreibung |
| --- | --- | --- |
| Titel | System::String | Der Seitentitel. |

### ReturnValue

True, wenn die Seite aus dem angeforderten Bereich stammt, sonst false. Wird in Geräten verwendet, die ein angegebenes Array von Seitenzahlen rendern können.

## Siehe auch

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
