---
title: Aspose::Page::XPS::XpsDocument::InsertPage method
linktitle: InsertPage
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsDocument::InsertPage method. Inserts an empty page to the document with default page size at index  position in C++.'
type: docs
weight: 3200
url: /cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


Inserts an empty page to the document with default page size at *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | Position at which a page should be inserted. |
| activate | bool | Flag indicating whether to select inserted page as active. |

### ReturnValue

Inserted page.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


Inserts an empty page to the document with specified *width*  and *height*  at *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | Position at which a page should be inserted. |
| width | float | Width of a new page. |
| height | float | Height of a new page. |
| activate | bool | Flag indicating whether to select inserted page as active. |

### ReturnValue

Inserted page.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


Inserts a page to the document at *index*  position.

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Parameter | Type | Description |
| --- | --- | --- |
| index | int32_t | Position at which a page should be added. |
| page | System::SharedPtr\<XpsModel::XpsPage\> | [Page](../../../aspose.page/) to be inserted. |
| activate | bool | Flag indicating whether to select inserted page as active. |

### ReturnValue

Inserted page.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
