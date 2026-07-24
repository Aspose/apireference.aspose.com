---
title: "System::Collections::Generic::Dictionary 클래스"
linktitle: "Dictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::Dictionary 클래스. C++에서 Dictionary 클래스의 전방 선언."
type: docs
weight: 1100
url: /ko/cpp/system.collections.generic/dictionary/
---
## Dictionary class


전방 선언된 [Dictionary](./) 클래스.

```cpp
template<typename TKey,typename TValue>class Dictionary : public System::Collections::Generic::BaseDictionary<std::unordered_map<TKey, TValue, EqualityComparerHashAdapter<TKey>, EqualityComparerAdapter<TKey>, ASPOSE_MAP_ALLOCATOR_TYPE(TKey, TValue)>>
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | 키 유형. |
| TValue | 값 형식. |
## Nested classes

* Class [Enumerator](./enumerator/)
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Dictionary](./dictionary/)() | 빈 사전을 생성합니다. |
| [Dictionary](./dictionary/)(const map_t\&) | 맵에서 데이터를 복사합니다. |
| [Dictionary](./dictionary/)(int) | 미리 할당된 사전을 생성하는 것에 해당하는 오버로드; 실제로는 할당을 수행하지 않습니다. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&) | 복사 생성자. |
| [Dictionary](./dictionary/)(const SharedPtr\<IDictionary\<TKey, TValue\>\>\&, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 복사 생성자. |
| [Dictionary](./dictionary/)(const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 빈 사전을 생성합니다. |
| [Dictionary](./dictionary/)(int, const SharedPtr\<IEqualityComparer\<TKey\>\>\&) | 빈 사전을 생성합니다. |
| [GetEnumerator](./getenumerator/)() override | 열거자 객체를 생성합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [IEnumerablePtr](./ienumerableptr/) | 열거 가능한 인터페이스에 대한 포인터. |
| [IEnumeratorPtr](./ienumeratorptr/) | 열거자에 대한 포인터. |
| [KeyCollection](./keycollection/) | RTTI 정보. |
| [KVPair](./kvpair/) | 키-값 쌍 타입. |
| [map_t](./map_t/) | 기본 데이터 유형. |
| [Ptr](./ptr/) | 포인터 유형. |
| [ValueCollection](./valuecollection/) | 추출할 값들의 컬렉션. |
## 비고


[Dictionary](./) that maps values to keys. Objects of this class should only be allocated using [System::MakeObject()](../../system/makeobject/) function. Never create instance of this type on stack or using operator new, as it will result in runtime errors and/or assertion faults. Always wrap this class into [System::SmartPtr](../../system/smartptr/) pointer and use this pointer to pass it to functions as argument.


```cpp
#include <system/collections/dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // Dictionary 클래스 인스턴스를 생성합니다.
  auto dictionary = MakeObject<Dictionary<int, String>>();

  // 사전을 채웁니다.
  dictionary->Add(0, u"Foo");
  dictionary->Add(1, u"Bar");
  dictionary->Add(2, u"Baz");

  // 사전 항목을 출력합니다.
  for (const auto &pair: dictionary)
  {
    std::cout << pair.get_Key() << " - " << pair.get_Value() << std::endl;
  }

  return 0;
}
/*
This code example produces the following output:
0 - Foo
1 - Bar
2 - Baz
*/
```

## 또 보기

* Class [BaseDictionary](../basedictionary/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
