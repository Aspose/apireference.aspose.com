---
title: "System::ObjectExt::UnknownIsNull yöntemi"
linktitle: "UnknownIsNull"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::UnknownIsNull yöntemi. Bilinmeyen tip nesnesinin nullptr olup olmadığını kontrol eder. C++'ta skaler olmayan tipler için aşırı yükleme."
type: docs
weight: 1700
url: /tr/cpp/system/objectext/unknownisnull/
---
## ObjectExt::UnknownIsNull(T) method


Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler olmayan tipler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<!std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../object/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T | [Object](../../object/) kontrol etmek için. |

### ReturnValue

'obj == nullptr' doğruysa true, aksi takdirde false.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownIsNull(T) method


Bilinmeyen tip nesnesinin nullptr olup olmadığını denetler. Skaler tipler için aşırı yükleme.

```cpp
template<typename T> static std::enable_if<std::is_scalar<T>::value, bool>::type System::ObjectExt::UnknownIsNull(T obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../object/) türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T | [Object](../../object/) kontrol etmek için. |

### ReturnValue

Her zaman false döndürür.

## Ayrıca Bakınız

* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
