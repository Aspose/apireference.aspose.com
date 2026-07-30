---
title: "System::SmartPtr::SmartPtr constructor"
linktitle: "SmartPtr"
second_title: "Aspose.Font için C++"
description: "System::SmartPtr::SmartPtr constructor. Referans verilen dizinin tipini farklı bir tipte yeni dizi oluşturarak dönüştürür. C#'ta bulunan ve C++'ta desteklenmeyen bir dizi tip dönüşümü varsa faydalıdır."
type: docs
weight: 100
url: /tr/cpp/system/smartptr/smartptr/
---
## SmartPtr::SmartPtr(const SmartPtr\<Array\<Y\>\>\&, SmartPtrMode) constructor


Referans verilen dizinin tipini, farklı tipte yeni bir dizi oluşturarak dönüştürür. C#'ta desteklenmeyen bir dizi tip dönüşümü C++'ta mevcut olduğunda faydalıdır.

```cpp
template<typename Y> System::SmartPtr<T>::SmartPtr(const SmartPtr<Array<Y>> &src, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametre | Açıklama |
| --- | --- |
| Y | Kaynak dizinin tipi. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| src | const SmartPtr\<Array\<Y\>\>\& | Kopyası oluşturulacak diziye işaretçi, ancak elemanların tipi farklıdır. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Class [Array](../../array/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<P\>\&, Pointee_ *, SmartPtrMode) constructor


ptr'nin ilk değeriyle sahiplik bilgisini paylaşan bir [SmartPtr](../) oluşturur, ancak alakasız ve yönetilmeyen bir p işaretçisi tutar.

```cpp
template<typename P> System::SmartPtr<T>::SmartPtr(const SmartPtr<P> &ptr, Pointee_ *p, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametre | Tür | Açıklama |
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
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr\<Q\>\&, SmartPtrMode) constructor


Bir [SmartPtr](../) nesnesini kopya yapıcı ile oluşturur. Her iki işaretçi de sonrasında aynı nesneyi gösterir. İzin verildiğinde tip dönüşümü gerçekleştirir.

```cpp
template<class Q,typename> System::SmartPtr<T>::SmartPtr(const SmartPtr<Q> &x, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametre | Açıklama |
| --- | --- |
| Q | x tarafından işaret edilen nesnenin türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | const SmartPtr\\<Q\\>\\& | Kopyalanacak işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const SmartPtr_\&, SmartPtrMode) constructor


Bir [SmartPtr](../) nesnesini kopya yapıcı ile oluşturur. Her iki işaretçi de sonrasında aynı nesneyi gösterir.

```cpp
System::SmartPtr<T>::SmartPtr(const SmartPtr_ &ptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| ptr | const SmartPtr_\\& | Kopyalanacak işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(const Y\&) constructor


Boş bir dizi başlatır. Bazı C# kod yapılarının çevrilmesinde kullanılır.

```cpp
template<typename Y,typename> System::SmartPtr<T>::SmartPtr(const Y &)
```


| Parametre | Açıklama |
| --- | --- |
| Y | EmptyArrayInitializer tipinin yer tutucusu. |

## Ayrıca Bakınız

* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(Pointee_ *, SmartPtrMode) constructor


Belirtilen nesneyi işaret eden bir [SmartPtr](../) oluşturur veya ham işaretçiyi [SmartPtr](../)'a dönüştürür.

```cpp
System::SmartPtr<T>::SmartPtr(Pointee_ *object, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| nesne | Pointee_ * | Pointee. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Typedef [Pointee_](../pointee_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtr_\&&, SmartPtrMode) constructor


Bir [SmartPtr](../) nesnesini taşıma yapıcı ile oluşturur. Etkili olarak, iki işaretçi aynı modda ise yer değiştirir. x çağrıdan sonra kullanılamaz olabilir.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtr_ &&x, SmartPtrMode mode=SmartPtrMode::Shared) noexcept
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| x | SmartPtr_\&& | Taşınacak işaretçi. |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Typedef [SmartPtr_](../smartptr_/)
* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(SmartPtrMode) constructor


Gerekli modda bir [SmartPtr](../) nesnesi oluşturur.

```cpp
System::SmartPtr<T>::SmartPtr(SmartPtrMode mode)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| mod | SmartPtrMode | İşaretçi modu. |

## Ayrıca Bakınız

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## SmartPtr::SmartPtr(std::nullptr_t, SmartPtrMode) constructor


Gerekli modda null işaretçi bir [SmartPtr](../) nesnesi oluşturur.

```cpp
System::SmartPtr<T>::SmartPtr(std::nullptr_t=nullptr, SmartPtrMode mode=SmartPtrMode::Shared)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| mod | std::nullptr_t | İşaretçi modu. |

## Ayrıca Bakınız

* Enum [SmartPtrMode](../../smartptrmode/)
* Class [SmartPtr](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
