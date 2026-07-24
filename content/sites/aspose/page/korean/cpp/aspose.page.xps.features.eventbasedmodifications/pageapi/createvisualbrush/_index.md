---
title: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method"
linktitle: "CreateVisualBrush"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush method. C++에서 새로운 비주얼 브러시를 생성합니다."
type: docs
weight: 2200
url: /ko/cpp/aspose.page.xps.features.eventbasedmodifications/pageapi/createvisualbrush/
---
## PageAPI::CreateVisualBrush method


새로운 비주얼 브러시를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsVisualBrush> Aspose::Page::XPS::Features::EventBasedModifications::PageAPI::CreateVisualBrush(System::SharedPtr<XpsModel::XpsContentElement> element, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| element | System::SharedPtr\<XpsModel::XpsContentElement\> | Visual 속성의 비주얼 브러시용 [XPS](../../../aspose.page.xps/) 요소(캔버스, 경로 또는 글리프). |
| viewbox | System::Drawing::RectangleF | 브러시 소스 콘텐츠의 위치와 차원. |
| viewport | System::Drawing::RectangleF | 프라임 브러시 타일이 적용되는 포함 좌표 공간 내 영역으로, 브러시가 적용되는 영역을 채우기 위해 (가능하면 반복적으로) 적용됩니다. |

### ReturnValue

새 시각적 브러시.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsVisualBrush](../../../aspose.page.xps.xpsmodel/xpsvisualbrush/)
* Class [XpsContentElement](../../../aspose.page.xps.xpsmodel/xpscontentelement/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [PageAPI](../)
* Namespace [Aspose::Page::XPS::Features::EventBasedModifications](../../)
* Library [Aspose.Page for C++](../../../)
