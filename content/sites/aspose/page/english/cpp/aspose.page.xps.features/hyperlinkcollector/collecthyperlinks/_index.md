---
title: Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks method
linktitle: CollectHyperlinks
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks method. Collects XPS elements with hyperlinks of all types in C++.'
type: docs
weight: 100
url: /cpp/aspose.page.xps.features/hyperlinkcollector/collecthyperlinks/
---
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


Collects [XPS](../../../aspose.page.xps/) elements with hyperlinks of all types.

```cpp
static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| Parameter | Type | Description |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | The [XPS](../../../aspose.page.xps/) document. |

### ReturnValue

The collection containing hyperlinked [XPS](../../../aspose.page.xps/) elements.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


Collects [XPS](../../../aspose.page.xps/) elements with hyperlinks of a certain type.

```cpp
template<typename T> static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| Parameter | Description |
| --- | --- |
| T | The type of the hyperlink target object. |

| Parameter | Type | Description |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | The [XPS](../../../aspose.page.xps/) document. |

### ReturnValue

The collection containing hyperlinked [XPS](../../../aspose.page.xps/) elements.

## See Also

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
