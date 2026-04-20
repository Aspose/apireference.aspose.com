---
title: "طريقة System::setter_increment_wrap"
linktitle: "setter_increment_wrap"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::setter_increment_wrap. يقوم المترجم بترجمة تعبيرات الزيادة في C# التي تستهدف خاصية الفئة التي لديها محدد ومُستخرج معرف، إلى استدعاء هذه الدالة في C++."
type: docs
weight: 37500
url: /ar/cpp/system/setter_increment_wrap/
---
## System::setter_increment_wrap(Host *const, T(HostGet::*)(), void(HostSet::*)(T)) method


يقوم المترجم بترجمة تعبيرات الزيادة في C# التي تستهدف خاصية الفئة التي لديها محدد ومُستخرج معرف، إلى استدعاء هذه الدالة.

```cpp
template<typename T,typename Host,typename HostGet,typename HostSet> std::enable_if<std::is_base_of<HostGet, Host>::value &&std::is_base_of<HostSet, Host>::value, T>::type System::setter_increment_wrap(Host *const host, T(HostGet::*pGetter)(), void(HostSet::*pSetter)(T))
```


| معامل | الوصف |
| --- | --- |
| T | نوع الخاصية |
| Host | - فئة الكائن المراد تعديلها |
| HostGet | - Host نفسه، أو النوع الأساسي له، حيث تم تعريف getter الخاصية |
| HostSet | - Host نفسه، أو النوع الأساسي له، حيث تم تعريف setter الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| host | Host *const | مؤشر إلى كائن تُزاد خاصيته. |
| pGetter | T(HostGet::*)() | مؤشر دالة يشير إلى طريقة الحصول على الخاصية. |
| pSetter | void(HostSet::*)(T) | مؤشر دالة يشير إلى طريقة تعيين الخاصية. |

### ReturnValue

القيمة التي تم زيادتها للخاصية.

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_increment_wrap(T(*)(), void(*)(T)) method


يقوم المترجم بترجمة تعبيرات الزيادة في C# التي تستهدف خاصية الفئة التي لديها محدد ومُستخرج معرف، إلى استدعاء هذه الدالة.

```cpp
template<typename T> T System::setter_increment_wrap(T(*pGetter)(), void(*pSetter)(T))
```


| معامل | الوصف |
| --- | --- |
| T | نوع الخاصية |

| معامل | نوع | الوصف |
| --- | --- | --- |
| pGetter | T(*)() | مؤشر دالة يشير إلى الدالة الحرة للمسترجع للخاصية |
| pSetter | void(*)(T) | مؤشر دالة يشير إلى الدالة الحرة للمحدد للخاصية |

### ReturnValue

القيمة التي تم زيادتها للخاصية.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
