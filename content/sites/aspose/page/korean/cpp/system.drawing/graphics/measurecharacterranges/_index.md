---
title: "System::Drawing::Graphics::MeasureCharacterRanges 메서드"
linktitle: "MeasureCharacterRanges"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Graphics::MeasureCharacterRanges 메서드. C++에서 지정된 문자열의 문자 위치를 경계하는 각 영역의 배열을 반환합니다."
type: docs
weight: 6400
url: /ko/cpp/system.drawing/graphics/measurecharacterranges/
---
## Graphics::MeasureCharacterRanges method


지정된 문자열에서 문자 위치를 둘러싼 각 영역의 배열을 반환합니다.

```cpp
ArrayPtr<SharedPtr<Region>> System::Drawing::Graphics::MeasureCharacterRanges(const System::String &text, const SharedPtr<Font> &font, RectangleF layoutRect, const SharedPtr<StringFormat> &stringFormat)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| text | const System::String\& | 측정할 문자열 |
| font | const SharedPtr\<Font\>\& | 문자열 측정에 사용되는 폰트 |
| layoutRect | RectangleF | 문자열 측정에 사용되는 레이아웃 사각형 |
| stringFormat | const SharedPtr\<StringFormat\>\& | 문자열 형식, 측정할 문자 범위를 포함합니다. |

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Region](../../region/)
* Class [String](../../../system/string/)
* Class [Font](../../font/)
* Class [RectangleF](../../rectanglef/)
* Class [StringFormat](../../stringformat/)
* Class [Graphics](../)
* Namespace [System::Drawing](../../)
* Library [Aspose.Page for C++](../../../)
