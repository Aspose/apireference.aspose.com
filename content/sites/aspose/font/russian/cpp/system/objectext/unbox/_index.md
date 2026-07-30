---
title: "Метод System::ObjectExt::Unbox"
linktitle: "Unbox"
second_title: "Aspose.Font для C++"
description: "Метод System::ObjectExt::Unbox. Разупаковывает типы значений после преобразования в Object. Реализация для перечислений в C++."
type: docs
weight: 1500
url: /ru/cpp/system/objectext/unbox/
---
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Разупаковывает типы значений после преобразования в [Object](../../object/). Реализация для перечислений.

```cpp
template<typename T> static std::enable_if<std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | [Enum](../../enum/) тип. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для разупаковки. |

### ReturnValue

[Enum](../../enum/) value.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Разупаковывает типы значений после преобразования в [Object](../../object/). Реализация для типов, не являющихся enum и не nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип значения. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для разупаковки. |

### ReturnValue

Разупакованное значение.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Разупаковывает типы значений после преобразования в [Object](../../object/). Реализация для типов, не являющихся enum и не nullable.

```cpp
template<class T> static std::enable_if<!std::is_enum<T>::value &&!detail::has_operator_equal<T>::value, T>::type System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Параметр | Описание |
| --- | --- |
| T | Тип значения. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для разупаковки. |

### ReturnValue

Разупакованное значение.

## См. также

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(const SmartPtr\<Object\>\&) method


Разупаковывает строковые значения.

```cpp
String System::ObjectExt::Unbox(const SmartPtr<Object> &obj)
```


| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) для разупаковки |

### ReturnValue

[String](../../string/) representation of boxed string, can be null if boxed string was null.

## См. также

* Class [String](../../string/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Разупаковывает enum типы в целое число.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::numeric_limits<T>::is_integer, T>::type System::ObjectExt::Unbox(E e)
```


| Параметр | Описание |
| --- | --- |
| T | Тип целого числа назначения. |
| E | Тип исходного enum. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| e | E | Значение для разупаковки. |

### ReturnValue

Целочисленное представление enum.

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::Unbox(E) method


Преобразует enum типы.

```cpp
template<class T,class E> static std::enable_if<std::is_enum<E>::value &&std::is_enum<T>::value, T>::type System::ObjectExt::Unbox(E e)
```


| Параметр | Описание |
| --- | --- |
| T | Тип перечисления назначения. |
| E | Тип исходного enum. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| e | E | Значение для разупаковки. |

### ReturnValue

Преобразованное значение перечисления.

## См. также

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
