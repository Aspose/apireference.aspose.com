---
title: "طريقة System::Text::UTF7Encoding::GetBytes"
linktitle: "GetBytes"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::UTF7Encoding::GetBytes. احصل على البايتات الناتجة عن ترميز مخزن أحرف في C++."
type: docs
weight: 500
url: /ar/cpp/system.text/utf7encoding/getbytes/
---
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>, int, int, ArrayPtr\<uint8_t\>, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
int System::Text::UTF7Encoding::GetBytes(ArrayPtr<char_t> chars, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| char_index | int | بداية مقطع الحرف. |
| char_count | int | عدد الأحرف المراد تحويلها. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| byte_index | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(ArrayPtr\<char_t\>, int, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(ArrayPtr<char_t> chars, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | ArrayPtr\<char_t\> | الأحرف المراد ترميزها. |
| الفهرس | int | بداية مقطع الحرف. |
| count | int | عدد الأحرف المراد تحويلها. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const char_t *, int, uint8_t *, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
int System::Text::UTF7Encoding::GetBytes(const char_t *chars, int char_count, uint8_t *bytes, int byte_count) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | const char_t * | الأحرف المراد ترميزها. |
| char_count | int | عدد الأحرف المراد تحويلها. |
| bytes | uint8_t * | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| byte_count | int | حجم مخزن الإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const String\&) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const String &s)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) للترميز. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [String](../../../system/string/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const String\&, int, int, ArrayPtr\<uint8_t\>, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
int System::Text::UTF7Encoding::GetBytes(const String &s, int char_index, int char_count, ArrayPtr<uint8_t> bytes, int byte_index) override
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| s | const String\& | [String](../../../system/string/) للترميز. |
| char_index | int | بداية مقطع الحرف. |
| char_count | int | عدد الأحرف المراد تحويلها. |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| byte_index | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Class [String](../../../system/string/)
* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const System::Details::ArrayView\<char_t\>\&, int, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
virtual ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::ArrayView<char_t> &chars, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | const System::Details::ArrayView\<char_t\>\& | الأحرف المراد ترميزها. |
| الفهرس | int | بداية مقطع الحرف. |
| count | int | عدد الأحرف المراد تحويلها. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(const System::Details::StackArray\<char_t, N\>\&, int, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
template<std::size_t> ArrayPtr<uint8_t> System::Text::Encoding::GetBytes(const System::Details::StackArray<char_t, N> &chars, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | const System::Details::StackArray\<char_t, N\>\& | الأحرف المراد ترميزها. |
| الفهرس | int | بداية مقطع الحرف. |
| count | int | عدد الأحرف المراد تحويلها. |

### ReturnValue

[Buffer](../../../system/buffer/) that holds representation of characters being encoded.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(System::Details::ArrayView\<char_t\>, int, int, System::Details::ArrayView\<uint8_t\>, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
virtual int System::Text::Encoding::GetBytes(System::Details::ArrayView<char_t> chars, int char_index, int char_count, System::Details::ArrayView<uint8_t> bytes, int byte_index)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | System::Details::ArrayView\<char_t\> | الأحرف المراد ترميزها. |
| char_index | int | بداية مقطع الحرف. |
| char_count | int | عدد الأحرف المراد تحويلها. |
| bytes | System::Details::ArrayView\<uint8_t\> | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| byte_index | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## UTF7Encoding::GetBytes(System::Details::StackArray\<char_t, SC\>\&, int, int, System::Details::StackArray\<uint8_t, SB\>\&, int) method


احصل على البايتات الناتجة عن ترميز مخزن الأحرف.

```cpp
template<std::size_t,std::size_t> int System::Text::Encoding::GetBytes(System::Details::StackArray<char_t, SC> &chars, int char_index, int char_count, System::Details::StackArray<uint8_t, SB> &bytes, int byte_index)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| chars | System::Details::StackArray\<char_t, SC\>\& | الأحرف المراد ترميزها. |
| char_index | int | بداية مقطع الحرف. |
| char_count | int | عدد الأحرف المراد تحويلها. |
| bytes | System::Details::StackArray\<uint8_t, SB\>\& | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| byte_index | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد البايتات المكتوبة.

## انظر أيضًا

* Class [UTF7Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
