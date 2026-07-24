---
title: "Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks メソッド"
linktitle: "CollectHyperlinks"
second_title: "C++ 用 Aspose.Page"
description: "Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks メソッド。 C++ で、すべてのタイプのハイパーリンクを持つ XPS 要素を収集します"
type: docs
weight: 100
url: /ja/cpp/aspose.page.xps.features/hyperlinkcollector/collecthyperlinks/
---
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


すべてのタイプのハイパーリンクを持つ [XPS](../../../aspose.page.xps/) 要素を収集します

```cpp
static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| パラメーター | 型 | 説明 |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | [XPS](../../../aspose.page.xps/) ドキュメントです |

### ReturnValue

ハイパーリンク付き [XPS](../../../aspose.page.xps/) 要素を含むコレクションです

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
## HyperlinkCollector::CollectHyperlinks(System::SharedPtr\<XpsDocument\>) method


特定のタイプのハイパーリンクを持つ [XPS](../../../aspose.page.xps/) 要素を収集します

```cpp
template<typename T> static System::SharedPtr<System::Collections::Generic::ICollection<System::SharedPtr<XpsModel::XpsHyperlinkElement>>> Aspose::Page::XPS::Features::HyperlinkCollector::CollectHyperlinks(System::SharedPtr<XpsDocument> document)
```


| パラメーター | 説明 |
| --- | --- |
| T | ハイパーリンク対象オブジェクトのタイプです |

| パラメーター | 型 | 説明 |
| --- | --- | --- |
| document | System::SharedPtr\<XpsDocument\> | [XPS](../../../aspose.page.xps/) ドキュメントです |

### ReturnValue

ハイパーリンク付き [XPS](../../../aspose.page.xps/) 要素を含むコレクションです

## 参照

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ICollection](../../../system.collections.generic/icollection/)
* Class [XpsHyperlinkElement](../../../aspose.page.xps.xpsmodel/xpshyperlinkelement/)
* Class [XpsDocument](../../../aspose.page.xps/xpsdocument/)
* Class [HyperlinkCollector](../)
* Namespace [Aspose::Page::XPS::Features](../../)
* Library [Aspose.Page for C++](../../../)
