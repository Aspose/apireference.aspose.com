---
title: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet 类"
linktitle: "JobPrimaryBannerSheet"
second_title: "Aspose.Page 适用于 C++"
description: "Aspose::Page::XPS::XpsMetadata::JobPrimaryBannerSheet 类。描述作业要输出的横幅页。横幅页应使用默认的 PageMediaSize 并使用默认的 PageMediaType 输出。横幅页应与作业的其余部分隔离。这意味着任何装订或处理选项（如 JobDuplexAllDocumentsContiguously、JobStapleAllDocuments 或 JobBindAllDocuments）都不应包括横幅页。横幅页应作为作业的第一张页出现。 在 C++ 中。"
type: docs
weight: 6400
url: /zh/cpp/aspose.page.xps.xpsmetadata/jobprimarybannersheet/
---
## JobPrimaryBannerSheet class


描述作业要输出的横幅页。横幅页应使用默认的 [PageMediaSize](../pagemediasize/) 并使用默认的 [PageMediaType](../pagemediatype/) 输出。横幅页应与作业的其余部分隔离。这意味着任何装订或处理选项（如 [JobDuplexAllDocumentsContiguously](../jobduplexalldocumentscontiguously/)、[JobStapleAllDocuments](../jobstaplealldocuments/)、或 [JobBindAllDocuments](../jobbindalldocuments/)）都不应包括横幅页。横幅页应作为作业的第一张页出现。

```cpp
class JobPrimaryBannerSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                              public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [BannerSheetOption](./bannersheetoption/)
## 方法

| 方法 | 描述 |
| --- | --- |
| [JobPrimaryBannerSheet](./jobprimarybannersheet/)(const System::ArrayPtr\<System::SharedPtr\<JobPrimaryBannerSheet::BannerSheetOption\>\>\&) | 创建一个新实例。 |
## 另见

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
