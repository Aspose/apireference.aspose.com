---
title: "Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks 方法"
linktitle: "CollectHyperlinks"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks 方法。该方法在 C++ 中收集所有类型超链接的 XPS 元素。"
type: docs
weight: 100
url: /zh/cpp/aspose.page.xps.features/hyperlinkcollector/collecthyperlinks/
---
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


收集所有类型超链接的 [XPS](../../../aspose.page.xps/) 元素。

```cpp
static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | 该 [XPS](../../../aspose.page.xps/) 文档。 |

### ReturnValue

包含带超链接的 [XPS](../../../aspose.page.xps/) 元素的集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


收集特定类型超链接的 [XPS](../../../aspose.page.xps/) 元素。

```cpp
template<typename T> static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| Parameter | 描述 |
| --- | --- |
| T | 超链接目标对象的类型。 |

| Parameter | Type | 描述 |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | 该 [XPS](../../../aspose.page.xps/) 文档。 |

### ReturnValue

包含带超链接的 [XPS](../../../aspose.page.xps/) 元素的集合。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
