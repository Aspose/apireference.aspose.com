---
title: "System::Collections 네임스페이스"
linktitle: "System::Collections"
second_title: "C++용 Aspose.Page"
description: "C++에서 System::Collections 네임스페이스를 사용하는 방법."
type: docs
weight: 2200
url: /ko/cpp/system.collections/
---



## 클래스

| 클래스 | 설명 |
| --- | --- |
| [BitArray](./bitarray/) | [Array](../system/array/)는 인덱스로 접근할 수 있는 비트 배열입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하세요. |
| [BitArrayPtr](./bitarrayptr/) | [BitArray](./bitarray/)에 대한 포인터입니다. 이 타입은 다른 객체의 삭제를 관리하는 포인터이며, 스택에 할당하고 값 또는 const 레퍼런스로 함수에 전달해야 합니다. |
| [CollectionBase](./collectionbase/) | 강력히 타입이 지정된 컬렉션을 위한 추상 기본 클래스를 제공합니다. |
| [ICollection](./icollection/) | 비제네릭 컬렉션 인터페이스를 정의합니다. |
| [IEnumerable](./ienumerable/) | [IEnumerable](./ienumerable/)은 열거 가능한 모든 비제네릭 컬렉션의 기본 인터페이스입니다. |
| [IEnumerator](./ienumerator/) | 몇몇 요소를 반복하는 데 사용할 수 있는 열거자 인터페이스입니다. 이 클래스의 객체는 [System::MakeObject()](../system/makeobject/) 함수를 사용하여만 할당해야 합니다. 스택에 직접 생성하거나 operator new를 사용해 인스턴스를 만들지 마세요. 이렇게 하면 런타임 오류 또는 어설션 오류가 발생할 수 있습니다. 항상 이 클래스를 [System::SmartPtr](../system/smartptr/) 포인터로 감싸고, 해당 포인터를 인수로 함수에 전달하세요. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/) | 제네릭 Iterator [IEnumeratorImplRefType](./ienumeratorimplreftype/) 위에 비제네릭 [IEnumerator](./ienumerator/) 구현을 생성하는 래퍼 - 참조 타입용 래퍼. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/) | 제네릭 Iterator [IEnumeratorImplRefType](./ienumeratorimplreftype/) 위에 비제네릭 [IEnumerator](./ienumerator/) 구현을 생성하는 래퍼 - 값 타입용 래퍼. |
| [IEqualityComparer](./iequalitycomparer/) |  |
| [IList](./ilist/) | [IList](./ilist/)는 인덱스로 개별 접근이 가능한 비제네릭 객체 컬렉션을 나타냅니다. |
| [IListImplRefType](./ilistimplreftype/) | 참조 타입을 위한 구현으로, [System::Collections::Generic::List](../system.collections.generic/list/) 객체에 [System::Collections::IList](./ilist/) 인터페이스를 구현하는 스텁. |
| [IListImplValueType](./ilistimplvaluetype/) | 값 타입을 위한 구현으로, [System::Collections::Generic::List](../system.collections.generic/list/) 객체에 [System::Collections::IList](./ilist/) 인터페이스를 구현하는 스텁. |
| [IListWrapper](./ilistwrapper/) | 제네릭 컬렉션을 비제네릭 컬렉션으로 캐스팅을 지원하는 인터페이스. |
| [Invalidatable](./invalidatable/) | [InvalidatableTracker](./invalidatabletracker/) 객체를 통해 하위 객체들의 상태를 추적할 수 있게 하는 클래스. |
| [InvalidatableTracker](./invalidatabletracker/) | [Invalidatable](./invalidatable/) 객체의 트래커를 구현하는 클래스. |
