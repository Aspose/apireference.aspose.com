---
title: "System::Collections::Specialized::BitVector32 클래스"
linktitle: "BitVector32"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Specialized::BitVector32 클래스. C++에서 32비트 저장소에 대해 정수 또는 Boolean 접근이 쉬운 간단한 경량 비트 벡터를 제공합니다."
type: docs
weight: 100
url: /ko/cpp/system.collections.specialized/bitvector32/
---
## BitVector32 class


정수 또는 [Boolean](../../system/boolean/) 접근이 쉬운 간단한 경량 비트 벡터를 32비트 저장소에 제공합니다.

```cpp
class BitVector32
```

## Nested classes

* Class [Section](./section/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BitVector32](./bitvector32/)() | [BitVector32](./)의 새로운 빈 인스턴스를 초기화합니다. |
| [BitVector32](./bitvector32/)(int32_t) | 지정된 내부 데이터를 사용하여 [BitVector32](./) 구조의 새로운 인스턴스를 초기화합니다. |
| [BitVector32](./bitvector32/)(const BitVector32\&) | 지정된 값에 있는 정보를 사용하여 [BitVector32](./) 구조의 새로운 인스턴스를 초기화합니다. |
| static [CreateMask](./createmask/)() | 시리즈에서 첫 번째 마스크를 생성합니다. |
| static [CreateMask](./createmask/)(int32_t) | 시리즈에서 다음 마스크를 생성합니다. |
| static [CreateSection](./createsection/)(int16_t) | 지정된 최대값을 사용하여 시리즈에서 첫 번째 섹션을 생성합니다. |
| static [CreateSection](./createsection/)(int16_t, BitVector32::Section) | 지정된 최대값을 사용하여 시리즈에서 다음 섹션을 생성합니다. |
| [Equals](./equals/)(const BitVector32\&) | 지정된 객체가 현재 객체와 동일한지 확인합니다. |
| [get_Data](./get_data/)() | 이 비트 벡터에 저장된 원시 데이터를 반환합니다... |
| [GetHashCode](./gethashcode/)() const | 현재 객체에 대한 해시 코드를 반환합니다. |
| [idx_get](./idx_get/)(int32_t) | 지정된 모든 비트가 설정되어 있는지 여부를 나타내는 값을 가져옵니다. |
| [idx_get](./idx_get/)(BitVector32::Section) | 지정된 섹션의 값을 가져옵니다. |
| [idx_set](./idx_set/)(int32_t, bool) | 지정된 모든 비트가 설정되어 있는지 여부를 나타내는 값을 설정합니다. |
| [idx_set](./idx_set/)(BitVector32::Section, int32_t) | 지정된 섹션에 대한 값을 설정합니다. |
| static [ToString](./tostring/)(const BitVector32\&) | value 매개변수로 표현된 값을 문자열로 변환합니다. |
| [ToString](./tostring/)() const | 현재 객체가 나타내는 값을 문자열로 변환합니다. |
## 또 보기

* Namespace [System::Collections::Specialized](../)
* Library [Aspose.Page for C++](../../)
