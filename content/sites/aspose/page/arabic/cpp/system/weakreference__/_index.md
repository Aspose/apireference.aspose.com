---
title: "فئة System::WeakReference<>"
linktitle: "WeakReference<>"
second_title: "Aspose.Page لـ C++"
description: "فئة System::WeakReference<>. تمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن في C++."
type: docs
weight: 7800
url: /ar/cpp/system/weakreference__/
---
## WeakReference<> class


يمثل إشارة ضعيفة، تُشير إلى كائن مع السماح بحذف ذلك الكائن.

```cpp
class WeakReference<> : public System::WeakReference<System::Object>
```

## الطرق

| طريقة | الوصف |
| --- | --- |
| [get_IsAlive](./get_isalive/)() const | يحصل على إشارة ما إذا كان الكائن المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي قد تم حذفه. |
| [get_Target](./get_target/)() const | يحصل على الكائن (الهدف) المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي. |
| [set_Target](./set_target/)(const SmartPtr\<Object\>\&) | يضبط الكائن (الهدف) المشار إليه بواسطة كائن [WeakReference](../weakreference/) الحالي. |
| [WeakReference](./weakreference/)() | منشئ افتراضي. |
| [WeakReference](./weakreference/)(std::nullptr_t) | منشئ من nullptr. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&) | يُهيئ نسخة جديدة من فئة [WeakReference](../weakreference/)، مُشيرًا إلى الكائن المحدد. |
| [WeakReference](./weakreference/)(const SmartPtr\<Object\>\&, bool) | يُهيئ نسخة جديدة من فئة [WeakReference](../weakreference/)، مُشيرًا إلى الكائن المحدد. |
## انظر أيضًا

* Class [WeakReference](../weakreference/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
