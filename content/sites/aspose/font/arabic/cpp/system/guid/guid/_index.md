---
title: "منشئ System::Guid::Guid"
linktitle: "Guid"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::Guid::Guid. يُنشئ كائنًا يمثل GUID مكوّنًا من جميع الأصفار في C++."
type: docs
weight: 100
url: /ar/cpp/system/guid/guid/
---
## Guid::Guid() constructor


ينشئ كائنًا يمثل GUID مكوّنًا من جميع الأصفار.

```cpp
System::Guid::Guid()
```

## انظر أيضًا

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const ArrayPtr\<uint8_t\>\&) constructor


ينشئ كائنًا يمثل GUID محددًا كمصفوفة من قيم الأعداد الصحيحة غير الموقعة ذات 8 بت.

```cpp
System::Guid::Guid(const ArrayPtr<uint8_t> &b)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| b | const ArrayPtr\<uint8_t\>\& | مصفوفة بايت تحتوي على البايتات المنفصلة للـ GUID |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const Guid\&) constructor


ينشئ كائنًا يمثل نفس GUID مثل الكائن المحدد.

```cpp
System::Guid::Guid(const Guid &guid)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| guid | const Guid\& | الكائن [Guid](../) لنسخ قيمة GUID منه |

## انظر أيضًا

* Class [Guid](../)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const String\&) constructor


ينشئ كائنًا يمثل GUID محددًا كسلسلة نصية.

```cpp
System::Guid::Guid(const String &g)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| g | const String\& | تمثيل السلسلة لـ GUID الذي سيمثله الكائن الجاري إنشاؤه |

## انظر أيضًا

* Class [String](../../string/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(const System::Details::ArrayView\<uint8_t\>\&) constructor


ينشئ كائنًا يمثل GUID محددًا كعرض مصفوفة من قيم الأعداد الصحيحة غير الموقعة ذات 8 بت.

```cpp
System::Guid::Guid(const System::Details::ArrayView<uint8_t> &b)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| b | const System::Details::ArrayView\<uint8_t\>\& | مصفوفة بايت تحتوي على البايتات المنفصلة للـ GUID |

## انظر أيضًا

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const ArrayPtr\<uint8_t\>\&) constructor


ينشئ مثيلًا من فئة [Guid](../) من المكوّنات المحددة للـ GUID.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const ArrayPtr<uint8_t> &d)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | int32_t | البتات 0-31 من الـ GUID |
| b | int16_t | البتات 32-47 من الـ GUID |
| c | int16_t | البتات 48-63 من الـ GUID |
| d | const ArrayPtr\<uint8_t\>\& | مصفوفة بايت تحتوي على البتات 64-127 من الـ GUID |

## انظر أيضًا

* Typedef [ArrayPtr](../../arrayptr/)
* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, const System::Details::ArrayView\<uint8_t\>\&) constructor


ينشئ مثيلًا من فئة [Guid](../) من المكوّنات المحددة للـ GUID.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, const System::Details::ArrayView<uint8_t> &d)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | int32_t | البتات 0-31 من الـ GUID |
| b | int16_t | البتات 32-47 من الـ GUID |
| c | int16_t | البتات 48-63 من الـ GUID |
| d | const System::Details::ArrayView\<uint8_t\>\& | عرض لمصفوفة بايت يحتوي على البتات 64-127 من الـ GUID |

## انظر أيضًا

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(int32_t, int16_t, int16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


ينشئ مثيلًا من فئة [Guid](../) من الأعداد الصحيحة غير الموقعة والبايتات المحددة.

```cpp
System::Guid::Guid(int32_t a, int16_t b, int16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | int32_t | البتات 0-31 من الـ GUID |
| b | int16_t | البتات 32-47 من الـ GUID |
| c | int16_t | البتات 48-63 من الـ GUID |
| d | uint8_t | البتات 64-71 من الـ GUID |
| e | uint8_t | البتات 72-79 من الـ GUID |
| f | uint8_t | البتات 80-87 من الـ GUID |
| g | uint8_t | البتات 88-95 من الـ GUID |
| h | uint8_t | البتات 96-103 من الـ GUID |
| i | uint8_t | البتات 104-111 من الـ GUID |
| j | uint8_t | البتات 112-119 من GUID |
| k | uint8_t | البتات 120-127 من GUID |

## انظر أيضًا

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Guid::Guid(uint32_t, uint16_t, uint16_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t, uint8_t) constructor


ينشئ مثيلًا من فئة [Guid](../) من الأعداد الصحيحة غير الموقعة والبايتات المحددة.

```cpp
System::Guid::Guid(uint32_t a, uint16_t b, uint16_t c, uint8_t d, uint8_t e, uint8_t f, uint8_t g, uint8_t h, uint8_t i, uint8_t j, uint8_t k)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| أ | uint32_t | البتات 0-31 من الـ GUID |
| b | uint16_t | البتات 32-47 من الـ GUID |
| c | uint16_t | البتات 48-63 من الـ GUID |
| d | uint8_t | البتات 64-71 من الـ GUID |
| e | uint8_t | البتات 72-79 من الـ GUID |
| f | uint8_t | البتات 80-87 من الـ GUID |
| g | uint8_t | البتات 88-95 من الـ GUID |
| h | uint8_t | البتات 96-103 من الـ GUID |
| i | uint8_t | البتات 104-111 من الـ GUID |
| j | uint8_t | البتات 112-119 من GUID |
| k | uint8_t | البتات 120-127 من GUID |

## انظر أيضًا

* Class [Guid](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
