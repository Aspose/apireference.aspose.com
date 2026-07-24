---
title: "Aspose::Page::IMultiPageDevice 클래스"
linktitle: "IMultiPageDevice"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::IMultiPageDevice 클래스. 이 인터페이스는 C++에서 다중 페이지 장치를 조작하는 메서드를 포함합니다."
type: docs
weight: 800
url: /ko/cpp/aspose.page/imultipagedevice/
---
## IMultiPageDevice class


이 인터페이스는 다중 페이지 장치를 조작하는 메서드를 포함합니다.

```cpp
class IMultiPageDevice : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [ClosePage](./closepage/)() | 페이지가 렌더링된 후 장치에 필요한 준비를 수행합니다. |
| virtual [get_CurrentPageNumber](./get_currentpagenumber/)() | 현재 페이지 번호. |
| virtual [InitPageNumbers](./initpagenumbers/)() | 출력할 페이지 수를 초기화합니다. |
| virtual [OpenPage](./openpage/)(System::String) | 페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다. |
| virtual [OpenPage](./openpage/)(float, float) | 각 페이지 렌더링 전에 디바이스에 필요한 준비를 수행합니다. |
| virtual [UpdatePageParameters](./updatepageparameters/)(System::SharedPtr\<IMultiPageDevice\>) | 다른 다중 페이지 디바이스에서 페이지 매개변수를 업데이트합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
