---
title: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate yöntemi"
linktitle: "Delegate"
second_title: "Aspose.Page için C++"
description: "System::Delegate< ReturnType(ArgumentTypes...)>::Delegate yöntemi. Varsayılan yapıcı. C++'da hiçbir şeye işaret etmeyen delegate nesnesini oluşturur."
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
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(const Delegate\&) method




```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(const Delegate &)=default
```

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(Delegate\&&) method


Taşıma kopya yapıcı. Belirtilen delegenin işaret ettiği varlığın sahipliğini alır.

```cpp
System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(Delegate &&o) noexcept
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| o | Delegate\&& | Nokta gösterilen varlığın taşınacağı Delegate nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(int, T\&) method


Yapıcı. Belirtilen fonksiyon nesnesinden bir delege oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(int functor_tag, T &functor)
```


| Parameter | Açıklama |
| --- | --- |
| T | Yapıcıya argüman olarak kabul edilen fonksiyon nesnesinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| functor_tag | int | Sahte bir tamsayı değeri; bu argüman belirsizliği çözmek için kullanılır |
| functor | T\& | Yeni oluşturulan delegate'in işaret edeceği bir fonksiyon nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(long, T\&&) method


Taşıma yapıcı. Belirtilen fonksiyon nesnesinden bir delege oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(long functor_tag, T &&functor)
```


| Parameter | Açıklama |
| --- | --- |
| T | Yapıcıya argüman olarak kabul edilen fonksiyon nesnesinin tipi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| functor_tag | long | Sahte bir tamsayı değeri; bu argüman belirsizliği çözmek için kullanılır |
| functor | T\&& | Yeni oluşturulan delegate'in işaret edeceği bir fonksiyon nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*, ClassType *) method


Yapıcı. Belirtilen nesnenin belirtilen statik olmayan yöntemine işaret eden bir delege oluşturur.

```cpp
template<class MemberType,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Açıklama |
| --- | --- |
| MemberType | Yapıcı tarafından bir argüman olarak kabul edilen statik olmayan yöntemin türü |
| ClassType | Yapıcı tarafından bir argüman olarak kabul edilen nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| üye | MemberType ClassType::* | Yeni oluşturulan delegenin işaret edeceği statik olmayan yönteme bir işaretçi |
| obj | ClassType * | Yeni oluşturulan delegenin işaret edeceği nesne üye yöntemine bir işaretçi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*, const SharedPtr\<ClassType\>\&) method


Yapıcı. Belirtilen nesnenin belirtilen statik olmayan yöntemine işaret eden bir delege oluşturur.

```cpp
template<class MemberType,class MemberClass,class ClassType> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(MemberType MemberClass::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| MemberType | Yapıcı tarafından bir argüman olarak kabul edilen statik olmayan yöntemin türü |
| ClassType | Yapıcı tarafından bir argüman olarak kabul edilen nesnenin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| üye | MemberType MemberClass::* | Yeni oluşturulan delegenin işaret edeceği statik olmayan yönteme bir işaretçi |
| obj | const SharedPtr\<ClassType\>\& | Yeni oluşturulan delegenin işaret edeceği nesne üye yöntemine bir paylaşımlı işaretçi |

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(std::function\<R(Args...)>) method


Bir std::function fonksiyon nesnesine işaret eden bir delege nesnesi oluşturur.

```cpp
template<class R,class...> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(std::function<R(Args...)> f)
```


| Parameter | Açıklama |
| --- | --- |
| R | Yapıcı tarafından bir argüman olarak kabul edilen fonksiyon nesnesinin dönüş türü |
| Argümanlar | Yapıcı tarafından bir argüman olarak kabul edilen fonksiyon nesnesinin argüman listesi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Yeni oluşturulan delegenin işaret edeceği bir fonksiyon nesnesi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if\<std::is_bind_expression\<T\>::value\>::type *) method


Yapıcı. std::bind() tarafından oluşturulan fonksiyon nesnesine işaretçiden bir delege oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<std::is_bind_expression<T>::value>::type *=0)
```


| Parameter | Açıklama |
| --- | --- |
| Bu | Yapıcı tarafından bir argüman olarak kabul edilen std::bind() tarafından oluşturulan fonksiyon nesnesinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| fonksiyon | T | Yeni oluşturulan Delegate örneğinin işaret edeceği bir "bind ifadesi" - std::bind() tarafından oluşturulan bir fonksiyon işaretçisi - için bir işaretçi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## Delegate< ReturnType(ArgumentTypes...)>::Delegate(T, typename std::enable_if<!std::is_bind_expression\<T\>::value\&&std::is_pointer\<T\>::value\&&std::is_function\<typename std::remove_pointer\<T\>::type\>::value\>::type *) method


Yapıcı. Belirtilen serbest fonksiyon veya statik yönteme işaretçiden bir delege nesnesi oluşturur.

```cpp
template<class T> System::Delegate<ReturnType(ArgumentTypes...)>::Delegate(T function, typename std::enable_if<!std::is_bind_expression<T>::value &&std::is_pointer<T>::value &&std::is_function<typename std::remove_pointer<T>::type>::value>::type *=0)
```


| Parameter | Açıklama |
| --- | --- |
| Bu | Yapıcı tarafından bir argüman olarak kabul edilen fonksiyon veya statik yöntem işaretçisinin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| fonksiyon | T | Yeni oluşturulan Delegate örneğinin işaret edeceği bir fonksiyon veya statik yönteme bir işaretçi |

## Ayrıca Bakınız

* Class [Delegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
