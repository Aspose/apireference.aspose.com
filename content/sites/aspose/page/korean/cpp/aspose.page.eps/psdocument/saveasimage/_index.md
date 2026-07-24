---
title: "Aspose::Page::EPS::PsDocument::SaveAsImage 메서드"
linktitle: "SaveAsImage"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::SaveAsImage 메서드. PS/EPS 파일을 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 PS 파일과 동일합니다. 파일 확장자는 \"options\" 매개변수의 이미지 형식에 따라 결정됩니다. 문서가 FileStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 C++에서 기본 파일 이름 템플릿을 사용하여 현재 폴더에 저장됩니다."
type: docs
weight: 4300
url: /ko/cpp/aspose.page.eps/psdocument/saveasimage/
---
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>) method


PS/EPS 파일을 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 PS 파일과 동일합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 맞게 지정됩니다. 문서가 FileStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 현재 폴더에 기본 파일 이름 템플릿으로 저장됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveAsImage(System::SharedPtr\<Device::ImageSaveOptions\>, System::String, System::String) method


PS/EPS 파일을 지정된 디렉터리와 지정된 파일 이름으로 이미지 파일에 저장합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 맞게 지정됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::SaveAsImage(System::SharedPtr<Device::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.eps.device/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
