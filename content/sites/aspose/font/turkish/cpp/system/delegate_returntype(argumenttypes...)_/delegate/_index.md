---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate metodu"
linktitle: "Delegate"
second_title: "Aspose.Font için C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate metodu. Varsayılan yapıcı. C++'da hiçbir şeye işaret etmeyen delegate nesnesini oluşturur."
type: docs
weight: 100
url: /tr/cpp/system/delegate_returntype(argumenttypes...)_/delegate/
---
## Delegate< ReturnType(ArgumentTypes...)>::Delegate() method


Varsayılan yapıcı. Hiçbir şeye işaret etmeyen delege nesnesini oluşturur.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate()=default
```

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Taşıma kopya yapıcı. Belirtilen delege tarafından işaret edilen varlığın sahipliğini alır.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| o | Delegate\&& | İşaret edilen varlığı taşımak için Delegate nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Yapıcı. Belirtilen fonksiyon nesnesinden bir delege oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parametre | Açıklama |
| --- | --- |
| T | Yapıcı tarafından argüman olarak kabul edilen fonksiyon nesnesinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| functor_tag | int | Sahte bir tam sayı değeri; bu argüman belirsizliği çözmek için kullanılır |
| functor | T\& | Yeni oluşturulan delege'nin işaret edeceği bir fonksiyon nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Taşıma yapıcı. Belirtilen fonksiyon nesnesinden bir delege oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parametre | Açıklama |
| --- | --- |
| T | Yapıcı tarafından argüman olarak kabul edilen fonksiyon nesnesinin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| functor_tag | long | Sahte bir tam sayı değeri; bu argüman belirsizliği çözmek için kullanılır |
| functor | T\&& | Yeni oluşturulan delege'nin işaret edeceği bir fonksiyon nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Yapıcı. Belirtilen nesnenin belirtilen statik olmayan metoduna işaret eden bir delege oluşturur.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parametre | Açıklama |
| --- | --- |
| MemberType | Yapıcı tarafından argüman olarak kabul edilen statik olmayan metodun tipi |
| ClassType | Yapıcı tarafından argüman olarak kabul edilen nesnenin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| üye | MemberType ClassType::* | Yeni oluşturulan delege'nin işaret edeceği statik olmayan metodun bir işaretçisi |
| obj | ClassType * | Yeni oluşturulan delege tarafından işaret edilecek nesne üye metodunun bir işaretçisi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Yapıcı. Belirtilen nesnenin belirtilen statik olmayan metoduna işaret eden bir delege oluşturur.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| MemberType | Yapıcı tarafından argüman olarak kabul edilen statik olmayan metodun tipi |
| ClassType | Yapıcı tarafından argüman olarak kabul edilen nesnenin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| üye | MemberType MemberClass::* | Yeni oluşturulan delege'nin işaret edeceği statik olmayan metodun bir işaretçisi |
| obj | const SharedPtr\<ClassType\>\& | Yeni oluşturulan delege tarafından işaret edilecek bir nesne üye metoduna ait bir shared pointer |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Bir std::function fonksiyon nesnesine işaret eden bir delege nesnesi oluşturur.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parametre | Açıklama |
| --- | --- |
| R | Yapıcı tarafından argüman olarak kabul edilen fonksiyon nesnesinin dönüş tipi |
| Args | Yapıcı tarafından argüman olarak kabul edilen fonksiyon nesnesinin argüman listesi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Yeni oluşturulan delege nesnesi tarafından işaret edilecek bir fonksiyon nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Yapıcı. std::bind() tarafından oluşturulan fonksiyon nesnesine işaret eden belirtilen işaretçiden bir delege oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parametre | Açıklama |
| --- | --- |
| Bu | std::bind() tarafından oluşturulan ve yapıcı tarafından argüman olarak kabul edilen fonksiyon nesnesinin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fonksiyon | T | \"bind ifadesi\"ne işaretçi - std::bind() tarafından oluşturulan bir fonksiyon işaretçisi - yeni oluşturulan Delegate örneği tarafından işaret edilecek |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Yapıcı. Belirtilen serbest fonksiyon veya statik metoda işaretçiden bir delege nesnesi oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parametre | Açıklama |
| --- | --- |
| Bu | Yapıcı tarafından argüman olarak kabul edilen fonksiyon ya da statik metod işaretçisinin tipi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| fonksiyon | T | Yeni oluşturulan Delegate örneği tarafından işaret edilecek bir fonksiyon ya da statik metodun işaretçisi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
