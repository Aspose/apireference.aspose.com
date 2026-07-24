---
title: "Aspose::Page::XPS::XpsMetadata::Staple::StapleOption 类"
linktitle: "StapleOption"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::Staple::StapleOption 类. 描述在 C++ 中的 JobStapleAllDocuments 和 DocumentStaple 功能选项。"
type: docs
weight: 200
url: /zh/cpp/aspose.page.xps.xpsmetadata/staple/stapleoption/
---
## StapleOption class


描述 [JobStapleAllDocuments](../../jobstaplealldocuments/) 和 [DocumentStaple](../../documentstaple/) 功能选项。

```cpp
class StapleOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## 方法

| 方法 | 描述 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<Staple::IStapleOptionItem\>\>\&) | 向该功能添加一个 [IStapleOptionItem](../istapleoptionitem/) 实例数组。 |
| [SetAngle](./setangle/)(int32_t) | 设置 *Angle* 计分属性值。 |
| [SetSheetCapacity](./setsheetcapacity/)(int32_t) | 设置 *SheetCapacity* 计分属性值。 |
| [StapleOption](./stapleoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<Staple::IStapleOptionItem\>\>\&) | 创建一个新实例。 |
## 字段

| 字段 | 描述 |
| --- | --- |
| static [None](./none/) | 指定不装订。 |
| static [SaddleStitch](./saddlestitch/) | 指定骑马钉装订。 |
| static [StapleBottomLeft](./staplebottomleft/) | 指定左下角的单个订书钉。 |
| static [StapleBottomRight](./staplebottomright/) | 指定右下角的单个订书钉。 |
| static [StapleDualBottom](./stapledualbottom/) | 指定底部边缘的两个订书钉。 |
| static [StapleDualLeft](./stapledualleft/) | 指定左侧边缘的两个订书钉。 |
| static [StapleDualRight](./stapledualright/) | 指定右侧边缘的两个订书钉。 |
| static [StapleDualTop](./stapledualtop/) | 指定顶部边缘的两个订书钉。 |
| static [StapleTopLeft](./stapletopleft/) | 指定左上角的单个订书钉。 |
| static [StapleTopRight](./stapletopright/) | 指定右上角的单个订书钉。 |
## 另见

* Class [Option](../../option/)
* Class [Staple](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
