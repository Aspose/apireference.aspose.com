---
title: "Aspose::Page::XPS::XpsMetadata::ScoredProperty 클래스"
linktitle: "ScoredProperty"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::ScoredProperty 클래스. 일반 PrintTicketScoredProperty를 구현하는 클래스입니다. 모든 스키마 정의된 스코어드 속성의 기본 클래스입니다. **ScoredProperty** 요소는 옵션 정의에 내재된 속성을 선언합니다. 이러한 속성은 요청된 옵션이 장치가 지원하는 옵션과 얼마나 일치하는지 평가할 때 비교되어야 합니다. C++에서."
type: docs
weight: 14600
url: /ko/cpp/aspose.page.xps.xpsmetadata/scoredproperty/
---
## ScoredProperty class


공통 [PrintTicket](../printticket/)**[ScoredProperty](./)**을 구현하는 클래스입니다. 모든 스키마 정의된 스코어드 속성의 기본 클래스입니다. **[ScoredProperty](./)** 요소는 [Option](../option/) 정의에 내재된 속성을 선언합니다. 이러한 속성은 요청된 [Option](../option/)이 장치가 지원하는 [Option](../option/)과 얼마나 일치하는지 평가할 때 비교되어야 합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty](https://docs.microsoft.com/en-us/windows/win32/printdocs/scoredproperty).

```cpp
class ScoredProperty : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                       public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                       public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<ParameterRef\>) | 새 인스턴스를 생성합니다. |
| [ScoredProperty](./scoredproperty/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IScoredPropertyItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
