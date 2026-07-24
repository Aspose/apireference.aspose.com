---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect yöntemi"
linktitle: "bağla"
second_title: "Aspose.Page için C++"
description: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect yöntemi. Belirtilen delegeyi C++'ta koleksiyona ekler."
type: docs
weight: 400
url: /tr/cpp/system/multicastdelegate_returntype(argumenttypes...)_/connect/
---
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(Callback) method


Belirtilen delegeyi koleksiyona ekler.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(Callback callback)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| geri çağırma | Callback | Koleksiyona eklenecek delege |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonuna ekler.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parameter | Açıklama |
| --- | --- |
| MemberType | Delege koleksiyonuna eklenecek statik olmayan yöntemin türü |
| ClassType | Delegeye eklenecek nesne yönteminin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| üye | MemberType ClassType::* | Belirtilen nesnenin statik olmayan metoduna bir işaretçi |
| obj | ClassType * | Delege koleksiyonuna eklenecek nesne üye yöntemine bir işaretçi |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonuna ekler.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parameter | Açıklama |
| --- | --- |
| MemberType | Delege koleksiyonuna eklenecek statik olmayan yöntemin türü |
| ClassType | Delege koleksiyonuna eklenecek nesne yönteminin türü |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| üye | MemberType ClassType::* | Belirtilen nesnenin statik olmayan metoduna bir işaretçi |
| obj | const SharedPtr\<ClassType\>\& | Delege koleksiyonuna eklenecek nesne üye yöntemine bir paylaşımlı işaretçi |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Belirtilen MulticastDelegate nesnesini delegeler koleksiyonuna ekler.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parameter | Type | Açıklama |
| --- | --- | --- |
| diğer | MulticastDelegate\& | Delege koleksiyonuna eklemek için MulticastDelegate sınıfının bir örneği |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Belirtilen fonksiyon nesnesini delege koleksiyonuna ekler. Fonksiyon nesnesi, koleksiyona eklenmeden önce [Callback](../callback/) delege türüne dönüştürülür.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parameter | Açıklama |
| --- | --- |
| R | Koleksiyona eklenecek fonksiyon nesnesinin dönüş türü |
| Argümanlar | Koleksiyona eklenecek fonksiyon nesnesinin argüman listesi |

| Parameter | Type | Açıklama |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Koleksiyona eklenecek fonksiyon nesnesi |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Page for C++](../../../)
