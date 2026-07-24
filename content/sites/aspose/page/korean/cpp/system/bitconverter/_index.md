---
title: "System::BitConverter 클래스"
linktitle: "BitConverter"
second_title: "C++용 Aspose.Page"
description: "System::BitConverter 클래스. 바이트 시퀀스를 값 타입으로 변환하거나 그 반대로 변환하는 메서드를 포함합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입이며, C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 500
url: /ko/cpp/system/bitconverter/
---
## BitConverter class


바이트 시퀀스를 값 형식으로, 그리고 그 반대로 변환하는 메서드를 포함합니다. 인스턴스 서비스를 제공하지 않는 정적 타입이며, 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class BitConverter
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | 현재 아키텍처의 엔디언 방식을 나타냅니다. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | 지정된 배정밀도 부동소수점 값의 이진 표현과 동일한 이진 표현을 갖는 64비트 정수 값을 반환합니다. |
| static [GetBytes](./getbytes/)(bool) | 지정된 부울 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(char_t) | 지정된 char_t 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(int16_t) | 지정된 16비트 정수 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(int) | 지정된 32비트 정수 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(int64_t) | 지정된 64비트 정수 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(uint16_t) | 지정된 부호 없는 16비트 정수 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(uint32_t) | 지정된 부호 없는 32비트 정수 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(uint64_t) | 지정된 부호 없는 64비트 정수 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(float) | 지정된 단정밀도 부동소수점 값을 바이트 배열로 변환합니다. |
| static [GetBytes](./getbytes/)(double) | 지정된 배정밀도 부동소수점 값을 바이트 배열로 변환합니다. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | 값과 동등한 배정밀도 부동소수점 값을 반환합니다. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 한 바이트를 부울 값으로 변환합니다. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 한 바이트를 부울 값으로 변환합니다. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 두 바이트를 char_t 값으로 변환합니다. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 두 바이트를 char_t 값으로 변환합니다. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 8바이트를 변환하여 배정밀도 부동소수점 값으로 변환합니다. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 8바이트를 변환하여 배정밀도 부동소수점 값으로 변환합니다. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 2바이트를 변환하여 16비트 정수 값으로 변환합니다. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 2바이트를 변환하여 16비트 정수 값으로 변환합니다. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 4바이트를 변환하여 32비트 정수 값으로 변환합니다. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 4바이트를 변환하여 32비트 정수 값으로 변환합니다. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 8바이트를 변환하여 64비트 정수 값으로 변환합니다. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 8바이트를 변환하여 64비트 정수 값으로 변환합니다. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 4바이트를 변환하여 단정밀도 부동소수점 값으로 변환합니다. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 4바이트를 변환하여 단정밀도 부동소수점 값으로 변환합니다. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | 지정된 바이트 배열의 모든 값을 16진수 문자열 표현으로 변환합니다. 16진수 표기에서 사용할 문자 대소문자와 인접한 바이트 쌍 사이에 삽입되는 구분자는 해당 인수들을 통해 지정됩니다. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하여 지정된 바이트 배열의 값을 16진수 문자열 표현으로 변환합니다. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | 지정된 바이트 배열의 값 범위를 16진수 문자열 표현으로 변환합니다. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 2바이트를 변환하여 부호 없는 16비트 정수 값으로 변환합니다. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 2바이트를 변환하여 부호 없는 16비트 정수 값으로 변환합니다. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 4바이트를 변환하여 부호 없는 32비트 정수 값으로 변환합니다. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 4바이트를 변환하여 부호 없는 32비트 정수 값으로 변환합니다. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 8바이트를 변환하여 부호 없는 64비트 정수 값으로 변환합니다. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | 지정된 인덱스에서 시작하는 지정된 배열의 8바이트를 변환하여 부호 없는 64비트 정수 값으로 변환합니다. |
## 필드

| 필드 | 설명 |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | 현재 아키텍처의 엔디언 방식을 나타냅니다. 아키텍처가 리틀 엔디언이면 true, 그렇지 않으면 false입니다. |
## 비고



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // 출력할 값을 생성합니다.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // 값과 해당 바이트를 출력합니다.
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
