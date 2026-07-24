---
title: "Aspose::Page::SaveOptions 클래스"
linktitle: "SaveOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::SaveOptions 클래스. 이 클래스는 C++에서 변환 프로세스를 관리하는 데 필요한 옵션을 포함합니다."
type: docs
weight: 1500
url: /ko/cpp/aspose.page/saveoptions/
---
## SaveOptions class


이 클래스는 변환 프로세스를 관리하는 데 필요한 옵션을 포함합니다.

```cpp
class SaveOptions : public virtual System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | 컨버터가 입력 문서의 글꼴을 찾을 추가 폴더를 지정합니다. 기본 폴더는 운영 체제가 내부 필요를 위해 글꼴을 찾는 표준 글꼴 폴더입니다. |
| virtual [get_ConvertFontsToTTF](./get_convertfontstottf/)() | 비 TrueType 글꼴을 TTF로 저장할지 여부를 지정합니다. 이는 PS를 PDF로 변환할 때 결과 문서의 용량을 크게 줄이고, 비 TrueType 글꼴이 많이 포함된 PS 파일을 모든 출력 형식으로 변환하는 속도를 높입니다. 그러나 PostSctipt 파일을 이미지로 변환할 때 텍스트가 약간 수직으로 이동합니다. |
| virtual [get_Debug](./get_debug/)() | 디버그 정보를 표준 출력 스트림에 출력할지 여부를 지정합니다. |
| virtual [get_Exceptions](./get_exceptions/)() | [SuppressErrors](../)가 true인 경우 억제된 변환 오류 목록을 반환합니다. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality 카테고리는 이미지 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아져 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를, 100 값은 가장 높은 품질의 이미지를 생성합니다. |
| [get_Size](./get_size/)() const | 이미지의 크기를 가져오거나 설정합니다. |
| virtual [get_SupressErrors](./get_supresserrors/)() | 오류를 억제할지 여부를 지정합니다. true인 경우 억제된 오류가 [Exceptions](../) 목록에 추가됩니다. false인 경우 첫 번째 오류가 프로그램을 종료합니다. |
| [SaveOptions](./saveoptions/)() | 기본값으로 플래그 [SuppressErrors](../) (true) 및 [Debug](../) (false)를 설정한 새로운 [SaveOptions](./) 클래스 인스턴스를 초기화합니다. |
| [SaveOptions](./saveoptions/)(bool) | 플래그 [Debug](../) (false)의 기본값으로 새로운 [SaveOptions](./) 클래스 인스턴스를 초기화합니다. |
| [SaveOptions](./saveoptions/)(Aspose::Page::Drawing::Size) | 페이지 크기가 지정된 새로운 [SaveOptions](./) 인스턴스를 초기화합니다. |
| [SaveOptions](./saveoptions/)(bool, Aspose::Page::Drawing::Size) | 플래그 [Debug](../) (false)의 기본값과 페이지 크기가 지정된 새로운 [SaveOptions](./) 클래스 인스턴스를 초기화합니다. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | 컨버터가 입력 문서의 글꼴을 찾을 추가 폴더를 지정합니다. 기본 폴더는 운영 체제가 내부 필요를 위해 글꼴을 찾는 표준 글꼴 폴더입니다. |
| virtual [set_ConvertFontsToTTF](./set_convertfontstottf/)(bool) | 비 TrueType 글꼴을 TTF로 저장할지 여부를 지정합니다. 이는 PS를 PDF로 변환할 때 결과 문서의 용량을 크게 줄이고, 비 TrueType 글꼴이 많이 포함된 PS 파일을 모든 출력 형식으로 변환하는 속도를 높입니다. 그러나 PostSctipt 파일을 이미지로 변환할 때 텍스트가 약간 수직으로 이동합니다. |
| virtual [set_Debug](./set_debug/)(bool) | 디버그 정보를 표준 출력 스트림에 출력할지 여부를 지정합니다. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality 카테고리는 이미지 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아져 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를, 100 값은 가장 높은 품질의 이미지를 생성합니다. |
| [set_Size](./set_size/)(Aspose::Page::Drawing::Size) | 이미지의 크기를 가져오거나 설정합니다. |
| virtual [set_SupressErrors](./set_supresserrors/)(bool) | 오류를 억제할지 여부를 지정합니다. true인 경우 억제된 오류가 [Exceptions](../) 목록에 추가됩니다. false인 경우 첫 번째 오류가 프로그램을 종료합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
