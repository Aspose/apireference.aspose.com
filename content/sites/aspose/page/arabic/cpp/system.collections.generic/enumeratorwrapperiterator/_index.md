---
title: "الفئة System::Collections::Generic::EnumeratorWrapperIterator"
linktitle: "EnumeratorWrapperIterator"
second_title: "Aspose.Page لـ C++"
description: "الفئة System::Collections::Generic::EnumeratorWrapperIterator. المكرّر الذي يلفّ المُعدِّ المُنشأ مسبقًا ويوجه جميع الاستدعاءات إليه في C++."
type: docs
weight: 1500
url: /ar/cpp/system.collections.generic/enumeratorwrapperiterator/
---
## EnumeratorWrapperIterator class


مُكرّر يلتف حول المُعدِّد المُنشأ مسبقًا ويعيد توجيه جميع الاستدعاءات إليه.

```cpp
template<typename Element>class EnumeratorWrapperIterator : public System::Details::VirtualizedIteratorBase<Element>
```


| Parameter | الوصف |
| --- | --- |
| Element | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [CloneIterator](./cloneiterator/)() const override | ينسخ المتكرر الحالي. |
| [EnumeratorWrapperIterator](./enumeratorwrapperiterator/)(const SharedPtr\<IEnumerator\<Element\>\>\&) |  |
| [IncrementIterator](./incrementiterator/)() override | يحرك المكرّر خطوة إلى الأمام. يجب تحديث m_is_end و m_pointer. |
| [IteratorEquals](./iteratorequals/)(System::Details::VirtualizedIteratorBase\<Element\> *) const override | يتحقق مما إذا كان المكرّران يشيران إلى نفس العنصر. |
| virtual [~EnumeratorWrapperIterator](./~enumeratorwrapperiterator/)() | المدمر. |

## انظر أيضًا

* Namespace [System::Collections::Generic](../)
* Library [Aspose.Page for C++](../../)
