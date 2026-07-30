---
title: "طريقة System::ObjectType::GetType"
linktitle: "GetType"
second_title: "Aspose.Font لـ C++"
description: "طريقة System::ObjectType::GetType. تنفّذ ترجمة typeof(). تحميل زائد للأنواع الأولية في C++."
type: docs
weight: 100
url: /ar/cpp/system/objecttype/gettype/
---
## ObjectType::GetType() method


يُنفّذ ترجمة typeof(). تحميل زائد للأنواع الأولية.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value &&!std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| معامل | الوصف |
| --- | --- |
| T | نوع أولي. |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف النوع المحدد.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


يُنفّذ ترجمة typeof(). تحميل زائد لأنواع التعداد.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| معامل | الوصف |
| --- | --- |
| T | نوع أولي. |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف النوع المحدد.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


يُنفّذ ترجمة typeof(). تحميل زائد للهياكل والمؤشرات.

```cpp
template<typename T> static std::enable_if<(!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsBoxable<T>::value)||IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| معامل | الوصف |
| --- | --- |
| T | نوع أولي. |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف البنية المحددة.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


تنفّذ ترجمة typeof(). تحميل زائد لـ [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| معامل | الوصف |
| --- | --- |
| T | نوع [Nullable](../../nullable/). |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف البنية المحددة.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


يُنفّذ ترجمة typeof(). تحميل زائد لـMutlicastDelegate.

```cpp
template<typename T> static std::enable_if<detail::is_a<T, MulticastDelegate>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| معامل | الوصف |
| --- | --- |
| T | نوع MutlicastDelegate. |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف البنية المحددة.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


يُنفّذ ترجمة typeof(). تحميل زائد للهياكل والمؤشرات.

```cpp
template<typename T> static std::enable_if<!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&IsBoxable<T>::value &&!detail::is_a<T, MulticastDelegate>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType()
```


| معامل | الوصف |
| --- | --- |
| T | نوع أولي. |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف البنية المحددة أو نوع المؤشر إذا تم استدعاؤه لـ [SmartPtr](../../smartptr/).

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


يُنفّذ ترجمة typeof(). تحميل زائد لـuint8_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


تنفّذ ترجمة typeof(). تحميل زائد لـ char16_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


تنفّذ ترجمة typeof(). تحميل زائد لـ int32_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


تنفّذ ترجمة typeof(). تحميل زائد لـ int64_t.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


تنفّذ ترجمة typeof(). تحميل زائد لـ bool.

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType() method


تنفّذ ترجمة typeof(). تحميل زائد لـ [Void](../../void/).

```cpp
const System::TypeInfo & System::ObjectType::GetType()
```

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const String\&) method


يُنفّذ ترجمة typeof(). تحميل زائد لنوع السلسلة.

```cpp
static const System::TypeInfo & System::ObjectType::GetType(const String &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع أولي. |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف نوع [String](../../string/).

## انظر أيضًا

* Class [TypeInfo](../../typeinfo/)
* Class [String](../../string/)
* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


يُنفّذ ترجمة typeof(). تحميل زائد للمؤشرات الذكية.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع كائن المؤشر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) للحصول على [TypeInfo](../../typeinfo/). |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف الصنف النهائي للكائن الممرَّر.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


يُنفّذ ترجمة typeof(). تحميل زائد للهياكل.

```cpp
template<typename T> static std::enable_if<!IsExceptionWrapper<T>::value &&!IsSmartPtr<T>::value &&!std::is_fundamental<T>::value &&!std::is_enum<T>::value &&!IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع البنية. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) للحصول على [TypeInfo](../../typeinfo/). |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف الصنف النهائي للكائن الممرَّر.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T\&) method


يُنفّذ ترجمة typeof(). تحميل زائد للاستثناءات.

```cpp
template<typename T> static std::enable_if<IsExceptionWrapper<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T &obj)
```


| معامل | الوصف |
| --- | --- |
| T | [Exception](../../exception/) نوع. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) للحصول على [TypeInfo](../../typeinfo/). |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف الصنف النهائي للكائن الممرَّر.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


يُنفّذ ترجمة typeof(). تحميل زائد للأنواع الأولية.

```cpp
template<typename T> static std::enable_if<std::is_fundamental<T>::value||std::is_enum<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع أولي. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T | متجاهل |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف نوع الكائن الممرَّر.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectType::GetType(const T) method


تنفيذ ترجمة typeof(). تحميل زائد لأنواع [Nullable](../../nullable/).

```cpp
template<typename T> static std::enable_if<IsNullable<T>::value, constSystem::TypeInfo &>::type System::ObjectType::GetType(const T obj)
```


| معامل | الوصف |
| --- | --- |
| T | نوع [Nullable](../../nullable/). |

| معامل | نوع | الوصف |
| --- | --- | --- |
| obj | const T | متجاهل |

### ReturnValue

إشارة ثابتة إلى بنية [TypeInfo](../../typeinfo/) التي تصف نوع الكائن الممرَّر.

## انظر أيضًا

* Class [ObjectType](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
