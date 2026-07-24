---
title: "Aspose::Page::XPS::XpsDocument::InsertPath 方法"
linktitle: "InsertPath"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsDocument::InsertPath 方法。 在 C++ 中在指定索引位置向活动页面插入新的路径。"
type: docs
weight: 4600
url: /zh/cpp/aspose.page.xps/xpsdocument/insertpath/
---
## XpsDocument::InsertPath method


在 *index* 位置向活动页面插入一个新 Path。

```cpp
System::SharedPtr<XpsModel::XpsPath> Aspose::Page::XPS::XpsDocument::InsertPath(int32_t index, System::SharedPtr<XpsModel::XpsPathGeometry> data)
```


| Parameter | Type | 描述 |
| --- | --- | --- |
| 索引 | int32_t | 应插入新路径的位置。 |
| 数据 | System::SharedPtr\<XpsModel::XpsPathGeometry\> | 路径的几何形状。 |

### ReturnValue

已插入的路径。

## 另见

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsPath](../../../aspose.page.xps.xpsmodel/xpspath/)
* Class [XpsPathGeometry](../../../aspose.page.xps.xpsmodel/xpspathgeometry/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
