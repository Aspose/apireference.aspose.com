---
title: "الفئة System::Collections::IEnumeratorImplRefType"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Font لـ C++"
description: "الفئة System::Collections::IEnumeratorImplRefType. غلاف ينشئ تنفيذ IEnumerator غير عام فوق Iterator العام IEnumeratorImplRefType - غلاف لأنواع المراجع في C++."
type: docs
weight: 700
url: /ar/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


المغلف الذي ينشئ تنفيذًا غير عام لـ [IEnumerator](../ienumerator/) فوق المكرّر العام [IEnumeratorImplRefType](./) - مغلف لأنواع المرجع.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Current](./get_current/)() const override | يحصل على العنصر الحالي. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | منشئ الغلاف |
| [MoveNext](./movenext/)() override | ينقل المُعدِّد إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يضبط الإشارة إلى أول عنصر متاح. إذا تم الوصول إلى نهاية الحاوية، لا يفعل شيئًا. |

## انظر أيضًا

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
