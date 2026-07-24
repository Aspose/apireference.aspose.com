---
title: "System::Collections::Generic::IEnumerator 클래스"
linktitle: "IEnumerator"
second_title: "C++용 Aspose.Page"
description: "System::Collections::Generic::IEnumerator 클래스. 일부 요소들을 순회하는 데 사용할 수 있는 열거자 인터페이스입니다. 이 클래스의 객체는 System::MakeObject() 함수를 사용하여 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들면 런타임 오류 및/또는 어설션 오류가 발생합니다. 항상 이 클래스를 System::SmartPtr 포인터로 감싸고, 해당 포인터를 C++에서 함수 인자로 전달할 때 사용하십시오."
type: docs
weight: 2300
url: /ko/cpp/system.collections.generic/ienumerator/
---
## IEnumerator class


일부 요소를 반복하는 데 사용할 수 있는 열거자 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../../system/makeobject/) 함수를 사용하여 할당해야 합니다. 스택에 이 타입의 인스턴스를 생성하거나 operator new를 사용하지 마십시오. 런타임 오류 및/또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../../system/smartptr/) 포인터로 래핑하고, 해당 포인터를 함수 인자로 전달하십시오.

```cpp
template<typename T>class IEnumerator : public virtual System::IDisposable,
                                        public System::Details::EnumeratorBasedIterator<T>,
                                        protected System::Details::IteratorPointerUpdater<T, false>
```


| 매개변수 | 설명 |
| --- | --- |
| T | 요소 타입. |
## 메서드

| 메서드 | 설명 |
| --- | --- |
| [AsVirtualizedIterator](./asvirtualizediterator/)() | VirtualizedIterator 클래스에서 사용할 반복자를 준비합니다. |
| [CloneIterator](./cloneiterator/)() const override | 현재 반복자를 복제합니다. |
| virtual [Current](./current/)() const | 현재 요소를 가져옵니다. |
| virtual [get_Current](./get_current/)() const | 현재 요소를 가져옵니다. |
| [IEnumerator](./ienumerator/)() |  |
| [IncrementIterator](./incrementiterator/)() override | 반복자를 한 단계 앞으로 이동합니다. |
| [InitializeIterator](./initializeiterator/)() override | 첫 번째 [MoveNext()](./movenext/) 호출을 수행하고, VirtualizedIterator에서 사용할 열거자 객체를 준비합니다. |
| [MarkOwnedByVirtualizedIterator](./markownedbyvirtualizediterator/)() | 가상 반복자가 소유한 열거자를 표시합니다. |
| virtual [MoveNext](./movenext/)() | 열거자를 다음 요소로 이동합니다. 이전에 요소가 참조되지 않은 경우, 사용 가능한 첫 번째 요소를 참조하도록 설정합니다. 컨테이너 끝에 도달하면 아무 작업도 수행하지 않습니다. |
| virtual [Reset](./reset/)() | 열거자를 첫 번째 요소 앞 위치로 재설정합니다. |
| virtual [~IEnumerator](./~ienumerator/)() |  |
## Typedefs

| 타입 정의 | 설명 |
| --- | --- |
| [ValueType](./valuetype/) | 값 형식. |
## 비고



```cpp
#include <system/collections/list.h>
#include <system/smart_ptr.h>

using namespace System;
using namespace System::Collections::Generic;

int main()
{
  // List 클래스 인스턴스를 생성합니다.
  auto collection = MakeObject<List<int>>();

  // 리스트를 채웁니다.
  collection->Add(1);
  collection->Add(2);
  collection->Add(3);

  // 목록의 열거자를 가져옵니다.
  auto enumerator = collection->GetEnumerator();

  while (enumerator->MoveNext())
  {
    // 현재 요소를 가져와서 출력합니다.
    std::cout << enumerator->get_Current() << ' ';
  }

  // 열거자를 재설정합니다.
  enumerator->Reset();

  return 0;
}
/*
This code example produces the following output:
1 2 3
*/
```

## 또 보기

* Class [IDisposable](../../system/idisposable/)
* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
