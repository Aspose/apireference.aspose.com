---
title: "طريقة System::ObjectExt::UnboxToNullable"
linktitle: "UnboxToNullable"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::ObjectExt::UnboxToNullable. تفك صندوق الكائن إلى نوع قابل للفراغ في C++."
type: docs
weight: 1600
url: /ar/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


يفك تعبئة الكائن إلى نوع قابل للإلغاء.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الوجهة. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) للفك. |
| آمن | bool | إذا كان true، يُرجع nullptr عند الفشل، وإلا يرمي InvalidCastException. |

### ReturnValue

قيمة قابلة للفراغ غير مفكوكة (قد تكون null).

## انظر أيضًا

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
