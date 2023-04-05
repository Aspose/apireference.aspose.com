---
title: Class PageWatermark
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.PageWatermark 수업. 출력의 워터마크 설정 및 워터마크 특성을 설명합니다. watermarks apply 는 물리적 페이지가 아닌 논리적 페이지에 적용됩니다. 예를 들어DocumentDuplex 활성화되면 각각에 워터마크가 나타납니다. 각 시트의 페이지. 만약에DocumentDuplex  2이면 각 시트에 2개의 워터마크가 있습니다. https//docs.microsoft.com/enus/windows/win32/printdocs/pagewatermark
type: docs
weight: 2640
url: /ko/net/aspose.page.xps.xpsmetadata/pagewatermark/
---
## PageWatermark class

출력의 워터마크 설정 및 워터마크 특성을 설명합니다. watermarks apply 는 물리적 페이지가 아닌 논리적 페이지에 적용됩니다. 예를 들어,[`DocumentDuplex`](../documentduplex/) 활성화되면 각각에 워터마크가 나타납니다. 각 시트의 페이지. 만약에[`DocumentDuplex`](../documentduplex/) , =2이면 각 시트에 2개의 워터마크가 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/pagewatermark

```csharp
NUp
```

```csharp
PagesPerSheet
```

```csharp
public sealed class PageWatermark : Feature, IDocumentPrintTicketItem, IJobPrintTicketItem, 
    IPagePrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [PageWatermark](pagewatermark/)(params IPageWatermarkItem[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

## 다른 멤버들

| 이름 | 설명 |
| --- | --- |
| interface [IPageWatermarkItem](pagewatermark.ipagewatermarkitem/) | 인터페이스`PageWatermark` 기능 항목. |
| interface [IPageWatermarkOptionItem](pagewatermark.ipagewatermarkoptionitem/) | 인터페이스[`PageWatermarkOption`](../pagewatermark.pagewatermarkoption/) 항목. |
| class [Layering](pagewatermark.layering/) | 내부 설명 특징. 워터마크의 레이어링 동작을 정의합니다. |
| class [LayeringOption](pagewatermark.layeringoption/) | 설명[`Layering`](../pagewatermark.layering/) 기능 옵션. |
| class [PageWatermarkOption](pagewatermark.pagewatermarkoption/) | 설명`PageWatermark` 기능 옵션. |

### 또한보십시오

* class [Feature](../feature/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* interface [IPagePrintTicketItem](../ipageprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


