---
title: "System::Collections::IEnumeratorImplRefType فئة"
linktitle: "IEnumeratorImplRefType"
second_title: "Aspose.Page لـ C++"
description: "System::Collections::IEnumeratorImplRefType فئة. المغلف الذي ينشئ تنفيذ IEnumerator غير عام فوق Iterator العام IEnumeratorImplRefType - مغلف لأنواع المرجع في C++."
type: docs
weight: 700
url: /ar/cpp/system.collections/ienumeratorimplreftype/
---
## IEnumeratorImplRefType class


المغلف الذي ينشئ تنفيذ [IEnumerator](../ienumerator/) غير عام فوق Iterator العام [IEnumeratorImplRefType](./) - مغلف لأنواع المرجع.

```cpp
template<typename T>class IEnumeratorImplRefType : public System::Collections::IEnumerator
```


| Parameter | الوصف |
| --- | --- |
| T | نوع العنصر. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_Current](./get_current/)() const override | يحصل على العنصر الحالي. |
| [IEnumeratorImplRefType](./ienumeratorimplreftype/)(System::SharedPtr\<System::Collections::Generic::IEnumerator\<System::SharedPtr\<T\>\>\>) | منشئ الغلاف |
| [MoveNext](./movenext/)() override | ينقل المُعدِّر إلى العنصر التالي. إذا لم يتم الإشارة إلى أي عنصر من قبل، يحدد المرجع إلى أول عنصر متاح. إذا وصل إلى نهاية الحاوية، لا يفعل شيئًا. |

## انظر أيضًا

* Class [IEnumerator](../ienumerator/)
* Namespace [System::Collections](../)
* Library [Aspose.Page for C++](../../)
