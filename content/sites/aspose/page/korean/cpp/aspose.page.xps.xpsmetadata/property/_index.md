---
title: "Aspose::Page::XPS::XpsMetadata::Property 클래스"
linktitle: "속성"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::Property 클래스. 일반 PrintTicketProperty를 구현하는 클래스입니다. 모든 스키마 정의 속성의 기본 클래스입니다. Property 요소는 name 속성으로 지정된 장치, 작업 형식 또는 기타 관련 속성을 선언합니다. Value 요소는 Property에 값을 할당하는 데 사용됩니다. Property는 복잡할 수 있으며, 여러 하위 속성을 포함할 수 있습니다. 하위 속성도 Property 요소로 표현됩니다.  C++에서."
type: docs
weight: 14300
url: /ko/cpp/aspose.page.xps.xpsmetadata/property/
---
## Property class


공통 [PrintTicket](../printticket/)**[Property](./)**을 구현하는 클래스입니다. 모든 스키마 정의 속성의 기본 클래스입니다. **[Property](./)** 요소는 name 속성으로 지정된 장치, 작업 형식 또는 기타 관련 속성을 선언합니다. [Value](../value/) 요소는 **[Property](./)**에 값을 할당하는 데 사용됩니다. **[Property](./)**는 복잡할 수 있으며, 여러 하위 속성을 포함할 수 있습니다. 하위 속성도 **[Property](./)** 요소로 표현됩니다. [https://docs.microsoft.com/en-us/windows/win32/printdocs/property](https://docs.microsoft.com/en-us/windows/win32/printdocs/property).

```cpp
class Property : public Aspose::Page::XPS::XpsMetadata::CompositePrintTicketElement,
                 public virtual Aspose::Page::XPS::XpsMetadata::IPrintTicketItem,
                 public Aspose::Page::XPS::XpsMetadata::IFeatureItem,
                 public virtual Aspose::Page::XPS::XpsMetadata::IOptionItem,
                 public Aspose::Page::XPS::XpsMetadata::IScoredPropertyItem,
                 public Aspose::Page::XPS::XpsMetadata::IPropertyItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Property](./property/)(System::String, System::SharedPtr\<Property\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | 새 인스턴스를 생성합니다. |
| [Property](./property/)(System::String, System::SharedPtr\<Value\>, const System::ArrayPtr\<System::SharedPtr\<IPropertyItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 또 보기

* Class [CompositePrintTicketElement](../compositeprintticketelement/)
* Class [IPrintTicketItem](../iprintticketitem/)
* Class [IFeatureItem](../ifeatureitem/)
* Class [IOptionItem](../ioptionitem/)
* Class [IScoredPropertyItem](../iscoredpropertyitem/)
* Class [IPropertyItem](../ipropertyitem/)
* Namespace [Aspose::Page::XPS::XpsMetadata](../)
* Library [Aspose.Page for C++](../../)
