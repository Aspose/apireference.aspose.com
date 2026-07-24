---
title: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs class"
linktitle: "BeforeSavingEventArgs"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::BeforeSavingEventArgs 클래스. C++에서 다양한 저장 전 이벤트의 인수에 대한 기본 클래스를 정의합니다."
type: docs
weight: 200
url: /ko/cpp/aspose.page.xps.features.eventbasedmodifications/beforesavingeventargs/
---
## BeforeSavingEventArgs class


다양한 저장 전 이벤트 인수에 대한 기본 클래스를 정의합니다.

```cpp
template<typename T>class BeforeSavingEventArgs : public System::Object
```


| 매개변수 | 설명 |
| --- | --- |
| T | 수정 API 유형입니다. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AbsolutePageNumber](./get_absolutepagenumber/)() const | [XPS](../../aspose.page.xps/) 패키지 내 모든 문서에 걸친 현재 절대 페이지 번호입니다. |
| [get_DocumentNumber](./get_documentnumber/)() const | [XPS](../../aspose.page.xps/) 패키지 내 현재 문서 번호입니다. |
| [get_ElementAPI](./get_elementapi/)() const | 저장될 요소의 수정 API를 가져옵니다. |
| [get_OutputPageNumber](./get_outputpagenumber/)() const | 현재 출력 번호입니다. **PageNumbers** 저장 옵션이 지정된 경우 **AbsolutePageNumber**와 다릅니다. |
| [get_RelativePageNumber](./get_relativepagenumber/)() const | [XPS](../../aspose.page.xps/) 패키지 내 현재 문서에 상대적인 현재 페이지 번호입니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |

## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../)
* Library [Aspose.Page for C++](../../)
