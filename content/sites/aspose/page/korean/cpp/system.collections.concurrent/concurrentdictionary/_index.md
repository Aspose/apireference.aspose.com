---
title: "System::Collections::Concurrent::ConcurrentDictionary 클래스"
linktitle: "ConcurrentDictionary"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Concurrent::ConcurrentDictionary 클래스. 스레드 안전 사전 구현입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, C++에서 함수 인자로 전달할 때 해당 포인터를 사용하십시오."
type: docs
weight: 100
url: /ko/cpp/system.collections.concurrent/concurrentdictionary/
---
## ConcurrentDictionary class


스레드 안전 사전 구현입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용하여 인스턴스를 만들면 런타임 오류 또는 어설션 오류가 발생합니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 감싸고, 함수 인자로 전달할 때 해당 포인터를 사용하십시오.

```cpp
template<class TKey,class TValue>class ConcurrentDictionary : public System::Collections::Generic::Dictionary<TKey, TValue>
```


| 매개변수 | 설명 |
| --- | --- |
| TKey | 키 유형. |
| TValue | 값 형식. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Add](./add/)(const TKey\&, const TValue\&) override | 사전에 값을 추가합니다. |
| [Clear](./clear/)() override | 컨테이너의 모든 요소를 삭제합니다. |
| [CopyTo](./copyto/)(ArrayPtr\<System::Collections::Generic::KeyValuePair\<TKey, TValue\>\>, int) override | 컨테이너 요소를 기존 배열 요소에 복사합니다. |
| [get_KeysInternal](./get_keysinternal/)() const override | 사전 키에 접근하기 위한 래퍼 컬렉션을 가져옵니다. |
| [idx_set](./idx_set/)(const TKey\&, TValue) override | RTTI 정보. |
| [Remove](./remove/)(const TKey\&) override | 컨테이너에서 요소를 제거합니다. |
| [TryAdd](./tryadd/)(const TKey\&, const TValue\&) | 키/값 쌍을 사전에 추가하려 시도합니다. |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [BaseType](./basetype/) | 구현 유형입니다. |
| [ThisType](./thistype/) | 이 유형. |
## 비고



```cpp
#include <system/collections/concurrent/concurrent_dictionary.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  const int itemsCount = 32;

  // ConcurrentDictionary 클래스 인스턴스를 생성합니다.
  auto concurrentDictionary = MakeObject<ConcurrentDictionary<int, int>>();

  // 동시 사전을 채웁니다.
  for (auto i = 0; i < itemsCount; ++i)
  {
    concurrentDictionary->Add(i, i * i);
  }

  Console::WriteLine(concurrentDictionary->idx_get(3));

  return 0;
}
/*
This code example produces the following output:
9
*/
```

## 또 보기

* Class [Dictionary](../../system.collections.generic/dictionary/)
* Namespace [System::Collections::Concurrent](../)
* Library [Aspose.Page for C++](../../)
