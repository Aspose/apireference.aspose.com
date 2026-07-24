---
title: "طريقة System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Cast_noexcept. تُجري تحويلًا على كائنات SmartPtr في C++."
type: docs
weight: 15400
url: /ar/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


تُجري تحويلًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
