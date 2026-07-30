---
title: "System::ObjectExt::UnknownIsNull metodu"
linktitle: "UnknownIsNull"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::UnknownIsNull yöntemi. Bilinmeyen tipteki nesnenin nullptr olup olmadığını kontrol eder. C++'ta skaler olmayan tipler için aşırı yükleme."
type: docs
weight: 1800
url: /tr/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler olmayan tipler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../object/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T | [Object](../../object/) kontrol etmek için. |

### ReturnValue

Eğer 'obj == nullptr' doğruysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler tipler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../object/) türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T | [Object](../../object/) kontrol etmek için. |

### ReturnValue

Her zaman false döndürür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
