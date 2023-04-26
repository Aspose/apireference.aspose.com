---
title: Class Option
second_title: .NET API 참조용 Aspose.Page
description: Aspose.Page.XPS.XpsMetadata.Option 수업. 공통 PrintTicket을 구현하는 클래스 . 모든 스키마 정의 옵션의 기본 클래스입니다. Option 요소에는Property and ScoredProperty 이 옵션과 관련된 요소. https//docs.microsoft.com/enus/windows/win32/printdocs/option
type: docs
weight: 1660
url: /ko/net/aspose.page.xps.xpsmetadata/option/
---
## Option class

공통 PrintTicket을 구현하는 클래스 . 모든 스키마 정의 옵션의 기본 클래스입니다. Option 요소에는[`Property`](../property/) and [`ScoredProperty`](../scoredproperty/) 이 옵션과 관련된 요소. https://docs.microsoft.com/en-us/windows/win32/printdocs/option

```csharp
Option
```

```csharp
public class Option : CompositePrintTicketElement, IFeatureItem
```

## 생성자

| 이름 | 설명 |
| --- | --- |
| [Option](option/#constructor)(params IOptionItem[]) | 새 PrintTicket 옵션 인스턴스를 생성합니다. |
| [Option](option/#constructor_1)(Option) | 복제 옵션 인스턴스를 생성합니다. |
| [Option](option/#constructor_2)(string, params IOptionItem[]) | 새 PrintTicket 옵션 인스턴스를 생성합니다. |

## 속성

| 이름 | 설명 |
| --- | --- |
| [Name](../../aspose.page.xps.xpsmetadata/printticketelement/name/) { get; } | 요소 이름을 가져옵니다. |

## 행동 양식

| 이름 | 설명 |
| --- | --- |
| [Add](../../aspose.page.xps.xpsmetadata/option/add/)(params IOptionItem[]) | 이 옵션의 항목 목록 끝에 항목 목록을 추가합니다. 각각은[`ScoredProperty`](../scoredproperty/) 또는[`Property`](../property/) 인스턴스. |

### 또한보십시오

* class [CompositePrintTicketElement](../compositeprintticketelement/)
* interface [IFeatureItem](../ifeatureitem/)
* 네임스페이스 [Aspose.Page.XPS.XpsMetadata](../../aspose.page.xps.xpsmetadata/)
* 집회 [Aspose.Page](../../)


