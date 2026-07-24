---
title: "Aspose::Page::EPS::PsDocument::PsDocument constructor"
linktitle: "PsDocument"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::PsDocument constructor. 빈 PsDocument를 초기화합니다. 이 생성자는 PostScript 파일과 관련되지 않은 추가 작업, 예를 들어 C++에서 폰트를 변환하는 경우에만 사용됩니다."
type: docs
weight: 100
url: /ko/cpp/aspose.page.eps/psdocument/psdocument/
---
## PsDocument::PsDocument() constructor


빈 [PsDocument](../)을 초기화합니다. 이 생성자는 PostScript 파일과 관련되지 않은 추가 작업, 예를 들어 폰트를 변환하는 경우에만 사용됩니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument()
```

## 또 보기

* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>) constructor


PS/EPS 파일 스트림으로 [PsDocument](../)를 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> inPsStream)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| inPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS 파일의 입력 스트림. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>) constructor


초기화된 페이지와 함께 빈 [PsDocument](../)를 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS 파일을 저장할 스트림. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | PostScript 파일 저장을 제어하는 매개변수 집합. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


빈 [PsDocument](../)을 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS 파일을 저장할 스트림. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | PostScript 파일 저장을 제어하는 매개변수 집합. |
| multipaged | bool | false이면 페이지가 초기화되지 않습니다. 이 경우 페이지 초기화는 명시적인 "openPage(width, height)" 호출을 통해 수행되어야 합니다. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::SharedPtr\<System::IO::Stream\>, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


미리 [Postscript](../../../aspose.page.eps.postscript/) 문서 페이지 수가 알려진 경우 빈 [PsDocument](../)을 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::SharedPtr<System::IO::Stream> outPsStream, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outPsStream | System::SharedPtr\<System::IO::Stream\> | PS/EPS 파일을 저장할 스트림. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | PostScript 파일 저장을 제어하는 매개변수 집합. |
| numberOfPages | int32_t | PostScript 문서의 페이지 수. |

## 또 보기

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../../system.io/stream/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>) constructor


초기화된 페이지와 함께 빈 [PsDocument](../)를 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outPsFilePath | System::String | 출력 PS/EPS 파일 경로. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | PostScript 파일 저장을 제어하는 매개변수 집합. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, bool) constructor


빈 [PsDocument](../)을 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, bool multipaged)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outPsFilePath | System::String | 출력 PS/EPS 파일 경로. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | PostScript 파일 저장을 제어하는 매개변수 집합. |
| multipaged | bool | false이면 페이지가 초기화되지 않습니다. 이 경우 페이지 초기화는 명시적인 "openPage(width, height)" 호출을 통해 수행되어야 합니다. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String, System::SharedPtr\<Device::PsSaveOptions\>, int32_t) constructor


미리 [Postscript](../../../aspose.page.eps.postscript/) 문서 페이지 수가 알려진 경우 빈 [PsDocument](../)을 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String outPsFilePath, System::SharedPtr<Device::PsSaveOptions> options, int32_t numberOfPages)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| outPsFilePath | System::String | 출력 PS/EPS 파일 경로. |
| 옵션 | System::SharedPtr\<Device::PsSaveOptions\> | PostScript 파일 저장을 제어하는 매개변수 집합. |
| numberOfPages | int32_t | PostScript 문서의 페이지 수. |

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [PsSaveOptions](../../../aspose.page.eps.device/pssaveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
## PsDocument::PsDocument(System::String) constructor


입력 PS/EPS 파일로 [PsDocument](../)을 초기화합니다.

```cpp
Aspose::Page::EPS::PsDocument::PsDocument(System::String psFilePath)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| psFilePath | System::String | PS/EPS 파일 경로. |

## 또 보기

* Class [String](../../../system/string/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
