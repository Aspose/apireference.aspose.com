---
title: "Méthode System::Buffer::GetByte"
linktitle: "GetByte"
second_title: "Aspose.Font pour C++"
description: "Méthode System::Buffer::GetByte. Interprète le tableau typé spécifié comme un tableau d'octets brut et récupère la valeur d'octet à l'offset d'octet spécifié en C++."
type: docs
weight: 300
url: /fr/cpp/system/buffer/getbyte/
---
## Buffer::GetByte(const SharedPtr\<Array\<T\>\>\&, int) method


Interprète le tableau typé spécifié comme un tableau brut d'octets et récupère la valeur d'octet à l'offset d'octet spécifié.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const SharedPtr<Array<T>> &array, int index)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments du tableau |

| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const SharedPtr\<Array\<T\>\>\& | Le tableau cible |
| indice | int | Décalage basé sur zéro de l'octet à récupérer |

### ReturnValue

La valeur d'octet à l'index spécifié

## Voir aussi

* Typedef [SharedPtr](../../sharedptr/)
* Class [Array](../../array/)
* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::ArrayView\<T\>\&, int) method


Interprète le tableau typé spécifié comme un tableau brut d'octets et récupère la valeur d'octet à l'offset d'octet spécifié.

```cpp
template<typename T> static uint8_t System::Buffer::GetByte(const System::Details::ArrayView<T> &array, int index)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments de la vue du tableau |

| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const System::Details::ArrayView\<T\>\& | La vue du tableau cible |
| indice | int | Décalage basé sur zéro de l'octet à récupérer |

### ReturnValue

La valeur d'octet à l'index spécifié

## Voir aussi

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
## Buffer::GetByte(const System::Details::StackArray\<T, N\>\&, int) method


Interprète le tableau typé spécifié comme un tableau brut d'octets et récupère la valeur d'octet à l'offset d'octet spécifié.

```cpp
template<typename T,std::size_t> static uint8_t System::Buffer::GetByte(const System::Details::StackArray<T, N> &array, int index)
```


| Paramètre | Description |
| --- | --- |
| T | Le type des éléments du tableau de pile |
| N | La taille du tableau de pile |

| Paramètre | Type | Description |
| --- | --- | --- |
| tableau | const System::Details::StackArray\<T, N\>\& | Le tableau de pile cible |
| indice | int | Décalage basé sur zéro de l'octet à récupérer |

### ReturnValue

La valeur d'octet à l'index spécifié

## Voir aussi

* Class [Buffer](../)
* Namespace [System](../../)
* Library [Aspose.Font for C++](../../../)
