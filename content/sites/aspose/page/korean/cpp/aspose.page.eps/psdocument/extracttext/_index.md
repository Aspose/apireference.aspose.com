---
title: "Aspose::Page::EPS::PsDocument::ExtractText 메서드"
linktitle: "ExtractText"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::EPS::PsDocument::ExtractText 메서드. PS 파일에서 텍스트를 추출합니다. 텍스트는 Type 42 (TrueType) 폰트로 작성되었거나, Vector Map에 Type 42 폰트가 포함된 Type 0 폰트로 작성된 경우에만 추출할 수 있습니다 C++에서."
type: docs
weight: 2300
url: /ko/cpp/aspose.page.eps/psdocument/extracttext/
---
## PsDocument::ExtractText method


PS 파일에서 텍스트를 추출합니다. 텍스트는 Type 42 (**TrueType**) 폰트로 작성되었거나 Vector Map에 Type 42 폰트가 포함된 Type 0 폰트인 경우에만 추출할 수 있습니다.

```cpp
System::String Aspose::Page::EPS::PsDocument::ExtractText(System::SharedPtr<SaveOptions> options, int32_t startPage=0, int32_t endPage=0)
```


| 매개변수 | 형식 | 설명 |
| --- | --- | --- |
| 옵션 | System::SharedPtr\<SaveOptions\> | 저장 옵션. |
| startPage | int32_t | 텍스트 추출을 시작할 페이지입니다. 이 매개변수는 다중 페이지 문서에 유용합니다. |
| endPage | int32_t | 텍스트 추출을 마칠 페이지입니다. 이 매개변수는 다중 페이지 문서에 유용합니다. |

### ReturnValue

추출된 텍스트.

## 또 보기

* Class [String](../../../system/string/)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [SaveOptions](../../../aspose.page/saveoptions/)
* Class [PsDocument](../)
* Namespace [Aspose::Page::EPS](../../)
* Library [Aspose.Page for C++](../../../)
