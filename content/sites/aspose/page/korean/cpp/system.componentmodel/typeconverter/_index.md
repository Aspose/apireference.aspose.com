---
title: "System::ComponentModel::TypeConverter 클래스"
linktitle: "TypeConverter"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::TypeConverter 클래스. 구성 요소 모델에서 형식 변환을 처리하는 클래스. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 사용하여 C++ 함수에 인수로 전달하십시오."
type: docs
weight: 1400
url: /ko/cpp/system.componentmodel/typeconverter/
---
## TypeConverter class


구성 요소 모델에서 형식 변환을 처리하는 클래스. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 사용하여 함수에 인수로 전달하십시오.

```cpp
class TypeConverter : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<System::Object\>\&) | 객체를 변환합니다. |
| virtual [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | 객체를 변환합니다. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 문자열을 객체로 변환합니다. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::String\&) | 불변 문자열을 객체로 변환합니다. |
| [ConvertFromInvariantString](./convertfrominvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | 불변 문자열을 객체로 변환합니다. |
| [ConvertFromString](./convertfromstring/)(const System::String\&) | 문자열을 객체로 변환합니다. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::String\&) | 문자열을 객체로 변환합니다. |
| [ConvertFromString](./convertfromstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::String\&) | 문자열을 객체로 변환합니다. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 객체를 특정 유형으로 변환합니다. |
| virtual [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 객체를 특정 유형으로 변환합니다. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<System::Object\>\&) | 객체를 불변 문자열로 변환합니다. |
| [ConvertToInvariantString](./converttoinvariantstring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | 객체를 불변 문자열로 변환합니다. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<System::Object\>\&) | 객체를 문자열로 변환합니다. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Object\>\&) | 객체를 문자열로 변환합니다. |
| [ConvertToString](./converttostring/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) | 객체를 문자열로 변환합니다. |
| [TypeConverter](./typeconverter/)() | RTTI 정보. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
