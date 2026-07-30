---
title: "طريقة System::Cast_noexcept"
linktitle: "Cast_noexcept"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Cast_noexcept. تُجري تحويلًا على كائنات SmartPtr في C++."
type: docs
weight: 15500
url: /ar/cpp/system/cast_noexcept/
---
## System::Cast_noexcept method


تُجري تحويلًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast_noexcept(SmartPtr<TFrom> const &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
