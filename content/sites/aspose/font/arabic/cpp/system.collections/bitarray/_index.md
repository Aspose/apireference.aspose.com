---
title: "System::Collections::BitArray class"
linktitle: "BitArray"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::BitArray class. مصفوفة من البتات يمكن الوصول إليها عبر الفهرس. يجب تخصيص كائنات هذه الفئة فقط باستخدام الدالة System::MakeObject(). لا تقم أبدًا بإنشاء نسخة من هذا النوع على المكدس أو باستخدام المشغل new، لأن ذلك سيؤدي إلى أخطاء وقت التشغيل و/أو أعطال التأكيد. احرص دائمًا على تغليف هذه الفئة في مؤشر System::SmartPtr واستخدام هذا المؤشر لتمريره إلى الدوال كمعامل في C++."
type: docs
weight: 100
url: /ar/cpp/system.collections/bitarray/
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
## الطرق

| طريقة | الوصف |
| --- | --- |
| [Add](./add/)(const bool\&) override | يضيف قيمة إلى نهاية الحاوية. |
| [And](./and/)(const BitArrayPtr\&) | يحسب العملية البتية 'and' بين مجموعتين من BitSets. |
| [BitArray](./bitarray/)(const bitset\&) | منشئ النسخ. |
| [BitArray](./bitarray/)(const BitArray\&) | منشئ النسخ. |
| [BitArray](./bitarray/)(const BitArrayPtr\&) | منشئ النسخ. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<bool\>\&) | منشئ النسخ. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<uint8_t\>\&) | منشئ النسخ. |
| [BitArray](./bitarray/)(const System::ArrayPtr\<int\>\&) | منشئ النسخ. |
| [BitArray](./bitarray/)(int, bool) | منشئ تعبئة. |
| [Clear](./clear/)() override | يحذف جميع العناصر. |
| [Contains](./contains/)(const bool\&) const override | يتحقق مما إذا كانت القيمة المحددة موجودة في الحاوية. غير مُنفّذة. |
| [CopyTo](./copyto/)(System::ArrayPtr\<bool\>, int) override | ينسخ البيانات إلى عناصر المصفوفة الموجودة. |
| [data](./data/)() | الوصول إلى بنية البيانات الأساسية. |
| [data](./data/)() const | الوصول إلى بنية البيانات الأساسية. |
| [Get](./get/)(int) const | يحصل على عنصر [BitArray](./). |
| [get_Count](./get_count/)() const override | يحصل على حجم الحاوية. |
| [get_Length](./get_length/)() const | يحصل على حجم الحاوية. |
| [GetEnumerator](./getenumerator/)() override | ينشئ كائن عداد. |
| [idx_get](./idx_get/)(int) const | دالة جلب. |
| [idx_set](./idx_set/)(int, bool) | دالة ضبط. |
| [Not](./not/)() | يعكس BitSet. |
| [operator!=](./operator!=/)(const BitArray\&) const | عامل مقارنة بتية. |
| [operator==](./operator==/)(const BitArray\&) const | عامل مقارنة بتية. |
| [operator[]](./operator[]/)(int) | دالة وصول. |
| [Or](./or/)(const BitArrayPtr\&) | يحسب العملية البتية 'or' بين مجموعتين من BitSets. |
| [Remove](./remove/)(const bool\&) override | يعيد أول ظهور للقيمة المحددة. غير مُنفّذة. |
| [Set](./set/)(int, bool) | يضبط عنصر [BitArray](./). |
| [SetAll](./setall/)(bool) | يضبط جميع العناصر إلى قيمة محددة. |
| [SetTemplateWeakPtr](./settemplateweakptr/)(uint32_t) override | تنفيذ رسمي لآلية وسائط القالب الضعيفة؛ غير قابل للتطبيق على هذه الفئة. |
| [virtualizeBeginConstIterator](./virtualizebeginconstiterator/)() const override | يحصل على تنفيذ begin const iterator للحاوية الحالية. |
| [virtualizeBeginIterator](./virtualizebeginiterator/)() override | يحصل على تنفيذ begin iterator للحاوية الحالية. |
| [virtualizeEndConstIterator](./virtualizeendconstiterator/)() const override | يحصل على تنفيذ end const iterator للحاوية الحالية. |
| [virtualizeEndIterator](./virtualizeenditerator/)() override | يحصل على تنفيذ end iterator للحاوية الحالية. |
| [Xor](./xor/)(const BitArrayPtr\&) | يحسب العملية الثنائية 'xor' بين مجموعتي BitSets. |
## Typedefs

| تعريف نوع | الوصف |
| --- | --- |
| [bitset](./bitset/) | معلومات RTTI. |
## ملاحظات



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
  // ينشئ مثيلاً جديدًا من الفئة BitArray.
  auto bitArray = MakeObject<System::Collections::BitArray>(3);

  // طباعة القيم.
  Print(bitArray);

  return 0;
}
/*
This code example produces the following output:
0 0 0
*/
```

## انظر أيضًا

* Class [Object](../../system/object/)
* Class [ICollection](../../system.collections.generic/icollection/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
