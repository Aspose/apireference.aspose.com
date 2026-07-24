---
title: "طريقة System::String::Split"
linktitle: "تقسيم"
second_title: "Aspose.Page لـ C++"
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


| Parameter | Type | الوصف |
| --- | --- | --- |
| فاصل | char_t | الحرف الذي تُقسم السلسلة بناءً عليه. |
| count | int32_t | الحد الأقصى لعدد السلاسل الفرعية التي سيتم إرجاعها. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, StringSplitOptions) const method


يقسم السلسلة حسب الحرف.

```cpp
ArrayPtr<String> System::String::Split(char_t separator=u' ', StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| فاصل | char_t | الحرف الذي تُقسم السلسلة بناءً عليه. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(char_t, char_t, StringSplitOptions) const method


يقسم السلسلة حسب أحد حرفين.

```cpp
ArrayPtr<String> System::String::Split(char_t separatorA, char_t separatorB, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separatorA | char_t | الحرف الأول لتقسيم السلسلة به. |
| separatorB | char_t | الحرف الثاني لتقسيم السلسلة به. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, int32_t, StringSplitOptions) const method


يقسم السلسلة حسب أحد الأحرف المحددة.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, int32_t count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) من أحرف الفاصل. إذا كان فارغًا، يُعتبر أي حرف مسافة فاصلًا. |
| count | int32_t | الحد الأقصى لعدد السلاسل الفرعية التي سيتم إرجاعها. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<char_t\>\&, StringSplitOptions) const method


يقسم السلسلة حسب أحد الأحرف المحددة.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<char_t> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<char_t\>\& | [Array](../../array/) من أحرف الفاصل. إذا كان فارغًا، يُعتبر أي حرف مسافة فاصلًا. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, int, StringSplitOptions) const method


يقسم السلسلة حسب سلسلة فرعية. حاليًا، يدعم فقط مصفوفة الفواصل التي تحتوي على صفر أو عنصر واحد.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الفاصل. إذا كان فارغًا، لا يتم أي تقسيم. |
| count | int | الحد الأقصى لعدد العناصر في مصفوفة التقسيمات. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const ArrayPtr\<String\>\&, StringSplitOptions) const method


يقسم السلسلة حسب سلسلة فرعية.

```cpp
ArrayPtr<String> System::String::Split(const ArrayPtr<String> &separators, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| separators | const ArrayPtr\<String\>\& | [Array](../../array/) من سلاسل الفاصل. إذا كان فارغًا، لا يتم أي تقسيم. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, int, StringSplitOptions) const method


يقسم السلسلة حسب سلسلة فرعية.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, int count, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| فاصل | const String\& | السلسلة الفرعية التي تعمل كفاصل. إذا كانت فارغة، يعمل حرف المسافة كفاصل. |
| count | int | الحد الأقصى لعدد العناصر في مصفوفة التقسيمات. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## String::Split(const String\&, StringSplitOptions) const method


يقسم السلسلة حسب سلسلة فرعية.

```cpp
ArrayPtr<String> System::String::Split(const String &separator, StringSplitOptions opt=StringSplitOptions::None) const
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| فاصل | const String\& | السلسلة الفرعية التي تعمل كفاصل. إذا كانت فارغة، يعمل حرف المسافة كفاصل. |
| خيار | StringSplitOptions | خيارات التقسيم. |

### ReturnValue

[Array](../../array/) of substrings.

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [String](../)
* Enum [StringSplitOptions](../../stringsplitoptions/)
* Class [String](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
