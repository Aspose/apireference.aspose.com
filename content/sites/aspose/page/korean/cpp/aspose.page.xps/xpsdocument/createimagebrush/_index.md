---
title: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method"
linktitle: "CreateImageBrush"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::CreateImageBrush method. C++에서 새로운 이미지 브러시를 생성합니다."
type: docs
weight: 1800
url: /ko/cpp/aspose.page.xps/xpsdocument/createimagebrush/
---
## XpsDocument::CreateImageBrush(System::SharedPtr\<XpsModel::XpsImage\>, System::Drawing::RectangleF, System::Drawing::RectangleF) method


새로운 이미지 브러시를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::SharedPtr<XpsModel::XpsImage> image, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 이미지 | System::SharedPtr\\<XpsModel::XpsImage\\> | 이미지 리소스입니다. |
| viewbox | System::Drawing::RectangleF | 브러시 소스 콘텐츠의 위치와 차원. |
| viewport | System::Drawing::RectangleF | 프라임 브러시 타일이 적용되는 포함 좌표 공간 내 영역으로, 브러시가 적용되는 영역을 채우기 위해 (가능하면 반복적으로) 적용됩니다. |

### ReturnValue

새 이미지 브러시입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [XpsImage](../../../aspose.page.xps.xpsmodel/xpsimage/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::CreateImageBrush(System::String, System::Drawing::RectangleF, System::Drawing::RectangleF) method


새로운 이미지 브러시를 생성합니다.

```cpp
System::SharedPtr<XpsModel::XpsImageBrush> Aspose::Page::XPS::XpsDocument::CreateImageBrush(System::String imagePath, System::Drawing::RectangleF viewbox, System::Drawing::RectangleF viewport)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| imagePath | System::String | 브러시 타일로 사용할 이미지의 경로입니다. |
| viewbox | System::Drawing::RectangleF | 브러시 소스 콘텐츠의 위치와 차원. |
| viewport | System::Drawing::RectangleF | 프라임 브러시 타일이 적용되는 포함 좌표 공간 내 영역으로, 브러시가 적용되는 영역을 채우기 위해 (가능하면 반복적으로) 적용됩니다. |

### ReturnValue

새 이미지 브러시입니다.

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [XpsImageBrush](../../../aspose.page.xps.xpsmodel/xpsimagebrush/)
* Class [String](../../../system/string/)
* Class [RectangleF](../../../system.drawing/rectanglef/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
