---
title: "Aspose::Page::XPS::XpsDocument::InsertGlyphs 메서드"
linktitle: "InsertGlyphs"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::InsertGlyphs 메서드. C++에서 인덱스 위치에 새로운 글리프를 활성 페이지에 삽입합니다."
type: docs
weight: 4400
url: /ko/cpp/aspose.page.xps/xpsdocument/insertglyphs/
---
## XpsDocument::InsertGlyphs(int32_t, System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


*index* 위치에 활성 페이지에 새 glyphs를 삽입합니다.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::SharedPtr<XpsModel::XpsFont> font, float fontSize, float originX, float originY, System::String unicodeString)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 새 글리프를 삽입해야 하는 위치. |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) 리소스. |
| fontSize | float | [Font](../../../aspose.page.font/) 크기. |
| originX | float | Glyphs 원점 X 좌표. |
| originY | float | Glyphs 원점 Y 좌표. |
| unicodeString | System::String | 출력할 문자열. |

### ReturnValue

삽입된 글리프.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::InsertGlyphs(int32_t, System::String, float, System::Drawing::FontStyle, float, float, System::String) method


*index* 위치에 활성 페이지에 새 glyphs를 삽입합니다.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::InsertGlyphs(int32_t index, System::String fontFamily, float fontSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| index | int32_t | 새 글리프를 삽입해야 하는 위치. |
| fontFamily | System::String | [Font](../../../aspose.page.font/) 패밀리. |
| fontSize | float | [Font](../../../aspose.page.font/) 크기. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 스타일. |
| originX | float | Glyphs 원점 X 좌표. |
| originY | float | Glyphs 원점 Y 좌표. |
| unicodeString | System::String | 출력할 문자열. |

### ReturnValue

삽입된 글리프.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
