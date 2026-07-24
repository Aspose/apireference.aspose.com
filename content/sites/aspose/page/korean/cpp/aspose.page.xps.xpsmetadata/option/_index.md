---
title: "Aspose::Page::XPS::XpsMetadata::Option 클래스"
linktitle: "Option"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::Option 클래스. 일반 PrintTicketOption을 구현하는 클래스입니다. 모든 스키마 정의 옵션의 기본 클래스이며, Option 요소는 이 옵션과 연결된 모든 Property 및 ScoredProperty 요소를 포함합니다. C++에서."
type: docs
weight: 7600
url: /ko/cpp/aspose.page.xps.xpsmetadata/option/
---
## Option class


공통 [PrintTicket](../printticket/)**[Option](./)**을 구현하는 클래스입니다. 모든 스키마 정의 옵션의 기본 클래스이며, [Option](./) 요소는 이 옵션과 연결된 모든 [Property](../property/) 및 [ScoredProperty](../scoredproperty/) 요소를 포함합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/option](https://docs.microsoft.com/en-us/windows/win32/printdocs/option).

```cpp
class Option : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
               public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 이 옵션의 항목 목록 끝에 항목 리스트를 추가합니다. 각 항목은 [ScoredProperty](../scoredproperty/) 또는 [Property](../property/) 인스턴스여야 합니다. |
| [Option](./option/)(System::String, const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 새로운 [PrintTicket](../printticket/) 옵션 인스턴스를 생성합니다. |
| [Option](./option/)(const System::ArrayPtr\<System::SharedPtr\<IOptionItem\>\>\&) | 새로운 [PrintTicket](../printticket/) 옵션 인스턴스를 생성합니다. |
| [Option](./option/)(System::SharedPtr\<Option\>) | 복제 옵션 인스턴스를 생성합니다. |
## 또 보기

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
