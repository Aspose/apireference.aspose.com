---
title: "метод System::With"
linktitle: "С"
second_title: "Aspose.Page для C++"
description: "Метод System::With. Клонирует ссылочную запись и применяет к ней инициализирующий функтор в C++."
type: docs
weight: 40100
url: /ru/cpp/system/with/
---
## System::With(const SharedPtr\<T\>\&, const A\&) method


Клонирует ссылочную запись и применяет к ней инициализирующий функтор.

```cpp
template<typename T,typename A> SharedPtr<T> System::With(const SharedPtr<T> &record, const A &initializer)
```


| Параметр | Описание |
| --- | --- |
| T | Тип записи для клонирования. |
| A | Тип инициализирующего функтора. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| record | const SharedPtr\<T\>\& | Разделяемый указатель на объект для клонирования и инициализации. |
| инициализатор | const A\& | Инициализирующий функтор, применяемый к клону записи. |

### ReturnValue

Разделяемый указатель на клонированную запись.

## См. также

* Typedef [SharedPtr](../sharedptr/)
* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
## System::With(const T\&, const A\&) method


Копирует структуру записи и применяет к ней инициализирующий функтор.

```cpp
template<typename T,typename A> T System::With(const T &record, const A &initializer)
```


| Параметр | Описание |
| --- | --- |
| T | Тип записи для копирования. |
| A | Тип инициализирующего функтора. |

| Параметр | Тип | Описание |
| --- | --- | --- |
| record | const T\& | Запись для копирования и инициализации. |
| инициализатор | const A\& | Инициализирующий функтор, применяемый к копии записи. |

### ReturnValue

Скопированная запись.

## См. также

* Namespace [System](../)
* Library [Aspose.Page for C++](../../)
