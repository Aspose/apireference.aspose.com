---
title: "System::Drawing::Imaging::EncoderParameter 클래스"
linktitle: "EncoderParameter"
second_title: "C++용 Aspose.Page"
description: "System::Drawing::Imaging::EncoderParameter 클래스. 이미지 인코더에 값을 전달하기 위해 사용되는 컨테이너 역할을 합니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인수로 전달하십시오."
type: docs
weight: 600
url: /ko/cpp/system.drawing.imaging/encoderparameter/
---
## EncoderParameter class


이미지 인코더에 값을 전달하기 위해 사용되는 컨테이너 역할을 합니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들지 마십시오. 이렇게 하면 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 해당 포인터를 함수 인수로 전달하십시오.

```cpp
class EncoderParameter : public System::Object
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [EncoderParameter](./encoderparameter/)() | 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, uint8_t, bool) | 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int16_t) | 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t) | 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t) | 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t) | 분수를 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int64_t, int64_t) | 정수 값 범위를 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int32_t, int32_t, int32_t, int32_t) | 분수 범위를 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const String\&) | 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<uint8_t\>\&, bool) | 값 배열을 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int16_t\>\&) | 값 배열을 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&) | 값 배열을 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | 분수 배열을 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int64_t\>\&, const ArrayPtr\<int64_t\>\&) | 정수 범위 배열을 나타내는 새로운 [EncoderParameter](./) 클래스 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&, const ArrayPtr\<int32_t\>\&) | 분수 범위 배열을 나타내는 [EncoderParameter](./) 클래스의 새 인스턴스를 생성합니다. |
| [EncoderParameter](./encoderparameter/)(const SharedPtr\<Encoder\>\&, int, EncoderParameterValueType, void *) | 지정된 버퍼에서 읽은 지정된 유형의 지정된 개수 값을 나타내는 [EncoderParameter](./) 클래스의 새 인스턴스를 생성합니다. |
| [get_Encoder](./get_encoder/)() const | 현재 [EncoderParameter](./) 객체와 연결된 [Encoder](../encoder/) 객체를 반환합니다. |
| [get_NumberOfValues](./get_numberofvalues/)() const | 현재 객체가 나타내는 값의 개수를 반환합니다. |
| [get_Type](./get_type/)() const | 현재 객체가 나타내는 값(들)의 유형을 반환합니다. |
| [set_Encoder](./set_encoder/)(const EncoderPtr\&) | 지정된 [Encoder](../encoder/) 객체를 현재 [EncoderParameter](./) 객체와 연결합니다. |
| [~EncoderParameter](./~encoderparameter/)() | 소멸자. |
## 또 보기

* Class [Object](../../system/object/)
* Namespace [System::Drawing::Imaging](../)
* Library [Aspose.Page for C++](../../)
