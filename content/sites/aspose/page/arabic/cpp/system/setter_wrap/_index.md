---
title: "طريقة System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::setter_wrap. تحميل زائد لدوال تعيين المثيل مع تحويل النوع في C++."
type: docs
weight: 38200
url: /ar/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


تحميل زائد لدوال تعيين المثيل مع تحويل النوع.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة. |
| T2 | النوع المتوقع من دالة التعيين. |
| Host | نوع المثيل. |
| HostSet | - المضيف نفسه، أو نوعه الأساسي، حيث تم تعريف مُعيّن الخاصية. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| host | Host *const | [Object](../object/) لاستدعاء دالة المُعيّن. |
| pSetter | void(HostSet::*)(T2) | مرجع دالة المُعيّن. |
| value | T | القيمة التي سيتم تعيينها. |

### ReturnValue

تعيين القيمة.

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


إصدار بديل لدوال المُعيّن الثابتة مع تحويل النوع.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع القيمة. |
| T2 | النوع المتوقع من دالة التعيين. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| pSetter | void(*)(T2) | مرجع دالة المُعيّن الثابت. |
| value | T | القيمة التي سيتم تعيينها. |

### ReturnValue

تعيين القيمة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
