---
title: "فئة System::Collections::IEnumeratorImplValueType"
linktitle: "IEnumeratorImplValueType"
second_title: "Aspose.Font لـ C++"
description: "فئة System::Collections::IEnumeratorImplValueType. غلاف يُنشئ تنفيذ IEnumerator غير عام فوق Iterator العام IEnumeratorImplRefType - غلاف لأنواع القيم في C++."
type: docs
weight: 800
url: /ar/cpp/system.collections/ienumeratorimplvaluetype/
---
## IEnumeratorImplValueType class


غلاف يُنشئ تنفيذ [IEnumerator](../ienumerator/) غير عام فوق Iterator العام [IEnumeratorImplRefType](../ienumeratorimplreftype/) - غلاف لأنواع القيم.

```cpp
template<typename T>class IEnumeratorImplValueType : public System::Collections::IEnumerator
```


| معامل | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Current](./get_current/)() const override | يحصل على العنصر الحالي. |
| [IEnumeratorImplValueType](./ienumeratorimplvaluetype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<T\>\>) | منشئ الغلاف |
| [MoveNext](./movenext/)() override | ينقل المُعدِّد إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يضبط الإشارة إلى أول عنصر متاح. إذا تم الوصول إلى نهاية الحاوية، لا يفعل شيئًا. |

## انظر أيضًا

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Font for C++](../../)
