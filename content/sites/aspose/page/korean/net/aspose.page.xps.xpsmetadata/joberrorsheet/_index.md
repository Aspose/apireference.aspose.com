---
title: Class JobErrorSheet
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.JobErrorSheet 수업. 오류 시트 출력을 설명합니다. 전체 작업에는 단일 오류 시트가 있습니다. 오류 sheet 가 기본값으로 출력되어야 합니다.PageMediaSize 그리고 기본값을 사용하여PageMediaType . 오류 시트는 작업의 나머지 부분과 분리되어야 합니다. 즉 마무리 또는 처리 옵션예   또는  는 오류 시트를 포함하지 않아야 합니다. 오류 시트는 작업의 최종 시트로 발생해야 합니다. https//docs.microsoft.com/enus/windows/win32/printdocs/joberrorsheet
type: docs
weight: 1290
url: /ko/net/aspose.page.xps.xpsmetadata/joberrorsheet/
---
## JobErrorSheet class

오류 시트 출력을 설명합니다. 전체 작업에는 단일 오류 시트가 있습니다. 오류 sheet 가 기본값으로 출력되어야 합니다.[`PageMediaSize`](../pagemediasize/) 그리고 기본값을 사용하여[`PageMediaType`](../pagemediatype/) . 오류 시트는 작업의 나머지 부분과 분리되어야 합니다. 즉, 마무리 또는 처리 옵션(예: , , 또는 ) 는 오류 시트를 포함하지 않아야 합니다. 오류 시트는 작업의 최종 시트로 발생해야 합니다. https://docs.microsoft.com/en-us/windows/win32/printdocs/joberrorsheet

```csharp
JobDuplex
```

```csharp
JobStaple
```

```csharp
JobBinding
```

```csharp
public sealed class JobErrorSheet : Feature, IJobPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [JobErrorSheet](joberrorsheet/)(params IJobErrorSheetItem[]) | 새 인스턴스를 만듭니다. |

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
| class [ErrorSheetOption](joberrorsheet.errorsheetoption/) | 설명`JobErrorSheet` 기능 옵션. |
| class [ErrorSheetWhen](joberrorsheet.errorsheetwhen/) | 내부 설명 기능. |
| interface [IJobErrorSheetItem](joberrorsheet.ijoberrorsheetitem/) | 인터페이스`JobErrorSheet` 기능 항목. |

### 또한보십시오

* class [Feature](../feature/)
* interface [IJobPrintTicketItem](../ijobprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


