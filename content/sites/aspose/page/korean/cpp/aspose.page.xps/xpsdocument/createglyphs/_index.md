---
title: "Aspose::Page::XPS::XpsDocument::CreateGlyphs 메서드"
linktitle: "CreateGlyphs"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateGlyphs 메서드. C++에서 새로운 글리프를 생성합니다."
type: docs
weight: 1400
url: /ko/cpp/aspose.page.xps/xpsdocument/createglyphs/
---
## XpsDocument::CreateGlyphs(System::SharedPtr\<XpsModel::XpsFont\>, float, float, float, System::String) method


새 글리프를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::CreateGlyphs(System::SharedPtr<XpsModel::XpsFont> font, float fontRenderingEmSize, float originX, float originY, System::String unicodeString)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| font | System::SharedPtr\<XpsModel::XpsFont\> | [Font](../../../aspose.page.font/) 리소스. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) 크기. |
| originX | float | Glyphs 원점 X 좌표. |
| originY | float | Glyphs 원점 Y 좌표. |
| unicodeString | System::String | 출력할 문자열. |

### ReturnValue

새로운 글리프.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [XpsFont](../../../aspose.page.xps.xpsmodel/xpsfont/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateGlyphs(System::String, float, System::Drawing::FontStyle, float, float, System::String) method


새 글리프를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsGlyphs> Aspose::Page::XPS::XpsDocument::CreateGlyphs(System::String fontFamily, float fontRenderingEmSize, System::Drawing::FontStyle fontStyle, float originX, float originY, System::String unicodeString)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| fontFamily | System::String | [Font](../../../aspose.page.font/) 패밀리. |
| fontRenderingEmSize | float | [Font](../../../aspose.page.font/) 크기. |
| fontStyle | System::Drawing::FontStyle | [Font](../../../aspose.page.font/) 스타일. |
| originX | float | Glyphs 원점 X 좌표. |
| originY | float | Glyphs 원점 Y 좌표. |
| unicodeString | System::String | 출력할 문자열. |

### ReturnValue

새로운 글리프.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsGlyphs](../../../aspose.page.xps.xpsmodel/xpsglyphs/)
* Class [String](../../../system/string/)
* Enum [FontStyle](../../../system.drawing/fontstyle/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
