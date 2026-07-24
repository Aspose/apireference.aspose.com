---
title: "System::Buffer 클래스"
linktitle: "버퍼"
second_title: "C++용 Aspose.Page"
description: "System::Buffer 클래스. 원시 바이트 배열을 조작하는 메서드를 포함합니다. 이는 인스턴스 서비스를 제공하지 않는 정적 타입입니다. C++에서 어떠한 방법으로도 인스턴스를 생성해서는 안 됩니다."
type: docs
weight: 1000
url: /ko/cpp/system/buffer/
---
## Buffer class


원시 바이트 배열을 조작하는 메서드를 포함합니다. 인스턴스 서비스를 제공하지 않는 정적 타입이며, 어떤 방법으로도 인스턴스를 생성해서는 안 됩니다.

```cpp
class Buffer
```

## 메서드

| 메서드 | 설명 |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | 지정된 바이트 수를 소스 버퍼에서 대상 버퍼로 복사합니다. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | 두 개의 지정된 타입 배열을 원시 바이트 배열로 해석하고, 하나에서 다른 하나로 데이터를 복사합니다. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | 지정된 배열의 모든 요소가 차지하는 바이트 수를 결정합니다. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | 지정된 배열의 모든 요소가 차지하는 바이트 수를 결정합니다. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | 지정된 배열의 모든 요소가 차지하는 바이트 수를 결정합니다. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | 지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에서 바이트 값을 가져옵니다. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | 지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에서 바이트 값을 가져옵니다. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | 지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에서 바이트 값을 가져옵니다. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | 지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | 지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | 지정된 타입 배열을 원시 바이트 배열로 해석하고, 지정된 바이트 오프셋에 지정된 바이트 값을 설정합니다. |
## 비고



```cpp
#include <system/buffer.h>

using namespace System;

void Print(const SmartPtr<Array<uint8_t>> &source, int size)
{
  for (auto i = 0; i < size; i++)
  {
    std::cout << static_cast<int>(source[i]) << ' ';
  }
  std::cout << std::endl;
}

int main()
{
  // 배열을 생성하고 채웁니다.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // 배열 항목을 출력합니다.
  Print(first, SIZE);

  // 첫 번째 배열의 일부를 포함하는 배열을 생성합니다.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // 두 번째 배열의 항목을 출력합니다.
  Print(second, SIZE / 2);

  // 인덱스 0에 있는 항목의 값을 설정하고 배열 항목을 출력합니다.
  Buffer::SetByte(second, 0, 128);
  Print(second, SIZE / 2);

  return 0;
}
/*
This code example produces the following output:
0 2 4 6 8 10 12 14 16 18 20 22 24 26 28 30
16 18 20 22 24 26 28 30
128 18 20 22 24 26 28 30
*/
```

## 또 보기

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
