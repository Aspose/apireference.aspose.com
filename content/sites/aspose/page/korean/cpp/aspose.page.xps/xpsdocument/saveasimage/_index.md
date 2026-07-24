---
title: "Aspose::Page::XPS::XpsDocument::SaveAsImage 메서드"
linktitle: "SaveAsImage"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsDocument::SaveAsImage 메서드. 문서를 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 XPS 파일과 동일합니다. 파일 확장자는 \"options\" 매개변수의 이미지 형식에 해당합니다. 문서가 FileStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 C++에서 기본 파일 이름 템플릿을 사용하여 현재 폴더에 저장됩니다."
type: docs
weight: 5500
url: /ko/cpp/aspose.page.xps/xpsdocument/saveasimage/
---
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>) method


문서를 이미지 파일로 저장합니다. 출력 디렉터리와 파일 이름은 입력 [XPS](../../) 파일과 동일합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 대응합니다. 문서가 FileStream이 아닌 스트림으로 초기화된 경우, 이미지 파일은 현재 폴더에 기본 파일 이름 템플릿으로 저장됩니다.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 옵션 | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | 비트맵 이미지 형식으로 문서를 저장하기 위한 옵션입니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
## XpsDocument::SaveAsImage(System::SharedPtr\<Presentation::Image::ImageSaveOptions\>, System::String, System::String) method


문서를 지정된 디렉터리와 지정된 파일 이름으로 이미지 파일에 저장합니다. 파일 확장자는 "options" 매개변수의 이미지 형식에 따라 결정됩니다.

```cpp
void Aspose::Page::XPS::XpsDocument::SaveAsImage(System::SharedPtr<Presentation::Image::ImageSaveOptions> options, System::String outDir, System::String fileNameTemplate)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 옵션 | System::SharedPtr\<Presentation::Image::ImageSaveOptions\> | 비트맵 이미지 형식으로 문서를 저장하기 위한 옵션입니다. |
| outDir | System::String | 이미지 파일이 저장될 출력 디렉터리입니다. |
| fileNameTemplate | System::String | 이미지(확장자 제외)의 파일 이름 템플릿입니다. 입력 [XPS](../../) 파일이 1페이지인 경우 파일 이름과 정확히 동일하고, 그렇지 않은 경우 "_[n]" 형태가 되며, 여기서 "n"은 0부터 시작하는 페이지 번호입니다. 이 접미사가 파일 이름에 추가됩니다. 파일 확장자는 "option" 매개변수의 이미지 형식에 대응합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [ImageSaveOptions](../../../aspose.page.xps.presentation.image/imagesaveoptions/)
* Class [String](../../../system/string/)
* Class [XpsDocument](../)
* Namespace [Aspose::Page::XPS](../../)
* Library [Aspose.Page for C++](../../../)
