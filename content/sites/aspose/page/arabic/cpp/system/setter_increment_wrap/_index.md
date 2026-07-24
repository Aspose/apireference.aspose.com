---
title: "طريقة System::setter_increment_wrap"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::setter_increment_wrap. يقوم المترجم بترجمة تعبيرات الزيادة في C# التي تستهدف خاصية الفئة التي لديها مُحدِّد ومُستخرج معرف، إلى استدعاء هذه الدالة في C++."
type: docs
weight: 37400
url: /ar/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


يقوم المترجم بترجمة تعبيرات الزيادة في C# التي تستهدف خاصية الفئة التي لديها مُحدِّد ومُستخرج معرف، إلى استدعاء هذه الدالة.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الخاصية |
| Host | - فئة الكائن المراد تعديلها |
| HostGet | - الكائن Host نفسه، أو نوعه الأساسي، حيث تم تعريف getter الخاص بالخاصية |
| HostSet | - الكائن Host نفسه، أو نوعه الأساسي، حيث تم تعريف setter الخاص بالخاصية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| المضيف | Host *const | مؤشر إلى كائن تُزاد خاصيته. |
| pGetter | T(HostGet::*)() | مؤشر دالة يشير إلى طريقة الحصول على الخاصية. |
| pSetter | void(HostSet::*)(T) | مؤشر دالة يشير إلى طريقة تعيين الخاصية. |

### ReturnValue

القيمة المُزادَة للخاصية.

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


يقوم المترجم بترجمة تعبيرات الزيادة في C# التي تستهدف خاصية الفئة التي لديها مُحدِّد ومُستخرج معرف، إلى استدعاء هذه الدالة.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الخاصية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| pGetter | T(*)() | مؤشر دالة يشير إلى دالة getter الحرة للخاصية |
| pSetter | void(*)(T) | مؤشر دالة يشير إلى دالة setter الحرة للخاصية |

### ReturnValue

القيمة المُزادَة للخاصية.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
