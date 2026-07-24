---
title: "System::Drawing::Imaging::PropertyItem 클래스"
linktitle: "PropertyItem"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::PropertyItem 클래스. 이미지 파일에 포함될 메타데이터 속성을 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 1400
url: /ko/cpp/system.drawing.imaging/propertyitem/
---
## PropertyItem class


이미지 파일에 포함될 메타데이터 속성을 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class PropertyItem : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [get_Id](./get_id/)() const | 현재 객체가 나타내는 속성의 ID를 반환합니다. |
| [get_Len](./get_len/)() const | 현재 객체가 나타내는 속성의 길이를 바이트 단위로 반환합니다. |
| [get_Type](./get_type/)() const | 현재 객체가 나타내는 속성의 유형을 바이트 단위로 반환합니다. |
| [get_Value](./get_value/)() const | 현재 객체가 나타내는 속성의 값을 바이트 단위로 반환합니다. |
| [PropertyItem](./propertyitem/)() | [PropertyItem](./) 클래스의 새 인스턴스를 생성합니다. |
| [set_Id](./set_id/)(int32_t) | 현재 객체가 나타내는 속성의 ID를 설정합니다. |
| [set_Len](./set_len/)(int32_t) | 현재 객체가 나타내는 속성의 길이를 바이트 단위로 설정합니다. |
| [set_Type](./set_type/)(int16_t) | 현재 객체가 나타내는 속성의 유형을 바이트 단위로 설정합니다. |
| [set_Value](./set_value/)(const System::ArrayPtr\<uint8_t\>\&) | 현재 객체가 나타내는 속성의 유형을 바이트 단위로 설정합니다. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
