---
title: "Aspose::Page::EPS::PsDocument::CropEps 메서드"
linktitle: "CropEps"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::CropEps 메서드. 지정된 PsDocument를 EPS 파일로 자릅니다. 기존 %BoundingBox를 업데이트하거나 새로 생성된 %BoundingBox와 함께 초기 EPS 파일을 C++에서 저장합니다."
type: docs
weight: 900
url: /ko/cpp/aspose.page.eps/psdocument/cropeps/
---
## PsDocument::CropEps(System::SharedPtr\<System::IO::Stream\>, System::ArrayPtr\<float\>) method


주어진 [PsDocument](../)를 [EPS](../../) 파일로 자릅니다. 초기 [EPS](../../) 파일을 업데이트된 기존 %BoundingBox와 함께 저장하거나 새로 생성합니다.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::SharedPtr<System::IO::Stream> epsStream, System::ArrayPtr<float> cropBox)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 출력 [EPS](../../) 파일의 스트림. |
| cropBox | System::ArrayPtr\<float\> | 잘라내기 박스 (x0, y0, x, y). |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::CropEps(System::String, System::ArrayPtr\<float\>) method


주어진 [PsDocument](../)를 [EPS](../../) 파일로 자릅니다. 초기 [EPS](../../) 파일을 업데이트된 기존 %BoundingBox와 함께 저장하거나 새로 생성합니다.

```cpp
void Aspose::Page::EPS::PsDocument::CropEps(System::String outEpsFilePath, System::ArrayPtr<float> cropBox)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outEpsFilePath | System::String | 출력 [EPS](../../) 파일 경로. |
| cropBox | System::ArrayPtr\<float\> | 잘라내기 박스 (x0, y0, x, y). |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
