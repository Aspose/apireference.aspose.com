---
title: "System::Collections::Generic::EnumeratorWrapperIterator فئة"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Font لـ C++"
description: "System::Collections::Generic::EnumeratorWrapperIterator فئة. المكرّر الذي يلتف حول المُعدِّد المُنشأ مسبقًا ويعيد توجيه جميع الاستدعاءات إليه في C++."
type: docs
weight: 1500
url: /ar/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


مكرّر يلف المُعدد المُنشأ مسبقًا ويعيد توجيه جميع الاستدعاءات إليه.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| معامل | الوصف |
| --- | --- |
| Element | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المكرِّر الحالي. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. يجب تحديث m_is_end و m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | يتحقق مما إذا كان المكرّران يشيران إلى نفس العنصر. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | المدمر. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Font for C++](../../)
