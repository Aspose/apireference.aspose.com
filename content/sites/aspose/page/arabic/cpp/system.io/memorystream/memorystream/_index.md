---
title: "منشئ System::IO::MemoryStream::MemoryStream"
linktitle: "MemoryStream"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::IO::MemoryStream::MemoryStream. يُنشئ نسخة جديدة من فئة MemoryStream بسعة أولية تساوي 0 في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


يُنشئ نسخة جديدة من الفئة [MemoryStream](../) بسعة أولية تساوي 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## انظر أيضًا

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


يُنشئ نسخة جديدة من الفئة [MemoryStream](../) التي تمثل دفق ذاكرة متصل بالمخزن المؤقت للذاكرة المحدد. تُحدد معلمة ما إذا كان الدفق قابلًا للكتابة.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | مصفوفة بايت تُستَخدم كمخزن مؤقت للذاكرة التي سيستند إليها الدفق المُمَثَّل بالكيان الذي يتم إنشاؤه |
| قابل للكتابة | bool | يحدد ما إذا كان يجب أن يكون الدفق قابلًا للكتابة |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


يُنشئ نسخة جديدة من الفئة [MemoryStream](../) التي تمثل دفق ذاكرة متصل بقطاع من المخزن المؤقت للذاكرة المحدد يبدأ عند الفهرس المحدد ويتضمن عدد العناصر المحدد. تُحدد المعلمات ما إذا كان الدفق قابلًا للكتابة وما إذا كان يمكن استدعاء الطريقة GetBytes().

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| content | const ArrayPtr\<uint8_t\>\& | مصفوفة بايت يُستَخدم قطاع منها كمخزن مؤقت للذاكرة التي سيستند إليها الدفق المُمَثَّل بالكيان الذي يتم إنشاؤه |
| الفهرس | int | فهرس يبدأ من الصفر للعنصر في **content** الذي يبدأ عنده القطاع |
| count | int | عدد العناصر في **content** المتضمنة في القطاع |
| قابل للكتابة | bool | يحدد ما إذا كان يجب أن يكون الدفق قابلًا للكتابة |
| publiclyVisible | bool | يحدد ما إذا كان يجب إتاحة المخزن المؤقت للذاكرة الأساسي للمتصل بطريقة GetByte() |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


يُنشئ نسخة جديدة من الفئة [MemoryStream](../) التي تمثل دفقًا يعتمد على مخزن مؤقت للذاكرة بالحجم المحدد.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| capacity_ | int | حجم الذاكرة بالبايتات للمخزن المؤقت المرتبط بالتدفق الممثل بالكائن الذي يتم إنشاؤه |

## انظر أيضًا

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
