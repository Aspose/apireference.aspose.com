---
title: "metode System::Delegate< ReturnType(ArgumentTypes...)>::Delegate"
linktitle: "Delegate"
second_title: "Aspose.Page untuk C++"
description: "metode System::Delegate< ReturnType(ArgumentTypes...)>::Delegate. Konstruktor default. Membuat objek delegate yang tidak menunjuk ke apa pun dalam C++."
type: docs
weight: 100
url: /id/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Konstruktor default. Membuat objek delegate yang tidak menunjuk ke apa pun.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Konstruktor penyalinan bergerak. Mengambil kepemilikan entitas yang ditunjuk oleh delegate yang ditentukan.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| o | Delegate\&& | Objek Delegate untuk memindahkan entitas yang ditunjuk darinya |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Konstruktor. Membuat delegate dari objek fungsi yang ditentukan.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek fungsi yang diterima oleh konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| functor_tag | int | Nilai integer tiruan; argumen ini digunakan untuk menyelesaikan ambiguitas |
| functor | T\\& | Objek fungsi yang akan ditunjuk oleh delegate yang baru dibuat |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Konstruktor bergerak. Membuat delegate dari objek fungsi yang ditentukan.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | Deskripsi |
| --- | --- |
| T | Tipe objek fungsi yang diterima oleh konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| functor_tag | long | Nilai integer tiruan; argumen ini digunakan untuk menyelesaikan ambiguitas |
| functor | T\&& | Objek fungsi yang akan ditunjuk oleh delegate yang baru dibuat |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Konstruktor. Membuat delegate yang menunjuk ke metode non-statis yang ditentukan dari objek yang ditentukan.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Deskripsi |
| --- | --- |
| MemberType | Tipe dari metode non-static yang diterima konstruktor sebagai argumen |
| ClassType | Tipe dari objek yang diterima konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anggota | MemberType ClassType::* | Pointer ke metode non-static yang akan ditunjuk oleh delegate yang baru dibuat |
| obj | ClassType * | Pointer ke metode anggota objek yang akan ditunjuk oleh delegate yang baru dibuat |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Konstruktor. Membuat delegate yang menunjuk ke metode non-statis yang ditentukan dari objek yang ditentukan.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Deskripsi |
| --- | --- |
| MemberType | Tipe dari metode non-static yang diterima konstruktor sebagai argumen |
| ClassType | Tipe dari objek yang diterima konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| anggota | MemberType MemberClass::* | Pointer ke metode non-static yang akan ditunjuk oleh delegate yang baru dibuat |
| obj | const SharedPtr\<ClassType\>\& | Pointer shared ke metode anggota objek yang akan ditunjuk oleh delegate yang baru dibuat |

## Lihat Juga

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Membuat objek delegate yang menunjuk ke objek fungsi std::function.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | Deskripsi |
| --- | --- |
| R | Tipe kembalian dari objek fungsi yang diterima konstruktor sebagai argumen |
| Argumen | Daftar argumen dari objek fungsi yang diterima konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| f | std::function\<R(Args...)> | Objek fungsi yang akan ditunjuk oleh objek delegate yang baru dibuat |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Konstruktor. Membuat delegate dari pointer yang ditentukan ke objek fungsi yang dihasilkan oleh std::bind().

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | Deskripsi |
| --- | --- |
| The | Tipe dari objek fungsi yang dihasilkan oleh std::bind() yang diterima konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fungsi | T | Pointer ke "bind expression" - sebuah pointer fungsi yang dihasilkan oleh std::bind() - yang akan ditunjuk oleh instance Delegate yang baru dibuat |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Konstruktor. Membuat objek delegate dari pointer yang ditentukan ke fungsi bebas atau metode statis.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | Deskripsi |
| --- | --- |
| The | Tipe dari pointer fungsi atau metode statis yang diterima konstruktor sebagai argumen |

| Parameter | Tipe | Deskripsi |
| --- | --- | --- |
| fungsi | T | Pointer ke fungsi atau metode statis yang akan ditunjuk oleh instance Delegate yang baru dibuat |

## Lihat Juga

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
