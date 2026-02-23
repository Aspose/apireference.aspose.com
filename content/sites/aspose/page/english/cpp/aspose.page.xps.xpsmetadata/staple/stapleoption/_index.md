---
title: Aspose::Page::XPS::XpsMetadata::Staple::StapleOption class
linktitle: StapleOption
second_title: Aspose.Page for C++
description: 'Aspose::Page::XPS::XpsMetadata::Staple::StapleOption class. Describes the JobStapleAllDocuments and DocumentStaple features options in C++.'
type: docs
weight: 200
url: /cpp/aspose.page.xps.xpsmetadata/staple/stapleoption/
---
## StapleOption class


Describes the [JobStapleAllDocuments](../../jobstaplealldocuments/) and [DocumentStaple](../../documentstaple/) features options.

```cpp
class StapleOption : public Aspose::Page::XPS::XpsMetadata::Option
```

## Methods

| Method | Description |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<Staple::IStapleOptionItem\>\>\&) | Adds an array of [IStapleOptionItem](../istapleoptionitem/) instances to the feature. |
| [SetAngle](./setangle/)(int32_t) | Sets an *Angle* scored property value. |
| [SetSheetCapacity](./setsheetcapacity/)(int32_t) | Sets an *SheetCapacity* scored property value. |
| [StapleOption](./stapleoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<Staple::IStapleOptionItem\>\>\&) | Creates a new instance. |
## Fields

| Field | Description |
| --- | --- |
| static [None](./none/) | Specifies no stapling. |
| static [SaddleStitch](./saddlestitch/) | Specifies saddle stitch stapling. |
| static [StapleBottomLeft](./staplebottomleft/) | Specifies a single staple in the bottom, left corner. |
| static [StapleBottomRight](./staplebottomright/) | Specifies a single staple in the bottom, right corner. |
| static [StapleDualBottom](./stapledualbottom/) | Specifies two staples along the bottom edge. |
| static [StapleDualLeft](./stapledualleft/) | Specifies two staples along the left edge. |
| static [StapleDualRight](./stapledualright/) | Specifies two staples along the right edge. |
| static [StapleDualTop](./stapledualtop/) | Specifies two staples along the top edge. |
| static [StapleTopLeft](./stapletopleft/) | Specifies a single staple in the top, left corner. |
| static [StapleTopRight](./stapletopright/) | Specifies a single staple in the top, right corner. |
## See Also

* Class [Option](../../option/)
* Class [Staple](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
