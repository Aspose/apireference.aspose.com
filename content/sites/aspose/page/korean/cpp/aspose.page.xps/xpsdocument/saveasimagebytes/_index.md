---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes 메서드"
linktitle: "SaveAsImageBytes"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImageBytes 메서드. C++에서 문서를 비트맵 이미지 형식의 바이트 배열로 저장합니다."
type: docs
weight: 5600
url: /ko/cpp/aspose.page.xps/xpsdocument/saveasimagebytes/
---
## XpsDocument::SaveAsImageBytes method


문서를 비트맵 이미지 형식으로 바이트 배열로 저장합니다.

```cpp
System::ArrayPtr<System::ArrayPtr<System::ArrayPtr<uint8_t>>> Aspose::Page::XPS::XpsDocument::SaveAsImageBytes(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 옵션 | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | 비트맵 이미지 형식으로 문서를 저장하기 위한 옵션입니다. |

### ReturnValue

결과 이미지의 바이트 배열입니다. 첫 번째 차원은 내부 문서를 나타내고 두 번째 차원은 내부 문서 내의 페이지를 나타냅니다.

## 또 보기

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
