---
title: "طريقة System::MakeObject"
linktitle: "MakeObject"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::MakeObject. تنشئ كائنًا على الكومة وتعيد مؤشرًا مشتركًا إليه في C++."
type: docs
weight: 24600
url: /ar/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


ينشئ كائنًا على الكومة ويعيد مؤشرًا مشتركًا إليه.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| معامل | الوصف |
| --- | --- |
| T | الفئة لإنشائها. |
| المعاملات | أنواع معطيات المُنشئ. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| args | Args\\&&... | معطيات المُنشئ. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeObject(Args\&&...) method


ينشئ كائنًا على الكومة ويعيد مؤشرًا مشتركًا إليه.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| معامل | الوصف |
| --- | --- |
| T | [SmartPtr](../smartptr/) إلى الفئة لإنشائها. |
| المعاملات | أنواع معطيات المُنشئ. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| args | Args\\&&... | معطيات المُنشئ. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
