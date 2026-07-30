---
title: "System::MulticastDelegate< ReturnType(ArgumentTypes...)>::connect yöntemi"
linktitle: "bağla"
second_title: "Aspose.Font için C++"
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


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| geri arama | Callback | Koleksiyona eklenecek delege |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Typedef [Callback](../callback/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, ClassType *) method


Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonuna ekler.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, ClassType *obj)
```


| Parametre | Açıklama |
| --- | --- |
| MemberType | Delege koleksiyonuna eklenecek statik olmayan yöntemin türü |
| ClassType | Delegeye eklenecek nesne yönteminin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| üye | MemberType ClassType::* | Belirtilen nesnenin statik olmayan yöntemine bir işaretçi |
| obj | ClassType * | Delege koleksiyonuna eklenecek nesne üye yöntemine bir işaretçi |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*, const SharedPtr\<ClassType\>\&) method


Belirtilen nesnenin belirtilen statik olmayan metodunu delegeler koleksiyonuna ekler.

```cpp
template<class MemberType,class ClassType> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MemberType ClassType::*member, const SharedPtr<ClassType> &obj)
```


| Parametre | Açıklama |
| --- | --- |
| MemberType | Delege koleksiyonuna eklenecek statik olmayan yöntemin türü |
| ClassType | Delege koleksiyonuna eklenecek nesne yönteminin türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| üye | MemberType ClassType::* | Belirtilen nesnenin statik olmayan yöntemine bir işaretçi |
| obj | const SharedPtr\<ClassType\>\& | Delege koleksiyonuna eklenecek nesne üye yöntemine bir paylaşımlı işaretçi |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Typedef [SharedPtr](../../sharedptr/)
* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(MulticastDelegate\&) method


Belirtilen MulticastDelegate nesnesini delegeler koleksiyonuna ekler.

```cpp
MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(MulticastDelegate &other)
```


| Parametre | Tür | Açıklama |
| --- | --- | --- |
| diğer | MulticastDelegate\& | Delege koleksiyonuna eklenecek MulticastDelegate sınıfının bir örneği |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## MulticastDelegate< ReturnType(ArgumentTypes...)>::connect(std::function\<R(Args...)>) method


Belirtilen fonksiyon nesnesini delege koleksiyonuna ekler. Fonksiyon nesnesi, koleksiyona eklenmeden önce [Callback](../callback/) delege türüne dönüştürülür.

```cpp
template<class R,class...> MulticastDelegate & System::MulticastDelegate<ReturnType(ArgumentTypes...)>::connect(std::function<R(Args...)> f)
```


| Parametre | Açıklama |
| --- | --- |
| R | Koleksiyona eklenecek fonksiyon nesnesinin dönüş türü |
| Args | Koleksiyona eklenecek fonksiyon nesnesinin argüman listesi |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| f | std::function\<R(Args...)\> | Koleksiyona eklenecek fonksiyon nesnesi |

### ReturnValue

Kendine bir referans

## Ayrıca Bakınız

* Class [MulticastDelegate< ReturnType(ArgumentTypes...)>](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
