---
title: "System::SmartPtr::SmartPtr yapıcı"
linktitle: "SmartPtr"
second_title: "Aspose.Page için C++"
description: "System::SmartPtr::SmartPtr yapıcı. Referans verilen dizinin tipini farklı tipte yeni bir dizi oluşturarak dönüştürür. C#'ta dizi tip dönüşümü yapılmış ve bu C++'ta desteklenmiyorsa faydalıdır."
type: docs
weight: 100
url: /tr/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Referans verilen dizinin tipini, farklı tipte yeni bir dizi oluşturarak dönüştürür. C#'ta desteklenmeyen bir dizi tip dönüşümü C++'ta mevcutsa faydalıdır.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Açıklama |
| --- | --- |
| Y | Kaynak dizinin tipi. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Elemanları farklı tipte olacak şekilde bir kopya oluşturmak için diziye işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


İlk ptr değerinin sahiplik bilgilerini paylaşan bir [SmartPtr](../) oluşturur, ancak alakasız ve yönetilmeyen bir p işaretçisi tutar.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ptr | const SmartPtr\<P\>\& | Sahipliği paylaşmak için başka bir akıllı işaretçi. |
| p | Pointee_ * | Yönetilecek bir nesneye işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


[SmartPtr](../) nesnesini kopya oluşturur. Her iki işaretçi de sonrasında aynı nesneyi gösterir. İzin verildiğinde tip dönüşümü gerçekleştirir.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Açıklama |
| --- | --- |
| Q | x tarafından işaret edilen nesnenin türü. |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Kopyalanacak işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


[SmartPtr](../) nesnesini kopya oluşturur. Her iki işaretçi de sonrasında aynı nesneyi gösterir.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Kopyalanacak işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Boş bir dizi başlatır. Bazı C# kod yapılarının çevrilmesinde kullanılır.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parameter | Açıklama |
| --- | --- |
| Y | EmptyArrayInitializer tipinin yer tutucusu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Belirtilen nesneyi işaret eden bir [SmartPtr](../) oluşturur veya ham işaretçiyi [SmartPtr](../) tipine dönüştürür.

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| nesne | Pointee_ * | İşaret edilen nesne. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


[SmartPtr](../) nesnesini taşıma ile oluşturur. Aslında, iki işaretçi aynı modda ise yer değiştirir. Çağrıdan sonra x kullanılmaz hale gelebilir.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| x | SmartPtr_\&& | Taşınacak işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Gerekli modda bir [SmartPtr](../) nesnesi oluşturur.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Gerekli modda null işaretçili bir [SmartPtr](../) nesnesi oluşturur.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| mod | std::nullptr_t | İşaretçi modu. |

## Ayrıca Bakınız

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
