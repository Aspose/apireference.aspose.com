---
title: "منشئ System::SmartPtr::SmartPtr"
linktitle: "SmartPtr"
second_title: "Aspose.Font لـ C++"
description: "منشئ System::SmartPtr::SmartPtr. يحول نوع المصفوفة المشار إليها بإنشاء مصفوفة جديدة من نوع مختلف. مفيد إذا كان في C# هناك تحويل نوع للمصفوفة غير مدعوم في C++."
type: docs
weight: 100
url: /ar/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


يحوّل نوع المصفوفة المشار إليها بإنشاء مصفوفة جديدة من نوع مختلف. مفيد إذا كان هناك تحويل نوع مصفوفة في C# غير مدعوم في C++.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| معامل | الوصف |
| --- | --- |
| Y | نوع مصفوفة المصدر. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | مؤشر إلى المصفوفة لإنشاء نسخة منها، ولكن بنوع عناصر مختلف. |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


ينشئ [SmartPtr](../) يشارك معلومات الملكية مع القيمة الأولية للمتغير ptr، لكنه يحمل مؤشرًا غير مرتبط وغير مُدار p.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | مؤشر ذكي آخر لمشاركة الملكية من الملكية. |
| p | Pointee_ * | مؤشر إلى كائن لإدارته. |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


ينشئ نسخة من كائن [SmartPtr](../). كلا المؤشرين يشيران إلى نفس الكائن بعد ذلك. يقوم بتحويل النوع إذا كان مسموحًا.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| معامل | الوصف |
| --- | --- |
| Q | نوع الكائن الذي يشير إليه x. |

| معامل | نوع | الوصف |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | مؤشر للنسخ. |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


ينشئ نسخة من كائن [SmartPtr](../). كلا المؤشرين يشيران إلى نفس الكائن بعد ذلك.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| ptr | const SmartPtr_\& | مؤشر للنسخ. |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


يُهيئ مصفوفة فارغة. يُستخدم لترجمة بعض تراكيب كود C#.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| معامل | الوصف |
| --- | --- |
| Y | عنصر نائب من نوع EmptyArrayInitializer. |

## انظر أيضًا

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


ينشئ [SmartPtr](../) يشير إلى الكائن المحدد، أو يحول مؤشرًا خامًا إلى [SmartPtr](../).

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| كائن | Pointee_ * | Pointee. |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


ينشئ بنقل كائن [SmartPtr](../). فعليًا، يبدل مؤشرين إذا كانا في نفس الوضع. قد يصبح x غير قابل للاستخدام بعد الاستدعاء.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| x | SmartPtr_\&& | مؤشر للنقل. |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


ينشئ كائن [SmartPtr](../) بالوضع المطلوب.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| mode | SmartPtrMode | وضع المؤشر. |

## انظر أيضًا

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


ينشئ كائن [SmartPtr](../) مؤشره null بالوضع المطلوب.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| معامل | نوع | الوصف |
| --- | --- | --- |
| mode | std::nullptr_t | وضع المؤشر. |

## انظر أيضًا

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
