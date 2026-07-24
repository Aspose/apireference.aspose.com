---
title: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet 클래스"
linktitle: "JobErrorSheet"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::JobErrorSheet 클래스. 오류 시트 출력에 대해 설명합니다. 전체 작업은 하나의 오류 시트를 가집니다. 오류 시트는 기본 PageMediaSize와 기본 PageMediaType을 사용하여 출력되어야 합니다. 오류 시트는 작업의 나머지 부분과 분리되어야 합니다. 이는 JobDuplex, JobStaple, JobBinding과 같은 마감 또는 처리 옵션이 오류 시트를 포함하지 않아야 함을 의미합니다. 오류 시트는 작업의 마지막 시트로 나타나야 합니다. C++에서."
type: docs
weight: 5300
url: /ko/cpp/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class


오류 시트 출력을 설명합니다. 전체 작업은 하나의 오류 시트를 가집니다. 오류 시트는 기본 [PageMediaSize](../pagemediasize/)와 기본 [PageMediaType](../pagemediatype/)을 사용하여 출력되어야 합니다. 오류 시트는 작업의 나머지 부분과 분리되어야 합니다. 이는 **JobDuplex**, **JobStaple**, **JobBinding**과 같은 마감 또는 처리 옵션이 오류 시트를 포함하지 않아야 함을 의미합니다. 오류 시트는 작업의 마지막 시트로 나타나야 합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet](https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet).

```cpp
class JobErrorSheet : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem
```

## Nested classes

* Class [ErrorSheetOption](./errorsheetoption/)
* Class [ErrorSheetWhen](./errorsheetwhen/)
* Class [IJobErrorSheetItem](./ijoberrorsheetitem/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [JobErrorSheet](./joberrorsheet/)(const System::ArrayPtr\<System::SharedPtr\<JobErrorSheet::IJobErrorSheetItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
