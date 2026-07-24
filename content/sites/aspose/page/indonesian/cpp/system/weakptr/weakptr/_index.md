---
title: "System::WeakPtr::WeakPtr konstruktor"
linktitle: "WeakPtr"
second_title: "Aspose.Page untuk C++"
description: "System::WeakPtr::WeakPtr konstruktor. Membuat weak pointer yang mereferensikan pointer yang sama yang ditunjuk oleh x dalam C++."
type: docs
weight: 100
url: /id/cpp/system/weakptr/weakptr/
---
## WeakPtr::WeakPtr(const SmartPtr\<Q\>\&) constructor


Membuat weak pointer yang merujuk ke pointer yang sama yang ditunjuk oleh x.

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const SmartPtr<Q> &x)
```


| Parameter | Deskripsi |
| --- | --- |
| Q | Tipe pointee dari pointer sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const SmartPtr\<Q\>\& | Pointer untuk menyalin nilai pointee dari. |

## Lihat Juga

* Class [SmartPtr](../../smartptr/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const SmartPtr_\&) constructor


Membuat weak pointer yang merujuk ke pointer yang sama yang ditunjuk oleh ptr.

```cpp
System::WeakPtr<T>::WeakPtr(const SmartPtr_ &ptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ptr | const SmartPtr_\& | Pointer untuk menyalin nilai pointee dari. |

## Lihat Juga

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr\<Q\>\&) constructor


Membuat weak pointer dengan copy-constructor.

```cpp
template<class Q,typename> System::WeakPtr<T>::WeakPtr(const WeakPtr<Q> &x)
```


| Parameter | Deskripsi |
| --- | --- |
| Q | Tipe pointee sumber. |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | const WeakPtr\<Q\>\& | Pointer untuk menyalin nilai pointee dari. |

## Lihat Juga

* Class [WeakPtr](../)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(const WeakPtr_\&) constructor


Membuat weak pointer dengan copy-constructor.

```cpp
System::WeakPtr<T>::WeakPtr(const WeakPtr_ &ptr)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| ptr | const WeakPtr_\& | Pointer untuk menyalin nilai pointee dari. |

## Lihat Juga

* Typedef [WeakPtr_](../weakptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(Pointee_ *) constructor


Membuat weak pointer ke objek yang diberikan.

```cpp
System::WeakPtr<T>::WeakPtr(Pointee_ *object)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| object | Pointee_ * | [Object](../../object/) untuk membuat weak pointer ke. |

## Lihat Juga

* Typedef [Pointee_](../pointee_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(SmartPtr_\&&) constructor


Membuat weak pointer dengan move-constructor.

```cpp
System::WeakPtr<T>::WeakPtr(SmartPtr_ &&x)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| x | SmartPtr_\&& | Pointer untuk memindahkan nilai pointee dari. |

## Lihat Juga

* Typedef [SmartPtr_](../smartptr_/)
* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## WeakPtr::WeakPtr(std::nullptr_t) constructor


Membuat pointer null.

```cpp
System::WeakPtr<T>::WeakPtr(std::nullptr_t=nullptr)
```

## Lihat Juga

* Class [WeakPtr](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
