---
title: "System::ComponentModel::EnumConverter class"
linktitle: "EnumConverter"
second_title: "C++용 Aspose.Page"
description: "System::ComponentModel::EnumConverter 클래스. EnumConverter를 사용하는 번역된 코드가 컴파일되도록 하기 위한 더미 클래스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++ 함수의 인수로 전달하십시오."
type: docs
weight: 700
url: /ko/cpp/system.componentmodel/enumconverter/
---
## EnumConverter class


EnumConverter를 사용하는 번역된 코드가 컴파일되도록 하기 위한 더미 클래스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 인스턴스를 생성하거나 operator new를 사용하지 마세요. 그렇지 않으면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class EnumConverter : public System::ComponentModel::TypeConverter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [CanConvertFrom](./canconvertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | 형식이 변환 가능한지 확인합니다; 구현되지 않음. |
| [CanConvertTo](./canconvertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::TypeInfo\&) | 형식이 변환 가능한지 확인합니다; 구현되지 않음. |
| [ConvertFrom](./convertfrom/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&) override | 실제 형식 변환을 수행합니다; 구현되지 않음. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | 실제 형식 변환을 수행합니다; 구현되지 않음. |
| [EnumConverter](./enumconverter/)(const System::TypeInfo\&) | RTTI 정보. |
| [get_EnumType](./get_enumtype/)() | 작동 중인 열거형 타입을 가져옵니다 [EnumConverter](./); 구현되지 않음. |
## 또 보기

* Class [TypeConverter](../typeconverter/)
* Namespace [System::ComponentModel](../)
* Library [Aspose.Page for C++](../../)
