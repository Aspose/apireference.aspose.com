---
title: "طريقة System::Nullable::operator-= "
linktitle: "operator-="
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Nullable::operator-= method. تُطبق operator-=() على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة الممثلة بواسطة كائن Nullable المحدد كمعامل جانبي أيمن في C++."
type: docs
weight: 1500
url: /ar/cpp/system/nullable/operator-=/
---
## Nullable::operator-=(const Nullable\<T1\>\&) method


تُطبق [operator-=()](./) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة الممثلة بواسطة كائن [Nullable](../) المحدد كمعامل جانبي أيمن.

```cpp
template<typename T1> Nullable<T> System::Nullable<T>::operator-=(const Nullable<T1> &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | النوع الأساسي لكائن [Nullable](../) الذي تُستخدم قيمته الممثلة كمعامل جانبي أيمن لـ [operator-=()](./) |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const Nullable\<T1\>\& | مرجع ثابت إلى كائن [Nullable](../) تُستخدم قيمته الممثلة كمعامل جانبي أيمن لـ [operator-=()](./) المطبق على القيمة الممثلة بواسطة الكائن الحالي. |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(const T1\&) method


تُطبق [operator-=()](./) على القيمة الممثلة بواسطة الكائن الحالي باستخدام القيمة المحددة كمعامل جانبي أيمن.

```cpp
template<typename T1,typename> std::enable_if<!IsNullable<T1>::value, Nullable<T>>::type System::Nullable<T>::operator-=(const T1 &other)
```


| معامل | الوصف |
| --- | --- |
| T1 | نوع القيمة المستخدمة كقيمة جانبية أيمن لـ [operator-=()](./) |

| معامل | نوع | الوصف |
| --- | --- | --- |
| other | const T1\& | مرجع ثابت إلى القيمة التي تُستخدم كقيمة جانبية أيمن لـ [operator-=()](./) المطبق على القيمة الممثلة بواسطة الكائن الحالي. |

### ReturnValue

مرجع إلى الذات

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Nullable::operator-=(T1) method


تُرجع نسخة من فئة [Nullable](../) تمثل قيمة فارغة.

```cpp
template<typename T1,typename> Nullable<T> System::Nullable<T>::operator-=(T1)
```

## انظر أيضًا

* Class [Nullable](../)
* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
