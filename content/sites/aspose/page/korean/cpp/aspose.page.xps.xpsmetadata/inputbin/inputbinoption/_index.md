---
title: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption class"
linktitle: "InputBinOption"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::XPS::XpsMetadata::InputBin::InputBinOption 클래스. C++에서 JobInputBin, DocumentInputBin 및 PageInputBin 기능 옵션을 설명합니다."
type: docs
weight: 700
url: /ko/cpp/aspose.page.xps.xpsmetadata/inputbin/inputbinoption/
---
## InputBinOption class


[JobInputBin](../../jobinputbin/), [DocumentInputBin](../../documentinputbin/) 및 [PageInputBin](../../pageinputbin/) 기능 옵션을 설명합니다.

```cpp
class InputBinOption : public Aspose::Page::XPS::XpsMetadata::Option,
                       public Aspose::Page::XPS::XpsMetadata::InputBin::IInputBinItem
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | 옵션에 [IInputBinOptionItem](../iinputbinoptionitem/) 인스턴스 배열을 추가합니다. |
| [Clone](./clone/)() | 이 옵션 인스턴스를 복제합니다. |
| [InputBinOption](./inputbinoption/)(System::String, const System::ArrayPtr\<System::SharedPtr\<InputBin::IInputBinOptionItem\>\>\&) | 새 인스턴스를 생성합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [AutoSelect](./autoselect/) | 디바이스는 구성에 따라 최적의 옵션을 자동으로 선택합니다. |
| static [AutoSheetFeeder](./autosheetfeeder/) | 잉크젯 프린터용 디바이스 입력 트레이. |
| static [Cassette](./cassette/) | 피드 빈이 카세트임을 지정합니다. |
| static [Manual](./manual/) | 기본 수동 피드 빈을 지정합니다. |
| static [Tractor](./tractor/) | 피드 빈이 트랙터임을 지정합니다. |
## 또 보기

* Class [Option](../../option/)
* Class [IInputBinItem](../iinputbinitem/)
* Class [InputBin](../)
* Namespace [Aspose::Page::XPS::XpsMetadata](../../)
* Library [Aspose.Page for C++](../../../)
