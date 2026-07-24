---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect metode"
linktitle: "hubungkan"
second_title: "Aspose.Page untuk C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect metode. Menambahkan delegate yang ditentukan ke koleksi dalam C++."
type: docs
weight: 400
url: /id/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Menambahkan delegate yang ditentukan ke koleksi.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| callback | Callback | Delegasi yang akan ditambahkan ke koleksi |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Menambahkan metode non-statis yang ditentukan dari objek yang ditentukan ke koleksi delegate.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Deskripsi |
| --- | --- |
| MemberType | Tipe dari metode non-statis yang akan ditambahkan ke koleksi delegate |
| ClassType | Tipe dari metode objek yang akan ditambahkan ke delegate |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anggota | MemberType ClassType::* | Pointer ke metode non-statis dari objek yang ditentukan |
| obj | ClassType * | Pointer ke metode anggota objek yang akan ditambahkan ke koleksi delegate |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Menambahkan metode non-statis yang ditentukan dari objek yang ditentukan ke koleksi delegate.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| MemberType | Tipe dari metode non-statis yang akan ditambahkan ke koleksi delegate |
| ClassType | Tipe dari metode objek yang akan ditambahkan ke koleksi delegate |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anggota | MemberType ClassType::* | Pointer ke metode non-statis dari objek yang ditentukan |
| obj | const SharedPtr\<ClassType\>\& | Pointer bersama ke metode anggota objek yang akan ditambahkan ke koleksi delegate |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Menambahkan objek MulticastDelegate yang ditentukan ke koleksi delegate.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| lain | MulticastDelegate\& | Sebuah instance dari kelas MulticastDelegate untuk ditambahkan ke koleksi delegate |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Menambahkan objek fungsi yang ditentukan ke koleksi delegate. Objek fungsi dikonversi ke tipe delegate [Callback](../callback/) sebelum ditambahkan ke koleksi.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parameter | Deskripsi |
| --- | --- |
| R | Tipe pengembalian dari objek fungsi yang akan ditambahkan ke koleksi |
| Argumen | Daftar argumen dari objek fungsi yang akan ditambahkan ke koleksi |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Objek fungsi yang akan ditambahkan ke koleksi |

### ReturnValue

Referensi ke diri sendiri

## Lihat Juga

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
