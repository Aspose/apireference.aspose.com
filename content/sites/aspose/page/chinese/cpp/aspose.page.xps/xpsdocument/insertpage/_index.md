---
title: "Aspose::Page::XPS::XpsDocument::InsertPage 方法"
linktitle: "InsertPage"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::InsertPage 方法。 在 C++ 中于索引位置插入一个具有默认页面大小的空白页到文档中。"
type: docs
weight: 4500
url: /zh/cpp/aspose.page.xps/xpsdocument/insertpage/
---
## XpsDocument::InsertPage(int32_t, bool) method


在 *index* 位置向文档插入一个具有默认页面尺寸的空页面。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, bool activate=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应插入页面的位置。 |
| 激活 | bool | 指示是否将插入的页面设为活动页的标志。 |

### ReturnValue

已插入的页面。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, float, float, bool) method


在 *index* 位置向文档插入一个具有指定 *width* 和 *height* 的空页面。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, float width, float height, bool activate=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应插入页面的位置。 |
| width | 单精度浮点数 | 新页面的宽度。 |
| height | 单精度浮点数 | 新页面的高度。 |
| 激活 | bool | 指示是否将插入的页面设为活动页的标志。 |

### ReturnValue

已插入的页面。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertPage(int32_t, System::SharedPtr\<XpsModel::XpsPage\>, bool) method


在 *index* 位置向文档插入一个页面。

```cpp
System::SharedPtr<XpsModel::XpsPage> Aspose::Page::XPS::XpsDocument::InsertPage(int32_t index, System::SharedPtr<XpsModel::XpsPage> page, bool activate=true)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应添加页面的位置。 |
| page | System::SharedPtr\<XpsModel::XpsPage\> | 要插入的 [Page](../../../aspose.page/)。 |
| 激活 | bool | 指示是否将插入的页面设为活动页的标志。 |

### ReturnValue

已插入的页面。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPage](../../../aspose.page.xps.xpsmodel/xpspage/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
