---
title: "طريقة System::Text::Encoding::GetChars"
linktitle: "GetChars"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::Text::Encoding::GetChars. احصل على الأحرف الناتجة عن فك شفرة مخزن البايتات في C++."
type: docs
weight: 2000
url: /ar/cpp/system.text/encoding/getchars/
---
## Encoding::GetChars(ArrayPtr\<uint8_t\>) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات من. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int, ArrayPtr\<char_t\>, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual int System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int byte_index, int byte_count, ArrayPtr<char_t> chars, int char_index)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات من. |
| byte_index | int | إزاحة مخزن الإدخال. |
| byte_count | int | حجم المخزن المؤقت للإدخال. |
| chars | ArrayPtr\<char_t\> | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| char_index | int | إزاحة المخزن المؤقت للإخراج. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetChars(ArrayPtr\<uint8_t\>, int, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual ArrayPtr<char_t> System::Text::Encoding::GetChars(ArrayPtr<uint8_t> bytes, int index, int count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | ArrayPtr\<uint8_t\> | [Buffer](../../../system/buffer/) لقراءة البايتات من. |
| الفهرس | int | إزاحة مخزن الإدخال. |
| count | int | حجم المخزن المؤقت للإدخال. |

### ReturnValue

[Buffer](../../../system/buffer/) of decoded characters.

## انظر أيضًا

* Typedef [ArrayPtr](../../../system/arrayptr/)
* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
## Encoding::GetChars(const uint8_t *, int, char_t *, int) method


احصل على الأحرف الناتجة عن فك ترميز مخزن البايتات.

```cpp
virtual int System::Text::Encoding::GetChars(const uint8_t *bytes, int byte_count, char_t *chars, int char_count)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| bytes | const uint8_t * | [Buffer](../../../system/buffer/) لقراءة البايتات من. |
| byte_count | int | حجم المخزن المؤقت للإدخال. |
| chars | char_t * | [Buffer](../../../system/buffer/) لوضع الأحرف فيه. |
| char_count | int | حجم مخزن الإخراج. |

### ReturnValue

عدد الأحرف المكتوبة.

## انظر أيضًا

* Class [Encoding](../)
* Namespace [System::Text](../../)
* Library [Aspose.Font for C++](../../../)
