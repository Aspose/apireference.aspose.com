---
title: "System::Nullable::Equals method"
linktitle: "Equals"
second_title: "Aspose.Font для C++"
description: "System::Nullable::Equals method. Определяет, равно ли значение, представленное текущим объектом, значению, представленному указанным объектом Nullable в C++."
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
| T1 | Базовый тип объекта [Nullable](../) для сравнения |

| Параметр | Тип | Описание |
| --- | --- | --- |
| other | const T1\& | Константная ссылка на объект [Nullable](../) для сравнения |

### ReturnValue

True, если значение, представленное текущим объектом, равно значению, представленному указанным объектом [Nullable](../), иначе — false

## См. также

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
