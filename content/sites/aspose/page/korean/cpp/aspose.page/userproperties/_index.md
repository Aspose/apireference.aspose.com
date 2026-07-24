---
title: "Aspose::Page::UserProperties 클래스"
linktitle: "UserProperties"
second_title: "C++용 Aspose.Page"
description: "Aspose::Page::UserProperties 클래스. 타입이 지정된 속성을 설정하고 반환할 수 있는 특수 속성 클래스입니다. 또한 이 속성 객체에 해당 속성이 없을 경우 검색할 두 개의 기본 속성 객체를 연결할 수 있습니다."
type: docs
weight: 1600
url: /ko/cpp/aspose.page/userproperties/
---
## UserProperties class


특정 형식의 속성을 설정하고 반환할 수 있는 특수 속성 클래스입니다. 또한 이 속성 객체에 해당 속성이 없을 경우 검색할 두 개의 기본 속성 객체를 연결할 수 있습니다.

```cpp
class UserProperties : public System::Collections::Generic::Dictionary<System::String, System::SharedPtr<System::Object>>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| virtual [GetProperty](./getproperty/)(System::String) | 문자열 속성 값을 가져옵니다. |
| virtual [GetProperty](./getproperty/)(System::String, System::String) | 문자열 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String) | 색상 속성 값을 가져옵니다. |
| virtual [GetPropertyColor](./getpropertycolor/)(System::String, System::Drawing::Color) | 색상 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String) | double 속성 값을 가져옵니다. |
| virtual [GetPropertyDouble](./getpropertydouble/)(System::String, double) | double 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String) | float 속성 값을 가져옵니다. |
| virtual [GetPropertyFloat](./getpropertyfloat/)(System::String, float) | float 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String) | integer 속성 값을 가져옵니다. |
| virtual [GetPropertyInt](./getpropertyint/)(System::String, int32_t) | integer 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String) | 여백 속성 값을 가져옵니다. |
| virtual [GetPropertyMargins](./getpropertymargins/)(System::String, System::SharedPtr\<Margins\>) | 여백 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String) | matrix 속성 값을 가져옵니다. |
| virtual [GetPropertyMatrix](./getpropertymatrix/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | matrix 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String) | rectangle 속성 값을 가져옵니다. |
| virtual [GetPropertyRectangle](./getpropertyrectangle/)(System::String, System::Drawing::RectangleF) | rectangle 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertySize](./getpropertysize/)(System::String) | size 속성 값을 가져옵니다. |
| virtual [GetPropertySize](./getpropertysize/)(System::String, System::Drawing::Size) | size 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String) | 문자열 배열 속성 값을 가져옵니다. |
| virtual [GetPropertyStringArray](./getpropertystringarray/)(System::String, System::ArrayPtr\<System::String\>) | 문자열 배열 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [IsProperty](./isproperty/)(System::String) | boolean 속성 값을 가져옵니다. |
| virtual [IsProperty](./isproperty/)(System::String, bool) | boolean 속성 값을 가져옵니다. 요청한 속성이 없으면 제공된 기본값을 반환합니다. |
| virtual [PrintProperties](./printproperties/)() |  |
| virtual [PropertyNames](./propertynames/)() | 속성 이름을 반환합니다. |
| virtual [set_Properties](./set_properties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 속성을 복사하고, 기본값을 포함하여 이 [UserProperties](./)에 넣습니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::String) | 문자열 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::ArrayPtr\<System::String\>) | 문자열 배열 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::ArrayPtr\<System::String\>) | 지정된 속성 테이블에서 문자열 배열 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Color) | 색상 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Color) | 지정된 속성 테이블에서 색상 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Rectangle) | 사각형 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Rectangle) | 지정된 속성 테이블에서 사각형 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<Margins\>) | 여백 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<Margins\>) | 지정된 속성 테이블에서 여백 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::Drawing::Size) | 크기 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::Drawing::Size) | 지정된 속성 테이블에서 크기 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, int32_t) | 정수 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, int32_t) | 지정된 속성 테이블에서 정수 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, double) | double 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, double) | 지정된 속성 테이블에서 double 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, float) | float 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, float) | 지정된 속성 테이블에서 float 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, bool) | boolean 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, bool) | 지정된 속성 테이블에서 boolean 속성 값을 설정합니다. |
| virtual [SetProperty](./setproperty/)(System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 행렬 속성 값을 설정합니다. |
| static [SetProperty](./setproperty/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::String, System::SharedPtr\<System::Drawing::Drawing2D::Matrix\>) | 지정된 속성 테이블에서 행렬 속성 값을 설정합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | n번째 템플릿 인수를 약한 포인터(공유 포인터가 아니라)로 설정합니다. 컨테이너에서 포인터를 약한 모드로 전환할 수 있습니다. |
| [UserProperties](./userproperties/)() | 빈 [UserProperties](./) 클래스 인스턴스를 초기화합니다. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | 기본값을 사용하여 [UserProperties](./) 클래스의 인스턴스를 초기화합니다. |
| [UserProperties](./userproperties/)(System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>, System::SharedPtr\<System::Collections::Generic::Dictionary\<System::String, System::SharedPtr\<System::Object\>\>\>) | defaults와 altDefaults 테이블을 해당 순서대로 검색하여 [UserProperties](./)를 생성합니다. |
## 또 보기

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [Aspose::Page](../)
* Library [Aspose.Page for C++](../../)
