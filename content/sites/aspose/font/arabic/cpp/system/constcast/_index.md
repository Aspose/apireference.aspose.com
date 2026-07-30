---
title: "System::ConstCast طريقة"
linktitle: "تحويل ثابت"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ConstCast. نهاية التحويلات المهجورة في C++."
type: docs
weight: 16200
url: /ar/cpp/system/constcast/
---
## System::ConstCast method


نهاية التحويلات المهجورة.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| معامل | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.
## ملاحظات


يُجري تحويل const على كائنات [SmartPtr](../smartptr/).
## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
