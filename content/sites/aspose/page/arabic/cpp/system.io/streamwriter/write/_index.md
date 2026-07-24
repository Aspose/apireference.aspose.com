---
title: "System::IO::StreamWriter::Write طريقة"
linktitle: "Write"
second_title: "Aspose.Page لـ C++"
description: "System::IO::StreamWriter::Write طريقة. يكتب الحرف المحدد إلى الدفق في C++."
type: docs
weight: 1000
url: /ar/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


يكتب الحرف المحدد إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | الحرف المراد كتابته |

## انظر أيضًا

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


يكتب جميع الأحرف من المصفوفة المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |
| الفهرس | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| count | int32_t | عدد الأحرف في النطاق الفرعي للكتابة؛ -1 يعني أن النطاق الفرعي ينتهي حيث تنتهي مصفوفة **buffer** |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const char_t *) method


يكتب السلسلة c-string المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const char_t * | سلسلة c-string المراد كتابتها |

## انظر أيضًا

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


يكتب تمثيل السلسلة للكيان المحدد إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | الكائن المراد كتابته |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const String\&) method


يكتب السلسلة المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للكتابة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


يكتب تمثيل السلسلة للكيان المحدد إلى الدفق.

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | الكائن المراد كتابته |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
