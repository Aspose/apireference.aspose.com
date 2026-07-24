---
title: "System::Nullable::Equals metodu"
linktitle: "Eşittir"
second_title: "Aspose.Page için C++"
description: "System::Nullable::Equals metodu. C++'ta mevcut nesne tarafından temsil edilen değerin, belirtilen Nullable nesnesi tarafından temsil edilen değerle eşit olup olmadığını belirler."
type: docs
weight: 200
url: /tr/cpp/system/nullable/equals/
---
## Nullable::Equals method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerle eşit olup olmadığını belirler.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parameter | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| other | const T1\& | Karşılaştırılacak [Nullable](../) nesnesine sabit bir referans |

### ReturnValue

Doğru ise geçerli nesne tarafından temsil edilen değer, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değerle eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
