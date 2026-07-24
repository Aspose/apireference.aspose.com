---
title: "Aspose::Page::Plugins::PsConverterOptions 클래스"
linktitle: "PsConverterOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Plugins::PsConverterOptions 클래스. C++에서 PsConverter 플러그인에 대한 옵션을 나타냅니다."
type: docs
weight: 1200
url: /ko/cpp/aspose.page.plugins/psconverteroptions/
---
## PsConverterOptions class


[PsConverter](../psconverter/) 플러그인에 대한 옵션을 나타냅니다.

```cpp
class PsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                           public Aspose::Page::Plugins::IDataContainer,
                           public Aspose::Page::Plugins::ISaveInstruction
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | 새 데이터 소스를 [PsConverter](../psconverter/) 플러그인 데이터 컬렉션에 추가합니다. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | 새 데이터 소스를 [PsConverterOptions](./) 플러그인 데이터 컬렉션에 추가합니다. |
| [get_AdditionalFontsFolders](./get_additionalfontsfolders/)() const | 컨버터가 입력 문서의 글꼴을 찾을 추가 폴더를 지정합니다. 기본 폴더는 운영 체제가 내부 필요를 위해 글꼴을 찾는 표준 글꼴 폴더입니다. |
| [get_DataCollection](./get_datacollection/)() override | [PsConverterOptions](./) 플러그인 데이터 컬렉션을 반환합니다. |
| virtual [get_Debug](./get_debug/)() | 디버그 정보를 표준 출력 스트림에 출력할지 여부를 지정합니다. |
| virtual [get_Exceptions](./get_exceptions/)() | [SuppressErrors](../)가 true인 경우 억제된 변환 오류 목록을 반환합니다. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality 카테고리는 이미지 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아져 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를, 100 값은 가장 높은 품질의 이미지를 생성합니다. |
| virtual [get_OperationName](./get_operationname/)() | 작업 이름을 반환합니다. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | 저장 작업 결과를 위한 추가된 대상들의 컬렉션을 가져옵니다. |
| [get_SupressErrors](./get_supresserrors/)() const | 오류를 억제할지 여부를 지정합니다. true인 경우 억제된 오류가 [Exceptions](../) 목록에 추가됩니다. false인 경우 첫 번째 오류가 프로그램을 종료합니다. |
| [set_AdditionalFontsFolders](./set_additionalfontsfolders/)(System::ArrayPtr\<System::String\>) | 컨버터가 입력 문서의 글꼴을 찾을 추가 폴더를 지정합니다. 기본 폴더는 운영 체제가 내부 필요를 위해 글꼴을 찾는 표준 글꼴 폴더입니다. |
| virtual [set_Debug](./set_debug/)(bool) | 디버그 정보를 표준 출력 스트림에 출력할지 여부를 지정합니다. |
| virtual [set_Exceptions](./set_exceptions/)(System::SharedPtr\<System::Collections::Generic::IList\<System::Exception\>\>) | [SuppressErrors](../)가 true인 경우 억제된 변환 오류 목록을 반환합니다. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality 카테고리는 이미지 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아져 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를, 100 값은 가장 높은 품질의 이미지를 생성합니다. |
| [set_SupressErrors](./set_supresserrors/)(bool) | 오류를 억제할지 여부를 지정합니다. true인 경우 억제된 오류가 [Exceptions](../) 목록에 추가됩니다. false인 경우 첫 번째 오류가 프로그램을 종료합니다. |
## 또 보기

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
