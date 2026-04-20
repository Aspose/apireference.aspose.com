---
title: "طريقة System::ForceStaticCast"
linktitle: "فرض تحويل ثابت"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ForceStaticCast. تقوم بإجراء تحويل ثابت حقيقي على كائنات SmartPtr في C++."
type: docs
weight: 20500
url: /ar/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


تقوم بإجراء تحويل ثابت حقيقي على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا، وإلا فإن السلوك غير معرف.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
