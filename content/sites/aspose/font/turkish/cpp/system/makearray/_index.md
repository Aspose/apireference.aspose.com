---
title: "System::MakeArray yöntemi"
linktitle: "MakeArray"
second_title: "Aspose.Font için C++"
description: "System::MakeArray yöntemi. Belirtilen argümanları C++'ta yapıcıya geçirerek yeni bir Array nesnesi oluşturan bir fabrika işlevi."
type: docs
weight: 24100
url: /tr/cpp/system/makearray/
---
## System::MakeArray(Args\&&...) method


Belirtilen argümanları yapıcıya geçirerek yeni bir [Array](../array/) nesnesi oluşturan bir fabrika işlevi.

```cpp
template<class T,class...> ArrayPtr<T> System::MakeArray(Args &&... args)
```


| Parametre | Açıklama |
| --- | --- |
| T | Fonksiyonun oluşturduğu [Array](../array/) nesnesinin öğe türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| args | Args\&&... | Oluşturulan [Array](../array/) nesnesinin yapıcısına geçirilen argümanlar |

### ReturnValue

Oluşturulan [Array](../array/) nesnesine işaret eden bir akıllı işaretçi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(Integral, Args\&&...) method


Belirtilen argümanları yapıcıya geçirerek yeni bir [Array](../array/) nesnesi oluşturan bir fabrika işlevi.

```cpp
template<class T,class Integral,class...> std::enable_if<std::is_integral<Integral>::value, ArrayPtr<T>>::type System::MakeArray(Integral size, Args &&... args)
```


| Parametre | Açıklama |
| --- | --- |
| T | Fonksiyonun oluşturduğu [Array](../array/) nesnesinin öğe türü |
| Tam sayı | Dizi boyutu türü. |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| size | Tam sayı | Oluşturulan dizinin boyutu. |
| args | Args\&&... | Oluşturulan [Array](../array/) nesnesinin yapıcısına geçirilen argümanlar |

### ReturnValue

Oluşturulan [Array](../array/) nesnesine işaret eden bir akıllı işaretçi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
## System::MakeArray(std::initializer_list\<T\>) method


Belirtilen başlatma listesindeki öğelerle dolduran ve yeni bir [Array](../array/) nesnesi oluşturan, ardından bu [Array](../array/) nesnesine işaret eden bir akıllı işaretçi döndüren bir fabrika işlevi.

```cpp
template<typename T> ArrayPtr<T> System::MakeArray(std::initializer_list<T> init)
```


| Parametre | Açıklama |
| --- | --- |
| T | Fonksiyonun oluşturduğu [Array](../array/) nesnesinin öğe türü |

| Parametre | Tür | Açıklama |
| --- | --- | --- |
| init | std::initializer_list\<T\> | Diziyi doldurmak için gereken öğeleri içeren başlatma listesi |

### ReturnValue

Oluşturulan [Array](../array/) nesnesine işaret eden bir akıllı işaretçi

## Ayrıca Bakınız

* Typedef [ArrayPtr](../arrayptr/)
* Namespace [System](../)
* Library [Aspose.Font for C++](../../)
