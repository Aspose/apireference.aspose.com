---
title: Class Feature
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.Feature 수업. 일반적인 인쇄 스키마 기능을 캡슐화하는 클래스입니다. 모든 스키마 정의 기능의 기본 클래스입니다. A 요소에는 전체 목록이 포함되어 있습니다.Option 그리고Property 장치 속성 작업 형식 설정 또는 기타 관련 특성을 완전히 설명하는 요소. https//docs.microsoft.com/enus/windows/win32/printdocs/feature
type: docs
weight: 880
url: /ko/net/aspose.page.xps.xpsmetadata/feature/
---
## Feature class

일반적인 인쇄 스키마 기능을 캡슐화하는 클래스입니다. 모든 스키마 정의 기능의 기본 클래스입니다. A 요소에는 전체 목록이 포함되어 있습니다.[`Option`](../option/) 그리고[`Property`](../property/) 장치 속성, 작업 형식 설정 또는 기타 관련 특성을 완전히 설명하는 요소. https://docs.microsoft.com/en-us/windows/win32/printdocs/feature

```csharp
Feature
```

```csharp
public class Feature : CompositePrintTicketElement, IFeatureItem, IPrintTicketItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Feature](feature/#constructor)(string, Feature, params IFeatureItem[]) | 새 PrintTicket 기능 인스턴스를 생성합니다. |
| [Feature](feature/#constructor_1)(string, Option, params IFeatureItem[]) | 새 PrintTicket 기능 인스턴스를 생성합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/feature/add/)(params IFeatureItem[]) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각각은`Feature` ,[`Option`](../option/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* interface [IPrintTicketItem](../iprintticketitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


