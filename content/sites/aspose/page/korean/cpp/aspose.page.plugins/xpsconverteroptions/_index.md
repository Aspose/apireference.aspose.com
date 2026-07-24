---
title: "Aspose::Page::Plugins::XpsConverterOptions 클래스"
linktitle: "XpsConverterOptions"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::Plugins::XpsConverterOptions 클래스. C++에서 XpsConverter 플러그인에 대한 옵션을 나타냅니다."
type: docs
weight: 2000
url: /ko/cpp/aspose.page.plugins/xpsconverteroptions/
---
## XpsConverterOptions class


[XpsConverter](../xpsconverter/) 플러그인에 대한 옵션을 나타냅니다.

```cpp
class XpsConverterOptions : public Aspose::Page::Plugins::IPluginOptions,
                            public Aspose::Page::Plugins::IDataContainer,
                            public Aspose::Page::Plugins::ISaveInstruction
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AddDataSource](./adddatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverter](../xpsconverter/) 플러그인 데이터 컬렉션에 새 데이터 소스를 추가합니다. |
| [AddSaveDataSource](./addsavedatasource/)(System::SharedPtr\<IDataSource\>) override | [XpsConverterOptions](./) 플러그인 데이터 컬렉션에 새 데이터 소스를 추가합니다. |
| [get_DataCollection](./get_datacollection/)() override | [XpsConverterOptions](./) 플러그인 데이터 컬렉션을 반환합니다. |
| [get_JpegQualityLevel](./get_jpegqualitylevel/)() const | Quality 카테고리는 이미지 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아져 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를, 100 값은 가장 높은 품질의 이미지를 생성합니다. |
| virtual [get_OperationName](./get_operationname/)() | 작업 이름을 반환합니다. |
| [get_SaveTargetsCollection](./get_savetargetscollection/)() override | 저장 작업 결과를 위한 추가된 대상들의 컬렉션을 가져옵니다. |
| [set_JpegQualityLevel](./set_jpegqualitylevel/)(int32_t) | Quality 카테고리는 이미지 압축 수준을 지정합니다. 사용 가능한 값은 0에서 100까지입니다. 지정된 숫자가 낮을수록 압축률이 높아져 이미지 품질이 낮아집니다. 0 값은 가장 낮은 품질의 이미지를, 100 값은 가장 높은 품질의 이미지를 생성합니다. |
## 또 보기

* Class [IPluginOptions](../ipluginoptions/)
* Class [IDataContainer](../idatacontainer/)
* Class [ISaveInstruction](../isaveinstruction/)
* Namespace [Aspose::Page::Plugins](../)
* Library [Aspose.Page for C++](../../)
