---
title: "طريقة System::Cast"
linktitle: "Cast"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Cast. تُجري تحويلًا على كائنات SmartPtr في C++."
type: docs
weight: 15400
url: /ar/cpp/system/cast/
---
## System::Cast method


تُجري تحويلًا على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::Cast(SmartPtr<TFrom> const &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
