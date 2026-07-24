---
title: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush 메서드"
linktitle: "CreateVisualBrush"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateVisualBrush 메서드. C++에서 새로운 비주얼 브러시를 생성합니다."
type: docs
weight: 2900
url: /ko/cpp/aspose.page.xps/xpsdocument/createvisualbrush/
---
## XpsDocument::CreateVisualBrush method


새로운 비주얼 브러시를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::XpsDocument::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | 다음 [XPS](../../) 요소 (Canvas, Path 또는 Glyphs) 의 Visual 속성을 위한 visual brush. |
| viewbox | System::Drawing::RectangleF | 브러시 소스 콘텐츠의 위치와 차원. |
| viewport | System::Drawing::RectangleF | 프라임 브러시 타일이 적용되는 포함 좌표 공간 내 영역으로, 브러시가 적용되는 영역을 채우기 위해 (가능하면 반복적으로) 적용됩니다. |

### ReturnValue

새 시각적 브러시.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
