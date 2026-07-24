---
title: "Aspose::Page::XPS::XpsMetadata::PageWatermark 클래스"
linktitle: "PageWatermark"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::PageWatermark 클래스. 출력의 워터마크 설정 및 워터마크 특성을 설명합니다. 워터마크는 물리 페이지가 아니라 논리 페이지에 적용됩니다. 예를 들어, DocumentDuplex가 활성화된 경우, 각 시트의 각 NUp 페이지에 워터마크가 표시됩니다. DocumentDuplex, PagesPerSheet=2인 경우, 각 시트에 워터마크가 2개 표시됩니다.  C++에서."
type: docs
weight: 13100
url: /ko/cpp/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class


출력의 워터마크 설정 및 워터마크 특성을 설명합니다. 워터마크는 물리 페이지가 아니라 논리 페이지에 적용됩니다. 예를 들어, [DocumentDuplex](../documentduplex/)가 활성화된 경우, 각 시트의 각 **[NUp](../nup/)** 페이지에 워터마크가 표시됩니다. [DocumentDuplex](../documentduplex/)가, **PagesPerSheet**=2인 경우, 각 시트에 워터마크가 2개 표시됩니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark](https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark).

```cpp
class PageWatermark : public Aspose::Page::XPS::XpsMetadata::Feature,
                      public Aspose::Page::XPS::XpsMetadata::IJobPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IDocumentPrintTicketItem,
                      public Aspose::Page::XPS::XpsMetadata::IPagePrintTicketItem
```

## Nested classes

* Class [IPageWatermarkItem](./ipagewatermarkitem/)
* Class [IPageWatermarkOptionItem](./ipagewatermarkoptionitem/)
* Class [Layering](./layering/)
* Class [LayeringOption](./layeringoption/)
* Class [PageWatermarkOption](./pagewatermarkoption/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [PageWatermark](./pagewatermark/)(const System::ArrayPtr\<System::SharedPtr\<PageWatermark::IPageWatermarkItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [Feature](../feature/)
* Class [IJobPrintTicketItem](../ijobprintticketitem/)
* Class [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* Class [IPagePrintTicketItem](../ipageprintticketitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
