---
title: "طريقة System::Text::StringBuilder::Append"
linktitle: "إلحاق"
second_title: "Aspose.Page لـ C++"
description: "طريقة System::Text::StringBuilder::Append. يضيف حرفًا إلى الباني في C++."
type: docs
weight: 300
url: /ar/cpp/system.text/stringbuilder/append/
---
## StringBuilder::Append(char_t) method


يضيف حرفًا إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| c | char_t | قيمة الحرف. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(char_t, int) method


يضيف أحرفًا إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(char_t c, int count)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| c | char_t | قيمة الحرف. |
| count | int | كم مرة لتكرار حرف الإدراج. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&) method


يضيف مصفوفة أحرف إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | الأحرف للإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const ArrayPtr\<char_t\>\&, int, int) method


يضيف شريحة من مصفوفة الأحرف إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const ArrayPtr<char_t> &arr, int startIndex, int charCount)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| arr | const ArrayPtr\<char_t\>\& | الأحرف للإضافة. |
| startIndex | int | فهرس بداية الشريحة. |
| charCount | int | طول القطعة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<StringBuilder\>\&) method


يضيف محتوى المُنشئ إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<StringBuilder> &builder)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| الباني | const SharedPtr\<StringBuilder\>\& | الباني لإضافة المحتوى منه. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const SharedPtr\<T\>\&) method


يضيف تمثيل السلسلة للكائن إلى المُنشئ.

```cpp
template<class T> StringBuilder * System::Text::StringBuilder::Append(const SharedPtr<T> &obj)
```


| Parameter | الوصف |
| --- | --- |
| T | [Object](../../../system/object/) النوع. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| obj | const SharedPtr\<T\>\& | [Object](../../../system/object/) للتسلسل والإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Typedef [SharedPtr](../../../system/sharedptr/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&) method


يضيف سلسلة إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) لإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(const String\&, int, int) method


يضيف شريحة من السلسلة إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(const String &str, int startIndex, int charCount)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| str | const String\& | [String](../../../system/string/) لإضافة. |
| startIndex | int | فهرس بداية الشريحة. |
| charCount | int | طول القطعة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [String](../../../system/string/)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(double) method


يضيف قيمة عددية عائمة إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(double df)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| df | double | القيمة للتسلسل والإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(E) method


يضيف تمثيل سلسلة قيمة التعداد إلى المُنشئ.

```cpp
template<class E> std::enable_if<std::is_enum<E>::value, StringBuilder *>::type System::Text::StringBuilder::Append(E e)
```


| Parameter | الوصف |
| --- | --- |
| E | [Enum](../../../system/enum/) النوع. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| e | E | القيمة للتسلسل والإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(float) method


يضيف قيمة عددية عائمة إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(float f)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| f | عدد عائم | القيمة للتسلسل والإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(int) method


يضيف قيمة عددية صحيحة إلى المُنشئ.

```cpp
StringBuilder * System::Text::StringBuilder::Append(int i)
```


| Parameter | Type | الوصف |
| --- | --- | --- |
| i | int | القيمة للتسلسل والإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
## StringBuilder::Append(T) method


يضيف قيمة حسابية إلى المُنشئ.

```cpp
template<typename T> std::enable_if<std::is_arithmetic<T>::value, StringBuilder *>::type System::Text::StringBuilder::Append(T value)
```


| Parameter | الوصف |
| --- | --- |
| T | نوع حسابي. |

| Parameter | Type | الوصف |
| --- | --- | --- |
| value | T | القيمة للتسلسل والإضافة. |

### ReturnValue

هذا المؤشر.

## انظر أيضًا

* Class [StringBuilder](../)
* Class [StringBuilder](../)
* Namespace [System::Text](../../)
* Library [Aspose.Page for C++](../../../)
