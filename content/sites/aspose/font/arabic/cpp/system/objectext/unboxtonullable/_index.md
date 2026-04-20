---
title: "System::ObjectExt::UnboxToNullable طريقة"
linktitle: "UnboxToNullable"
second_title: "Aspose.Font لـ C++"
description: "System::ObjectExt::UnboxToNullable طريقة. يفتح تغليف الكائن إلى نوع قابل للإلغاء في C++."
type: docs
weight: 1700
url: /ar/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


يفك تعبئة الكائن إلى نوع قابل للإلغاء.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الوجهة. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |
| آمن | bool | إذا كان true، أعد nullptr عند الفشل، وإلا ارمِ InvalidCastException. |

### ReturnValue

قيمة قابلة للإلغاء غير مغلفة (قد تكون null).

## انظر أيضًا

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
