---
title: "Aspose::Page::XPS::ApsLoadOptions 클래스"
linktitle: "ApsLoadOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::ApsLoadOptions 클래스. C++에서 APS 문서 로드 옵션을 제공합니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.xps/apsloadoptions/
---
## ApsLoadOptions class


APS 문서 로드 옵션입니다.

```cpp
class ApsLoadOptions : public Aspose::Page::XPS::LoadOptions
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ApsLoadOptions](./apsloadoptions/)() | 옵션의 새 인스턴스를 생성합니다. |
| [get_TransparencyThreshold](./get_transparencythreshold/)() const | 0에서 255 사이의 정수 값으로, 이 값보다 낮은 알파 값을 가진 이미지 픽셀은 완전히 투명한 것으로 간주됩니다. PostScript는 투명성을 지원하지 않지만, 컬러 이미지 위에 명시적 마스크를 적용하여 일부 픽셀은 완전히 불투명하고 일부 픽셀은 완전히 투명하게 만들 수 있습니다. 투명도 임계값은 원본과 PostScript 결과물 간의 최상의 유사성을 찾는 데 사용됩니다. 기본값은 255입니다. |
| [set_TransparencyThreshold](./set_transparencythreshold/)(int32_t) | 0에서 255 사이의 정수 값으로, 이 값보다 낮은 알파 값을 가진 이미지 픽셀은 완전히 투명한 것으로 간주됩니다. PostScript는 투명성을 지원하지 않지만, 컬러 이미지 위에 명시적 마스크를 적용하여 일부 픽셀은 완전히 불투명하고 일부 픽셀은 완전히 투명하게 만들 수 있습니다. 투명도 임계값은 원본과 PostScript 결과물 간의 최상의 유사성을 찾는 데 사용됩니다. 기본값은 255입니다. |
## 또 보기

* Class [LoadOptions](../loadoptions/)
* Namespace [Aspose::Page::XPS](../)
* Library [Aspose.Page for C++](../../)
