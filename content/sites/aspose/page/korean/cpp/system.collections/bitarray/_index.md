---
title: "System::Collections::BitArray 클래스"
linktitle: "BitArray"
second_title: "C++용 Aspose.Page"
description: "System::Collections::BitArray 클래스. 인덱스로 접근할 수 있는 비트 배열입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.collections/bitarray/
---
## BitArray class


[Array](../../system/array/) of bits which can be addressed by index. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.

```cpp
class BitArray : public virtual System::Object,
                 public System::Collections::Generic::ICollection<bool>
```

## Nested classes

* Class [Enumerator](./enumerator/)
* Class [Reference](./reference/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const bool\&) override | 컨테이너 끝에 값을 추가합니다. |
| [And](./and/)(const BitArrayPtr\&) | 두 BitSet 간의 비트 단위 'and' 연산을 계산합니다. |
| [BitArray](./bitarray/)(const bitset\&) | 복사 생성자. |
| [BitArray](./bitarray/)(const BitArray\&) | 복사 생성자. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | 복사 생성자. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | 복사 생성자. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | 복사 생성자. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | 복사 생성자. |
| [BitArray](./bitarray/)(int, bool) | 채우기 생성자. |
| [Clear](./clear/)() override | 모든 요소를 삭제합니다. |
| [Contains](./contains/)(const bool\&) const override | 컨테이너에 특정 값이 존재하는지 확인합니다. 구현되지 않음. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | 데이터를 기존 배열 요소에 복사합니다. |
| [data](./data/)() | 기본 데이터 구조에 접근합니다. |
| [data](./data/)() const | 기본 데이터 구조에 접근합니다. |
| [Get](./get/)(int) const | [BitArray](./) 요소를 가져옵니다. |
| [get_Count](./get_count/)() const override | 컨테이너 크기를 가져옵니다. |
| [get_Length](./get_length/)() const | 컨테이너 크기를 가져옵니다. |
| [GetEnumerator](./getenumerator/)() override | 열거자 객체를 생성합니다. |
| [idx_get](./idx_get/)(int) const | Getter 함수. |
| [idx_set](./idx_set/)(int, bool) | Setter 함수. |
| [Not](./not/)() | BitSet을 부정합니다. |
| [operator!=](./operator!=/)(const BitArray\&) const | 비트 단위 비교 연산자. |
| [operator==](./operator==/)(const BitArray\&) const | 비트 단위 비교 연산자. |
| [operator[]](./operator[]/)(int) | 접근자 함수. |
| [Or](./or/)(const BitArrayPtr\&) | 두 BitSet 간의 비트 단위 'or' 연산을 계산합니다. |
| [Remove](./remove/)(const bool\&) override | 지정된 값의 첫 번째 발생을 반환합니다. 구현되지 않았습니다. |
| [Set](./set/)(int, bool) | [BitArray](./) 요소를 설정합니다. |
| [SetAll](./setall/)(bool) | 모든 요소를 특정 값으로 설정합니다. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | 약한 템플릿 인수 메커니즘의 공식 구현; 이 클래스에는 적용되지 않습니다. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | 현재 컨테이너에 대한 begin const iterator 구현을 가져옵니다. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | 현재 컨테이너에 대한 begin iterator 구현을 가져옵니다. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | 현재 컨테이너에 대한 end const iterator 구현을 가져옵니다. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | 현재 컨테이너에 대한 end iterator 구현을 가져옵니다. |
| [Xor](./xor/)(const BitArrayPtr\&) | 두 BitSet 간의 비트 단위 'xor' 연산을 계산합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [bitset](./bitset/) | RTTI 정보. |
## 비고



```cpp
#include <system/collections/bitarray.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

void Print(const System::SmartPtr<System::Collections::Generic::IEnumerable<bool>> &bitArray)
{
  for (const auto item: bitArray)
  {
    std::cout << item << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // BitArray 클래스의 새 인스턴스를 생성합니다.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // 값을 출력합니다.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## 또 보기

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
