---
title: "System::IO::StreamWriter::WriteLine طريقة"
linktitle: "WriteLine"
second_title: "Aspose.Font لـ C++"
description: "System::IO::StreamWriter::WriteLine طريقة. يكتب أحرف إنهاء السطر إلى الدفق في C++."
type: docs
weight: 1100
url: /ar/cpp/system.io/streamwriter/writeline/
---
## StreamWriter::WriteLine() method


يكتب أحرف إنهاء السطر إلى الدفق.

```cpp
void System::IO::StreamWriter::WriteLine() override
```

## انظر أيضًا

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


يكتب جميع الأحرف من المصفوفة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
void System::IO::StreamWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count) override
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
## StreamWriter::WriteLine(const char_t *) method


يكتب سلسلة c-string المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
void System::IO::StreamWriter::WriteLine(const char_t *buffer) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| buffer | const char_t * | سلسلة c-string المراد كتابتها |

## انظر أيضًا

* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const SharedPtr\<Object\>\&) method


يكتب تمثيل السلسلة للكائن المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
void System::IO::StreamWriter::WriteLine(const SharedPtr<Object> &obj) override
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
## StreamWriter::WriteLine(const String\&) method


يكتب السلسلة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
void System::IO::StreamWriter::WriteLine(const String &value) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| قيمة | const String\& | السلسلة المراد كتابتها |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [StreamWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Font for C++](../../../)
## StreamWriter::WriteLine(const System::SharedPtr\<T\>\&) method


يكتب تمثيل السلسلة للكائن المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
template<typename T> void System::IO::StreamWriter::WriteLine(const System::SharedPtr<T> &obj)
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
