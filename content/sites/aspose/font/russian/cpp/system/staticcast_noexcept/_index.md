---
title: "метод System::StaticCast_noexcept"
linktitle: "StaticCast_noexcept"
second_title: "Aspose.Font для C++"
description: "метод System::StaticCast_noexcept. Выполняет статическое приведение объектов Exception в C++."
type: docs
weight: 39500
url: /ru/cpp/system/staticcast_noexcept/
---
## System::StaticCast_noexcept(const TFrom\&) method


Выполняет статическое приведение объектов [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::StaticCast_noexcept(const TFrom &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого [Exception](../exception/). |
| TFrom | Тип исходного [Exception](../exception/). |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | const TFrom\& | Указатель на источник. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе nullptr.

## Deprecated
Оставлено для обратной совместимости. Используйте AsCast вместо этого.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\> const\&) method


Выполняет статическое приведение для объектов [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::StaticCast_noexcept(SmartPtr<TFrom> const &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого объекта, на который указывает указатель. |
| TFrom | Тип исходного объекта, на который указывает указатель. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> const\& | Указатель на источник. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе nullptr.

## Deprecated
Оставлено для обратной совместимости. Используйте AsCast вместо этого.

## См. также

* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(SmartPtr\<TFrom\>) method


Выполняет статическое приведение объектов к объектам [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::StaticCast_noexcept(SmartPtr<TFrom> obj) noexcept
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого [Exception](../exception/). |
| TFrom | Тип [Object](../object/). |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | SmartPtr\<TFrom\> | Указатель на источник. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе nullptr.

## Deprecated
Оставлено для обратной совместимости. Используйте AsCast вместо этого.

## См. также

* Class [Object](../object/)
* Class [SmartPtr](../smartptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::StaticCast_noexcept(WeakPtr\<TFrom\> const\&) method


Выполняет статическое приведение объектов [WeakPtr](../weakptr/).

```cpp
template<typename TTo,typename TFrom> CastResult<TTo>::type System::StaticCast_noexcept(WeakPtr<TFrom> const &obj)
```


| Параметр | Описание |
| --- | --- |
| TTo | Тип целевого объекта, на который указывает указатель. |
| TFrom | Тип исходного объекта, на который указывает указатель. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| obj | WeakPtr\<TFrom\> const\& | Указатель на источник. |

### ReturnValue

Результат приведения, если приведение разрешено, иначе nullptr.

## Deprecated
Оставлено для обратной совместимости. Используйте AsCast вместо этого.

## См. также

* Class [WeakPtr](../weakptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
