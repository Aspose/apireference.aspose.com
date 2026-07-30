---
title: "System::Nullable::Equals yöntemi"
linktitle: "Eşittir"
second_title: "Aspose.Font için C++"
description: "System::Nullable::Equals yöntemi. Mevcut nesne tarafından temsil edilen değerin, C++'ta belirtilen Nullable nesnesi tarafından temsil edilen değerle eşit olup olmadığını belirler."
type: docs
weight: 200
url: /tr/cpp/system/nullable/equals/
---
## Nullable::Equals method


Geçerli nesne tarafından temsil edilen değerin, belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere eşit olup olmadığını belirler.

```cpp
template<typename T1> std::enable_if<IsNullable<T1>::value, bool>::type System::Nullable<T>::Equals(const T1 &other) const
```


| Parametre | Açıklama |
| --- | --- |
| T1 | Karşılaştırılacak [Nullable](../) nesnesinin temel türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| other | const T1\& | Karşılaştırma için [Nullable](../) nesnesine sabit referans |

### ReturnValue

Doğru, geçerli nesne tarafından temsil edilen değer belirtilen [Nullable](../) nesnesi tarafından temsil edilen değere eşitse, aksi takdirde - yanlış

## Ayrıca Bakınız

* Class [Nullable](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
