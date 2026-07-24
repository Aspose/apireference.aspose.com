---
title: "Aspose::Page::IMultiPageDevice::OpenPage‑metod"
linktitle: "OpenPage"
second_title: "Aspose.Page för C++"
description: "Aspose::Page::IMultiPageDevice::OpenPage‑metod. Gör nödvändig förberedelse av enheten innan varje sidrendering i C++."
type: docs
weight: 400
url: /sv/cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Utför nödvändig förberedelse av enheten innan varje sidrendering.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| bredd | float | En bredd på sidan. |
| höjd | float | En höjd på sidan. |

### ReturnValue

Returnerar true om den öppnade sidan har ett nummer som faller inom intervallet av valda sidnummer och false annars.

## Se även

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Utför nödvändig förberedelse av enheten innan sidrendering.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | Beskrivning |
| --- | --- | --- |
| titel | System::String | Sidans titel. |

### ReturnValue

True om sidan är inom det begärda intervallet, annars false. Används i enheter som kan rendera en specificerad array av sidnummer.

## Se även

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
