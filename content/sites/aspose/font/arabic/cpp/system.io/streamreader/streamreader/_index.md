---
title: "System::IO::StreamReader::StreamReader منشئ"
linktitle: "StreamReader"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StreamReader::StreamReader منشئ. ينشئ نسخة من كائن StreamReader الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت في C++."
type: docs
weight: 100
url: /ar/cpp/system.io/streamreader/streamreader/
---
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | التيار الأساسي لقراءة الأحرف منه |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, bool) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 1024 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, bool detectEncodingFromByteOrderMarks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | التيار الأساسي لقراءة الأحرف منه |
| detectEncodingFromByteOrderMarks | bool | صحيح للبحث عن علامات ترتيب البايت في بداية التيار، وإلا - خطأ |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | التيار الأساسي لقراءة الأحرف منه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 1024 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | التيار الأساسي لقراءة الأحرف منه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| detectEncodingFromByteOrderMarks | bool | صحيح للبحث عن علامات ترتيب البايت في بداية التيار، وإلا - خطأ |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const SharedPtr\<Stream\>\&, const EncodingPtr\&, bool, int) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت.

```cpp
System::IO::StreamReader::StreamReader(const SharedPtr<Stream> &stream, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| دفق | const SharedPtr\<Stream\>\& | التيار الأساسي لقراءة الأحرف منه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| detectEncodingFromByteOrderMarks | bool | صحيح للبحث عن علامات ترتيب البايت في بداية التيار، وإلا - خطأ |
| bufferSize | int | الحد الأدنى لحجم الذاكرة المؤقتة بالبايت |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Stream](../../stream/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 4096 بايت.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const System::String\& | مسار الملف لقراءة الأحرف منه |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, bool) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من الملف المحدد باستخدام ترميز UTF-8 ومخزن مؤقت بحجم افتراضي 4096 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, bool detectEncodingFromByteOrderMarks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const System::String\& | مسار الملف لقراءة الأحرف منه |
| detectEncodingFromByteOrderMarks | bool | صحيح للبحث عن علامات ترتيب البايت في بداية الملف، وإلا - خطأ |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 4096 بايت.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const System::String\& | مسار الملف لقراءة الأحرف منه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من التيار الأساسي المحدد باستخدام الترميز المحدد ومخزن مؤقت بحجم افتراضي 4096 بايت. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const System::String\& | مسار الملف لقراءة الأحرف منه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| detectEncodingFromByteOrderMarks | bool | صحيح للبحث عن علامات ترتيب البايت في بداية الملف، وإلا - خطأ |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamReader::StreamReader(const System::String\&, const EncodingPtr\&, bool, int) constructor


ينشئ نسخة من كائن [StreamReader](../) الذي يقرأ الأحرف من الملف المحدد باستخدام الترميز المحدد ومخزن مؤقت بالحجم المحدد. يحدد معلمة ما إذا كان يجب تمكين اكتشاف علامة ترتيب البايت.

```cpp
System::IO::StreamReader::StreamReader(const System::String &path, const EncodingPtr &encoding, bool detectEncodingFromByteOrderMarks, int bufferSize)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| مسار | const System::String\& | مسار الملف لقراءة الأحرف منه |
| encoding | const EncodingPtr\& | الترميز المراد استخدامه |
| detectEncodingFromByteOrderMarks | bool | صحيح للبحث عن علامات ترتيب البايت في بداية الملف، وإلا - خطأ |
| bufferSize | int | الحد الأدنى لحجم الذاكرة المؤقتة بالبايت |

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [EncodingPtr](../../../system/encodingptr/)
* Class [StreamReader](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
