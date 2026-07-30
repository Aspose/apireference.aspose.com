---
title: "System::ObjectExt::UnboxToNullable method"
linktitle: "UnboxToNullable"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::UnboxToNullable method. object'i C++'da nullable türe kutudan çıkarır."
type: docs
weight: 1700
url: /tr/cpp/system/objectext/unboxtonullable/
---
## ObjectExt::UnboxToNullable method


Nesnenin kutlamasını kaldırarak nullable tipe dönüştürür.

```cpp
template<class T> static Nullable<T> System::ObjectExt::UnboxToNullable(const SmartPtr<Object> &obj, bool safe=true)
```


| Parametre | Açıklama |
| --- | --- |
| T | Hedef tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const SmartPtr\<Object\>\& | [Object](../../object/) kutusundan çıkarmak için. |
| güvenli | bool | Doğru ise, başarısızlıkta nullptr döndür, aksi takdirde InvalidCastException fırlat. |

### ReturnValue

Kutu dışı bırakılmış nullable değer (null olabilir).

## Ayrıca Bakınız

* Class [Nullable](../../nullable/)
* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
