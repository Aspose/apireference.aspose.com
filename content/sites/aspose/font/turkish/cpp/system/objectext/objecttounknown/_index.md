---
title: "System::ObjectExt::ObjectToUnknown method"
linktitle: "ObjectToUnknown"
second_title: "Aspose.Font için C++"
description: "System::ObjectExt::ObjectToUnknown method. Object'i bilinmeyen bir türe dönüştürür, C++'da akıllı gösterici türü ve kutuya alınmış değer durumlarını ele alır."
type: docs
weight: 1300
url: /tr/cpp/system/objectext/objecttounknown/
---
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) öğesini bilinmeyen bir türe dönüştürür, akıllı gösterici türü ve kutuya alınmış değer durumlarını ele alır.

```cpp
template<typename T> static std::enable_if<IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../object/) öğesini dönüştürmek için tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | Dönüştürülecek [Object](../../object/). |

### ReturnValue

Ya kutudan çıkarılmış değer ya da dönüştürülmüş gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## ObjectExt::ObjectToUnknown(SmartPtr\<Object\>) method


[Object](../../object/) öğesini bilinmeyen bir türe dönüştürür, akıllı gösterici türü ve kutuya alınmış değer durumlarını ele alır.

```cpp
template<typename T> static std::enable_if<!IsSmartPtr<T>::value, T>::type System::ObjectExt::ObjectToUnknown(SmartPtr<Object> obj)
```


| Parametre | Açıklama |
| --- | --- |
| T | [Object](../../object/) öğesini dönüştürmek için tür. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| obj | SmartPtr\<Object\> | Dönüştürülecek [Object](../../object/). |

### ReturnValue

Ya kutudan çıkarılmış değer ya da dönüştürülmüş gösterici.

## Ayrıca Bakınız

* Class [SmartPtr](../../smartptr/)
* Class [Object](../../object/)
* Class [ObjectExt](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
