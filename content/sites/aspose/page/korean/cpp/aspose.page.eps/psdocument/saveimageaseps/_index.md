---
title: "Aspose::Page::EPS::PsDocument::SaveImageAsEps 메서드"
linktitle: "SaveImageAsEps"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::SaveImageAsEps 메서드. C++에서 Bitmap 객체를 EPS 출력 스트림에 저장합니다."
type: docs
weight: 5800
url: /ko/cpp/aspose.page.eps/psdocument/saveimageaseps/
---
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


Bitmap 객체를 [EPS](../../) 출력 스트림에 저장합니다.

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 이미지 | System::SharedPtr\<System::Drawing::Bitmap\> | 이미지. |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) 출력 스트림. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::Drawing::Bitmap\>, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


Bitmap 객체를 [EPS](../../) 파일에 저장합니다.

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::Drawing::Bitmap> image, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 이미지 | System::SharedPtr\<System::Drawing::Bitmap\> | 이미지. |
| epsFilePath | System::String | [EPS](../../) 파일 경로. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Bitmap](../../../system.drawing/bitmap/)
* Class [String](../../../system/string/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) method


입력 스트림에서 PNG/JPEG/TIFF/BMP/GIF/EMF 이미지를 [EPS](../../) 출력 스트림으로 저장합니다.

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::SharedPtr<System::IO::Stream> imageStream, System::SharedPtr<System::IO::Stream> epsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| imageStream | System::SharedPtr\<System::IO::Stream\> | 이미지 입력 스트림. |
| epsStream | System::SharedPtr\<System::IO::Stream\> | [EPS](../../) 출력 스트림. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::SaveImageAsEps(System::String, System::String, System::SharedPtr\<Device::PsSaveOptions\>) method


파일에서 PNG/JPEG/TIFF/BMP/GIF/EMF 이미지를 [EPS](../../) 파일로 저장합니다.

```cpp
static void Aspose::Page::EPS::PsDocument::SaveImageAsEps(System::String imageFilePath, System::String epsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| imageFilePath | System::String | 이미지 파일 경로. |
| epsFilePath | System::String | [EPS](../../) 파일 경로. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | 변환 중 발생한 오류의 출력을 지정하는 매개변수를 포함합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
