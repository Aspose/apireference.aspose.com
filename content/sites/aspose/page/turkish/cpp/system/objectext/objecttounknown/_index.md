---
title: "System::ObjectExt::ObjectToUnknown method"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Page için C++"
description: "System::ObjectExt::ObjectToUnknown method. Object'i bilinmeyen bir tipe dönüştürür, C++'ta hem akıllı gösterici tipini hem de kutulanmış değer durumlarını ele alır."
type: docs
weight: 1200
url: /tr/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) nesnesini bilinmeyen bir tipe dönüştürür, hem akıllı gösterici tipini hem de kutulanmış değer durumlarını ele alır.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../object/) nesnesini dönüştürmek için hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | Dönüştürülecek [Object](../../object/). |

### ReturnValue

Ya açılmış değer ya da dönüştürülmüş gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) nesnesini bilinmeyen bir tipe dönüştürür, hem akıllı gösterici tipini hem de kutulanmış değer durumlarını ele alır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parameter | Açıklama |
| --- | --- |
| T | [Object](../../object/) nesnesini dönüştürmek için hedef tip. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | Dönüştürülecek [Object](../../object/). |

### ReturnValue

Ya açılmış değer ya da dönüştürülmüş gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
