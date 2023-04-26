---
title: Class DocumentNUp
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.DocumentNUp 수업. 단일 물리적 시트에 대한 여러 논리적 페이지의 출력 및 형식을 설명합니다. 각 문서는 개별적으로 컴파일됩니다. 그리고JobNUpAllDocumentsContiguously 는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https//docs.microsoft.com/enus/windows/win32/printdocs/documentnup
type: docs
weight: 750
url: /ko/net/aspose.page.xps.xpsmetadata/documentnup/
---
## DocumentNUp class

단일 물리적 시트에 대한 여러 논리적 페이지의 출력 및 형식을 설명합니다. 각 문서는 개별적으로 컴파일됩니다. 그리고[`JobNUpAllDocumentsContiguously`](../jobnupalldocumentscontiguously/) 는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/documentnup

```csharp
DocumentNUp
```

```csharp
public sealed class DocumentNUp : NUp, IDocumentPrintTicketItem, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [DocumentNUp](documentnup/)(params INUpItem[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/documentnup/addpagespersheetoption/)(int) | 추가 및 옵션 점수 속성 값. 물리적 시트당 논리적 페이지 수를 지정합니다. |

### 또한보십시오

* class [NUp](../nup/)
* interface [IDocumentPrintTicketItem](../idocumentprintticketitem/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


