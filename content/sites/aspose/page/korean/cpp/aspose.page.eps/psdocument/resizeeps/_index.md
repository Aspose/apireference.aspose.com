---
title: "Aspose::Page::EPS::PsDocument::ResizeEps 메서드"
linktitle: "ResizeEps"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ResizeEps 메서드. 주어진 PsDocument를 EPS 파일로 크기 조정합니다. 이 메서드는 EPS 크기를 추출한 후에만 사용됩니다. 기존 %BoundingBox를 업데이트하거나 새로 생성하여 초기 EPS 파일을 저장합니다. 페이지 변환 매트릭스도 C++에서 설정됩니다."
type: docs
weight: 4000
url: /ko/cpp/aspose.page.eps/psdocument/resizeeps/
---
## PsDocument::ResizeEps(System::SharedPtr\<System::IO::Stream\>, System::Drawing::SizeF, Units) method


주어진 [PsDocument](../)을 [EPS](../../) 파일로 크기 조정합니다. 이 메서드는 [EPS](../../) 크기를 추출한 후에만 사용됩니다. 기존 %BoundingBox를 업데이트한 초기 [EPS](../../) 파일을 저장하거나 새 파일이 생성됩니다. 또한 [Page](../../../aspose.page/) 변환 행렬이 설정됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::SharedPtr<System::IO::Stream> epsStream, System::Drawing::SizeF newSizeInUnits, Units units)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 출력 [EPS](../../) 파일의 스트림. |
| newSizeInUnits | System::Drawing::SizeF | 지정된 단위로 표시된 [EPS](../../) 이미지의 새 크기. |
| 단위 | 단위 | 새 크기의 단위입니다. 포인트, 인치, 밀리미터, 센티미터 및 초기 크기의 백분율이 될 수 있습니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::ResizeEps(System::String, System::Drawing::SizeF, Units) method


주어진 [PsDocument](../)을 [EPS](../../) 파일로 크기 조정합니다. 이 메서드는 [EPS](../../) 크기를 추출한 후에만 사용됩니다. 초기 [EPS](../../) filD:\ASPOSE.GIT\aspose.pdf.cpp\cs_porter_produce\Aspose.Page.Cpp.Page.Cpp\eps\src_eps\PsDocument.hThe output directory where image file will be saved.e를 업데이트된 기존 %BoundingBox와 함께 저장하거나 새 파일이 생성됩니다. 또한 [Page](../../../aspose.page/) 변환 행렬이 설정됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::ResizeEps(System::String outEpsFilePath, System::Drawing::SizeF newSizeInUnits, Units units)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outEpsFilePath | System::String | 출력 [EPS](../../) 파일 경로. |
| newSizeInUnits | System::Drawing::SizeF | 지정된 단위로 표시된 [EPS](../../) 이미지의 새 크기. |
| 단위 | 단위 | 새 크기의 단위입니다. 포인트, 인치, 밀리미터, 센티미터 및 초기 크기의 백분율이 될 수 있습니다. |

## 또 보기

* Class [String](../../../system/string/)
* Class [SizeF](../../../system.drawing/sizef/)
* Enum [Units](../../../aspose.page/units/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
