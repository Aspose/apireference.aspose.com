---
title: "System::IO::TextWriter::WriteLine method"
linktitle: "WriteLine"
second_title: "Aspose.Page لـ C++"
description: "System::IO::TextWriter::WriteLine method. يكتب أحرف محدد السطر إلى الدفق في C++."
type: docs
weight: 1000
url: /ar/cpp/system.io/textwriter/writeline/
---
## TextWriter::WriteLine() method


يكتب أحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine()
```

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(bool) method


يكتب تمثيل السلسلة للقيمة البوليانية المحددة متبوعًا بأحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(bool value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | bool | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(char_t) method


يكتب الحرف المحدد متبوعًا بأحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(char_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&) method


يكتب جميع الأحرف من المصفوفة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | المصفوفة التي تحتوي على الأحرف المراد كتابتها |

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const ArrayPtr\<char_t\>\&, int32_t, int32_t) method


يكتب النطاق الفرعي المحدد من أحرف UTF-16 من مصفوفة الأحرف المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(const ArrayPtr<char_t> &buffer, int32_t index, int32_t count)
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
## TextWriter::WriteLine(const char_t *) method


يكتب السلسلة C المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(const char_t *value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const char_t * | سلسلة c-string المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const SharedPtr\<Object\>\&) method


يكتب تمثيل السلسلة للكيان المحدد متبوعًا بأحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(const SharedPtr<Object> &value)
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
## TextWriter::WriteLine(const String\&, const TArgs\&...) method


يكتب القيم المحددة مُنسقة وفقًا للتنسيق المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
template<class...> void System::IO::TextWriter::WriteLine(const String &format, const TArgs &... args)
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
## TextWriter::WriteLine(const String\&) method


يكتب السلسلة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(const String &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | السلسلة للكتابة |

## انظر أيضًا

* Class [String](../../../system/string/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(const TypeInfo\&) method


يكتب تمثيل السلسلة للكائن [TypeInfo](../../../system/typeinfo/) المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(const TypeInfo &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const TypeInfo\& | الكائن المراد كتابته |

## انظر أيضًا

* Class [TypeInfo](../../../system/typeinfo/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(Decimal) method


يكتب تمثيل السلسلة للكائن [Decimal](../../../system/decimal/) المحدد متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(Decimal value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عشري | الكائن المراد كتابته |

## انظر أيضًا

* Class [Decimal](../../../system/decimal/)
* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(double) method


يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المزدوجة المحددة متبوعًا بأحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(double value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | double | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(float) method


يكتب تمثيل السلسلة للقيمة ذات الفاصلة العائمة ذات الدقة المفردة المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(float value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عائم | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int) method


يكتب تمثيل السلسلة للقيمة الصحيحة 32-بت المحددة متبوعًا بأحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(int value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(int64_t) method


يكتب تمثيل السلسلة للقيمة الصحيحة 64-بت المحددة متبوعًا بأحرف محدد السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(int64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int64_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint32_t) method


يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة ذات 32 بت المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(uint32_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint32_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
## TextWriter::WriteLine(uint64_t) method


يكتب تمثيل السلسلة للقيمة الصحيحة غير الموقعة ذات 64 بت المحددة متبوعًا بأحرف إنهاء السطر إلى الدفق.

```cpp
virtual void System::IO::TextWriter::WriteLine(uint64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint64_t | القيمة المراد كتابتها |

## انظر أيضًا

* Class [TextWriter](../)
* Namespace [System::IO](../../)
* Library [Aspose.Page for C++](../../../)
