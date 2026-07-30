---
title: "System::IO::StreamWriter::StreamWriter constructor"
linktitle: "StreamWriter"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StreamWriter::StreamWriter constructor. ينشئ نسخة من كائن StreamWriter يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


ينشئ نسخة من كائن [StreamWriter](../) يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | الدفق الأساسي لكتابة الأحرف إليه |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


ينشئ نسخة من كائن [StreamWriter](../) يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | الدفق الأساسي لكتابة الأحرف إليه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


ينشئ نسخة من كائن [StreamWriter](../) يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد أحد المعاملات ما إذا كان يجب إغلاق الدفق الأساسي عندما يتم التخلص من كائن [StreamWriter](../).

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | الدفق الأساسي لكتابة الأحرف إليه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| buffer_size | int | الحد الأدنى لحجم الذاكرة المؤقتة بالبايت |
| leave_open | bool | يحدد ما إذا كان يجب ترك الدفق الأساسي مفتوحًا بعد التخلص من كائن [StreamWriter](../) الحالي |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


ينشئ نسخة من كائن [StreamWriter](../) يكتب الأحرف إلى الملف المحدد باستخدام ترميز UTF-8 وذاكرة مؤقتة بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي تُكتب إليه الأحرف |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


ينشئ نسخة من كائن [StreamWriter](../) يكتب الأحرف إلى الملف المحدد باستخدام الترميز المحدد وحجم الذاكرة المؤقتة. تُحدد معلمة ما إذا كان يجب إلحاق البيانات بالملف أو استبدال محتوى الملف.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي تُكتب إليه الأحرف |
| إلحاق | bool | يحدد ما إذا كان يجب إلحاق البيانات بالملف المحدد (true) أو استبدال محتوى الملف (false) |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| buffer_size | int | حجم الذاكرة المؤقتة المراد استخدامها |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


ينشئ نسخة من كائن [StreamWriter](../) يكتب الأحرف إلى الملف المحدد باستخدام الترميز المحدد وذاكرة مؤقتة بحجم افتراضي 1024 بايت. تُحدد معلمة ما إذا كان يجب إلحاق البيانات بالملف أو استبدال محتوى الملف.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const String\& | مسار الملف الذي تُكتب إليه الأحرف |
| إلحاق | bool | يحدد ما إذا كان يجب إلحاق البيانات بالملف المحدد (true) أو استبدال محتوى الملف (false) |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
