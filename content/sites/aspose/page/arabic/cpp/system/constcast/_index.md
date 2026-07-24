---
title: "طريقة System::ConstCast"
linktitle: "ConstCast"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ConstCast. نهاية التحويلات المهجورة في C++."
type: docs
weight: 16100
url: /ar/cpp/system/constcast/
---
## System::ConstCast method


نهاية التحويلات المهجورة.

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::ConstCast(const SmartPtr<TFrom> &obj)
```


| Parameter | الوصف |
| --- | --- |
| TTo | نوع العنصر المستهدف. |
| TFrom | نوع العنصر المصدر. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<TFrom\>\& | مؤشر المصدر. |

### ReturnValue

نتيجة التحويل إذا كان التحويل مسموحًا أو nullptr وإلا.
## ملاحظات


يقوم بإجراء تحويل ثابت على كائنات [SmartPtr](../smartptr/).
## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
