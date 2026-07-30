---
title: "System::ObjectExt::UnknownToObject yöntemi"
linktitle: "UnknownToObject"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::UnknownToObject yöntemi. Bilinmeyen tipteki nesneyi Object'e dönüştürür, C++'ta hem akıllı işaretçi tiplerini hem de değer tipi durumlarını ele alır."
type: docs
weight: 1900
url: /tr/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Bilinmeyen tipteki nesneyi [Object](../../object/) tipine dönüştürür, hem akıllı işaretçi tiplerini hem de değer tipi durumlarını ele alır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../object/) tipine dönüştürülecek tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | const T\& | Dönüştürülecek [Object](../../object/). |

### ReturnValue

[Object](../../object/) için akıllı işaretçi, dönüştürülmüş işaretçi ya da kutulanmış değer olabilir.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Bilinmeyen tipteki nesneyi [Object](../../object/) tipine dönüştürür, hem akıllı işaretçi tiplerini hem de değer tipi durumlarını ele alır.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../object/) tipine dönüştürülecek tip. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | T | Dönüştürülecek [Object](../../object/). |

### ReturnValue

[Object](../../object/) için akıllı işaretçi, dönüştürülmüş işaretçi ya da kutulanmış değer olabilir.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
