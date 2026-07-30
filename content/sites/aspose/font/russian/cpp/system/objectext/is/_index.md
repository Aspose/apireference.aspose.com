---
title: "Метод System::ObjectExt::Is"
linktitle: "Is"
second_title: "Aspose.Font для C++"
description: "Метод System::ObjectExt::Is. Реализует перевод оператора ''is''. Специализация для строкового литерала в C++."
type: docs
weight: 1100
url: /ru/cpp/system/objectext/is/
---
## ObjectExt::Is(const char16_t *) method


Реализует перевод оператора 'is'. Специализация для строкового литерала.

```cpp
template<class T> static bool System::ObjectExt::Is(const char16_t *str)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| str | const char16_t * | [String](../../string/) литерал. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const ExceptionWrapper\<U\>\&) method


Реализует трансляцию оператора 'is'. Специализация для типов-обёрток исключений.

```cpp
template<class T,class U> static std::enable_if<IsExceptionWrapper<T>::value, bool>::type System::ObjectExt::Is(const ExceptionWrapper<U> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const ExceptionWrapper\<U\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [ExceptionWrapper](../../exceptionwrapper/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Nullable\<U\>\&) method


Реализует перевод оператора 'is'. Специализация для типа [Nullable](../../nullable/).

```cpp
template<class T,class U> static bool System::ObjectExt::Is(const Nullable<U> &value)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| value | const Nullable\<U\>\& | [Nullable](../../nullable/) тип. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [Nullable](../../nullable/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


Реализует трансляцию оператора 'is'. Специализация для значимых типов.

```cpp
template<class T> static std::enable_if<std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const Object\&) method


Реализует трансляцию оператора 'is'. Специализация для непреобразуемых типов.

```cpp
template<class T> static std::enable_if<!std::is_convertible<T, Object>::value, bool>::type System::ObjectExt::Is(const Object &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const Object\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

Всегда возвращает false, так как типы неконвертируемы.

## См. также

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Реализует перевод оператора 'is'. Специализация для nullable типов.

```cpp
template<class T> static std::enable_if<IsNullable<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Реализует перевод оператора 'is'. Специализация для boxable типов с определённым оператором ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<Object\>\&) method


Реализует перевод оператора 'is'. Специализация для boxable типов без определённого оператора ==.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<Object> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Реализует трансляцию оператора 'is'. Специализация для указательных типов.

```cpp
template<class T,class U> static std::enable_if<IsSmartPtr<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<U\>\&) method


Реализует перевод оператора 'is'. Специализация для enum типов.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const SmartPtr<U> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |
| U | Тип указного объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<U\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const SmartPtr\<V\>\&) method


Реализует перевод оператора 'is'. Специализация value типов, упакованных в интерфейсы.

```cpp
template<class T,class V> static std::enable_if<System::IsBoxable<T>::value &&!IsNullable<T>::value &&!std::is_enum<T>::value &&!std::is_same<V, Object>::value, bool>::type System::ObjectExt::Is(const SmartPtr<V> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |
| V | Тип указного объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<V\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [Object](../../object/)
* Class [SmartPtr](../../smartptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const T\&) method


Реализует трансляцию оператора 'is'. Специализация для упаковываемых (значимых) типов, что именно они есть.

```cpp
template<class T> static std::enable_if<System::IsBoxable<T>::value, bool>::type System::ObjectExt::Is(const T &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const T\& | [Object](../../object/) для тестирования оператора 'is'. Игнорируется. |

### ReturnValue

Всегда true

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


Реализует трансляцию оператора 'is'. Специализация для указательных типов, оптимизированных для классов 'final'.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |
| U | Тестируемый тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const U\&) method


Реализует трансляцию оператора 'is'. Специализация для указательных типов.

```cpp
template<class T,class U> static std::enable_if<std::is_convertible<T, Object>::value &&!std::is_final<T>::value &&!System::IsBoxable<T>::value &&System::IsSmartPtr<U>::value, bool>::type System::ObjectExt::Is(const U &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |
| U | Тестируемый тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const U\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(const WeakPtr\<U\>\&) method


Реализует перевод оператора 'is'. Специализация для enum типов против weak указателей.

```cpp
template<class T,class U> static std::enable_if<std::is_enum<T>::value, bool>::type System::ObjectExt::Is(const WeakPtr<U> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |
| U | Тип указного объекта. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const WeakPtr\<U\>\& | [Object](../../object/) для тестирования оператора 'is'. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [WeakPtr](../../weakptr/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Is(int32_t) method


Реализует перевод оператора 'is'. Специализация для целочисленного литерала.

```cpp
template<class T> static bool System::ObjectExt::Is(int32_t value)
```


| Параметр | Описание |
| --- | --- |
| T | Целевой тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| значение | int32_t | целочисленный литерал. |

### ReturnValue

true, если 'is' возвращает true, иначе false.

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
