---
title: "System::Nullable::Equals метод"
linktitle: "Equals"
second_title: "Aspose.Page для C++"
description: "System::Nullable::Equals метод. Определяет, равняется ли значение, представляемое текущим объектом, значению, представляемому указанным объектом Nullable, в C++."
type: docs
weight: 200
url: /ru/cpp/system/nullable/equals/
---
## Nullable::Equals method


Определяет, равно ли значение, представленное текущим объектом, значению, представленному указанным объектом [Nullable](../).

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Параметр | Описание |
| --- | --- |
| T1 | Базовый тип объекта [Nullable](../), с которым производится сравнение |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const T1\& | Константная ссылка на объект [Nullable](../), с которым производится сравнение |

### ReturnValue

Истина, если значение, представленное текущим объектом, равно значению, представленному указанным объектом [Nullable](../), иначе — ложь

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
