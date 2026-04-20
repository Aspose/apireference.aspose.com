---
title: "فئة System::WeakReference< T >"
linktitle: "WeakReference< T >"
second_title: "Aspose.Font لـ C++"
description: "فئة System::WeakReference< T >. تمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن في C++."
type: docs
weight: 7700
url: /ar/cpp/system/weakreference_t_/
---
## WeakReference< T > class


يمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن المشار إليه. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | يتحقق مما إذا كان الكائن المشار إليه غير فارغ. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | يقارن الكائن المشار إليه مع نسخة أخرى من فئة [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان الكائن المشار إليه فارغًا. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | يقارن الكائن المشار إليه مع نسخة أخرى من فئة [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | يضبط الكائن (الهدف) المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | يحصل على الكائن (الهدف) المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي. |
| [WeakReference](./weakreference/)() | منشئ افتراضي. |
| [WeakReference](./weakreference/)(std::nullptr_t) | منشئ من nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | يُهيئ نسخة جديدة من فئة [WeakReference](../weakreference/)، مشيرة إلى الكائن المحدد. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | يُهيئ نسخة جديدة من فئة [WeakReference](../weakreference/)، مشيرة إلى الكائن المحدد. |

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
