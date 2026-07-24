---
title: "طريقة System::IO::TextWriter::Write"
linktitle: "Write"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::IO::TextWriter::Write. يكتب تمثيل السلسلة للقيمة المنطقية المحددة إلى الدفق في C++."
type: docs
weight: 900
url: /ar/cpp/system.io/textwriter/write/
---
## TextWriter::Write(bool) method


يكتب تمثيل السلسلة للقيمة البوليانية المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(bool value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | bool | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(char_t) method


يكتب الحرف المحدد إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(char_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&) method


يكتب جميع الأحرف من المصفوفة المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |
| الفهرس | int32_t | فهرس يبدأ من الصفر للعنصر في **buffer** حيث يبدأ النطاق الفرعي للكتابة |
| count | int32_t | عدد الأحرف في النطاق الفرعي للكتابة؛ -1 يعني أن النطاق الفرعي ينتهي حيث تنتهي مصفوفة **buffer** |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const char_t *) method


يكتب السلسلة c-string المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(const char_t *value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const char_t * | سلسلة c-string المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const SharedPtr\<Object\>\&) method


يكتب تمثيل السلسلة للكيان المحدد إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(const SharedPtr<Object> &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const SharedPtr\<Object\>\& | الكائن المراد كتابته |

## انظر أيضًا

* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [Object](../../../system/object/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const String\&, const TArgs\&...) method


يكتب القيم المحددة منسقة وفقًا للتنسيق المحدد إلى الدفق.

```cpp
template<class...> void System::IO::TextWriter::Write(const String &format, const TArgs &... args)
```


| Parameter | الوصف |
| --- | --- |
| TArgs | قائمة أنواع القيم للكتابة |

| Parameter | Type | الوصف |
| --- | --- | --- |
| تنسيق | const String\& | تنسيق السلسلة |
| args | const TArgs\&... | القيم للكتابة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const String\&) method


يكتب السلسلة المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(const String &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للكتابة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(const TypeInfo\&) method


يكتب تمثيل السلسلة للكائن [TypeInfo](../../../system/typeinfo/) المحدد إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(const TypeInfo &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const TypeInfo\& | الكائن المراد كتابته |

## انظر أيضًا

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(Decimal) method


يكتب تمثيل السلسلة للكائن [Decimal](../../../system/decimal/) المحدد إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(Decimal value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عشري | الكائن المراد كتابته |

## انظر أيضًا

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(double) method


يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المزدوجة المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(double value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | double | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(float) method


يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المفردة المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(float value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عائم | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int) method


يكتب تمثيل السلسلة للقيمة الصحيحة 32-بت المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(int value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(int64_t) method


يكتب تمثيل السلسلة للقيمة الصحيحة 64-بت المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(int64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int64_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint32_t) method


يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة 32-بت المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(uint32_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint32_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::Write(uint64_t) method


يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة 64-بت المحددة إلى الدفق.

```cpp
virtual void System::IO::TextWriter::Write(uint64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint64_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
