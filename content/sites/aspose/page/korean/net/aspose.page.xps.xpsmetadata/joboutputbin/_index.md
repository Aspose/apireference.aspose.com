---
title: Class JobOutputBin
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.JobOutputBin 수업. 장치에 설치된 출력 빈 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. TheJobOutputBin DocumentOutputBin 그리고PageOutputBin keywords 는 상호 배타적이며 하나만 PrintTicket 또는 인쇄 기능 문서에 지정해야 합니다.
type: docs
weight: 1430
url: /ko/net/aspose.page.xps.xpsmetadata/joboutputbin/
---
## JobOutputBin class

장치에 설치된 출력 빈 또는 장치에 대해 지원되는 빈의 전체 목록을 설명합니다. The`JobOutputBin` ,[`DocumentOutputBin`](../documentoutputbin/) 그리고[`PageOutputBin`](../pageoutputbin/) keywords 는 상호 배타적이며 하나만 PrintTicket 또는 인쇄 기능 문서에 지정해야 합니다.

```csharp
public sealed class JobOutputBin : OutputBin, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [JobOutputBin](joboutputbin/)(params IOutputBinItem[]) | 새 인스턴스를 만듭니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`Feature`](../feature/) ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [OutputBin](../outputbin/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


