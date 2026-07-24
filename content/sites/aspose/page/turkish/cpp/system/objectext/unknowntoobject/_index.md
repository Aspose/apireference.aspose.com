---
title: "System::ObjectExt::UnknownToObject yöntemi"
linktitle: "UnknownToObject"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::UnknownToObject yöntemi. Bilinmeyen tipi Object'e dönüştürür, C++'ta akıllı gösterici tipi ve değer tipi durumlarını her ikisini de ele alır."
type: docs
weight: 1800
url: /tr/cpp/system/objectext/unknowntoobject/
---
## ObjectExt::UnknownToObject(const T\&) method


Bilinmeyen tipi [Object](../../object/) tipine dönüştürür, akıllı gösterici tipi ve değer tipi durumlarını her ikisini de ele alır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(const T &obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../object/) tipine dönüştürülecek tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | const T\& | Dönüştürülecek [Object](../../object/). |

### ReturnValue

[Object](../../object/) için akıllı gösterici, dönüştürülmüş gösterici ya da kutulanmış değer olabilir.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::UnknownToObject(T) method


Bilinmeyen tipi [Object](../../object/) tipine dönüştürür, akıllı gösterici tipi ve değer tipi durumlarını her ikisini de ele alır.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, System::SmartPtr<Object>>::type System::ObjectExt::UnknownToObject(T obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../object/) tipine dönüştürülecek tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | T | Dönüştürülecek [Object](../../object/). |

### ReturnValue

[Object](../../object/) için akıllı gösterici, dönüştürülmüş gösterici ya da kutulanmış değer olabilir.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
