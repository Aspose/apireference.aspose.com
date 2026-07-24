---
title: "Aspose::Page::XPS::XpsMetadata::Feature 클래스"
linktitle: "기능"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::Feature 클래스. 일반 Print Schema 기능을 캡슐화하는 클래스입니다. 모든 스키마 정의된 기능의 기본 클래스입니다. Feature 요소는 장치 속성, 작업 형식 설정 또는 기타 관련 특성을 완전히 설명하는 Option 및 Property 요소의 전체 목록을 포함합니다. C++에서."
type: docs
weight: 2900
url: /ko/cpp/aspose.page.xps.xpsmetadata/feature/
---
## Feature class


공통 Print Schema 기능을 캡슐화하는 클래스입니다. 모든 스키마 정의 기능의 기본 클래스입니다. **[Feature](./)** 요소는 장치 속성, 작업 형식 설정 또는 기타 관련 특성을 완전히 설명하는 [Option](../option/) 및 [Property](../property/) 요소의 전체 목록을 포함합니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/feature](https://docs.microsoft.com/en-us/windows/win32/printdocs/feature).

```cpp
class Feature : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                public virtual Aspose::Page::XPS::XpsMetadata::IFeatureItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 이 기능의 항목 목록 끝에 항목 목록을 추가합니다. 각 항목은 [Feature](./), [Option](../option/), 또는 [Property](../property/) 인스턴스여야 합니다. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Option\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 새로운 [PrintTicket](../printticket/) 기능 인스턴스를 생성합니다. |
| [Feature](./feature/)(System::String, System::SharedPtr\<Feature\>, const System::ArrayPtr\<System::SharedPtr\<IFeatureItem\>\>\&) | 새로운 [PrintTicket](../printticket/) 기능 인스턴스를 생성합니다. |
## 또 보기

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
