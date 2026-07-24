---
title: "System::IO::BinaryWriter 클래스"
linktitle: "BinaryWriter"
second_title: "C++용 Aspose.Page"
description: "System::IO::BinaryWriter 클래스. 원시 타입 값을 바이트 스트림에 쓰는 라이터를 나타냅니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 래핑하고, 해당 포인터를 C++에서 함수 인수로 전달하는 데 사용하십시오."
type: docs
weight: 900
url: /ko/cpp/system.io/binarywriter/
---
## BinaryWriter class


원시 타입 값을 바이트 스트림에 쓰는 라이터를 나타냅니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인수로 전달하는 데 사용하십시오.

```cpp
class BinaryWriter : public System::IDisposable
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BinaryWriter](./binarywriter/)(const StreamPtr\&, const EncodingPtr\&, bool) | 지정된 인코딩을 사용하여 지정된 스트림에 데이터를 쓰는 [BinaryWriter](./) 클래스의 인스턴스를 생성합니다. |
| [Close](./close/)() | 현재 [BinaryWriter](./) 객체와 기본 출력 스트림을 닫습니다. |
| [Dispose](./dispose/)() override | 현재 객체가 사용한 모든 리소스를 해제하고 기반 스트림을 닫습니다. |
| [Flush](./flush/)() | 출력 스트림을 플러시합니다. |
| [get_BaseStream](./get_basestream/)() | 출력 스트림을 반환합니다. |
| [Seek](./seek/)(int, System::IO::SeekOrigin) | 현재 객체가 나타내는 스트림의 위치를 설정합니다. |
| virtual [Write](./write/)(uint8_t) | 지정된 부호 없는 8비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(const ArrayPtr\<uint8_t\>\&, int, int) | 지정된 바이트 배열에서 지정된 바이트 하위 범위를 출력 스트림에 씁니다. |
| virtual [Write](./write/)(const ArrayPtr\<char_t\>\&, int, int) | 지정된 문자 배열에서 지정된 UTF-16 문자 하위 범위를 출력 스트림에 씁니다. |
| virtual [Write](./write/)(bool) | **value**가 'true'이면 값이 0인 단일 바이트를, **value**가 'false'이면 값이 1인 단일 바이트를 출력 스트림에 씁니다. |
| virtual [Write](./write/)(char16_t) | 지정된 16비트 와이드 문자 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(int16_t) | 지정된 16비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(int) | 지정된 32비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(int64_t) | 지정된 64비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(uint16_t) | 지정된 부호 없는 16비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(uint32_t) | 지정된 부호 없는 32비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(uint64_t) | 지정된 부호 없는 64비트 정수 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(float) | 지정된 단정밀도 부동 소수점 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(double) | 지정된 배정밀도 부동 소수점 값을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(const Decimal\&) | 지정된 [Decimal](../../system/decimal/) 값의 바이트 표현을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(const String\&) | 현재 인코딩에서 길이 접두사가 있는 문자열을 출력 스트림에 씁니다. |
| virtual [Write](./write/)(const char_t *) | 현재 인코딩에서 길이 접두사가 있는 문자열을 출력 스트림에 씁니다. |
| [~BinaryWriter](./~binarywriter/)() | 소멸자. |
## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::IO](../)
* Library [Aspose.Page for C++](../../)
