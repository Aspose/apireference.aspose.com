---
title: Class JobNUpAllDocumentsContiguously
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.JobNUpAllDocumentsContiguously 수업. 단일 물리적 시트에 대한 여러 논리적 페이지의 출력을 설명합니다. job 의 모든 문서는 연속적으로 함께 컴파일됩니다.JobNUpAllDocumentsContiguously 그리고DocumentNUp 는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https//docs.microsoft.com/enus/windows/win32/printdocs/jobnupalldocumentscontiguously
type: docs
weight: 1380
url: /ko/net/aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/
---
## JobNUpAllDocumentsContiguously class

단일 물리적 시트에 대한 여러 논리적 페이지의 출력을 설명합니다. job 의 모든 문서는 연속적으로 함께 컴파일됩니다.`JobNUpAllDocumentsContiguously` 그리고[`DocumentNUp`](../documentnup/) 는 상호 배타적입니다. 이러한 키워드 간의 제약 조건 처리를 결정하는 것은 드라이버에 달려 있습니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/jobnupalldocumentscontiguously

```csharp
public sealed class JobNUpAllDocumentsContiguously : NUp, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [JobNUpAllDocumentsContiguously](jobnupalldocumentscontiguously/)(params INUpItem[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |
| [AddPagesPerSheetOption](../../aspose.page.xps.xpsmetadata/jobnupalldocumentscontiguously/addpagespersheetoption/)(int) | 추가 및 옵션 점수 속성 값. 물리적 시트당 논리적 페이지 수를 지정합니다. |

### 또한보십시오

* class [NUp](../nup/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


