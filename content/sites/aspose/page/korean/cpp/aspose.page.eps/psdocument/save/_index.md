---
title: "Aspose::Page::EPS::PsDocument::Save 메서드"
linktitle: "Save"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::Save 메서드. 지정된 PsDocument를 PS 또는 EPS 파일로 저장합니다. 이 메서드는 PsDocument가 C++에서 처음부터 생성된 경우에만 사용됩니다."
type: docs
weight: 4200
url: /ko/cpp/aspose.page.eps/psdocument/save/
---
## PsDocument::Save() method


주어진 [PsDocument](../)를 PS 또는 [EPS](../../) 파일로 저장합니다. 이 메서드는 [PsDocument](../)가 처음부터 생성된 경우에만 사용됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::Save()
```

## 또 보기

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::SharedPtr\<System::IO::Stream\>) method


주어진 [PsDocument](../)를 스트림에 저장합니다. 이 메서드는 [XMP](../../../aspose.page.eps.xmp/) 메타데이터를 업데이트한 후에만 사용됩니다. 업데이트된 기존 메타데이터 또는 GetMetadata 메서드를 호출하면서 생성된 새 메타데이터와 함께 초기 [EPS](../../) 파일을 저장합니다. 마지막 경우에는 필요한 모든 PostScript 코드와 [EPS](../../) 주석이 추가됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::SharedPtr<System::IO::Stream> epsStream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| epsStream | System::SharedPtr\<System::IO::Stream\> | 출력 [EPS](../../) 파일의 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::Save(System::String) method


주어진 [PsDocument](../)를 [EPS](../../) 파일로 저장합니다. 이 메서드는 [XMP](../../../aspose.page.eps.xmp/) 메타데이터를 업데이트한 후에만 사용됩니다. 업데이트된 기존 메타데이터 또는 GetMetadata 메서드를 호출하면서 생성된 새 메타데이터와 함께 초기 [EPS](../../) 파일을 저장합니다. 마지막 경우에는 필요한 모든 PostScript 코드와 [EPS](../../) 주석이 추가됩니다.

```cpp
void Aspose::Page::EPS::PsDocument::Save(System::String outEpsFilePath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outEpsFilePath | System::String | 출력 [EPS](../../) 파일 경로. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
