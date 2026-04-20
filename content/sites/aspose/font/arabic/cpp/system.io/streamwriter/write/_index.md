---
title: "طريقة System::IO::StreamWriter::Write"
linktitle: "Write"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::IO::StreamWriter::Write. تكتب الحرف المحدد إلى الدفق في C++."
type: docs
weight: 1000
url: /ar/cpp/system.io/streamwriter/write/
---
## StreamWriter::Write(char_t) method


يكتب الحرف المحدد إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(char_t value) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | char_t | الحرف المراد كتابته |

## انظر أيضًا

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&) method


يكتب جميع الأحرف من المصفوفة المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من أحرف UTF-16 من المصفوفة الحرفية المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |
| الفهرس | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** الذي يبدأ منه النطاق الفرعي للكتابة |
| count | int32_t | عدد الأحرف في النطاق الفرعي للكتابة؛ -1 يحدد أن النطاق الفرعي ينتهي حيث تنتهي مصفوفة **buffer** |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const char_t *) method


يكتب السلسلة c-string المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const char_t *buffer) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const char_t * | سلسلة c-string المراد كتابتها |

## انظر أيضًا

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const SharedPtr\<Object\>\&) method


يكتب تمثيل السلسلة للكائن المحدد إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const SharedPtr<Object> &obj) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const SharedPtr\<Object\>\& | الكائن المراد كتابته |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const String\&) method


يكتب السلسلة المحددة إلى الدفق.

```cpp
void System::IO::StreamWriter::Write(const String &value) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة المراد كتابتها |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::Write(const System::SharedPtr\<T\>\&) method


يكتب تمثيل السلسلة للكائن المحدد إلى الدفق.

```cpp
template<typename T> void System::IO::StreamWriter::Write(const System::SharedPtr<T> &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع الكائن |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const System::SharedPtr\<T\>\& | الكائن المراد كتابته |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
