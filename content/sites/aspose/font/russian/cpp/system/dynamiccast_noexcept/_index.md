---
title: "Метод System::DynamicCast_noexcept"
linktitle: "DynamicCast_noexcept"
second_title: "Aspose.Font для C++"
description: "Метод System::DynamicCast_noexcept. Старые устаревшие приведения. Будут удалены в будущих версиях C++."
type: docs
weight: 17700
url: /ru/cpp/system/dynamiccast_noexcept/
---
## System::DynamicCast_noexcept(const TFrom\&) method


Старые устаревшие приведения типов. Будут удалены в будущих версиях.

```cpp
template<typename TTo,typename TFrom> std::enable_if<IsExceptionWrapper<TFrom>::value &&IsExceptionWrapper<TTo>::value &&(std::is_convertible<TTo, TFrom>::value||std::is_base_of<TTo, TFrom>::value), TTo>::type System::DynamicCast_noexcept(const TFrom &obj) noexcept
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
## Примечания


Выполняет динамическое приведение к объектам [Exception](../exception/). ## Устарело
Оставлено для обратной совместимости. Используйте AsCast вместо этого.

## См. также

* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::DynamicCast_noexcept(SmartPtr\<TFrom\> const\&) method


Выполняет динамическое приведение к объектам [SmartPtr](../smartptr/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<!IsExceptionWrapper<TTo>::value, typenameCastResult<TTo>::type>::type System::DynamicCast_noexcept(SmartPtr<TFrom> const &obj) noexcept
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
## System::DynamicCast_noexcept(SmartPtr\<TFrom\>) method


Выполняет динамическое приведение объектов к объектам [Exception](../exception/).

```cpp
template<typename TTo,typename TFrom> std::enable_if<std::is_same<System::Object, TFrom>::value &&IsExceptionWrapper<TTo>::value, TTo>::type System::DynamicCast_noexcept(SmartPtr<TFrom> obj) noexcept
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
