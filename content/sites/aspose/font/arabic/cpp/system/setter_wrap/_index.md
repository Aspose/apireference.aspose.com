---
title: "طريقة System::setter_wrap"
linktitle: "setter_wrap"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::setter_wrap. تحميل زائد لدوال تعيين المثيل مع تحويل النوع في C++."
type: docs
weight: 38300
url: /ar/cpp/system/setter_wrap/
---
## System::setter_wrap(Host *const, void(HostSet::*)(T2), T) method


تحميل زائد لدوال تعيين المثيل مع تحويل النوع.

```cpp
template<typename T,typename T2,typename Host,typename HostSet> std::enable_if<std::is_base_of<HostSet, Host>::value, T>::type System::setter_wrap(Host *const host, void(HostSet::*pSetter)(T2), T value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |
| T2 | النوع المتوقع من دالة التعيين. |
| Host | نوع المثيل. |
| HostSet | - المضيف نفسه، أو نوعه الأساسي، حيث تم تعريف محدد الخاصية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| host | Host *const | [Object](../object/) لاستدعاء دالة الضبط لـ. |
| pSetter | void(HostSet::*)(T2) | مرجع دالة الضبط. |
| قيمة | T | القيمة التي سيتم ضبطها. |

### ReturnValue

ضبط القيمة.

## انظر أيضًا

* Enum [UriComponents](../uricomponents/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::setter_wrap(void(*)(T2), T) method


تحمل زائد لدوال الضبط الثابتة مع تحويل النوع.

```cpp
template<typename T,typename T2> T System::setter_wrap(void(*pSetter)(T2), T value)
```


| معامل | الوصف |
| --- | --- |
| T | نوع القيمة. |
| T2 | النوع المتوقع من دالة التعيين. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| pSetter | void(*)(T2) | مرجع دالة الضبط الثابتة. |
| قيمة | T | القيمة التي سيتم ضبطها. |

### ReturnValue

ضبط القيمة.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
