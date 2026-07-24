---
title: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs 메서드"
linktitle: "InsertGlyphs"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs 메서드. 이 캔버스의 자식 목록에 새 글리프를 인덱스 위치에 삽입합니다 C++에서."
type: docs
weight: 900
url: /ko/cpp/aspose.page.xps.xpsmodel/xpscanvas/insertglyphs/
---
## XpsCanvas::InsertGlyphs method


이 캔버스의 자식 목록에 *index* 위치에 새 글리프를 삽입합니다.

```cpp
System::SharedPtr<XpsGlyphs> Aspose::Page::XPS::XpsModel::XpsCanvas::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 새 글리프를 삽입해야 하는 위치. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) 패밀리. |
| fontSize | float | [Font](../../../aspose.page.font/) 크기. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 스타일. |
| originX | float | Glyphs 원점 X 좌표. |
| originY | float | 글리프 원점 T 좌표. |
| unicodeString | System::String | 출력할 문자열. |

### ReturnValue

추가된 글리프.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsCanvas](../)
* Namespace [Aspose::Page::XPS::XpsModel](../../)
* Library [Aspose.Page for C++](../../../)
