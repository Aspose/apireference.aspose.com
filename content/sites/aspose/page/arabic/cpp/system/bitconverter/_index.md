---
title: "System::BitConverter class"
linktitle: "BitConverter"
second_title: "Aspose.Page لـ C++"
description: "System::BitConverter class. يحتوي على طرق تقوم بتحويل تسلسل من البايتات إلى نوع قيمة والعكس. هذا نوع ثابت لا يحتوي على خدمات مثيل. يجب ألا تنشئ أي مثيلات له بأي وسيلة في C++."
type: docs
weight: 500
url: /ar/cpp/system/bitconverter/
---
## BitConverter class


يحتوي على طرق تقوم بتحويل تسلسل البايتات إلى نوع قيمة والعكس. هذا نوع ثابت لا يقدم خدمات مثيل. يجب ألا تنشئ أي نسخ منه بأي وسيلة.

```cpp
class BitConverter
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| static [_IsLittleEndian](./_islittleendian/)() | يشير إلى endianness للمعمارية الحالية. |
| static [DoubleToInt64Bits](./doubletoint64bits/)(double) | يعيد قيمة عدد صحيح 64-بت تمثيلها الثنائي يساوي التمثيل الثنائي للقيمة ذات الفاصلة العائمة مزدوجة الدقة المحددة. |
| static [GetBytes](./getbytes/)(bool) | يحوّل القيمة المنطقية المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(char_t) | يحوّل قيمة char_t المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(int16_t) | يحوّل قيمة عدد صحيح 16-بت المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(int) | يحوّل قيمة عدد صحيح 32-بت المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(int64_t) | يحوّل قيمة عدد صحيح 64-بت المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(uint16_t) | يحوّل قيمة عدد صحيح غير موقع 16-بت المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(uint32_t) | يحوّل قيمة عدد صحيح غير موقع 32-بت المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(uint64_t) | يحوّل قيمة عدد صحيح غير موقع 64-بت المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(float) | يحوّل قيمة عدد عشري بفاصلة عائمة ذات دقة أحادية المحددة إلى مصفوفة من البايتات. |
| static [GetBytes](./getbytes/)(double) | يحوّل قيمة عدد عشري بفاصلة عائمة ذات دقة مزدوجة المحددة إلى مصفوفة من البايتات. |
| static [Int64BitsToDouble](./int64bitstodouble/)(int64_t) | يعيد قيمة عدد عشري بفاصلة عائمة ذات دقة مزدوجة تكون قيمتها مكافئة للقيمة. |
| static [ToBoolean](./toboolean/)(const System::ArrayPtr\<uint8_t\>\&, int) | يحوّل بايت واحد من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة منطقية. |
| static [ToBoolean](./toboolean/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يحوّل بايت واحد من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة منطقية. |
| static [ToChar](./tochar/)(const System::ArrayPtr\<uint8_t\>\&, int) | يحوّل بايتين من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة char_t. |
| static [ToChar](./tochar/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يحوّل بايتين من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة char_t. |
| static [ToDouble](./todouble/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل ثمانية بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة ذات دقة مزدوجة للنقطة العائمة. |
| static [ToDouble](./todouble/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل ثمانية بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة ذات دقة مزدوجة للنقطة العائمة. |
| static [ToInt16](./toint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل بايتين من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح 16‑بت. |
| static [ToInt16](./toint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل بايتين من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح 16‑بت. |
| static [ToInt32](./toint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل أربعة بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح 32‑بت. |
| static [ToInt32](./toint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل أربعة بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح 32‑بت. |
| static [ToInt64](./toint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل ثمانية بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح 64‑بت. |
| static [ToInt64](./toint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل ثمانية بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح 64‑بت. |
| static [ToSingle](./tosingle/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل أربعة بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة ذات دقة مفردة للنقطة العائمة. |
| static [ToSingle](./tosingle/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل أربعة بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة ذات دقة مفردة للنقطة العائمة. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, bool, const String\&) | يقوم بتحويل جميع قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية. حالة الأحرف المستخدمة في التمثيل الست عشري والفاصل المُدرج بين كل زوج من البايتات المتجاورة تُحددان عبر الوسائط المقابلة. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية بدءًا من الفهرس المحدد. |
| static [ToString](./tostring/)(const ArrayPtr\<uint8_t\>\&, int, int) | يقوم بتحويل نطاق من قيم مصفوفة البايت المحددة إلى تمثيلها كسلسلة ست عشرية. |
| static [ToUInt16](./touint16/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل بايتين من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح غير موقع 16‑بت. |
| static [ToUInt16](./touint16/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل بايتين من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح غير موقع 16‑بت. |
| static [ToUInt32](./touint32/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل أربعة بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح غير موقع 32‑بت. |
| static [ToUInt32](./touint32/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل أربعة بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح غير موقع 32‑بت. |
| static [ToUInt64](./touint64/)(const System::ArrayPtr\<uint8_t\>\&, int) | يقوم بتحويل ثمانية بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح غير موقع 64‑بت. |
| static [ToUInt64](./touint64/)(const System::Details::ArrayView\<uint8_t\>\&, int) | يقوم بتحويل ثمانية بايتات من المصفوفة المحددة بدءًا من الفهرس المحدد إلى قيمة عدد صحيح غير موقع 64‑بت. |
## الحقول

| حقل | الوصف |
| --- | --- |
| static [IsLittleEndian](./islittleendian/) | يشير إلى ترتيب البايتات (endianness) للمعمارية الحالية. true إذا كانت المعمارية ذات ترتيب little endian، false غير ذلك. |
## ملاحظات



```cpp
#include <system/bit_converter.h>
#include <system/smart_ptr.h>

using namespace System;

template <typename T>
void Print(T arg)
{
  std::cout << arg << ' ';

  for (const auto byte: BitConverter::GetBytes(arg))
  {
    std::cout << std::hex << static_cast<int>(byte);
  }

  std::cout << std::endl;
}

int main()
{
  // إنشاء قيم للطباعة.
  int anInt = 1234567890;
  double aDouble = 0.123456789;

  // طباعة القيمة وبايتاتها.
  Print(anInt);
  Print(aDouble);

  return 0;
}
/*
This code example produces the following output:
1234567890 d229649
0.123457 5f633937dd9abf3f
*/
```

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
