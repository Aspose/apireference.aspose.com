---
title: "دالة System::setter_decrement_wrap"
linktitle: "setter_decrement_wrap"
second_title: "Aspose.Font لـ C++"
description: "دالة System::setter_decrement_wrap. يترجم المترجم تعبيرات ما قبل الإنقاص في C#'' التي تستهدف خاصية الكائن التي لديها setter و getter معرفين، إلى استدعاء هذه الدالة (تحميل زائد للمستخرج const) في C++."
type: docs
weight: 37200
url: /ar/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


المترجم يترجم تعبيرات ما قبل الإنقاص في C#'s التي تستهدف خاصية الكائن التي لديها setter و getter معرفين، إلى استدعاء هذه الدالة (تحميل زائد للمستخرج const).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| معامل | الوصف |
| --- | --- |
| T | نوع الخاصية. |
| Host | - فئة الكائن المراد تعديلها |
| HostConstGet | - Host نفسه، أو النوع الأساسي له، حيث تم تعريف getter الخاصية |
| HostSet | - Host نفسه، أو النوع الأساسي له، حيث تم تعريف setter الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| host | Host *const | الكائن المستهدف لاستدعاء getters و setters له. |
| pGetter | T(HostConstGet::*)() const | مؤشر دالة يشير إلى دالة getter الخاصة بالخاصية. |
| pSetter | void(HostSet::*)(T) | مؤشر دالة يشير إلى دالة setter الخاصة بالخاصية. |

### ReturnValue

قيمة الخاصية قبل الزيادة.

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


المترجم يترجم تعبيرات ما قبل الإنقاص في C# التي تستهدف خاصية كائن لديها مُحدد ومُسترجع معرفة، إلى استدعاء هذه الدالة (إصدار مُحمَّل للمسترجع غير الثابت).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| معامل | الوصف |
| --- | --- |
| T | نوع الخاصية. |
| Host | - فئة الكائن المراد تعديلها |
| HostGet | - Host نفسه، أو النوع الأساسي له، حيث تم تعريف getter الخاصية |
| HostSet | - Host نفسه، أو النوع الأساسي له، حيث تم تعريف setter الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| host | Host *const | الكائن المستهدف لاستدعاء getters و setters له. |
| pGetter | T(HostGet::*)() | مؤشر دالة يشير إلى دالة getter الخاصة بالخاصية. |
| pSetter | void(HostSet::*)(T) | مؤشر دالة يشير إلى دالة setter الخاصة بالخاصية. |

### ReturnValue

قيمة الخاصية قبل الزيادة.

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


المترجم يترجم تعبيرات ما قبل الإنقاص في C# التي تستهدف خاصية فئة لديها مُحدد ومُسترجع معرفة، إلى استدعاء هذه الدالة.

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| معامل | الوصف |
| --- | --- |
| T | نوع الخاصية |

| معامل | نوع | الوصف |
| --- | --- | --- |
| pGetter | T(*)() | مؤشر دالة يشير إلى الدالة الحرة للمسترجع للخاصية |
| pSetter | void(*)(T) | مؤشر دالة يشير إلى الدالة الحرة للمحدد للخاصية |

### ReturnValue

قيمة الخاصية قبل الزيادة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
