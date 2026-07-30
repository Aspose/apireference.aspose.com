---
title: "طريقة System::String::Split"
linktitle: "تقسيم"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::String::Split. تقسم السلسلة حسب حرف في C++."
type: docs
weight: 4300
url: /ar/cpp/system/string/split/
---
## String::Split(char_t, int32_t, StringSplitOptions) const method


يقسم السلسلة حسب الحرف.

```cpp
ArrayPtr<String> System::String::Split(char_t separator, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| فاصل | char_t | الحرف الذي تُقسم السلسلة بناءً عليه. |
| count | int32_t | الحد الأقصى لعدد السلاسل الفرعية التي سيتم إرجاعها. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


يقسم السلسلة حسب الحرف.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| فاصل | char_t | الحرف الذي تُقسم السلسلة بناءً عليه. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


يقسم السلسلة حسب أحد حرفين.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| separatorA | char_t | الحرف الأول الذي تُقسم السلسلة بناءً عليه. |
| separatorB | char_t | الحرف الثاني الذي تُقسم السلسلة بناءً عليه. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


يقسم السلسلة حسب أحد الأحرف المحددة.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) من أحرف الفاصل. إذا كان فارغًا، يُعتبر أي حرف مسافة فارغة فاصلًا. |
| count | int32_t | الحد الأقصى لعدد السلاسل الفرعية التي سيتم إرجاعها. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


يقسم السلسلة حسب أحد الأحرف المحددة.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) من أحرف الفاصل. إذا كان فارغًا، يُعتبر أي حرف مسافة فارغة فاصلًا. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


يقسم السلسلة حسب الجزء الفرعي. حاليًا، يدعم فقط مصفوفة الفواصل التي تحتوي على صفر أو عنصر واحد.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الفاصل. إذا كان فارغًا، لا يتم أي تقسيم. |
| count | int | الحد الأقصى لعدد العناصر في مصفوفة التقسيمات. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


يقسم السلسلة حسب الجزء الفرعي.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الفاصل. إذا كان فارغًا، لا يتم أي تقسيم. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


يقسم السلسلة حسب الجزء الفرعي.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| فاصل | const String\& | السلسلة الفرعية التي تعمل كفاصل. إذا كانت فارغة، يُعامل حرف المسافة كفاصل. |
| count | int | الحد الأقصى لعدد العناصر في مصفوفة التقسيمات. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


يقسم السلسلة حسب الجزء الفرعي.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| فاصل | const String\& | السلسلة الفرعية التي تعمل كفاصل. إذا كانت فارغة، يُعامل حرف المسافة كفاصل. |
| اختياري | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
