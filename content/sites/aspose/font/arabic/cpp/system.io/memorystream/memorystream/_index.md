---
title: "منشئ System::IO::MemoryStream::MemoryStream"
linktitle: "MemoryStream"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::IO::MemoryStream::MemoryStream. ينشئ مثيلًا جديدًا من فئة MemoryStream بسعة أولية تساوي 0 في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/memorystream/memorystream/
---
## MemoryStream::MemoryStream() constructor


ينشئ مثيلًا جديدًا من الفئة [MemoryStream](../) بسعة أولية تساوي 0.

```cpp
System::IO::MemoryStream::MemoryStream()
```

## انظر أيضًا

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, bool) constructor


ينشئ مثيلًا جديدًا من الفئة [MemoryStream](../) التي تمثل تدفقًا ذا ذاكرة متصلة بالمخزن المؤقت المحدد. يحدد أحد المعاملات ما إذا كان التدفق قابلًا للكتابة.

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, bool writable=true)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المحتوى | const ArrayPtr\<uint8_t\>\& | مصفوفة بايت تُستخدم كمخزن مؤقت للذاكرة التي سيُبنى عليها التدفق المُمَثَّل بالكيان الذي يتم إنشاؤه. |
| قابل للكتابة | bool | يحدد ما إذا كان يجب أن يكون التدفق قابلًا للكتابة |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(const ArrayPtr\<uint8_t\>\&, int, int, bool, bool) constructor


ينشئ مثيلًا جديدًا من الفئة [MemoryStream](../) التي تمثل تدفقًا ذا ذاكرة متصلة بقطاع من المخزن المؤقت المحدد يبدأ عند الفهرس المحدد ويشمل عدد العناصر المحدد. تحدد المعلمات ما إذا كان التدفق قابلًا للكتابة وما إذا كان يمكن استدعاء الطريقة GetBytes().

```cpp
System::IO::MemoryStream::MemoryStream(const ArrayPtr<uint8_t> &content, int index, int count, bool writable=true, bool publiclyVisible=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| المحتوى | const ArrayPtr\<uint8_t\>\& | مصفوفة بايت يُستخدم جزء منها كمخزن مؤقت للذاكرة التي سيُبنى عليها التدفق المُمَثَّل بالكيان الذي يتم إنشاؤه. |
| الفهرس | int | فهرس يبدأ من الصفر للعنصر في **content** الذي يبدأ عنده القطاع |
| count | int | عدد العناصر في **content** المتضمنة في القطاع |
| قابل للكتابة | bool | يحدد ما إذا كان يجب أن يكون التدفق قابلًا للكتابة |
| publiclyVisible | bool | يحدد ما إذا كان يجب إتاحة المخزن المؤقت الأساسي للذاكرة للمتصل بطريقة GetByte() |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## MemoryStream::MemoryStream(int) constructor


ينشئ مثيلًا جديدًا من الفئة [MemoryStream](../) التي تمثل تدفقًا يعتمد على مخزن مؤقت للذاكرة بالحجم المحدد.

```cpp
System::IO::MemoryStream::MemoryStream(int capacity_)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| capacity_ | int | حجم المخزن المؤقت للذاكرة بالبايت المرتبط بالتدفق المُمَثَّل بالكيان الذي يتم إنشاؤه. |

## انظر أيضًا

* Class [MemoryStream](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
