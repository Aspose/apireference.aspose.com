---
title: "منشئ System::IO::StreamWriter::StreamWriter"
linktitle: "StreamWriter"
second_title: "Aspose.Page لـ C++"
description: "منشئ System::IO::StreamWriter::StreamWriter. يُنشئ نسخة من كائن StreamWriter الذي يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/streamwriter/streamwriter/
---
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&) constructor


يُنشئ نسخة من كائن [StreamWriter](../) الذي يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | دفق الإدخال الأساسي لكتابة الأحرف إليه |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


إنشاء نسخة من كائن [StreamWriter](../) الذي يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | دفق الإدخال الأساسي لكتابة الأحرف إليه |
| الترميز | const EncodingPtr\& | الترميز المراد استخدامه |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const SharedPtr\<Stream\>\&, const EncodingPtr\&, int, bool) constructor


إنشاء نسخة من كائن [StreamWriter](../) الذي يكتب الأحرف إلى الدفق الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. تحدد معلمة ما إذا كان يجب إغلاق الدفق الأساسي عندما يتم التخلص من كائن [StreamWriter](../).

```cpp
System::IO::StreamWriter::StreamWriter(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, int buffer_size, bool leave_open=false)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | دفق الإدخال الأساسي لكتابة الأحرف إليه |
| الترميز | const EncodingPtr\& | الترميز المراد استخدامه |
| buffer_size | int | الحد الأدنى لحجم المخزن المؤقت بالبايت |
| leave_open | bool | يحدد ما إذا كان يجب ترك الدفق الأساسي مفتوحًا بعد التخلص من كائن [StreamWriter](../) الحالي. |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&) constructor


إنشاء نسخة من كائن [StreamWriter](../) الذي يكتب الأحرف إلى الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف لكتابة الأحرف إليه |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&, int) constructor


إنشاء نسخة من كائن [StreamWriter](../) الذي يكتب الأحرف إلى الملف المحدد باستخدام الترميز المحدد وحجم المخزن المؤقت. تحدد معلمة ما إذا كان يجب إلحاق البيانات بالملف أو استبدال محتوى الملف.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding, int buffer_size)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف لكتابة الأحرف إليه |
| append | bool | يحدد ما إذا كان يجب إلحاق البيانات بالملف المحدد (true) أو استبدال محتوى الملف (false). |
| الترميز | const EncodingPtr\& | الترميز المراد استخدامه |
| buffer_size | int | حجم المخزن المؤقت للاستخدام |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::StreamWriter(const String\&, bool, const EncodingPtr\&) constructor


إنشاء نسخة من كائن [StreamWriter](../) الذي يكتب الأحرف إلى الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت. تحدد معلمة ما إذا كان يجب إلحاق البيانات بالملف أو استبدال محتوى الملف.

```cpp
System::IO::StreamWriter::StreamWriter(const String &path, bool append, const EncodingPtr &encoding=System::Text::Encoding::get_UTF8Unmarked())
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المسار | const String\& | مسار الملف لكتابة الأحرف إليه |
| append | bool | يحدد ما إذا كان يجب إلحاق البيانات بالملف المحدد (true) أو استبدال محتوى الملف (false). |
| الترميز | const EncodingPtr\& | الترميز المراد استخدامه |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
