---
title: "طريقة System::Console::WriteLine"
linktitle: "WriteLine"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Console::WriteLine. تُخرج فاصل السطر الحالي إلى تدفق الإخراج القياسي في C++."
type: docs
weight: 1100
url: /ar/cpp/system/console/writeline/
---
## Console::WriteLine() method


يخرج محدد سطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine()
```

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(bool) method


يخرج تمثيل النص لقيمة bool متبوعًا بمحدد سطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(bool value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | bool | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(char_t) method


يخرج قيمة الحرف المحددة متبوعة بمحدد سطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(char_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | char_t | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&) method


يخرج تمثيل السلسلة للمصفوفة الحرفية المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | المصفوفة المراد إخراجها |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const ArrayPtr\<char_t\>\&, int, int) method


يخرج تمثيل السلسلة للنطاق المحدد من المصفوفة الحرفية المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const ArrayPtr<char_t> &buffer, int index, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| المخزن المؤقت | const ArrayPtr\<char_t\>\& | مصفوفة الأحرف |
| الفهرس | int | الفهرس في المصفوفة الذي يبدأ منه النطاق للإخراج |
| count | int | عدد العناصر في النطاق المراد إخراجه |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const char *) method




```cpp
static void System::Console::WriteLine(const char *)=delete
```

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const char_t *) method


يخرج السلسلة c-string المحددة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const char_t *value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const char_t * | سلسلة c-string المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const Decimal\&) method


يُخرج تمثيل السلسلة لقيمة [Decimal](../../decimal/) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const Decimal &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const Decimal\& | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Decimal](../../decimal/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const Exception\&) method


يُخرج تمثيل السلسلة للكائن [Exception](../../exception/) المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const Exception &e)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| e | const Exception\& | القيمة المراد إخراجها |

## انظر أيضًا

* Typedef [Exception](../../exception/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const SharedPtr\<T\>\&) method


يخرج تمثيل النص للكائن المحدد متبوعًا بمحدد سطر الحالي إلى تدفق الإخراج القياسي.

```cpp
template<class T> static void System::Console::WriteLine(const SharedPtr<T> &object)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع الكائن المراد إخراجه |

| Parameter | Type | الوصف |
| --- | --- | --- |
| object | const SharedPtr\<T\>\& | [Object](../../object/) للإخراج |

## انظر أيضًا

* Typedef [SharedPtr](../../sharedptr/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const String\&, Args\&&...) method


يخرج تمثيل السلسلة للمعاملات المحددة المُنسقة وفقًا للتنسيق المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
template<class...> static void System::Console::WriteLine(const String &format, Args &&... args)
```


| Parameter | الوصف |
| --- | --- |
| ال | أنواع القيم المراد إخراجها |

| Parameter | Type | الوصف |
| --- | --- | --- |
| تنسيق | const String\& | تنسيق السلسلة |
| args | Args\&&... | القيم المراد إخراجها |

## انظر أيضًا

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const String\&) method


يخرج كائن السلسلة المحدد متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const String &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const String\& | كائن السلسلة المراد إخراجه |

## انظر أيضًا

* Class [String](../../string/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(const TypeInfo\&) method


يُخرج تمثيل السلسلة لقيمة [TypeInfo](../../typeinfo/) متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(const TypeInfo &value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | const TypeInfo\& | القيمة المراد إخراجها |

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(double) method


يخرج تمثيل السلسلة لقيمة عدد عائم مزدوج الدقة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(double value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | double | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(float) method


يخرج تمثيل السلسلة لقيمة عدد عائم أحادي الدقة متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(float value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | عدد عائم | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(int32_t) method


يخرج تمثيل السلسلة لقيمة عدد صحيح 32-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(int32_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int32_t | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(int64_t) method


يخرج تمثيل السلسلة لقيمة عدد صحيح 64-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(int64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | int64_t | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(uint32_t) method


يخرج تمثيل السلسلة لقيمة عدد صحيح غير موقع 32-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(uint32_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint32_t | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Console::WriteLine(uint64_t) method


يخرج تمثيل السلسلة لقيمة عدد صحيح غير موقع 64-بت متبوعًا بفاصل السطر الحالي إلى تدفق الإخراج القياسي.

```cpp
static void System::Console::WriteLine(uint64_t value)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| value | uint64_t | القيمة المراد إخراجها |

## انظر أيضًا

* Class [Console](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
