---
title: "System::WeakReference< T > فئة"
linktitle: "WeakReference< T >"
second_title: "Aspose.Page لـ C++"
description: "System::WeakReference< T > فئة. تمثل مرجعًا ضعيفًا، يشير إلى كائن مع السماح بحذف ذلك الكائن في C++."
type: docs
weight: 7700
url: /ar/cpp/system/weakreference_t_/
---
## WeakReference< T > class


يمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن.

```cpp
template<typename T>class WeakReference< T > : public System::Object
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن المرجعي. |
## الطرق

| طريقة | الوصف |
| --- | --- |
| [operator!=](./operator!=/)(std::nullptr_t) const | يتحقق مما إذا كان الكائن المرجعي غير فارغ. |
| [operator!=](./operator!=/)(const WeakReference\<T\>\&) const | يقارن الكائن المرجعي مع نسخة أخرى من فئة [WeakReference](../weakreference/). |
| [operator==](./operator==/)(std::nullptr_t) const | يتحقق مما إذا كان الكائن المرجعي فارغًا. |
| [operator==](./operator==/)(const WeakReference\<T\>\&) const | يقارن الكائن المرجعي مع نسخة أخرى من فئة [WeakReference](../weakreference/). |
| [reset](./reset/)() |  |
| [SetTarget](./settarget/)(const SmartPtr\<T\>\&) | يضبط الكائن (الهدف) المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي. |
| [TryGetTarget](./trygettarget/)(const SmartPtr\<T\>\&) const | يحصل على الكائن (الهدف) المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي. |
| [WeakReference](./weakreference/)() | منشئ افتراضي. |
| [WeakReference](./weakreference/)(std::nullptr_t) | منشئ من nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&) | يُهيئ نسخة جديدة من فئة [WeakReference](../weakreference/)، مُشيرًا إلى الكائن المحدد. |
| [WeakReference](./weakreference/)(const SmartPtr\<T\>\&, bool) | يُهيئ نسخة جديدة من فئة [WeakReference](../weakreference/)، مُشيرًا إلى الكائن المحدد. |

## انظر أيضًا

* Class [Object](../object/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
