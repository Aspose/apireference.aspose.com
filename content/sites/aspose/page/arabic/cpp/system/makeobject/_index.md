---
title: "System::MakeObject طريقة"
linktitle: "MakeObject"
second_title: "Aspose.Page لـ C++"
description: "System::MakeObject طريقة. ينشئ كائنًا على الكومة ويعيد مؤشرًا مشتركًا إليه في C++."
type: docs
weight: 24500
url: /ar/cpp/system/makeobject/
---
## System::MakeObject(Args\&&...) method


ينشئ كائنًا على الكومة ويعيد مؤشرًا مشتركًا إليه.

```cpp
template<class T,class ...> std::enable_if<!IsSmartPtr<T>::value, SmartPtr<T>>::type System::MakeObject(Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| T | الفئة لإنشائها. |
| المعلمات | أنواع معلمات المُنشئ. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| args | Args\&&... | معلمات المُنشئ. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## انظر أيضًا

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::MakeObject(Args\&&...) method


ينشئ كائنًا على الكومة ويعيد مؤشرًا مشتركًا إليه.

```cpp
template<class T,class ...> std::enable_if<IsSmartPtr<T>::value, T>::type System::MakeObject(Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| T | [SmartPtr](../smartptr/) إلى الفئة لإنشائها. |
| المعلمات | أنواع معلمات المُنشئ. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| args | Args\&&... | معلمات المُنشئ. |

### ReturnValue

[SmartPtr](../smartptr/) to newly created object, always in shared mode.

## انظر أيضًا

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
