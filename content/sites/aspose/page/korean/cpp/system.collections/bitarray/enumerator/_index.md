---
title: "System::Collections::BitArray::Enumerator 클래스"
linktitle: "열거자"
second_title: "C++용 Aspose.Page"
description: "System::Collections::BitArray::Enumerator 클래스. C++에서 반복을 위해 사용되는 Enumerator 타입입니다."
type: docs
weight: 2900
url: /ko/cpp/system.collections/bitarray/enumerator/
---
## Enumerator class


[Enumerator](./) type for iteration purposes.

```cpp
class Enumerator : public virtual System::Object,
                   public System::Collections::Generic::IEnumerator<bool>
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| [Enumerator](./enumerator/)(const SharedPtr\<BitArray\>\&) | 열거자를 생성합니다. |
| [get_Current](./get_current/)() const override | 주소 지정된 비트를 불리언 형태로 가져옵니다. |
| [MoveNext](./movenext/)() override | 다음 비트로 이동합니다. |
| [Reset](./reset/)() override | 열거자를 첫 번째 요소 앞 위치로 재설정합니다. |
## 또 보기

* Class [Object](../../../system/object/)
* Class [IEnumerator](../../../system.collections.generic/ienumerator/)
* Class [BitArray](../)
* Namespace [System::Collections](../../)
* Library [Aspose.Page for C++](../../../)
