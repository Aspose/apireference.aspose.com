---
title: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions class"
linktitle: "IXpsTextConversionOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Presentation::IXpsTextConversionOptions 클래스. C++에서 XPS를 다른 형식으로 변환하기 위한 옵션을 정의합니다."
type: docs
weight: 300
url: /ko/cpp/aspose.page.xps.presentation/ixpstextconversionoptions/
---
## IXpsTextConversionOptions class


[XPS](../../aspose.page.xps/)를 다른 형식으로 변환하기 위한 옵션을 정의합니다.

```cpp
class IXpsTextConversionOptions : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [get_PreserveText](./get_preservetext/)() | [XPS](../../aspose.page.xps/)에서 일부 텍스트 요소는 글꼴의 문자 코드와 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. 이 플래그가 true로 설정되면 해당 [XPS](../../aspose.page.xps/) 요소의 텍스트가 그래픽 형태로 변환됩니다. 그러면 텍스트 자체가 위에 투명하게 표시됩니다. 이렇게 하면 해당 요소의 텍스트를 선택할 수 있게 됩니다. 그러나 부작용으로 출력 파일이 원본보다 훨씬 커질 수 있습니다. 이 플래그가 false로 설정되면 대체 형태로 표시되어야 할 문자가 다른 문자로 교체되어 대체 글리프 형태에 매핑됩니다. 따라서 텍스트는 여전히 선택 가능하지만 수정되어 읽기 어려워질 가능성이 있습니다. |
| virtual [set_PreserveText](./set_preservetext/)(bool) | [XPS](../../aspose.page.xps/)에서 일부 텍스트 요소는 글꼴의 문자 코드와 일치하지 않는 대체 글리프 형태에 대한 참조를 포함할 수 있습니다. 이 플래그가 true로 설정되면 해당 [XPS](../../aspose.page.xps/) 요소의 텍스트가 그래픽 형태로 변환됩니다. 그러면 텍스트 자체가 위에 투명하게 표시됩니다. 이렇게 하면 해당 요소의 텍스트를 선택할 수 있게 됩니다. 그러나 부작용으로 출력 파일이 원본보다 훨씬 커질 수 있습니다. 이 플래그가 false로 설정되면 대체 형태로 표시되어야 할 문자가 다른 문자로 교체되어 대체 글리프 형태에 매핑됩니다. 따라서 텍스트는 여전히 선택 가능하지만 수정되어 읽기 어려워질 가능성이 있습니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page::XPS::Presentation](../)
* Library [Aspose.Page for C++](../../)
