---
title: "فئة System::Buffer"
linktitle: "Buffer"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Buffer. تحتوي على طرق تُعامل مصفوفات البايت الخام. هذا نوع ثابت لا يحتوي على خدمات مثيلات. لا يجب عليك أبدًا إنشاء مثيلات منها بأي وسيلة في C++."
type: docs
weight: 1000
url: /ar/cpp/system/buffer/
---
## Buffer class


يحتوي على طرق تُعالج مصفوفات البايت الخام. هذا نوع ثابت لا يقدم خدمات مثيلات. يجب ألا تنشئ أي مثيلات له بأي وسيلة.

```cpp
class Buffer
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [BlockCopy](./blockcopy/)(const uint8_t *, int, uint8_t *, int, int) | ينسخ عددًا محددًا من البايتات من مخزن المصدر إلى مخزن الوجهة. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::ArrayView\<TDst\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [BlockCopy](./blockcopy/)(const System::Details::ArrayView\<TSrc\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [BlockCopy](./blockcopy/)(const SharedPtr\<Array\<TSrc\>\>\&, int, const System::Details::StackArray\<TDst, ND\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [BlockCopy](./blockcopy/)(const System::Details::StackArray\<TSrc, NS\>\&, int, const SharedPtr\<Array\<TDst\>\>\&, int, int) | يفسر مصفوفتين محددتين ذات نوع كمصوفات بايت خام وينسخ البيانات من إحداهما إلى الأخرى. |
| static [ByteLength](./bytelength/)(const SharedPtr\<Array\<T\>\>\&) | يحدد عدد البايتات التي تشغلها جميع عناصر المصفوفة المحددة. |
| static [ByteLength](./bytelength/)(const System::Details::ArrayView\<T\>\&) | يحدد عدد البايتات التي تشغلها جميع عناصر المصفوفة المحددة. |
| static [ByteLength](./bytelength/)(const System::Details::StackArray\<T, N\>\&) | يحدد عدد البايتات التي تشغلها جميع عناصر المصفوفة المحددة. |
| static [GetByte](./getbyte/)(const SharedPtr\<Array\<T\>\>\&, int) | يفسر المصفوفة ذات النوع المحدد كمصفوفة بايت خام ويسترجع قيمة البايت عند الإزاحة البايتية المحددة. |
| static [GetByte](./getbyte/)(const System::Details::ArrayView\<T\>\&, int) | يفسر المصفوفة ذات النوع المحدد كمصفوفة بايت خام ويسترجع قيمة البايت عند الإزاحة البايتية المحددة. |
| static [GetByte](./getbyte/)(const System::Details::StackArray\<T, N\>\&, int) | يفسر المصفوفة ذات النوع المحدد كمصفوفة بايت خام ويسترجع قيمة البايت عند الإزاحة البايتية المحددة. |
| static [SetByte](./setbyte/)(const SharedPtr\<Array\<T\>\>\&, int, uint8_t) | يفسر المصفوفة المكتوبة المحددة كمصفوفة byte خام ويضبط قيمة byte المحددة عند الإزاحة byte المحددة. |
| static [SetByte](./setbyte/)(const System::Details::ArrayView\<T\>\&, int, uint8_t) | يفسر المصفوفة المكتوبة المحددة كمصفوفة byte خام ويضبط قيمة byte المحددة عند الإزاحة byte المحددة. |
| static [SetByte](./setbyte/)(const System::Details::StackArray\<T, N\>\&, int, uint8_t) | يفسر المصفوفة المكتوبة المحددة كمصفوفة byte خام ويضبط قيمة byte المحددة عند الإزاحة byte المحددة. |
## ملاحظات



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
  // إنشاء وملء المصفوفة.
  const int SIZE = 16;
  auto first = MakeObject<Array<uint8_t>>(SIZE);
  for (auto i = 0; i < SIZE; ++i)
  {
    first[i] = static_cast<uint8_t>(i * 2);
  }

  // طباعة عناصر المصفوفة.
  Print(first, SIZE);

  // إنشاء مصفوفة تحتوي على جزء من الأولى.
  auto second = MakeObject<Array<uint8_t>>(SIZE / 2);
  Buffer::BlockCopy(first, SIZE / 2, second, 0, SIZE / 2);

  // طباعة عناصر المصفوفة الثانية.
  Print(second, SIZE / 2);

  // ضبط قيمة العنصر عند الفهرس 0 وطباعة عناصر المصفوفة.
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

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
