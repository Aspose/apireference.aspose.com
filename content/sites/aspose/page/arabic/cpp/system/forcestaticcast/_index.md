---
title: "System::ForceStaticCast طريقة"
linktitle: "إجبار تحويل ثابت"
second_title: "Aspose.Page لـ C++"
description: "System::ForceStaticCast طريقة. يقوم بإجراء تحويل ثابت حقيقي على كائنات SmartPtr في C++."
type: docs
weight: 20400
url: /ar/cpp/system/forcestaticcast/
---
## System::ForceStaticCast method


يقوم بإجراء تحويل ثابت حقيقي على كائنات [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ForceStaticCast(SmartPtr<TFrom> const &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا، وإلا يكون السلوك غير معرف.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
