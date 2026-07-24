---
title: "System::Drawing::ImageConverter 클래스"
linktitle: "ImageConverter"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::ImageConverter 클래스. Image 객체를 한 데이터 유형에서 다른 데이터 유형으로 변환합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1300
url: /ko/cpp/system.drawing/imageconverter/
---
## ImageConverter class


[Image](../image/) 객체를 한 데이터 유형에서 다른 데이터 유형으로 변환합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class ImageConverter : public System::ComponentModel::TypeConverter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::ComponentModel::ITypeDescriptorContext\>\&, const System::SharedPtr\<System::Globalization::CultureInfo\>\&, const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) override | 객체를 특정 유형으로 변환합니다. |
| [ConvertTo](./convertto/)(const System::SharedPtr\<System::Object\>\&, const System::TypeInfo\&) | 객체를 특정 유형으로 변환합니다. |
| [ImageConverter](./imageconverter/)() | [ImageConverter](./)의 새 인스턴스를 생성합니다. |
## 또 보기

* Class [TypeConverter](../../system.componentmodel/typeconverter/)
* Namespace [System::Drawing](../)
* Library [Aspose.Page for C++](../../)
