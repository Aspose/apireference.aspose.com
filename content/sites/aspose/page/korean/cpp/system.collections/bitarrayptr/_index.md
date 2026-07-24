---
title: "System::Collections::BitArrayPtr 클래스"
linktitle: "BitArrayPtr"
second_title: "C++용 Aspose.Page"
description: "System::Collections::BitArrayPtr 클래스. BitArray에 대한 포인터입니다. 이 타입은 다른 객체의 삭제를 관리하기 위한 포인터이며, C++에서는 스택에 할당하고 값으로 또는 const 레퍼런스로 함수에 전달해야 합니다."
type: docs
weight: 200
url: /ko/cpp/system.collections/bitarrayptr/
---
## BitArrayPtr class


[BitArray](../bitarray/)에 대한 포인터입니다. 이 타입은 다른 객체의 삭제를 관리하기 위한 포인터이며, 스택에 할당하고 값으로 또는 const 레퍼런스로 함수에 전달해야 합니다.

```cpp
class BitArrayPtr : public System::SmartPtr<BitArray>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [BitArrayPtr](./bitarrayptr/)() | null 포인터를 초기화합니다. |
| [BitArrayPtr](./bitarrayptr/)(const SharedPtr\<BitArray\>\&) | 변환 생성자. |
| [IsNull](./isnull/)() const | 특정 값이 null인지 확인합니다. |
| [operator[]](./operator[]/)(int) const | 비트 접근자. |
## 또 보기

* Class [SmartPtr](../../system/smartptr/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
