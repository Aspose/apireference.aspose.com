---
title: "دالة System::Cast"
linktitle: "Cast"
second_title: "Aspose.Page لـ C++"
description: "دالة System::Cast. تُجري تحويلًا على كائنات SmartPtr في C++."
type: docs
weight: 15300
url: /ar/cpp/system/cast/
---
## System::Cast method


تُجري تحويلًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
