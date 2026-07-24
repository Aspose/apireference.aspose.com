---
title: "Aspose::Page::XPS::XpsDocument::AddPage 方法"
linktitle: "AddPage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::AddPage 方法。 在 C++ 中向文档添加一个默认页面大小的空白页。"
type: docs
weight: 700
url: /zh/cpp/aspose.page.xps/xpsdocument/addpage/
---
## XpsDocument::AddPage(bool) method


向文档添加一个具有默认页面尺寸的空页。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::AddPage(bool activate=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 激活 | bool | 标志，指示是否将添加的页面设为活动页面。 |

### ReturnValue

已添加页面。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::AddPage(float, float, bool) method


向文档添加一个空页，指定 *width* 和 *height*。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::AddPage(float width, float height, bool activate=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| width | 单精度浮点数 | 新页面的宽度。 |
| height | 单精度浮点数 | 新页面的高度。 |
| 激活 | bool | 标志，指示是否将添加的页面设为活动页面。 |

### ReturnValue

已添加页面。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::AddPage(System::SharedPtr\<XpsModel::XpsPage\>, bool) method


向文档添加一页。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::AddPage(System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| page | System::SharedPtr\<XpsModel::XpsPage\> | [Page](../../../aspose.page/) 待添加。 |
| 激活 | bool | 标志，指示是否将添加的页面设为活动页面。 |

### ReturnValue

已添加页面。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
