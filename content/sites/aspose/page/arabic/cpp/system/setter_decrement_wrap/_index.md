---
title: "طريقة System::setter_decrement_wrap"
linktitle: "setter_decrement_wrap"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::setter_decrement_wrap. يترجم المترجم تعبيرات ما قبل الإنقاص في C#''s التي تستهدف خاصية instance''s التي لديها setter و getter معرفة، إلى استدعاء هذه الدالة (تحميل زائد لـ const getter) في C++."
type: docs
weight: 37100
url: /ar/cpp/system/setter_decrement_wrap/
---
## System::setter_decrement_wrap(Host *const, T(HostConstGet::*)() const, void(HostSet::*)(T)) method


المترجم يترجم تعبيرات ما قبل الإنقاص في C#'s التي تستهدف خاصية المثيل التي لديها setter و getter معرفة، إلى استدعاء هذه الدالة (تحميل زائد لـ const getter).

```cpp
template<typename T,typename Host,typename HostConstGet,typename HostSet> std::enable_if<std::is_base_of<HostConstGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostConstGet::*pGetter)() const, void(HostSet::*pSetter)(T))
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الخاصية. |
| Host | - فئة الكائن المراد تعديلها |
| HostConstGet | - الكائن Host نفسه، أو نوعه الأساسي، حيث تم تعريف getter الخاص بالخاصية |
| HostSet | - الكائن Host نفسه، أو نوعه الأساسي، حيث تم تعريف setter الخاص بالخاصية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| المضيف | Host *const | الكائن لاستدعاء getters و setters له. |
| pGetter | T(HostConstGet::*)() const | مؤشر دالة يشير إلى دالة getter الخاصة بالخاصية |
| pSetter | void(HostSet::*)(T) | مؤشر دالة يشير إلى دالة setter للخاصية |

### ReturnValue

قيمة الخاصية قبل الزيادة

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


المترجم يترجم تعبيرات ما قبل الإنقاص في C#'s التي تستهدف خاصية المثيل التي لديها setter و getter معرفة، إلى استدعاء هذه الدالة (تحميل زائد لـ non-const getter).

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_decrement_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الخاصية. |
| Host | - فئة الكائن المراد تعديلها |
| HostGet | - الكائن Host نفسه، أو نوعه الأساسي، حيث تم تعريف getter الخاص بالخاصية |
| HostSet | - الكائن Host نفسه، أو نوعه الأساسي، حيث تم تعريف setter الخاص بالخاصية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| المضيف | Host *const | الكائن لاستدعاء getters و setters له. |
| pGetter | T(HostGet::*)() | مؤشر دالة يشير إلى دالة getter الخاصة بالخاصية |
| pSetter | void(HostSet::*)(T) | مؤشر دالة يشير إلى دالة setter للخاصية |

### ReturnValue

قيمة الخاصية قبل الزيادة

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_decrement_wrap(T(*)(), void(*)(T)) method


المترجم يترجم تعبيرات ما قبل الإنقاص في C#'s التي تستهدف خاصية الفئة التي لديها setter و getter معرفة، إلى استدعاء هذه الدالة.

```cpp
template<typename T> T System::setter_decrement_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الخاصية |

| Parameter | Type | الوصف |
| --- | --- | --- |
| pGetter | T(*)() | مؤشر دالة يشير إلى دالة getter الحرة للخاصية |
| pSetter | void(*)(T) | مؤشر دالة يشير إلى دالة setter الحرة للخاصية |

### ReturnValue

قيمة الخاصية قبل الزيادة

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
