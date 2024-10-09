---
title: Aspose::Page::IMultiPageDevice::OpenPage method
linktitle: OpenPage
second_title: Aspose.Page for C++
description: 'Aspose::Page::IMultiPageDevice::OpenPage method. Makes necessary preparation of the device before each page rendering in C++.'
type: docs
weight: 400
url: /cpp/aspose.page/imultipagedevice/openpage/
---
## IMultiPageDevice::OpenPage(float, float) method


Makes necessary preparation of the device before each page rendering.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(float width, float height)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| width | float | A width of the page. |
| height | float | A height of the page. |

### ReturnValue

Returns true if opened page has a number that falls in a range of selected page numbers and false otherwise.

## See Also

* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
## IMultiPageDevice::OpenPage(System::String) method


Makes necessary preparation of the device before page rendering.

```cpp
virtual bool Aspose::Page::IMultiPageDevice::OpenPage(System::String title)=0
```


| Parameter | Type | Description |
| --- | --- | --- |
| title | System::String | The page title. |

### ReturnValue

True if page is from requested range, otherwise false. Used in devices that can render specified array of page numbers.

## See Also

* Class [String](../../../system/string/)
* Class [IMultiPageDevice](../)
* Namespace [Aspose::Page](../../)
* Library [Aspose.Page for C++](../../../)
